import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class BinarySearchRecursive {



    public static int search(int data[],int low,int high,int key){
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(data[mid]==key) return mid+1;
        else if(data[mid]>key) return  search(data,low,mid-1,key);
        else return search(data,mid+1,high,key);
    }



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
        int pos=search(data,0,n-1,key);
        if(pos==-1) out.println(key+" is not found ");
        else out.println(key+" is found at "+pos+" of the sorted array");
    }

}
