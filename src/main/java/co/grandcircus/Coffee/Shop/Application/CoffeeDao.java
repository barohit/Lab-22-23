package co.grandcircus.Coffee.Shop.Application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	public List<Item> findAllItems() {
		return jdbcTemplate.query("SELECT * FROM items", new BeanPropertyRowMapper<Item>(Item.class));
	}
	
	public int addItem(String name, double price, String description, int quantity) {
		String addQuery = "insert into items(name, price, description, quantity) values (?, ?, ?, ?)";
		return jdbcTemplate.update(addQuery, name, price, description, quantity); 
	}
	
	public int updateItem(String name, String price, String description, int itemID, int quantity) {
		String updateQuery = "UPDATE TABLE items SET name = '?', price='?', description='?' quantity='?' WHERE itemID = '?'"; 
		return jdbcTemplate.update(updateQuery, name, price, description, quantity, itemID); 
		
	}
	
	public List<User> findAllUsers() {
		return jdbcTemplate.query("SELECT * FROM users", new BeanPropertyRowMapper<User>(User.class)); 
	}
	
	public int addUser(String firstname, String lastname, String email, String password, String phoneNumber) {
		String addQuery = "insert into users(firstname, lastname, email, password, phonenumber) values (?,?,?,?,?);";
		return jdbcTemplate.update(addQuery, firstname, lastname, email, password, phoneNumber); 
	}
}

