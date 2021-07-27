package com.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( length = 60)
    private String bairro;

    @Column(length = 50)
    private String cidade;

    @Column( length = 150)
    private String comentarios;

    @Column( length = 100)
    private String complemento;

    @Column(length = 11,updatable = true)
    private String cpf;

    @Column( length = 2)
    private Integer dependentes;

    @Column(updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNasc;

    @Column( length = 100)
    private String empresa;

    @Column( length = 100)
    private String endereco;

    @Column( length = 50)
    private String estado;

    @Column( length = 50)
    private String estadoCivil;

    @Column( length = 150)
    private String nome;

    @Column( length = 15)
    private Integer numero;

    @Column( length = 100)
    private String profissao;

    @Column( length = 50)
    private BigDecimal renda;

    @Column( length = 50)
    private BigDecimal rendaFamiliar;

    @Column( length = 50)
    private BigDecimal rendaTotal;

    @Column( length = 15)
    private String rg;

    @Column
    private String sexo;

    @Column( length = 20)
    private String tel1;

    @Column
    private String tel2;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getDependentes() {
		return dependentes;
	}

	public void setDependentes(Integer dependentes) {
		this.dependentes = dependentes;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public BigDecimal getRenda() {
		return renda;
	}

	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}

	public BigDecimal getRendaFamiliar() {
		return rendaFamiliar;
	}

	public void setRendaFamiliar(BigDecimal rendaFamiliar) {
		this.rendaFamiliar = rendaFamiliar;
	}

	public BigDecimal getRendaTotal() {
		return rendaTotal;
	}

	public void setRendaTotal(BigDecimal rendaTotal) {
		this.rendaTotal = rendaTotal;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTel1() {
		return tel1;
	}

	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	public String getTel2() {
		return tel2;
	}

	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
   
    
}
