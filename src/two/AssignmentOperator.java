package two;

public class AssignmentOperator {
    public static void main(String[] args) {

            int a = 10;
            int b = 20;
            int c = 0;

            c = a + b;
            System.out.println("c = a + b = " + c );//c=a+b=30;

            c += a ;
            System.out.println("c += a  = " + c );//c=c+a=30+10=40;

            c -= a ;
            System.out.println("c -= a = " + c );//c=c-a=40-10=30;

            c *= a ;
            System.out.println("c *= a = " + c );//c=c*a=30*10=300,

            c/= a ;
            System.out.println("c /= a = " + c );//c=c/a=300/10=30

            c %= a ;
            System.out.println("c %= a  = " + c );//c=c%a=30%10=0
    }
}