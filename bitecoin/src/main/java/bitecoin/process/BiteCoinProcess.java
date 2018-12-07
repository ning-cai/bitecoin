package bitecoin.process;

import bitecoin.model.Price;

public interface BiteCoinProcess {

	public Price getSpotPrice();

	public Price getBuyPrice();

	public Price getSellPrice();
}
