import java.util.Scanner;

public class Ques6 {


    static   boolean constants[]={true,false};
    static  boolean imply(boolean p,boolean q){
        return !p|q;
    }
    static  void moduspones(){
        System.out.println("Modus Pones  =====>");
        System.out.println("If p is true and p->q is also true ");
        System.out.println("Then q is always true");
        System.out.println("======== Truth Table ======");
        System.out.println("p\t\t\tp->q\t\tq");
        for (boolean p:constants) for(boolean q:constants) System.out.println(p+"\t\t"+imply(p,q)+"\t\t"+q);
    }


    static void modustollens(){
        System.out.println("Modus Tollens  =====>");
        System.out.println("If ~q is true and p->q is also true ");
        System.out.println("Then ~p is always true");
        System.out.println("======== Truth Table ======");
        System.out.println("p\t\t\tq\t\t\t~q\t\t\t~p\t\t\tp->q");
        for (boolean p:constants) for(boolean q:constants) System.out.println(p+"\t\t"+q+"\t\t"+!q+"\t\t"+!p+"\t\t"+imply(p,q));
    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("*********MENU********");
            System.out.println("1. Modus Ponens ");
            System.out.println("2. Modus Tollens");
            System.out.println("\nEnter Your Choice");
            int choice=scanner.nextInt();
            switch (choice){

                case 1->moduspones();
                case 2-> modustollens();
                default -> {
                    System.out.println("GOOD BYE ...............");
                    System.exit(100);
                }


            }
        }
    }
}
