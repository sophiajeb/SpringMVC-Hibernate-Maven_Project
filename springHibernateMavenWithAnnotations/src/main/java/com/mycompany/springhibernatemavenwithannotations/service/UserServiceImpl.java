/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springhibernatemavenwithannotations.service;

import com.mycompany.springhibernatemavenwithannotations.dao.UserDao;
import com.mycompany.springhibernatemavenwithannotations.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    
    
    @Autowired
    private UserDao dao;
    
    public User findById(int id) {
        return dao.findById(id);
    }
    
    public List<User> findAllUsers() {
		return dao.findAllUsers();
	}
    
    public void saveUser(User user) {
		dao.saveUser(user);
	}
    
    public void deleteUserById(int id) {
		dao.deleteUserById(id);
	}
    
    public void updateUser(User user) {
		User entity = dao.findById(user.getId());
		if(entity!=null){
			entity.setUsername(user.getUsername());
			entity.setPassword(user.getPassword());
			entity.setFname(user.getFname());
			entity.setLname(user.getLname());
                        entity.setType(user.getType());
		}
	}
    
    
}
