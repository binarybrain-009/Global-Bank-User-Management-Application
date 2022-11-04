package com.wellsfargo.training.globalbank.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wellsfargo.training.globalbank.model.User;
import com.wellsfargo.training.globalbank.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository urep;
	
	public User registerUser(User user) {
		return urep.save(user); // invoke jpa repository save() method
	}
	
	public List<User> getAllUsers()
	{
		return urep.findAll();
	}
}
