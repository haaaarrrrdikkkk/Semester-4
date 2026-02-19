import java.util.Scanner;
class MaxThr{
    int a,b,c;
    MaxThr(int x, int y, int z){
        a = x;
        b = y;
        c = z;

    }
    void findMax(){
        int max = a;
        if(b>max){
        max = b;
        }
        if(c>max){
        max = c;
        }
        System.out.println("Maximum of three Numbers: "+ max);

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three Numbers: ");
        int x = in.nextInt();
        int y= in.nextInt();
        int z= in.nextInt();

        MaxThr m = new MaxThr(x,y,z);
        m.findMax();

    }
}