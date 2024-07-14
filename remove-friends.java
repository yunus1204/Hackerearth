import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int pop[]=new int[n];
            for(int i=0;i<n;i++){
                pop[i]=sc.nextInt();
            }
            Stack<Integer> stack=new Stack<>();
            if(n!=0) stack.push(pop[0]);
            for(int i=1;i<n;i++)
            {
                while(!stack.isEmpty() && stack.peek()<pop[i] && k>0)
                {
                    stack.pop();
                    k--;
                }
                stack.push(pop[i]);
            }
            while(k>0){
                stack.pop();
                k--;
            }
        for(int i:stack)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        }
    }
}
