import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int param1 = scan.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int param2 = scan.nextInt();

       
       try {
        contar(param1, param2);
       } catch (ParametrosInvalidosException e) {
        System.out.println("Parâmetros inválidos");
        System.out.println(e.getMessage());
       }     

        scan.close();
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException{
        int total = 0;
        if(param2 > param1) {
            total = param2 - param1;
        }else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        for (int i = 0; i < total; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    
    }
}
