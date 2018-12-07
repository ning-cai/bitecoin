package bitecoin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class PriceJson {

	private Price data;

	public Price getData() {
		return data;
	}

	public void setData(Price data) {
		this.data = data;
	}

}
