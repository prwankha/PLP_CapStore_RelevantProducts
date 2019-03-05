package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Product;
import com.cg.dao.CapStoreDao;
@Service
public class CapStoreServiceImpl implements CapStoreService{
	@Autowired
CapStoreDao capStoreDao=null;

	public CapStoreDao getCapStoreDao() {
	return capStoreDao;
}

public void setCapStoreDao(CapStoreDao capStoreDao) {
	this.capStoreDao = capStoreDao;
}

	@Override
	public List<Product> findProductByName(String productName) {
				return capStoreDao.findProductByName(productName);
	}

	@Override
	public List<Product> findProductByCategory(String category) {
	
		return capStoreDao.findProductByCategory(category);
	}

	@Override
	public List<Product> similarProducts(String type, String category) {
		return capStoreDao.similarProducts(type, category);
	}

	@Override
	public List<String> findTypes(String category) {
		return capStoreDao.findTypes(category);
	}

	@Override
	public boolean namesearch(String nameSearch) {
		return capStoreDao.namesearch(nameSearch);
	}

}
