
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//---------------------------------------------------------------------------------------------------------------------
Scanner sc = new Scanner(System.in);

int i;
    
int w = sc.nextInt();

int x = sc.nextInt();
  
    while (x<5){
        for(i = 0; i<=x; i++){
            w =w + 1 ;
    
            System.out.println("analise: " +w);
            x = sc.nextInt();
            System.out.println("Numero de vezes do for: " +i);
            
            }
            System.out.println("Numero de vezes do while: " +x);
        }
        sc.close();
    }
}
