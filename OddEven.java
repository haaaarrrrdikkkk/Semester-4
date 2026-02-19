class OddEven{
    int number;

    void check(){
        if(number % 2 == 0)
            System.out.println("Number is Even ");
            else
            System.out.println("Number is Odd");

        }
    
        public static void main(String[] args){

            OddEven obj = new OddEven();
            obj.number = 7;
            obj.check();

        }
    }
