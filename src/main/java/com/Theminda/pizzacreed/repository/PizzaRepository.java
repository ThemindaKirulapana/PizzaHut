package com.Theminda.pizzacreed.repository;

import com.Theminda.pizzacreed.dao.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
