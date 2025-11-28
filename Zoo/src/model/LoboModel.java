package model;

public class LoboModel extends Animal {

    private int tamanhoMatilha;

    public LoboModel(String _nome, char _sexo, int _tamanhoMatilha) {
        super(_nome, _sexo);
        this.tamanhoMatilha = _tamanhoMatilha;
    }

    public int getTamanhoMatilha() {
        return tamanhoMatilha;
    }

    public void setTamanhoMatilha(int tamanhoMatilha) {
        this.tamanhoMatilha = tamanhoMatilha;
    }

    @Override
    public void fazerSom() {
        System.out.println("Aulido");
    }
}
