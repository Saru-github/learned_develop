public class Factorial {

    public static void main(String[] args) {
        Factorial fact1 = new Factorial();
        Factorial fact2 = new Factorial();

        System.out.println(fact1.factorialFunc(5));
        System.out.println(fact2.factorialFunc(6));

    }
    public int factorialFunc(int n){
        if(n >1){
            return n*this.factorialFunc(n-1);
        } else {
            return 1;
        }
    }

    public int factorialFunc2(int n){
        if(n <= 1){
            return 1;
        } else {
            return n*this.factorialFunc(n-1);
        }
    }
}
