import java.util.*;


class LoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int n1= (a+(int)Math.pow(2, 0)*b);
            int n2 = n1 + ((int)Math.pow(2, 1)*b);
            String serie = n1+" "+n2+" ";
            for(int j=2;j<n;j++){
                int n3 = n2+ ((int)Math.pow(2, j)*b);
                n2=n3;
                serie+=n3+" ";
                
            }
            System.out.println(serie);

            
            
        } 
        in.close();
    }
}