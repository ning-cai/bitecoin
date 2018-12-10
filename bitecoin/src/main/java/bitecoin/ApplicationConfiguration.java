package bitecoin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import bitecoin.process.BiteCoinProcess;
import bitecoin.process.BiteCoinProcessImpl;
import bitecoin.process.QuoteProcess;
import bitecoin.process.QuoteProcessImpl;

@Configuration
@ComponentScan
public class ApplicationConfiguration {

	@Bean
	public BiteCoinProcess biteCoinProcess() {
		return new BiteCoinProcessImpl();
	}

	@Bean
	public QuoteProcess quoteProcess() {
		return new QuoteProcessImpl();
	}

}
