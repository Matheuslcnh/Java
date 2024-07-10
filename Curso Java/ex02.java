
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;

public class ex02 {
    public static void main(String[] args) {
        //Hora do Computador
        Date relogio = new Date();
        System.out.println("a hora do sistema é " + relogio.toString());
        // System.out.println(relogio.toString());
        //Idioma do sistema
        Locale loc = Locale.getDefault();
        System.out.println("O edioma do sistema é " + loc.getDisplayLanguage());
        // Resolução da tela
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("A resolução da tela é: "+d.width + "x" +d.height);
        

        
    }
}
