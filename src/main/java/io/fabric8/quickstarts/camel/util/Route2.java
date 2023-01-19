package io.fabric8.quickstarts.camel.util;

import org.apache.camel.Exchange;

public class Route2 {
	public void precioCondicional(Exchange exchange) {
		
		Integer a = (Integer) exchange.getProperty("precio");
		
		if(a > 4000) {
			a = a /5;
			exchange.setProperty("precio", a);
		}
		else if (a < 2000) {
			a = a * 7 / 2;
			exchange.setProperty("precio", a);
		}
		else if (a == 1000) {
			a = a * 5 - 500;
			exchange.setProperty("precio", a);
		}
		
	}

}
