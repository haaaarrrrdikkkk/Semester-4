import java.util.Scanner;
class ReverseNum{
    int num;
    ReverseNum(int n){
        num= n;

    }
    void reverse(){
        int rev = 0;
        int temp = num;
         
         while(temp != 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
         }
         System.out.println("Reversed Number: "+rev);
         
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        System.out.println("Enter a number:");
        int n = in.nextInt();

        ReverseNum r= new ReverseNum(n);
        r.reverse();

    }}
