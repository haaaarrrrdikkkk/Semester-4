import java.util.Scanner;
class Item{
    int code;
    double price;

    void input(int c, double p){
        code = c;
        price = p;


    }
    void display(){
        System.out.println(code + "\t\t"+ price);

    }
}
public class codeandprice{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for(int i = 0; i< 5; i++){
            items[i] = new Item();
            System.out.println("Enter code and price for every commodity: "+ (i+1) +":");
            int code = in.nextInt();
            double price = in.nextDouble();

            items[i].input(code,price);
            total += price;

        }
        System.out.println("\nCode\t\tPrice");
        System.out.println("----------------");

        for (int i= 0; i<5; i++){
            items[i].display();

        }
        System.out.println("--------------------");
        System.out.println("Total Price: "+ total);

    }
}
