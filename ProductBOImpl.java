package com.nandini.product.bo;

import com.nandini.product.dao.ProductDAO;
import com.nandini.product.dao.ProductDAOImpl;
import com.nandini.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
