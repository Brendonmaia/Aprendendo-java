package flamingo.aprendendo.basico;

public class ArrysParte01 {
    public static void main( String[] args) {
        int [] idades = new int[5];
        idades[0] = 10;
        idades[1] = 21;
        idades[2] = 25;
        idades[3] = 59;
        idades[4] = 79;

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
    }
 }