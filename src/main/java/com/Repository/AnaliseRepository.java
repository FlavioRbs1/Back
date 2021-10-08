package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Analise;

@Repository
public interface AnaliseRepository extends JpaRepository<Analise,Integer> {

}
