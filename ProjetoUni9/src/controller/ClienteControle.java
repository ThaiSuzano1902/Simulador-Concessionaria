package controller;
import model.Cliente;
import model.PessoaFisica;
import model.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;

public class ClienteControle {
    private List<Cliente> listaCliente = new ArrayList<>();

public void cadastrarCliente(Cliente cliente){
    listaCliente.add(cliente);
    System.out.println("Cliente cadastrado com sucesso!");
}

public void listarClientes(){
    if (!listaCliente.isEmpty()) {
        for (Cliente cliente : listaCliente) {
                cliente.exibirInformacoes();
                System.out.println("-------------------");        }
    } else {
        System.out.println("Nenhum cliente cadastrado.");
    }
}

    public void removerCliente(String nomeParaRemover) {

        if (!listaCliente.isEmpty()) {

            for (int i = 0; i < listaCliente.size(); i++) {

                Cliente clienteAtual = listaCliente.get(i);

                if (clienteAtual.getNome().equalsIgnoreCase(nomeParaRemover)) {
                    listaCliente.remove(i);
                    System.out.println("Cliente removido com sucesso!");
                    return;
                }
            }

            System.out.println("Cliente não encontrado.");
        } else {

            System.out.println("A lista está vazia.");
        }
    }

public void editarCliente(String nomeProcurado, String novoNome){

    for (Cliente cliente : listaCliente){
        boolean nomesIguais = true;
        String nomeLista = cliente.getNome();

        if(nomeLista.length() != nomeProcurado.length()){
            nomesIguais = false;
        } else {
            for(int i = 0; i < nomeLista.length(); i++){
                if(nomeLista.charAt(i) != nomeProcurado.charAt(i)){

                    nomesIguais = false;
                    break;
                }

            }

        }
        if(nomesIguais){

            cliente.setNome(novoNome);

            System.out.println("Cliente editado com sucesso!");
            return;
        }

    }

    System.out.println("Cliente não encontrado.");
}

}