package crudlover.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;


@Entity(name = "Car")
@Table(name = "car")
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    private String modelo;
    private String fabricante;
    private String dataFabricacao;
    private Double valor;
    private Integer anoModelo;

    public Car(){};

    public Car(Long id, String modelo, String fabricante, String dataFabricacao, Double valor, Integer anoModelo) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.dataFabricacao = dataFabricacao;
        this.valor = valor;
        this.anoModelo = anoModelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAnoModelo() {
        return anoModelo;
    }
}
