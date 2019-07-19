package br.com.sysmanager.desafio1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrainCompositionTest {
    @Test
    public void atracarSucesso() {
        TrainComposition composicao = new TrainComposition();
        composicao.atracar(7, TrainComposition.Orientacao.ESQUERDA);
        composicao.atracar(13, TrainComposition.Orientacao.ESQUERDA);

        assertEquals(13, (int) composicao.getVagoes().get(0));
        assertEquals(7, (int) composicao.getVagoes().get(1));
    }

    @Test
    public void desatracarSucessoDireita(){
        TrainComposition composicao = new TrainComposition();
        composicao.atracar(7, TrainComposition.Orientacao.ESQUERDA);
        composicao.atracar(13, TrainComposition.Orientacao.ESQUERDA);

        composicao.desatracar(TrainComposition.Orientacao.DIREITA);

        assertEquals(13, (int) composicao.getVagoes().get(0));

    }

    @Test
    public void desatracarSucessoEsquerda(){
        TrainComposition composicao = new TrainComposition();
        composicao.atracar(7, TrainComposition.Orientacao.ESQUERDA);
        composicao.atracar(13, TrainComposition.Orientacao.ESQUERDA);

        composicao.desatracar(TrainComposition.Orientacao.ESQUERDA);

        assertEquals(7, (int) composicao.getVagoes().get(0));

    }
}