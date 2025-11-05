package br.com.hc.model.usuario;

public class Paciente {
    private String nome;
    private String cpf;
    private int idade;
    private String rg;
    private boolean convenio;
    private int idConvenio;


    public Paciente() {
    }


    public Paciente(String nome, String cpf, int idade, String rg, boolean convenio, int idConvenio) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.rg = rg;
        this.convenio = convenio;
        this.idConvenio = idConvenio;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }


    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", rg='" + rg + '\'' +
                ", convenio=" + convenio +
                ", idConvenio=" + idConvenio +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return cpf.equals(paciente.cpf);
    }

    public int hashCode() {
        return cpf.hashCode();
    }
}