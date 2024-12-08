import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo(a) ao servirdor!");

        scanner.close();
    }
}