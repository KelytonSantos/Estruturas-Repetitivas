
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.println("Digite a senha: ");
        senha = sc.nextInt();
        
        while (senha != 2002) {
            System.out.println("Senha Invalida.\n\n\n");
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();

        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
