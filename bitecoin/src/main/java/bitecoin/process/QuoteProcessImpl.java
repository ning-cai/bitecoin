package bitecoin.process;

import org.springframework.web.client.RestTemplate;

import bitecoin.model.Quote;

public class QuoteProcessImpl implements QuoteProcess {

	public Quote getQuote() {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		return quote;
	}
}
