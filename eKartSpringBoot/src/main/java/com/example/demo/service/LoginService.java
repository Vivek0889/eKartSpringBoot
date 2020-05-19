/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.LoginResponsitory;
import com.example.demo.domain.entities.LoginEntity;

/**
 * @author vivek
 *
 */
@Service
public class LoginService {

//	@Autowired
//	private LoginResponsitory loginRepo;
	
	public List<LoginEntity> getAllUser() {
		
//		return loginRepo.getAllUsers();
		return null;
	}
}
