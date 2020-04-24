package br.com.Locadora;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {

        int vet[];
        vet = new int[9];

        int elemento = 0;

        Scanner input =  new Scanner(System.in);


        for ( int i = 0; i< vet.length; i++){
            System.out.print(" Informe o elemento " + (i+1) + " para o array: ");
            vet[i] = input.nextInt();

        }

        System.out.println(" Informe um elemento para busca: ");


  //      BuscaLinear.Linear(elemento, vet);
        BuscaBinaria.Binaria(elemento, vet);

//        if(BuscaLinear.Linear(elemento, vet) == true)
//            System.out.println(" *** O numero foi achado no metodo linear *** ");
//        else
//            System.out.println(" *** O numero nao foi achado no metodo linear *** ");

        if(BuscaBinaria.Binaria(elemento, vet) == true)
            System.out.println(" *** O numero foi achado no metodo binario *** ");
        else
            System.out.println(" *** O numero nao foi achado no metodo binario *** ");


    }
    public static boolean Binaria (int x, int dados[]){

        int n = dados.length;
        int aux = 0;

        for(int i = 0; i < n-1; i++){
            for(int j = i+1 ; j < n; j++){     // Você trocou j por i aqui, estava   for(int j = i+1 ; i < n; j++){
                if(dados[i] > dados[j]){
                    aux = dados[j];
                    dados[j] = dados[i];
                    dados[i] = aux;
                }
            }
        }

        int meio;
        int inicio = 0;
        int fim = dados.length-1;
        while (inicio <= fim) {
            meio = (inicio + fim)/2;
            if (x == dados[meio])
                return true;
            if (x < dados[meio])
                fim = meio - 1;
            else
                inicio = meio + 1;
        }
        return false;

    }
}
