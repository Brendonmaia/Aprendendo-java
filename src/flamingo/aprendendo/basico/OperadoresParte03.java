package flamingo.aprendendo.basico;

public class OperadoresParte03 {
    public static void main(String[] args) {
        /*
        * && AND -> E
        * || OR -> OU
        * ! NOT -> NÃO
        * */

        byte idade = 16;
        boolean isCNH = true;
        boolean isEstaNaLeiparaDirigir = idade >= 18 && isCNH == true;

        System.out.println("Operadores pt03");
        System.out.println(isEstaNaLeiparaDirigir);
        System.out.println();
        System.out.println();
        System.out.println();

    }


}
