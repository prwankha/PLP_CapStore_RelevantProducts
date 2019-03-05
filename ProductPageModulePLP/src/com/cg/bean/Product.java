package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;


@Table(name="Product_Details")
@Entity

public class Product {
	@Id
private int product_Id;
	@NotNull
private String productName;
private String description;
private float price;
private  String type;
private String  category;
private int soldQuantities;
private float discount;
private int views;
private int stock ;
public Product() {
}

public Product(int product_Id, String productName) {
	super();
	this.product_Id = product_Id;
	this.productName = productName;
}

public Product(int product_Id, String productName, String description, float price, String type, String category,
		int soldQuantities, float discount, int views, int stock) {
	super();
	this.product_Id = product_Id;
	this.productName = productName;
	this.description = description;
	this.price = price;
	this.type = type;
	this.category = category;
	this.soldQuantities = soldQuantities;
	this.discount = discount;
	this.views = views;
	this.stock = stock;
}

public int getProduct_Id() {
	return product_Id;
}

public void setProduct_Id(int product_Id) {
	this.product_Id = product_Id;
}

public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getSoldQuantities() {
	return soldQuantities;
}
public void setSoldQuantities(int soldQuantities) {
	this.soldQuantities = soldQuantities;
}
public float getDiscount() {
	return discount;
}
public void setDiscount(float discount) {
	this.discount = discount;
}
public int getViews() {
	return views;
}
public void setViews(int views) {
	this.views = views;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}

@Override
public String toString() {
	return "Product [product_Id=" + product_Id + ", productName=" + productName + ", description=" + description
			+ ", price=" + price + ", type=" + type + ", category=" + category + ", soldQuantities=" + soldQuantities
			+ ", discount=" + discount + ", views=" + views + ", stock=" + stock + "]";
}


}
