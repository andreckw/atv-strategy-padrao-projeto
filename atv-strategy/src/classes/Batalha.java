package classes;

import java.util.ArrayList;
import java.util.List;

import classes.personagens.Personagem;
import interfaces.IStatusEffect;

public class Batalha {
    
    public int indexPersonagemAtual;
    public List<Personagem> personagens = new ArrayList<>();

    public Batalha(List<Personagem> personagens) {
        personagens.sort((p1, p2) -> Integer.compare(p1.getAtr().getDestreza(), p2.getAtr().getDestreza()));
        this.personagens = personagens;
        this.indexPersonagemAtual = 0;
    }

    public void batalhar(int indexInimigo) {
        // Ataca um inimigo
        Personagem personagemAtual = personagens.get(indexPersonagemAtual);
        personagemAtual.atacar(personagens.get(indexInimigo));

        // Acionar todos os efeitos de todos os personagens
        for (Personagem personagem : personagens) {
            for (IStatusEffect effect : personagem.getEeitos()) {
                System.out.println(personagem + " - " + effect);
                if (effect != null) {
                    effect.efeito(personagem);
                }
            }
        }

        List<Personagem> personagemsRemover = new ArrayList<>();
        personagemsRemover.addAll(personagens);

        for (Personagem personagem : personagemsRemover) {
            if (personagem.getVida() <= 0) {
                personagens.remove(personagem);
            }
        }

        
        System.out.println("Dados do combate: ");
        for (Personagem personagem : personagens) {
            System.out.println("-> Nome: " + personagem.getClass().getSimpleName());
            System.out.println("-> Vida: " + personagem.getVida());
            System.out.println("-> Mana: " + personagem.getMana());
            System.out.println("*------------------------*");
        }

        indexPersonagemAtual += 1;

        if (indexPersonagemAtual >= this.personagens.size()) {
            indexPersonagemAtual = 0;
        }

        personagemAtual = personagens.get(indexPersonagemAtual);

        System.out.println("Turno de "+ personagemAtual.getClass().getSimpleName());
        int i = 0;
        for (Personagem personagem : personagens) {
            if (!personagem.equals(personagemAtual)) {
                System.out.println("["+i+"] " + personagem.getClass().getSimpleName());
            }
            i++;
        }
    }
}
