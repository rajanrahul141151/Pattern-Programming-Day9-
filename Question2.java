//Write a program to print triangle using star pattern programming language

public class Question2 {
    public static void main(String[] args) {
        int n=5;

        for(int i=0; i<n; i++)
        {
            for(int s = 0; s< n-i; s++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}
