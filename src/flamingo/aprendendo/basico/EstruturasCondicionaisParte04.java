package flamingo.aprendendo.basico;

import java.util.Scanner;

public class EstruturasCondicionaisParte04 {
    static void main() {
        //Switch Case (Escolha Caso)
        byte diaSemana;
        String resultado;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        diaSemana = sc.nextByte();
        switch (diaSemana){
            case 1:
            resultado = "Domingo";
            break;
            case 2:
                resultado = "Segunda-feira";
                break;
            case 3:
                resultado = "Terça-feira";
                break;
            case 4:
                resultado = "Quarta-feira";
                break;
            case 5:
                resultado = "Quinta-feira";
                break;
            case 6:
                resultado = "Sexta-feira";
                break;
            case 7:
                resultado = "Sabado";
                break;
            default:
                resultado = "Dia inválido!";

                System.out.println(resultado);

        }
        System.out.printf("O dia da semana é: %s" , resultado);
    }
}
