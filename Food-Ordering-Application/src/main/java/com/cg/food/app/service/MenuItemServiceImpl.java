package com.cg.food.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.food.app.enums.CATEGORY;
import com.cg.food.app.exception.ItemNotFoundException;
import com.cg.food.app.model.MenuItem;
import com.cg.food.app.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {


	@Autowired
	private MenuItemRepository repoObject;

	@Override
	public MenuItem addMenuItem(MenuItem items) {

		return repoObject.save(items);
	}

	@Override
	public boolean deleteMenuItem(long menuItemId) {

		if(!repoObject.existsById((int)menuItemId)) {
			throw new ItemNotFoundException("The Item Id you entered is Wrong");
		}
		repoObject.deleteById((int)menuItemId);
		return true;
	}

	@Override
	public MenuItem updateMenuItem(MenuItem items) {

		return repoObject.save(items);
	}

	@Override
	public MenuItem searchMenuItem(String itemName) {
		if(!repoObject.equals(itemName)) {
			throw new ItemNotFoundException("The Item Name you entered is not in Application or Not yet Added");
		}
		return repoObject.findByName(itemName);
	}

	@Override
	public List<MenuItem> displayAllitems() {

		return repoObject.findAll();
	}

	@Override
	public MenuItem filterItemsbyName(CATEGORY category) {

		return repoObject.findByCategory(category);
	}


	
	
}
