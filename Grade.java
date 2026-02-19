import java.util.Scanner;
class Grade{
    int percent;
    Grade(int p){
        percent = p;

    }
    void showGrade(){
        if(percent > 90){
            System.out.println("Grade A!");

        }
            if(percent >= 80){
            System.out.println("Grade B!");

        }
            if(percent >= 70){
            System.out.println("Grade C!");

        }
            if(percent > 60){
            System.out.println("Grade D!");

        }
            if(percent >= 40){
            System.out.println("Grade E!");

        }
            if(percent < 40){
            System.out.println("Grade F!");

        }
    }
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Percentage: ");
            int p = in.nextInt();

            Grade g= new Grade(p);
            g.showGrade();

        }
    }
