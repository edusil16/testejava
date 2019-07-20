package br.com.sysmanager.desafio1;

import java.util.LinkedList;

public class TrainComposition {

    enum Orientacao {
        ESQUERDA, DIREITA
    }

    private LinkedList<Integer> vagoes = new LinkedList<Integer>();

    public void atracar(Integer vagao, Orientacao orientacao) {
        switch (orientacao) {
            case ESQUERDA:
                vagoes.addFirst(vagao);
                break;
            case DIREITA:
                vagoes.addLast(vagao);
                break;
        }
    }

    public void desatracar(Orientacao orientacao) {
        switch (orientacao) {
            case ESQUERDA:
                vagoes.removeFirst();
                break;
            case DIREITA:
                vagoes.removeLast();
                break;
        }
    }

    public LinkedList<Integer> getVagoes() {
        return vagoes;
    }

}
