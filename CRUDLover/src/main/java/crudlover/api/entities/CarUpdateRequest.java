package crudlover.api.entities;

import java.io.Serializable;

public class CarUpdateRequest {
    private String modelo;
    private String fabricante;
    private Double valor;

    public CarUpdateRequest(){};

    public CarUpdateRequest(String modelo, String fabricante, Double valor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.valor = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Double getValor() {
        return valor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
