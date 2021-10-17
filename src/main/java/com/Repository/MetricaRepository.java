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

	@Query(value="SELECT m.rendaAzul from Metrica as m where id=1")
	public Double rendaAzul();
	
	@Query(value="SELECT m.rendaAmarelo from Metrica as m where id=1")
	public Double rendaAmarelo();
	
	@Query(value="SELECT m.rendaVerde from Metrica as m where id=1")
	public Double rendaVerde();
	
	@Query(value="SELECT m.rendaVermelho from Metrica as m where id=1")
	public Double rendaVermelho();

	@Query(value="SELECT m.classAzul from Metrica as m where id=1")
	public Double getClassAzul();

	@Query(value="SELECT m.classVerde from Metrica as m where id=1")
	public Double getClassVerde();

	@Query(value="SELECT m.classAmarelo from Metrica as m where id=1")
	public Double getClassAmarelo();

	@Query(value="SELECT m.classVermelho from Metrica as m where id=1")
	public Double getClassVermelho();
	
	@Query(value="SELECT m.limiteVerde from Metrica as m where id=1")
	public Double getLimiteVerde();
	
	@Query(value="SELECT m.limiteAzul from Metrica as m where id=1")
	public Double getLimiteAzul();
	
}
