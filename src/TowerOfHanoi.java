import java.util.Scanner;
import static java.lang.System.out;
public class TowerOfHanoi {

    static int count=2;
    static int []current=new int[3];

    public static void towerOfHanoi(int n,char source,char destination,char auxillary){
        if(n==0) return;
        towerOfHanoi(n-1,source,auxillary,destination);
        current[source-'A']--;
        count+=(current[source-'A']==0?1:0);
        current[destination-'A']++;
        out.println("Move Disk " +n + " From "+ source+" to "+destination);
        towerOfHanoi(n-1,auxillary,destination,source);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        out.println("Enter number of disks");
        int n=scanner.nextInt();
        current[0]=n;
        out.println("Steps To Solve Tower Of Hanoi Problem ");
        towerOfHanoi(n,'A','B','C');
        out.println("Poles were Empty for "+count+" times ");


    }

}
