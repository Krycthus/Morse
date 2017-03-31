import java.io.*;

public class Main {
    public static void main(String[] args) {

        String codeMorse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
                ".-.-.-", "-----", ".----", "..---", "...--", "....-", ".....",
                "-...", "--...", "---..", "----"};

        String corespondance = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.0123456789";

        System.out.println("Traduire en Morse ? (1) \nTraduire en Texte ? (2)\n ->");
        int choix = Integer.parseInt(lireString());

        switch (choix) {
            case 1: //Texte vers Morse
                System.out.print("\nEntrer le mot à traduire\n->");
                String x;
                x = lireString();
                x = x.toUpperCase();
                for (int i = 0; i < x.length(); i++) {
                    for (int t = 0; t < corespondance.length(); t++) {
                        if (x.charAt(i) == corespondance.charAt(t)) {
                            System.out.print(" " + codeMorse[t] + "  ");
                            break;
                        }
                    }
                }
                break;

            case 2://Morse vers texte
                System.out.print("\nEntrer le mot à traduire\n->");
                String y = lireString();
                String ytab[] = y.split(" ");
                for (int i = 0; i < ytab.length; i++) {
                    for (int t = 0; t < corespondance.length(); t++) {
                        if (ytab[i].equals(codeMorse[t])) {
                            System.out.print(corespondance.charAt(t));
                            break;
                        }
                    }
                }
                break;
        }
    }
    public static String lireString ()   // lecture d'une chaine
    {
        String ligne_lue = null ;

        try
        {
            InputStreamReader lecteur = new InputStreamReader (System.in) ;
            BufferedReader entree = new BufferedReader (lecteur) ;
            ligne_lue = entree.readLine() ;
        }
        catch (IOException err)
        {
            System.exit(0) ;
        }
        return ligne_lue ;
    }
}