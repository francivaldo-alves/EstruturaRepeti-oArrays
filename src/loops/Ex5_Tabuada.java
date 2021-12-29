package loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {

        int tabuada=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada ");
        tabuada = scan.nextInt();
        int count =1;

        System.out.println(" tabuada " + tabuada);
        do {

            System.out.println( + tabuada  +" X " + count  + "=" + (tabuada * count));
            count++;


        }while(count<=10);

        System.out.println(" tabuada do laço for" + tabuada);
        for(int i=1; i<=10; i++) {

            System.out.println(+tabuada + " X " + i + "=" + (tabuada * i));
        }
    }


    }


