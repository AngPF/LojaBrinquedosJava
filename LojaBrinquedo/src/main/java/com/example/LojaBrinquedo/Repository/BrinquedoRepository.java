package com.example.LojaBrinquedo.Repository;

import com.example.LojaBrinquedo.Model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
    List<Brinquedo> findAll();
}
