package model;

import java.util.ArrayList;
import java.util.List;

public class SistemasDeVendasVe {

    // ======================================
    // LISTA DE VEÍCULOS
    // ======================================

    private List<Veiculo> listaVeiculos = new ArrayList<>();


    // ======================================
    // CADASTRAR VEÍCULO
    // ======================================
    public void cadastrarVeiculo(Veiculo veiculo) {

        // REGRA DA ATIVIDADE
        if (veiculo.getAnoFabricacao() > 2027) {

            throw new IllegalArgumentException(
                    "Ano de fabricação inválido!"
            );
        }

        listaVeiculos.add(veiculo);

        System.out.println("Veículo cadastrado com sucesso!");
    }


    // ======================================
    // LISTAR VEÍCULOS
    // ======================================
    public void listarVeiculos() {

        // VERIFICA SE A LISTA ESTÁ VAZIA
        if (listaVeiculos.isEmpty()) {

            System.out.println("Nenhum veículo cadastrado.");

            return;
        }

        // PERCORRE A LISTA
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


            // ======================================
            // POLIMORFISMO
            // ======================================

            // CARRO
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


    // ======================================
    // EDITAR PREÇO DO VEÍCULO
    // ======================================
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

        // NÃO ENCONTROU
        throw new IllegalArgumentException(
                "Veículo não encontrado!"
        );
    }


    // ======================================
    // DELETAR VEÍCULO
    // ======================================
    public void deletarVeiculo(Long id) {

        Veiculo veiculoEncontrado = null;

        // PROCURA O VEÍCULO
        for (Veiculo veiculo : listaVeiculos) {

            if (veiculo.getId().equals(id)) {

                veiculoEncontrado = veiculo;

                break;
            }
        }

        // NÃO ENCONTROU
        if (veiculoEncontrado == null) {

            throw new IllegalArgumentException(
                    "Veículo não encontrado!"
            );
        }

        // REMOVE DA LISTA
        listaVeiculos.remove(veiculoEncontrado);

        System.out.println("Veículo removido!");
    }


    // ======================================
    // BUSCAR VEÍCULO PELO ID
    // ======================================
    public Veiculo buscarVeiculo(Long id) {

        for (Veiculo veiculo : listaVeiculos) {

            if (veiculo.getId().equals(id)) {

                return veiculo;
            }
        }

        return null;
    }
}