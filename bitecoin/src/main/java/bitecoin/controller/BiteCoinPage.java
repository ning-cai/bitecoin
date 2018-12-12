package bitecoin.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import bitecoin.model.Price;
import bitecoin.model.Quote;
import bitecoin.process.BiteCoinProcess;
import bitecoin.process.QuoteProcess;

@Controller
@RequestMapping("/bitecoin")
public class BiteCoinPage {

	@Autowired
	private QuoteProcess quoteProcess;
	@Autowired
	private BiteCoinProcess biteCoinProcess;

	@GetMapping("/price")
	public Price updatePrice() {
		Price spotPrice = biteCoinProcess.getSpotPrice();
		return spotPrice;
	}

	@RequestMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("date", new Date());
		model.addAttribute("name", "Mike");

		Quote quote = this.quoteProcess.getQuote();
		model.addAttribute("quote", quote.getValue().getQuote());

		Price spotPrice = biteCoinProcess.getSpotPrice();
		model.addAttribute("spotPrice", spotPrice.getAmount());
		model.addAttribute("currency", spotPrice.getCurrency());

		return "bitecoin";
	}
}
