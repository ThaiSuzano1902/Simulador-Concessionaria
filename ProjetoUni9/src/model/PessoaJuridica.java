package model;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String nomeEmpresa;

    public PessoaJuridica(String nome, String contato, String cnpj, String nomeEmpresa) {
        super(nome, contato);
        setCnpj(cnpj);
        setNomeEmpresa(nomeEmpresa);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj == null || cnpj.length() != 14) {
            throw new IllegalArgumentException("Número de CNPJ Inválido! Deve conter exatamente 14 dígitos.");
        }
        this.cnpj = cnpj;
    }  

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        if(nomeEmpresa == null){
            throw new IllegalStateException("Erro!!! Não aceitamos campos vazios. ");
        }
        this.nomeEmpresa = nomeEmpresa;
    }


    @Override
    public void exibirInformacoes(){
        System.out.println("--- Dados do Cliente (Pessoa Juridica) ---");
        System.out.println("Nome: " + getNome());  
        System.out.println("Contato: " + getContato()); 
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Empresa:: " + this.nomeEmpresa);
    }


    

}