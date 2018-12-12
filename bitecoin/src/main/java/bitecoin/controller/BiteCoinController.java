package bitecoin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bitecoin.model.Price;
import bitecoin.process.BiteCoinProcess;

@RestController
public class BiteCoinController {

	@Autowired
	private BiteCoinProcess biteCoinProcess;

	@GetMapping("/price")
	public Price updatePrice() {
		Price spotPrice = biteCoinProcess.getSpotPrice();
		return spotPrice;
	}
}
