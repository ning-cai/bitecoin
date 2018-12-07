package bitecoin.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/")
	public String helloWorld(Model model) {
		model.addAttribute("date", new Date());
		model.addAttribute("name", "Mike");

		return "bitecoin";
	}
}
