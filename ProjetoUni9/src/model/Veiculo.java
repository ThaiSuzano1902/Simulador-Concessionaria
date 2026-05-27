package model;

import java.util.Objects;

import Enums.StatusVeiculo;
import Enums.TipoVeiculo;

public class Veiculo {

 
    private Long id;
    private String fabricante;
    private int anoFabricacao;
    private TipoVeiculo tipo;
    private StatusVeiculo status;
    private String modelo;
    private int preco;



    public Veiculo() {
    }



    public Veiculo(Long id,
                    String modelo,
                    String fabricante,
                    int anoFabricacao,
                    TipoVeiculo tipo,
                    StatusVeiculo status,
                    int preco) {

        this.id = id;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anoFabricacao = anoFabricacao;
        this.tipo = tipo;
        this.status = status;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }


    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }


    public StatusVeiculo getStatus() {
        return status;
    }

    public void setStatus(StatusVeiculo status) {
        this.status = status;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }


    @Override
    public boolean equals(Object o) {

        // VERIFICA SE É O MESMO OBJETO
        if (this == o) return true;

        // VERIFICA SE É UM VEICULO
        if (!(o instanceof Veiculo)) return false;

        Veiculo veiculo = (Veiculo) o;

        // COMPARA PELO ID
        return Objects.equals(id, veiculo.id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}