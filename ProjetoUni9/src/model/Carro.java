package model;

import java.util.Objects;
import Enums.StatusVeiculo;
import Enums.TipoVeiculo;

public class Carro extends Veiculo {


    private int portas;
    private int capacidadePassageiros;

    public Carro() {
    }

    public Carro(Long id,String modelo,String fabricante,int anoFabricacao,TipoVeiculo tipo, StatusVeiculo status,int preco,int portas,int capacidadePassageiros) {
        super(id, modelo, fabricante, anoFabricacao, tipo, status, preco);
        this.portas = portas;
        this.capacidadePassageiros = capacidadePassageiros;
    }


    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }


    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return Objects.equals(getId(), carro.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}