package com.util;

import java.math.BigDecimal;

public class BigDecimalConverter {

	public BigDecimal converter(String value) {
		if(value == null) {
			return null;
		}
		
		value = value.replace(".","").replace(",",".");
		return new BigDecimal(value);
	}
}
