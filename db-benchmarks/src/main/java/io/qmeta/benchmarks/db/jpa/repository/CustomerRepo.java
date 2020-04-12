package io.qmeta.benchmarks.db.jpa.repository;

import io.qmeta.benchmarks.db.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}

