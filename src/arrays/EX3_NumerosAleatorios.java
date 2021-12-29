package arrays;

import java.util.Random;

public class EX3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numeroAleatorio = new int[20];

        for (int i =0; i< numeroAleatorio.length; i++){
            int numero= random.nextInt(100);
            numeroAleatorio[i]=numero;

        }
        System.out.print("Numero aleatório :");
        for (int numero: numeroAleatorio){
            System.out.print(numero + "  ");

        }

        System.out.print("\nNumero aleatório antecessor:");
        for (int numero: numeroAleatorio){
            System.out.print(numero -1 + "  ");

        }

        System.out.print("\nNumero aleatório sucessor:");
        for (int numero: numeroAleatorio){
            System.out.print(numero +1 + "  ");

        }



    }
}
