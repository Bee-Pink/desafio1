import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do Heroi:");
        String nome = scanner.nextLine();
        System.out.println("Insira a XP que o Heroi se encontra no momento:");
        int xp = scanner.nextInt();
        scanner.close();

        String nivel = determinarNivel(xp);

        System.out.println("O Heroi de nome " + nome + " esta no nivel de " + nivel);

    }

    private static String determinarNivel(int xp) {
        if (xp <= 1000) {
            return "Ferro";
        } else if (xp <= 2000) {
            return "Bronze";
        } else if (xp <= 5000) {
            return "Prata";
        } else if (xp <= 7000) {
            return "Ouro";
        } else if (xp <= 8000) {
            return "Platina";
        } else if (xp <= 9000) {
            return "Ascendente";
        } else if (xp <= 10000) {
            return "Imortal";
        } else {
            return "Radiante";
        }
    }
}