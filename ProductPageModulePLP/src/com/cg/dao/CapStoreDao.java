package com.cg.dao;
import java.util.List;

import com.cg.bean.Product;


public interface CapStoreDao {
public List<Product> findProductByName(String productName);
public List<Product> findProductByCategory(String category);
public List<String> findTypes(String category);
public List<Product> similarProducts(String type,String category);
public boolean namesearch(String nameSearch);

}
