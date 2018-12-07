package bitecoin.service;

import bitecoin.model.Price;

public interface CoinbaseService {

	public Price getSpotPrice();

	public Price getBuyPrice();

	public Price getSellPrice();
}
