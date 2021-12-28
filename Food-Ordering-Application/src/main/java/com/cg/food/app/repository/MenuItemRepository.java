package com.cg.food.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.food.app.enums.CATEGORY;
import com.cg.food.app.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Integer>{
	
	@Query("from MenuItem where itemName=:itemName")
	public MenuItem findByName(@Param("itemName") String itemName);

	@Query("from MenuItem where category=:category")
	public MenuItem findByCategory(@Param("category") CATEGORY category);


}
