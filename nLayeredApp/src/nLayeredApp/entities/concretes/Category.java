package nLayeredApp.entities.concretes;

import java.util.List;

import nLayeredApp.core.entities.Entity;

public class Category extends Entity {
	
	private int id;
	private String name;
	
	private List<Product> Product;
	
	public Category() {
		super();
	}
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product> getProduct() {
		return Product;
	}
	public void setProduct(List<Product> product) {
		Product = product;
	}

}
