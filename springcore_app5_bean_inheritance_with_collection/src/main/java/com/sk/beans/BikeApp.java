package com.sk.beans;

import java.util.ArrayList;
import java.util.List;

public class BikeApp {


	private List<String> bikeDetailsList = new ArrayList<>();

	public void setBikeDetailsList(List<String> bikeDetailsList) {
		this.bikeDetailsList = bikeDetailsList;
	}

	@Override
	public String toString() {
		return "BikeApp [bikeDetailsList=" + bikeDetailsList + "]";
	}
	
	
	
	
}
