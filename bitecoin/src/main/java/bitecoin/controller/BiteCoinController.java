package bitecoin.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bitecoin.model.Price;
import bitecoin.model.Quote;
import bitecoin.process.BiteCoinProcess;
import bitecoin.process.BiteCoinProcessImpl;
import bitecoin.process.QuoteProcess;
import bitecoin.process.QuoteProcessImpl;

@Controller
public class BiteCoinController {

	private QuoteProcess quoteProcess;
	private BiteCoinProcess biteCoinProcess;

	public BiteCoinController() {
		quoteProcess = new QuoteProcessImpl();
		biteCoinProcess = new BiteCoinProcessImpl();
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
