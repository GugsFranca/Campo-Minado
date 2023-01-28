package GugsFranca;

import GugsFranca.modelo.Tabuleiro;
import GugsFranca.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);
    
    }
}
