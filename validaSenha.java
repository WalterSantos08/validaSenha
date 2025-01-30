
import java.util.Scanner;

public class validaSenha {

	public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int senhaDefinida = 2002; 
        int senha; 

        while (true) { 
            System.out.println("Digite a sua senha: ");
            senha = dados.nextInt();

            if (senha == senhaDefinida) {
                System.out.println("Acesso Permitido");
                break; 
            } else {
                System.out.println("Senha Invalida");
            }
        }

        dados.close(); 
    }
}
