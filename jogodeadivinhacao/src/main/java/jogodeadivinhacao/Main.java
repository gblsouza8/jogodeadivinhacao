package jogodeadivinhacao;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static int gerarAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(1, 50);
        return numeroAleatorio;
    }


    @SuppressWarnings("resource")
    public static void jogarNovamente(){
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja jogar novamente?\n 1. Sim\n 2. Não");
        int escolha = input.nextInt();
        if (escolha == 1){
            jogoCompleto();
        } else if (escolha == 2){
            System.out.println("Encerrando o jogo...");
            System.exit(0);
        } else {
            System.out.println("Faça uma escolha válida");
            jogarNovamente();
        }
    }

    public static void jogoCompleto() {
        int numeroAleatorio = gerarAleatorio();
        int tentativa = 0;
        while (tentativa <= 10) {
            @SuppressWarnings("resource")
            Scanner input = new Scanner(System.in);
            System.out.println("Digite um número: ");
            int numero = input.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("Parabéns! você acertou em " + tentativa + " tentativas!");
                jogarNovamente();
            } else if (numero < numeroAleatorio) {
                System.out.println("Você errou... tente um número maior!");
                tentativa += 1;
                System.out.println("Tentativas restantes: " + (10 - tentativa));
            } else {
                System.out.println("Você errou... tente um número menor!");
                tentativa += 1;
                System.out.println("Tentativas restantes: " + (10 - tentativa));
            }
    }
    System.out.println("Seu número de tentativas acabou...");
    jogarNovamente();
}




    public static void main(String[] args) {
        System.out.println("Adivinhe o número entre 1 e 50!");
        jogoCompleto();
        }
    }