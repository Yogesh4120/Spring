package com.cg.food.app.service;

import java.util.List;

import com.cg.food.app.enums.CATEGORY;
import com.cg.food.app.model.MenuItem;

public interface MenuItemService {

	public MenuItem addMenuItem(MenuItem items);

	public boolean deleteMenuItem(long menuItemId);

	public MenuItem updateMenuItem(MenuItem items);

	public MenuItem searchMenuItem(String itemName);

	public List<MenuItem> displayAllitems();

	public MenuItem filterItemsbyName(CATEGORY category);
}
