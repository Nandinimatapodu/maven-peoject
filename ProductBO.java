package com.nandini.product.bo;

import com.nandini.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
