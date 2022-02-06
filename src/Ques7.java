import java.util.Arrays;
import java.util.Scanner;

class Animal{
    String name;
    String category;
    Animal(String name,String category) {
        this.name = name;
        this.category = category;
    }
  public   String toString(){
        return name+"("+category+") ";
    }
}


public class Ques7 {
    static Animal []X;

    static boolean P(Animal x){
        return x.category.equals("DOG");
    }

   static boolean all(){
        String res="";
        for (int i=0;i<X.length-1;i++)  res+="P("+X[i].name+") ^ ";
        res+="P("+X[X.length-1].name+")";
        System.out.println(res);
        res="";
        boolean logic=P(X[X.length-1]);
        for (int i=0;i<X.length-1;i++)  {
            res+=P(X[i])+" ^ ";
            logic&=P(X[i]);
        }
       res+=P(X[X.length-1]);
       System.out.println(res);
       System.out.println(" Vx P(x) = "+logic);
       System.out.println("~( Vx P(x) ) = "+!logic);
       return !logic;
    }

    static boolean some(){
        String res="";
        for (int i=0;i<X.length-1;i++)  res+="~P("+X[i].name+") v ";
        res+="~P("+X[X.length-1].name+")";
        System.out.println(res);
        res="";
        boolean logic=P(X[X.length-1]);
        for (int i=0;i<X.length-1;i++)  {
            res+=(!P(X[i]))+" v ";
            logic|=(!P(X[i]));
        }
        res+=(!P(X[X.length-1]));
        System.out.println(res);
        System.out.println("]x ~(P(x)) = "+logic);
        return logic;
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of domain ");
        int n=scanner.nextInt();
        assert  n>0 :"Value of n can not be zero ";
        X=new Animal[n];
        System.out.println("Enter Details ");
        for (int i=0;i<n;i++)X[i]=new Animal(scanner.next(),scanner.next());
        System.out.println("============DOMAIN=========");
        System.out.println(Arrays.toString(X));
        System.out.println("============================");
        System.out.println("\nP(x) : x is dog ");
        System.out.println("\nTo Prove , ~ ( Vx P(x) ) == ]x ~P(x) ");
        System.out.println("\nTaking Left Side , ~ ( Vx P(x) ) ==>  ");
        boolean left=all();
        System.out.println(" \n Taking Right Side , ]x ~(P(x)) ==> ");
        boolean right=some();
        if (left==right){
            System.out.println("\n\n~ ( Vx P(x) ) == ]x ~P(x)  [ Hence Proved  ] ");
        }


    }

}
