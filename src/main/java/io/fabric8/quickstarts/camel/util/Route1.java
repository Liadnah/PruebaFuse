package io.fabric8.quickstarts.camel.util;

import org.apache.camel.Exchange;

public class Route1 {
	public void traerNumero(Exchange exchange) {
		
		Integer a = (Integer) exchange.getProperty("precio");
		
		a = a + 2000;
		exchange.setProperty("precio", a);
		
	}

}
