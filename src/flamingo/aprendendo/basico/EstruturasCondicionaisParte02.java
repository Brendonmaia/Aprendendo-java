package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte02 {
    public static void main(String[] args) {

//        byte idade = 18;
//
//        if (idade >= 18) {
//
//
//            System.out.println("pode comprar bebida alcoólica");
//        }else {
//            System.out.println("Não pode comprar bebida alcoólica");
//
//        }

    byte idade = 16;
    String categoria;

    // < 15 - Infantil
    // >= 15 && <18 - Juvenil
    // >= 18 - Adulto

   if (idade < 15) {
       categoria ="Categoria Infantil";
   } else if (idade >= 15 && idade < 18) {
     categoria = "Categoria Juvenil";
   } else {
       categoria = "Categoria Adulto";
   }
        System.out.println(categoria);
    }
}
