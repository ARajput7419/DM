import java.util.Arrays;
import java.util.Scanner;
import static  java.lang.System.out;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        out.println("Enter number of elements ");
        int n=scanner.nextInt();
        int [] data=new int[n];
        out.println("Enter elements");
        for(int i=0;i<n;i++)
            data[i]=scanner.nextInt();
        Arrays.sort(data);
        out.println("Our Array After Sorting "+Arrays.toString(data));
        out.println("Enter Key");
        int key=scanner.nextInt();
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(data[mid]==key){
                out.println(key+" is found  at "+(mid+1)+" of sorted Array ");
                break;
            }
            else if (data[mid]>key) high=mid-1;
            else low=mid+1;
        }
        if(low>high) out.println(key+" is not found");
    }
}
