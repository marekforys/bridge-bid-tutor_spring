package com.voris.bridge.bid_tutor.bridge_bid_tutor;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {
}
