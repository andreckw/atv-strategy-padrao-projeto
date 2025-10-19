import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Batalha;
import classes.armas.ArcoElfico;
import classes.armas.CajadoArcano;
import classes.armas.EspadaLonga;
import classes.personagens.Arqueiro;
import classes.personagens.Guerreiro;
import classes.personagens.Mago;
import classes.personagens.Personagem;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        List<Personagem> personagens = new ArrayList<>();
        
        personagens.add(new Guerreiro(new EspadaLonga()));
        // personagens.add(new Arqueiro(new ArcoElfico()));
        personagens.add(new Mago(new CajadoArcano()));

        Batalha batalha = new Batalha(personagens);

        int escolha = 1;

        while (batalha.personagens.size() > 1) {
            batalha.batalhar(escolha);
            
            escolha = Integer.parseInt(scan.nextLine());
        }

        System.out.println("O " + batalha.personagens.get(0).getClass().getSimpleName() + " venceu");
    }
}
