package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.Product;

@Repository
@Transactional
public class CapStoreDaoImpl implements CapStoreDao{
	@PersistenceContext
	 EntityManager entityManager=null;
	 
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

@Override
public List<Product> findProductByName(String productName) {
	Query query =entityManager.createQuery("from Product p where p.productName=:productName");
	query.setParameter("productName", productName);
	return query.getResultList();
}

@Override
public List<Product> findProductByCategory(String category) {
	Query query =entityManager.createQuery("from Product p where p.category=:category");
	query.setParameter("category", category);
	return query.getResultList();
}

@Override
public List<Product> similarProducts(String type, String category) {
	Query query =entityManager.createQuery("from Product p where p.category=:category and p.type=:type");
	query.setParameter("category", category);
	query.setParameter("type", type);
	return query.getResultList();
}

@Override
public List<String> findTypes(String category) {
	Query query =entityManager.createQuery("select distinct (type) from Product p where p.category=:category");
	query.setParameter("category", category);
	return query.getResultList();
}

@Override
public boolean namesearch(String nameSearch) {
	Query query =entityManager.createQuery("select p.productName from Product p");
	List<String> s=query.getResultList();
	if(s.contains(nameSearch))
		return true;
	else
		return false;
}

}
