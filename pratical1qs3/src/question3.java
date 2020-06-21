import java.util.Scanner;

public class pratical1q3 {
    public static void main(String[] args){
    
        String creditNum;
        int sum=0,sum2=0,total=0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Creatit No : ");
        creditNum = scan.nextLine();
        
        for(int x=7;x>=0;x-=2){
          int temp = creditNum.charAt(x)-'0';
          sum+=temp;
            System.out.print(+temp+"+");
                
        }
        System.out.print("\b="+sum+".\n");
        
       for(int x=6;x>=0;x-=2){
        int temp = creditNum.charAt(x)-'0';
        temp*=2;
        System.out.print(+temp+" ");
       }
       System.out.print("\n");
       
       for(int x=6;x>=0;x-=2){
        int temp= creditNum.charAt(x)-'0';
        temp*=2;   
        int no1=temp%10;
        int no2=temp/10;
        sum2+=no1+no2; 
        System.out.print(+no2+"+"+no1+"+");
         
       }
     System.out.print("\b="+sum2+".\n");
     total=sum+sum2;
     System.out.print(+sum+"+"+sum2+"="+total+".\n");
    }
}
