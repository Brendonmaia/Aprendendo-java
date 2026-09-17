package flamingo.aprendendo.basico;

public class ArrysParte02 {
    public static void main(String [] args) {
        int i = 0;
       String[] nomes = new String[4];

       nomes[0] = "Amora";
       nomes[1] = "Belinha";
       nomes[2] = "Lucky";
       nomes[3] = "Lupita";

       nomes = new String[5];
       nomes[4] = "Maia";

       while (i < nomes.length) {
           System.out.println(nomes[i]);
           i++;
       }

    }
}
