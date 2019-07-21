package br.com.sysmanager.desafio2;

import java.util.ArrayList;
import java.util.List;

public class ManipularArray {
    public void countNumbers(){
        int quantidade = 10;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }

        System.out.println("Array original:");
        printArray(vetor);

        ordenaVetor(vetor);

        System.out.println("Array ordenado:");
        printArray(vetor);

        // Parâmetro que utilizei para comparar o Array criado aleatoriamente de 0 a 10
        System.out.println("Array ordenado com o método lessThan: ");
        printArray(getNumbersLessThan(4,vetor));

    }

    private void ordenaVetor(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;
        }
    }
// Método criado para pegar os números menores que o parâmetro estipulado.
    private Integer[] getNumbersLessThan(int number, int[] array) {
        List<Integer> lessNumbers = new ArrayList();
        for(int i:array) {
            if(i<number) {
                lessNumbers.add(i);
            }
        }
        return lessNumbers.toArray(new Integer[lessNumbers.size()]);
    }

    private void printArray(int[] array) {
        StringBuilder buf = new StringBuilder("Array: ");
        for(int i:array) {
            buf.append(i).append(",");
        }
        System.out.println(buf.toString().substring(0,buf.length()-1));
    }

    private void printArray(Integer[] array) {
        StringBuilder buf = new StringBuilder("Array: ");
        for(int i:array) {
            buf.append(i).append(",");
        }
        System.out.println(buf.toString().substring(0,buf.length()-1));
    }
}
