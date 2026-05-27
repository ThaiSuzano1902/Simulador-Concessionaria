package model;

public class PessoaFisica extends Cliente {

    private String cpf;
    private int idade;

    public PessoaFisica(String nome, String contato, String cpf, int idade) {
        super(nome, contato);
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}