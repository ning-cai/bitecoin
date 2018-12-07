package bitecoin.process;

import bitecoin.model.Price;
import bitecoin.service.CoinbaseService;
import bitecoin.service.CoinbaseServiceImpl;

public class BiteCoinProcessImpl implements BiteCoinProcess {

	private CoinbaseService coinbaseService;

	public BiteCoinProcessImpl() {
		coinbaseService = new CoinbaseServiceImpl();
	}

	@Override
	public Price getSpotPrice() {
		return coinbaseService.getSpotPrice();
	}

	@Override
	public Price getBuyPrice() {
		return coinbaseService.getBuyPrice();
	}

	@Override
	public Price getSellPrice() {
		return coinbaseService.getSellPrice();
	}

}
