package co.grandcircus.Coffee.Shop.Application;

public class User {
	private String firstname; 
	private String lastname; 
	private String email; 
	private String password; 
	private String phoneNumber; 
	private String favoriteCoffee; 
	private String preferredFlavors; 
	private String favoriteMajorChain; 
	private String joinReasons;
	
	public User (String fn, String ln, String em, String pw, String pn) {
		firstname = fn; 
		lastname = ln; 
		email = em; 
		password = pw; 
		phoneNumber = pn; 
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFavoriteCoffee() {
		return favoriteCoffee;
	}
	public void setFavoriteCoffee(String favoriteCoffee) {
		this.favoriteCoffee = favoriteCoffee;
	}
	public String getPreferredFlavors() {
		return preferredFlavors;
	}
	public void setPreferredFlavors(String preferredFlavors) {
		this.preferredFlavors = preferredFlavors;
	}
	public String getFavoriteMajorChain() {
		return favoriteMajorChain;
	}
	public void setFavoriteMajorChain(String favoriteMajorChain) {
		this.favoriteMajorChain = favoriteMajorChain;
	}
	public String getJoinReasons() {
		return joinReasons;
	}
	public void setJoinReasons(String joinReasons) {
		this.joinReasons = joinReasons;
	} 

}
