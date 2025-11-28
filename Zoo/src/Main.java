import model.Animal;
import model.LeaoModel;
import model.LoboModel;
import service.AnimalService;

import java.util.Scanner;

public class Main {

    private static final Scanner in =  new Scanner(System.in);
    private static final AnimalService service = new AnimalService();
    private static Animal animal;

    private static String nome;
    private static char sexo;

    public static void main(String[] args) {
        lerOpcaoMenu();
    }

    private static void cadastrarLeao() {
        System.out.println("==== CADASTRAR LEÃO ====");
        cadastroAnimal();
        System.out.print("Peso: ");
        double peso = Double.parseDouble(in.nextLine());
        service.salvarAnimal(animal = new LeaoModel(nome, sexo, peso));
    }

    private static void cadastrarLobo() {
        System.out.println("==== CADASTRAR LOBO ====");
        cadastroAnimal();
        System.out.print("Tamanho Matilha: ");
        byte tamanhoMatilha = Byte.parseByte(in.nextLine());
        service.salvarAnimal(animal = new LoboModel(nome, sexo, tamanhoMatilha));
    }

    private static void cadastroAnimal() {
        System.out.print("Nome: ");
        nome = in.nextLine().trim();
        System.out.print("Sexo (1 - M / 2 - F): ");
        char sexoTipo = in.nextLine().charAt(0);
        sexo = sexoTipo == '1' ? 'M' : 'F';
    }

    private static void lerOpcaoMenu() {
        int opcao;
        do {
            opcao = exibirMenu();
            System.out.println();
            switch (opcao) {
                case 1 -> cadastrarLobo();
                case 2 -> cadastrarLeao();
                case 3 -> service.getAnimais();
                case 4 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Selecione uma opção válida.");
            }
            System.out.println();
        } while(opcao != 4);
    }

    private static int exibirMenu() {
        System.out.println("==== MENU ZOO ====");
        System.out.println("1. Cadastrar Lobo");
        System.out.println("2. Cadastrar Leão");
        System.out.println("3. Listar Animais");
        System.out.println("4. Sair");
        System.out.print(">> ");
        return Integer.parseInt(in.nextLine());
    }
}
