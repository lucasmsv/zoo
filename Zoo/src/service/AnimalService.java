package service;

import model.Animal;
import model.LeaoModel;
import model.LoboModel;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    private static final List<Animal> animalList = new ArrayList<>();

    public void salvarAnimal(Animal _animal) {
        animalList.add(_animal);
    }

    public void getAnimais() {
        if (animalList.isEmpty()) {
            System.out.println("Nenhum animal encontrado no momento.");
            return;
        }
        System.out.println("==== REGISTROS LOBOS ====");
        for (Animal animal : animalList) {
            if (animal instanceof LoboModel) {
                System.out.println("\t• Nome: " + animal.getNome());
                System.out.println("\t  Sexo: " + animal.getSexo());
                System.out.println("\t  Tamanho Matilha: " + ((LoboModel) animal).getTamanhoMatilha());
                System.out.print("\t  Som Emitido: "); animal.fazerSom();
            }
        }
        System.out.println("==== REGISTROS LEÕES ====");
        for (Animal animal : animalList) {
            if (animal instanceof LeaoModel) {
                System.out.println("\t• Nome: " + animal.getNome());
                System.out.println("\t  Sexo: " + animal.getSexo());
                System.out.println("\t  Peso: " + ((LeaoModel) animal).getPeso());
                System.out.print("\t  Som Emitido: "); animal.fazerSom();
            }
        }
    }
}
