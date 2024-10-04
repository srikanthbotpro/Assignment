package com.ust.Lapsuggestion.repo;

import com.ust.Lapsuggestion.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Laptoprepo extends JpaRepository<Laptop, Integer> {
}
