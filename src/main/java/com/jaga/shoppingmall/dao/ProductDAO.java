package com.jaga.shoppingmall.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jaga.shoppingmall.model.Product;

@Repository
public interface ProductDAO {
	public boolean saveOrUpdate(Product product);
	public boolean delete(Product product);
	public Product get(int id);
	public List<Product> list();
    public Object getproduct(int id);

}
