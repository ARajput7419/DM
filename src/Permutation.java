import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import static java.lang.System.out;

public class Permutation {

    static ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    static ArrayList<Integer> temp=new ArrayList<>();
    static boolean [] visited;

    public static  void generate(int []data,int index){
        if (index==data.length){
            result.add((ArrayList<Integer>) temp.clone());
            return;
        }
        for (int i=0;i<data.length;i++){
            if (!visited[i]){
                temp.add(data[i]);
                visited[i]=true;
                generate(data,index+1);
                visited[i]=false;
                temp.remove(temp.size()-1);
            }
        }
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
        visited=new boolean[n];
        generate(data,0);
        out.println("Permutations are :-> ");
        out.println(result);


    }


}
