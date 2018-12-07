package bitecoin.service;

import org.springframework.web.client.RestTemplate;

import bitecoin.model.Price;
import bitecoin.model.PriceJson;

public class CoinbaseServiceImpl implements CoinbaseService {

	@Override
	public Price getSpotPrice() {
		String url = "https://api.coinbase.com/v2/prices/spot?currency=USD";
		return getPriceByUrl(url);
	}

	@Override
	public Price getBuyPrice() {
		String url = "https://api.coinbase.com/v2/prices/buy?currency=USD";
		return getPriceByUrl(url);
	}

	@Override
	public Price getSellPrice() {
		String url = "https://api.coinbase.com/v2/prices/sell?currency=USD";
		return getPriceByUrl(url);
	}

	private Price getPriceByUrl(String url) {
		RestTemplate restTemplate = new RestTemplate();
		PriceJson priceJson = restTemplate.getForObject(url, PriceJson.class);
		return priceJson.getData();
	}

}
