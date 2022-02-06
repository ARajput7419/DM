import java.util.Scanner;

public class Ques5 {


    static   boolean constants[]={true,false};
    static  boolean imply(boolean p,boolean q){
        return !p|q;
    }

    static  void contradiction(){
        System.out.println("p\t\t\t~p\t\t\tp ^ ~p");
        for (boolean p:constants) System.out.println(p+"\t\t"+(!p)+"\t\t"+(p&!p));
    }


    static void contingency(){

        System.out.println("p\t\t\tq\t\t\tp v q");
        for (boolean p:constants) for (boolean q:constants) System.out.println(p+"\t\t"+q+"\t\t"+(p|q));


    }


    static  void tautology(){
        System.out.println("p\t\t\tq\t\t\tp v q\t\t~q\t\t(p v q)^~q\t\t((p ∨ q) ∧ ~q) → p");
        for (boolean p:constants) for (boolean q:constants)
            System.out.println(p+"\t\t"+q+"\t\t"+(p|q)+"\t\t"+(!q)+"\t\t"+((p|q)&(!q))+"\t\t\t"+imply(((p|q)&!q),p));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("*********MENU********");
            System.out.println("1. Tautology ");
            System.out.println("2. Contradiction");
            System.out.println("3. Contingency");
            System.out.println("\nEnter Your Choice");
            int choice=scanner.nextInt();
            switch (choice){
                case 1 -> tautology();
                case 2-> contradiction();
                case 3-> contingency();
                default->{
                    System.out.println("GOOD BYE................");
                    System.exit(100);
                }

            }
        }
    }
}
