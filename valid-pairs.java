import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_wealth = br.readLine().split(" ");
         long[] wealth = new long[N];
         for(int i_wealth = 0; i_wealth < arr_wealth.length; i_wealth++)
         {
         	wealth[i_wealth] = Long.parseLong(arr_wealth[i_wealth]);
         }

         int out_ = solve(N, wealth);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static int solve(int N, long[] wealth){
        int result = 0;

        int n=wealth.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                long num=wealth[i]+wealth[j];
                double log=Math.log10(num)/Math.log10(3);
                if(log==(int)log){
                    result++;
                }
            }
        }

        return result;
    
    }
}
