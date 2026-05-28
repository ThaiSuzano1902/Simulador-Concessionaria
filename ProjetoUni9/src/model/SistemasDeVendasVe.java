package model;

import java.util.ArrayList;
import java.util.List;

public class SistemasDeVendasVe {
    // LISTA  

    private List<Veiculo> listaVeiculos = new ArrayList<>();

    // CADASTRA
    public void cadastrarVeiculo(Veiculo veiculo) {
        if (veiculo.getAnoFabricacao() > 2027) {

            throw new IllegalArgumentException(
                    "Ano de fabricação inválido!"
            );
        }

        listaVeiculos.add(veiculo);

        System.out.println("Veículo cadastrado com sucesso!");
    }


    // LISTAR 
    public void listarVeiculos() {
        if (listaVeiculos.isEmpty()) {

            System.out.println("Nenhum veículo cadastrado.");

            return;
        }

        for (Veiculo veiculo : listaVeiculos) {

            System.out.println("-------------------------");

            System.out.println("ID: "
                    + veiculo.getId());

            System.out.println("Modelo: "
                    + veiculo.getModelo());

            System.out.println("Fabricante: "
                    + veiculo.getFabricante());

            System.out.println("Ano: "
                    + veiculo.getAnoFabricacao());

            System.out.println("Preço: "
                    + veiculo.getPreco());

            System.out.println("Tipo: "
                    + veiculo.getTipo());

            System.out.println("Status: "
                    + veiculo.getStatus());


            if (veiculo instanceof Carro) {

                Carro carro = (Carro) veiculo;

                System.out.println("Portas: "
                        + carro.getPortas());

                System.out.println("Capacidade Passageiros: "
                        + carro.getCapacidadePassageiros());
            }

            // MOTO
            else if (veiculo instanceof Moto) {

                Moto moto = (Moto) veiculo;

                System.out.println("Cilindrada: "
                        + moto.getCilindrada());
            }

            // UTILITÁRIO
            else if (veiculo instanceof Utilitario) {

                Utilitario utilitario = (Utilitario) veiculo;

                System.out.println("Capacidade de Carga: "
                        + utilitario.getCapacidadeCarga());
            }
        }
    }


    // EDITA PREÇO DO VEÍCULO
    public void editarPrecoVeiculo(Long id,
                                   int novoPreco) {

        for (Veiculo veiculo : listaVeiculos) {

            // PROCURA PELO ID
            if (veiculo.getId().equals(id)) {

                veiculo.setPreco(novoPreco);

                System.out.println("Preço atualizado!");

                return;
            }
        }
        throw new IllegalArgumentException(
                "Veículo não encontrado!"
        );
    }

    // DELETE
    public void deletarVeiculo(Long id) {

        Veiculo veiculoEncontrado = null;
        for (Veiculo veiculo : listaVeiculos) {

            if (veiculo.getId().equals(id)) {

                veiculoEncontrado = veiculo;

                break;
            }
        }
        if (veiculoEncontrado == null) {

            throw new IllegalArgumentException(
                    "Veículo não encontrado!"
            );
        }

        listaVeiculos.remove(veiculoEncontrado);

        System.out.println("Veículo removido!");
    }
    
    public Veiculo buscarVeiculo(Long id) {

        for (Veiculo veiculo : listaVeiculos) {

            if (veiculo.getId().equals(id)) {

                return veiculo;
            }
        }

        return null;
    }
}