package arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {
        int [] vetor ={-5, -6, 15, 20, 8, 3};

        System.out.print(" \n Vetor : ");
        for (int i = 0; i< vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.print(" \n Vetor : ");
        for (int i = (vetor.length -1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        }


    }
}
