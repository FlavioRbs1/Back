package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Configuracao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private boolean classic;
	
	@Column
	private boolean ocian;
	
	@Column
	private boolean florest;
	
	@Column
	private boolean night;
	
	@Column
	private boolean vulcano;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isClassic() {
		return classic;
	}

	public void setClassic(boolean classic) {
		this.classic = classic;
	}

	public boolean isOcian() {
		return ocian;
	}

	public void setOcian(boolean ocian) {
		this.ocian = ocian;
	}

	public boolean isFlorest() {
		return florest;
	}

	public void setFlorest(boolean florest) {
		this.florest = florest;
	}

	public boolean isNight() {
		return night;
	}

	public void setNight(boolean night) {
		this.night = night;
	}

	public boolean isVulcano() {
		return vulcano;
	}

	public void setVulcano(boolean vulcano) {
		this.vulcano = vulcano;
	}
	
	
}
