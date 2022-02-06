import java.util.Scanner;
import java.util.Stack;

import static java.lang.System.out;
class Data{
    char source,destination,auxillary;
    int n;
    public Data(int n,char source,char destination,char auxillary){
        this.n=n;
        this.source=source;
        this.destination=destination;
        this.auxillary=auxillary;
    }
    int total_steps=0;
}
public class TowerOfHanoiIterative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        out.println("Enter number of disks");
        int n=scanner.nextInt();
        out.println("Steps To Solve Tower Of Hanoi Problem ");
        Stack<Data> stack=new Stack<>();
        stack.push(new Data(n,'A','B','C'));
        while (!stack.isEmpty()){
            Data data=stack.peek();
            if(data.n==0) {
                stack.pop();
                continue;
            }
            if(data.total_steps==0) {
                stack.push(new Data(data.n - 1, data.source, data.auxillary, data.destination));
            }
            else if(data.total_steps==1){
                out.println("Move Disk "+data.n+" From "+data.source+" to "+data.destination);
                stack.push(new Data(data.n-1,data.auxillary,data.destination,data.source));
            }
            else stack.pop();
            data.total_steps++;

        }
    }
}
