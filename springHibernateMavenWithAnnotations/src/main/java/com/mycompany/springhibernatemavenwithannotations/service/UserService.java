/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springhibernatemavenwithannotations.service;

import com.mycompany.springhibernatemavenwithannotations.model.User;
import java.util.List;

/**
 *
 * @author user
 */
public interface UserService {
    
    User findById(int id);
    
    List<User> findAllUsers(); 
    
    void saveUser(User user);
    
    void updateUser(User user);
    
    void deleteUserById(int id);
}
