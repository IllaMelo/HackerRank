import java.util.Scanner;

public class stdin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        //Sempre utilizar um nextLine() apos um double e/ou um int
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
    
}