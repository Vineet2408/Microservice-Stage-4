package com.cognizant.truyum.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.truyum.MenuItemCustomerServiceApplication;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;


@RestController
@RequestMapping("/menu-items")
public class MenuItemController {
	private static Logger LOGGER = LoggerFactory.getLogger(MenuItemCustomerServiceApplication.class);
	@Autowired
	private MenuItemService menuItemService;

	@GetMapping
	public List<MenuItem> getAllMenuItems() {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemService.getMenuItemsCustomer();

	}

	@GetMapping("/{id}")
	public MenuItem getMenuItems(@PathVariable long id) {
		LOGGER.info("START");
		LOGGER.info("END");
		return menuItemService.getMenuItem(id);

	}

	
}