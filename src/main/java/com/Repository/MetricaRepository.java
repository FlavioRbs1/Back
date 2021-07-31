package com.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Metrica;

public interface MetricaRepository extends JpaRepository<Metrica,Integer> {
	

}
