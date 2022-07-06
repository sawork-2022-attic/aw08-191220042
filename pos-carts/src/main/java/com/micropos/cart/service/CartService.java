package com.micropos.cart.service;

import com.micropos.cart.model.Cart;
import com.micropos.cart.model.Item;
import com.micropos.dto.CartDto;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

public interface CartService {

    Double checkout(Cart cart);

    Double checkout(Integer cartId);

    Mono<CartDto> add(Cart cart, Item item);

    List<Cart> getAllCarts();

    Optional<Cart> getCart(Integer cartId);

    Integer test();

    Cart newCart();
}
