class ParameterizedCons {
    int n;

    ParameterizedCons(int a) {
        n = a;
        System.out.println("Value : " + n);

    }

    public static void main(String[] args) {
        ParameterizedCons obj = new ParameterizedCons(10);

    }
}