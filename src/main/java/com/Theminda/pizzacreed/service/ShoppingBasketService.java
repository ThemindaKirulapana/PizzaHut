package com.Theminda.pizzacreed.service;

import com.Theminda.pizzacreed.dao.Order;
import com.Theminda.pizzacreed.dao.ShoppingBasket;

public interface ShoppingBasketService {
    ShoppingBasket createBasket();

    ShoppingBasket getBasketById(Long basketId);

    void addItemToBasket(Long basketId, Long pizzaId, int quantity);

    void removeItemFromBasket(Long basketId, Long itemId);

    void clearBasket(Long basketId);

    Order checkout(Long basketId);
}
