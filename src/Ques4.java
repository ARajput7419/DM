import java.util.Scanner;



public class Ques4 {

  static   boolean constants[]={true,false};
    static  void doublenegation(){
        System.out.println("p\t\t\t~(~p)");
        for (boolean p:constants) System.out.println(p+"\t\t"+!(!p));
    }

   static void domination(){
        System.out.println("p\t\t\tp v T\t\tp ^ F");
        for (boolean p:constants) System.out.println(p+"\t\t"+(p|true)+"\t\t"+(p&false));

    }


    static  void identityLaw(){
        System.out.println("p\t\t\tp ^ T\t\tp v F");
        for (boolean p:constants) System.out.println(p+"\t\t"+(p&true)+"\t\t"+(p|false));
    }


    static  void demorgan(){


        System.out.println("p\t\t\tq\t\t\tp v q\t\t~(~p ^ ~q)");
        for (boolean p:constants) for (boolean q:constants) System.out.println(p+"\t\t"+q+"\t\t"+(p|q)+"\t\t"+!(!p&!q));
    }


    static  void associative(){
        System.out.println("p\t\t\tq\t\t\tr\t\t\tp v ( q v r )\t\t(p v q) v r");
        for (boolean p:constants) for (boolean q:constants) for (boolean r:constants)
            System.out.println(p+"\t\t"+q+"\t\t"+r+"\t\t"+(p|(q|r))+"\t\t\t\t"+((p|q)|r));
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("*********MENU********");
            System.out.println("1. Identity Law ");
            System.out.println("2. Domination Law ");
            System.out.println("3. Double Negation Law ");
            System.out.println("4. DeMorgan Law ");
            System.out.println("5. Associative Law ");
            System.out.println("\nEnter Your Choice");
            int choice=scanner.nextInt();
            switch (choice){
                case 1 -> identityLaw();
                case 2-> domination();
                case 3-> doublenegation();
                case 4->demorgan();
                case 5-> associative();
                default->{
                    System.out.println("GOOD BYE................");
                    System.exit(100);
                }

            }
        }
    }

}
