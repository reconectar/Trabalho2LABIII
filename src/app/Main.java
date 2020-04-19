package app;

import util.Timer;

import java.util.Arrays;
import java.util.Random;

public class Main {

    //Cenario I:
    // Metodo de multiplicacao Iterativa
    static int multIterativa(int a, int b){
        int aux = 0;
        for(int i=b; b!=0; b--)
            aux+=a;

        return aux;
    }

    // Metodo de multiplicacao Recursiva
    static int multRecursiva(int a, int b){
        if (a == 0 || b == 0)
            return 0;

        else if( b < 0 )
            return - a + multRecursiva(a, b + 1);

        else
            return a + multRecursiva(a, b - 1);

    }

    //Cenario 2:
    // Algoritmo gerador de vetor
    static int[] gerarVetorInteiros(int tamanhoVetor){
        int[] vetor = new int[tamanhoVetor];
        for(int i=0; i<tamanhoVetor; i++){
            vetor[i] = i+1;
        }
        return vetor;
    }

    // Metodo de busca sequencial
    static Boolean buscaSequencial(int num, int vetor[]){
        for(int i = 0; i<vetor.length; i++)
            if (vetor[i] == num)
                return true;

        return false;
    }

    // Metodo de busca binaria do proprio java com retorno booleano
    static Boolean buscaBinaria(int num, int vetor[]){
        return Arrays.binarySearch(vetor, num) < 0;
    }

    //Cenario 3:
    // Algoritmo gerador conjutos
    static char[] gerarConjuntoAleatorio(int tamanhoConjunto){
        Random rnd = new Random();
        char[] conjunto = new char[tamanhoConjunto];
        for(int i = 0; i<tamanhoConjunto; i++){
            conjunto[i] = (char) (rnd.nextInt(26) + 'a');
        }
        return conjunto;
    }

    //Algoritmo que imprime todos os subconjuntos de um conjunto
    static void imprimirSubconjuntos(char conjunto[])
    {
        int n = conjunto.length;
//        int quantidadeSubconjuntos = (int) Math.pow(2,n);
//        System.out.println(quantidadeSubconjuntos);

        for (int i = 0; i < (1<<n); i++)
        {
//            System.out.print("{ ");
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0) {
//                    System.out.print(conjunto[j] + " ");
                }
//            System.out.println("}");
        }
    }

    public static void main(String[] args) {
        try{
            int[] vetor = gerarVetorInteiros(20000000);
            Timer timer = new Timer(); //Iniciando o timer

            //Cenario 1
            //Iterativo
//            multIterativa(3,100);
//            multIterativa(3,1000);
//            multIterativa(3,10000);
//            multIterativa(3,100000);
//            multIterativa(3,1000000);
            //Recursivo
//            multRecursiva(3,100);
//            multRecursiva(3,1000);
//            multRecursiva(3,10000);
//            multRecursiva(3,100000);
//            multRecursiva(3,1000000);

            //Cenario 2
            //Sequencial
//            buscaSequencial(1000 ,vetor);
//            buscaSequencial(10000 ,vetor);
//            buscaSequencial(100000 ,vetor);
//            buscaSequencial(1000000 ,vetor);
//            buscaSequencial(10000000 ,vetor);
//            buscaSequencial(21000000 ,vetor);
            //Binaria
//            buscaBinaria(1000 ,vetor);
//            buscaBinaria(10000 ,vetor);
//            buscaBinaria(100000 ,vetor);
//            buscaBinaria(1000000 ,vetor);
//            buscaBinaria(10000000 ,vetor);
//            buscaBinaria(21000000 ,vetor);

            //Cenario 3
//            int tamanhoConjunto = 2;
//            int tamanhoConjunto = 4;
//            int tamanhoConjunto = 8;
//            int tamanhoConjunto = 16;
//            int tamanhoConjunto = 25;
//            imprimirSubconjuntos(gerarConjuntoAleatorio(tamanhoConjunto));

//            System.out.println("Tempo decorrido: " + timer.getTotalTime());
            System.out.println("Tempo decorrido em nanosegundos: " + timer.getTotalTimeInNano());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
