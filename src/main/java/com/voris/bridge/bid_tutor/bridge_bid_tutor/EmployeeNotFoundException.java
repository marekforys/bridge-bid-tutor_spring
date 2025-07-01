package com.voris.bridge.bid_tutor.bridge_bid_tutor;

class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}
