package com.virtusa.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.inventory.model.Category;
import com.virtusa.inventory.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> fetchAll() {
		return ResponseEntity.ok(categoryService.fetchAll());
	}

	@RequestMapping(value = "/category", method = RequestMethod.POST)
	public ResponseEntity<Category> save(@RequestBody Category category) {
		return ResponseEntity.ok(categoryService.save(category));
	}

	@RequestMapping(value = "/category", method = RequestMethod.PUT)
	public ResponseEntity<Category> update(@RequestBody Category category) {
		return ResponseEntity.ok(categoryService.update(category));
	}

	@RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
	public ResponseEntity delete(@PathVariable Integer id) {
		categoryService.delete(id);
		return ResponseEntity.ok().build();
	}
}
