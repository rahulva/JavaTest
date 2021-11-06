package com.test.prob_solving.ubs;

import java.util.*;

import static java.util.stream.Collectors.joining;

class UBSQ2 {

	/*
	 * Complete the 'priceCheck' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. STRING_ARRAY products 2. FLOAT_ARRAY productPrices 3.
	 * STRING_ARRAY productSold 4. FLOAT_ARRAY soldPrice
	 */

	public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold,
			List<Float> soldPrice) {
		// Write your code here

		int errorCount = 0;
		Map<String, Float> prodPriceMap = createProductPriceMap(products, productPrices);

		int i2 = 0;
		for (String product : productSold) {
			Float sellPrice = soldPrice.get(i2);
			Float realPrice = prodPriceMap.get(product);
			if (!sellPrice.equals(realPrice)) {
				errorCount++;
			}
			i2++;
		}
		return errorCount;
	}

	static Map<String, Float> createProductPriceMap(List<String> products, List<Float> productPrices) {
		Map<String, Float> prodPriceMap = new HashMap<String, Float>();
		int i = 0;
		for (String product : products) {
			prodPriceMap.put(product, productPrices.get(i));
			i++;
		}
		return prodPriceMap;
	}

}