package co.grandcircus.Coffee.Shop.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class CoffeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	
	public List<Item> findAllItems() {
		return jdbcTemplate.query("SELECT * FROM items", new BeanPropertyRowMapper<Item>(Item.class));
	}
	

	public List<Item> findItem(String name) {
		return jdbcTemplate.query("SELECT * FROM CoffeeShopDB.items WHERE name = '" + name + "'", new BeanPropertyRowMapper<Item>(Item.class)); 
	}
	
	public List<Item> findLoc(String name) {
		List<Item> l = jdbcTemplate.query("SELECT * FROM CoffeeShopDB.items WHERE name = '" + name + "'", new BeanPropertyRowMapper<Item>(Item.class));
		return l;
	}
	
	public List<User> findAllUsers() {
		return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<User>(User.class)); 
	}
	
	public int addUser(String firstname, String lastname, String email, String password, String phoneNumber, String favoriteCoffee, String preferredFlavors, String favoriteMajorChain, String joinReasons) {
		String addQuery = "INSERT INTO users(firstname, lastname, email, password, phonenumber, favoriteCoffee, preferredFlavors, favoriteMajorChain, joinReasons) values (?,?,?,?,?,?,?,?,?);";
		return jdbcTemplate.update(addQuery, firstname, lastname, email, password, phoneNumber, favoriteCoffee, preferredFlavors, favoriteMajorChain, joinReasons); 
	}
	
	public int updateItem(String name, String description, Double price, Integer quantity, Integer itemID ) {
		String updateQuery = "UPDATE items SET name = ?, description = ?, price = ?, quantity = ? WHERE itemID = ? ";
		return jdbcTemplate.update(updateQuery, name, description, price, quantity, itemID);
	}
	
	public int deleteItem(Integer itemID) {
		String deleteQuery = "DELETE FROM items WHERE itemID = ?";
		return jdbcTemplate.update(deleteQuery, itemID);  
	}
		
	public int addItem(String name, String description, Double price, Integer quantity) {
		String addQuery = "INSERT INTO items(name, description, price, quantity) VALUES (?, ?, ?, ?);";
		return jdbcTemplate.update(addQuery, name, description, price, quantity); 
	}
}

