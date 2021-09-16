package com.Repository;


import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Model.Metrica;

public interface MetricaRepository extends JpaRepository<Metrica,Integer> {
	
	Object findByid(Integer id);
	
	@Query(value="SELECT m.percentual from Metrica as m where id=1")
	public Double getPercentual();
	
	
	@Query(value="SELECT m.cpfVermelho from Metrica as m where id=1")
	public Double getClassificacaoCpfVermelho();
	
	@Query(value="SELECT m.cpfVerde from Metrica as m where id=1")
	public Double getClassificacaoCpfVerde();
	
	@Query(value="SELECT m.cpfAmarelo from Metrica as m where id=1")
	public Double getClassificacaoCpfAmarelo();

	@Query(value="SELECT m.comprasAbertoAzul from Metrica as m where id=1")
	public Double getPendenciasAzul();

}
