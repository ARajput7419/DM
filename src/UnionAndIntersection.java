import java.util.HashSet;
import java.util.Scanner;
import static java.lang.System.out;
public class UnionAndIntersection {


    public static HashSet<Integer> union(HashSet<Integer> set1,HashSet<Integer> set2){
        HashSet<Integer> result=new HashSet<>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static HashSet<Integer> intersection(HashSet<Integer> set1,HashSet<Integer> set2){
        HashSet<Integer> result=new HashSet<>();
        for (int i:set1) if (set2.contains(i)) result.add(i);
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        out.println("Enter set 1 size ");
        int n=scanner.nextInt();
        HashSet<Integer>set1=new HashSet<>();
        out.println("Enter set 1 elements ");
        for (int i=0;i<n;i++) set1.add(scanner.nextInt());
        out.println("Enter set 2 size ");
        n=scanner.nextInt();
        HashSet<Integer> set2=new HashSet<>();
        out.println("Enter set 2 elements ");
        for (int i=0;i<n;i++) set2.add(scanner.nextInt());
        out.println("Set 1 is "+set1);
        out.println("Set 2 is "+set2);
        out.println("***************** UNION *****************");
        out.println(union(set1,set2));
        out.println();
        out.println("****************INTERSECTION ***************");
        out.println(intersection(set1,set2));


    }


}
