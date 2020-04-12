package io.qmeta.benchmarks.db.jpa.repository;

import io.qmeta.benchmarks.db.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}

