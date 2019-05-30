package co.grandcircus.Coffee.Shop.Application;

public class Item {
	private String name; 
	private String description; 
	private Double price;
	private Integer quantity; 
	private String imglocation; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	} 
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getImglocation() {
		return imglocation;
	}
	public void setImglocation(String imglocation) {
		this.imglocation = imglocation;
	} 

}
