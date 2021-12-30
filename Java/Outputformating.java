import java.util.Scanner;
public class Outputformating {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //O "-" significa espaço e o 15 logo após mostra que são 15 espaços depois da string "s".
            //O "03" significa que o numero "d" tem que ter pelo menos 3 casas.
            System.out.printf("%-15s%03d%n", s1, x);
            
        }
        System.out.println("================================");
        sc.close();

    }

}
