package com.siva.lookup.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("ord1")
@Scope("singleton")

public class OrderService {
	@Lookup
	public PlaceOrder getPlaceOrder() {
		return null;

	}

	public void confirmOrder() {

		PlaceOrder placeOrder = getPlaceOrder();
		placeOrder.senOrder();

	}
}
