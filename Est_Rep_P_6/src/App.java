
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//---------------------------------------------------------------------------------------------------------------------

        System.out.println("Atividade 2:");
        Scanner sc1 = new Scanner (System.in);

        System.out.println("Digite o valor da coordenada x: ");
        int x = sc1.nextInt();
        System.out.println("Digite o valor da coordenada y: ");
        int y = sc1.nextInt();

        while (x != 0 && y != 0){
           if(x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
           }
           else if(x < 0 && y < 0){
                System.out.println("Terceiro quadrante");
           }
           else if(x > 0 && y < 0){
                System.out.println("Quarto quadrante");
           }
           else if(x < 0 && y > 0){
                System.out.println("Segundo quadrante");
           }

            x = sc1.nextInt();
            y = sc1.nextInt();
        }

        sc1.close();
    }
}
