package bitecoin.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bitecoin.model.Quote;
import bitecoin.process.QuoteProcess;
import bitecoin.process.QuoteProcessImpl;

@Controller
public class ViewController {

	private QuoteProcess quoteProcess;

	public ViewController() {
		this.quoteProcess = new QuoteProcessImpl();
	}

	@RequestMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("date", new Date());
		model.addAttribute("name", "Mike");

		Quote quote = this.quoteProcess.getQuote();
		model.addAttribute("quote", quote.getValue().getQuote());

		return "bitecoin";
	}
}
