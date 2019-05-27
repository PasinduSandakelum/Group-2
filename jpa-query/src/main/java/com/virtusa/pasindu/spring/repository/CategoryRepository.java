package com.virtusa.pasindu.spring.repository;

import com.virtusa.pasindu.spring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
