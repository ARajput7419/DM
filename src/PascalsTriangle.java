import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;
public class PascalsTriangle {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        out.println("Enter value of n");
        int n=scanner.nextInt();
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){

            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            for(int j=1;j<=i-1;j++){
                list.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
            }
            if(i!=0)
                list.add(1);
            result.add(list);
        }
        out.println("Pascals' Triangle ");
        for (List<Integer> t:result)
            out.println(t);


    }

}
