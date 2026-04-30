import java.util.Scanner; 
public class Tender{
 float cost;
 String company;

 void getData(Scanner sc){
    System.out.println("Enter company name: ");
    company = sc.next();
    System.out.println("Enter the cost :");
    cost = sc.nextFloat();

 }
 public class Main(){
    public static void main(String args[]){
        Scanner sc = new Scanner(Sytem.in);

        Tender[] t = new Tender[5];
        
        for(int i=0; i < 5; i++){
            t[i] = new Tender();
        }
        System.out.println("Enter details for 5 comapnies : ");
        for(int i =0; i< 5; i++){
            Tender[i].getData();
            
        }
    }
 }
    
    
}