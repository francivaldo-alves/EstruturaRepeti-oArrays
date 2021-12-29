package loops;

import java.util.Scanner;

public class EX4_ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int count=0, numero =0,numeroPar =0, numeroIpar=0, quantNumeros=0;

        System.out.println("digite quantos numeros: ");
        quantNumeros = scanner.nextInt();
        do{
            System.out.println("Número: ");
            numero = scanner.nextInt();
            count++;
            if(numero % 2 ==0) numeroPar++;
            else numeroIpar++;


        }while(count < quantNumeros);

        System.out.println(" Quantidade Par " + numeroPar);
        System.out.println("quantidade Impar: " + numeroIpar );

    }

}
