package com.Theminda.pizzacreed.repository;

import com.Theminda.pizzacreed.dao.ShoppingBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingBasketRepository extends JpaRepository<ShoppingBasket, Long> {

}
