import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int idade;
        int anos;
        int meses;
        int dias;
        
        Scanner input = new Scanner(System.in);
        System.out.println ("Insira os anos: ");
        anos = input.nextInt();
        System.out.println ("Insira os meses: ");
        meses = input.nextInt();
        System.out.println("Insira os dias: ");
        dias = input.nextInt();
        
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.println("O total de dias é " + totalDias)
        
        input.close();
        
    }
}