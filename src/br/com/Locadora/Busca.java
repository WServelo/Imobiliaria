package br.com.Locadora;

import java.util.Arrays;

public class Busca {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(busca(array, 1));
        System.out.println(busca(array, 5));
        System.out.println(busca(array, 12));
    }

    private static int busca(int[] array, int chave) {
        return buscaBinariaRecursiva(array, 0, array.length - 1, chave);
    }

    private static int buscaBinariaRecursiva(int[] array, int menor, int maior, int chave) {
        int media = (maior + menor) / 2;
        int valorMeio = array[media];

        if (menor > maior)
            return -1;
        else if (valorMeio == chave)
            return media;
        else if (valorMeio < chave)
            return buscaBinariaRecursiva(array, media + 1, maior, chave);
        else
            return buscaBinariaRecursiva(array, menor, media - 1, chave);
    }
}

