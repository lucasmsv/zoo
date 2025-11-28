package model;

public class LeaoModel extends Animal {
    private double peso;

    public LeaoModel(String _nome, char _sexo, double _peso) {
        super(_nome, _sexo);
        this.peso = _peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void fazerSom() {
        System.out.println("Rugido");
    }
}
