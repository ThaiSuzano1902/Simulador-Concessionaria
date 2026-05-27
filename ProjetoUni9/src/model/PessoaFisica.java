package model;

public class PessoaFisica extends Cliente {

    private String cpf;
    private int idade;

    public PessoaFisica(String nome, String contato, String cpf, int idade) {
        super(nome, contato);
        setCpf(cpf);
        setIdade(idade);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("CPF Inválido! Deve conter exatamente 11 dígitos.");
        }
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade Inválida. Você precisa ser maior de 18 anos.");
        }
        this.idade = idade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("--- Dados do Cliente (Pessoa Física) ---");
        System.out.println("Nome: " + getNome());       
        System.out.println("Contato: " + getContato()); 
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
    }
}
