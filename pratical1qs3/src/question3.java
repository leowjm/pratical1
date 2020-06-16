import java.util.Scanner;

public class pratical1q3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String creditNumber;
        int sum = 0, sum2 = 0;
        int total;
        
        System.out.print("Enter credit card No.: ");
        creditNumber = scan.nextLine();
        
        for (int x = 7; x>=0; x-=2){
            int temp = creditNumber.charAt(x) - '0';
            sum += temp;
            System.out.print(temp+"+");
        }
        System.out.print("\b ");       
        System.out.print("= " + sum + "\n");
        
        for (int x = 6; x>=0; x-=2 ){
            int temp = creditNumber.charAt(x)-'0';
            System.out.print(temp * 2 +" " );
        }
        
        System.out.print("\n");
        for (int x = 6; x>=0; x-=2 ){
            int temp = creditNumber.charAt(x)-'0';
            int value = temp * 2;
            int no1 = value % 10;
            int no2 = value / 10;
            
            sum2 += no1 + no2;
            System.out.print(no2+"+"+no1+"+");
          
        }
        System.out.print("\b ");
        System.out.print("=" + sum2);
        System.out.print("\n");
        
        total = sum + sum2;
        System.out.print(sum + "+" + sum2 + "=" + total + "\n");
        
    }
}
