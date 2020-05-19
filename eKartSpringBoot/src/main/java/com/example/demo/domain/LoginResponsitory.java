/**
 * 
 */
package com.example.demo.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.entities.LoginEntity;

/**
 * @author vivek
 *
 */
public interface LoginResponsitory extends CrudRepository<LoginEntity, Integer> {

	@Query("SELECT u FROM LoginEntity u")
	public List<LoginEntity> getAllUsers();
}
