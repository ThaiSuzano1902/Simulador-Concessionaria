package model;

import java.util.Objects;

import Enums.StatusVeiculo;
import Enums.TipoVeiculo;

public class Utilitario extends Veiculo {

    private double capacidadeCarga;

    public Utilitario() {
    }

    public Utilitario(Long id,
                      String modelo,
                      String fabricante,
                      int anoFabricacao,
                      TipoVeiculo tipo,
                      StatusVeiculo status,
                      int preco,
                      double capacidadeCarga) {

        super(id, modelo, fabricante, anoFabricacao, tipo, status, preco);

        this.capacidadeCarga = capacidadeCarga;
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }


    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }


    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Utilitario)) return false;

        Utilitario that = (Utilitario) o;

        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}