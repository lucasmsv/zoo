package model;

public abstract class Animal {
    private String nome;
    private char sexo;

    public Animal(String _nome, char _sexo) {
        this.nome = _nome;
        this.sexo = _sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public abstract void fazerSom();
}
