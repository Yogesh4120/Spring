package com.cg.food.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.food.app.enums.CATEGORY;
import com.cg.food.app.model.MenuItem;
import com.cg.food.app.service.MenuItemService;

@RestController

@RequestMapping("/menuitems")
public class MenuItemController {

	@Autowired
	private MenuItemService serviceObject;

	@PostMapping
	@ResponseStatus(code=HttpStatus.CREATED)
	public MenuItem addMenuItem(@RequestBody MenuItem items) {

	return serviceObject.addMenuItem(items);
	}

	@DeleteMapping("/items/{items}")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public boolean deleteMenuItem(@PathVariable("items") long menuItemId) {

	return serviceObject.deleteMenuItem(menuItemId);
	}

	@PutMapping
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public MenuItem updateMenuItem(@RequestBody MenuItem items) {
	return serviceObject.updateMenuItem(items);
	}

	@GetMapping("/itemName/{itemName}")
	public MenuItem searchMenuItem(@PathVariable("itemName") String itemName) {
	return serviceObject.searchMenuItem(itemName);
	}

	@GetMapping
	public List<MenuItem> displayAllitems() {
	return serviceObject.displayAllitems();
	}

	@GetMapping("/category/{category}")
	public MenuItem filterItemsbyName(CATEGORY category) {
	return serviceObject.filterItemsbyName(category);
	}
}
