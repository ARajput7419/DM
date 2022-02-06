import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import static java.lang.System.out;
public class PowerSet {


   static ArrayList<ArrayList<Integer>> result=new ArrayList<>();
   static ArrayList<Integer> temp=new ArrayList<>();
   static void generate(int data[],int index){
        if (index==data.length){
            result.add((ArrayList<Integer>) temp.clone());
            return;
        }
        temp.add(data[index]);
        generate(data,index+1);
        temp.remove(temp.size()-1);
        generate(data,index+1);
    }


    public static void main(String[] args) {
        out.println("Enter number of elements ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        out.println("Enter elements ");
        int []data=new int[n];
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<n;) {
            int ele=scanner.nextInt();
            if (set.contains(ele))
                out.println("Please re-enter the element [ it already exists ] ");
            else{
                set.add(ele);
                data[i]=ele;
                i++;
            }
        }
        generate(data,0);
        out.println("Power Set of the given set is ");
        out.println(result);


    }

}
