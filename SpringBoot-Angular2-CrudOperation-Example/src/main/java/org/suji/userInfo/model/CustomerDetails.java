package org.suji.userInfo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerDetails {

	private int id;
    private String name;  
  /*  private String contactInfo;
    private String occupation;
    private String InterestIn;
    private String language;
    private String outfit;*/

    private String products;
    private String email ; 
    
    
    CustomerDetails() {
    	
	}
    
	public CustomerDetails(int id, String name, String products, String email, int payment, int pointSale,
			int order) {
		
		this.id = id;
		this.name = name;
		this.products = products;
		this.email = email;
		this.payment = payment;
		this.pointSale = pointSale;
		this.order = order;
	}
	private int payment;
    private int  pointSale;
    private int  order;
    
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
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public int getPointSale() {
		return pointSale;
	}
	public void setPointSale(int pointSale) {
		this.pointSale = pointSale;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", name=" + name + ", products=" + products + ", email=" + email
				+ ", payment=" + payment + ", pointSale=" + pointSale + ", order=" + order + "]";
	}
	
	
    
    
    
/*	public UserDetails(long id, String name, String products, String order, String interestIn, String language,
			String outfit) {
		
		this.id = id;
		this.name = name;
		this.contactInfo = contactInfo;
		this.occupation = occupation;
		this.InterestIn = interestIn;
		this.language = language;
		this.outfit = outfit;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getInterestIn() {
		return InterestIn;
	}
	public void setInterestIn(String interestIn) {
		InterestIn = interestIn;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getOutfit() {
		return outfit;
	}
	public void setOutfit(String outfit) {
		this.outfit = outfit;
	}*/

	
}
