//esse arquivo .java é exatamente o mesmo do que está em ./demo/src/main/java/Main.java



package java_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner (System. in);

        int vet[] = new int [5];

        System.out.println("Digite 5 valores para o vetor");

        for(int x=0; x<5; x++){ int valor = ler.nextInt();

            if(valor % 2 == 0) {
                vet [x] = valor;
            }
        }

        for(int x=0; x<5; x++){
        System.out.print(vet[x]+"\t");}

    }
}