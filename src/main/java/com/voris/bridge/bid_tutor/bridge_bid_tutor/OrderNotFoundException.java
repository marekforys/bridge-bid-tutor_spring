package com.voris.bridge.bid_tutor.bridge_bid_tutor;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
