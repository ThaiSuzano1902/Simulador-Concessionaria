package model;

import java.util.Objects;

import Enums.StatusVeiculo;
import Enums.TipoVeiculo;

public class Moto extends Veiculo {

    private String cilindrada;

    
    public Moto() {
    }

    public Moto(Long id,String modelo,String fabricante,int anoFabricacao,TipoVeiculo tipo,StatusVeiculo status,int preco,String cilindrada) {
        super(id, modelo, fabricante, anoFabricacao, tipo, status, preco);
        this.cilindrada = cilindrada;
    }


    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Moto)) return false;

        Moto moto = (Moto) o;
        return Objects.equals(getId(), moto.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}