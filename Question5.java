//Write a program to print RAJAN RAHUL

public class Question5 {
    public static void main(String[] args) {
        int n=11;
        for(int i=0; i<n; i++)
        {
            // R
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==0&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2
                || i-j ==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //A
            for(int j=0; j<n; j++)
            {
                if(i==0&&j>0&&j<(n-1)/2 || j==0&&i>0 || j==(n-1)/2&&i>0 || i==(n-1)/2&&j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //J
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==(n-1)/2&&i<(n-1) || i==(n-1)&&j>0&&j<(n-1)/2 || j==0&&i>=(n-1)/2&&i<(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //A
            for(int j=0; j<n; j++)
            {
                if(i==0&&j>0&&j<(n-1)/2 || j==0&&i>0 || j==(n-1)/2&&i>0 || i==(n-1)/2&&j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            
            }

            //N
            for(int j=0; j<n; j++)
            {
                if(j==0 || j==(n-1) || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            
            }

            System.out.print("           ");

            // R
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==0&&j<(n-1)/2 || j==(n-1)/2&&i>0&&i<(n-1)/2 || i==(n-1)/2&&j<(n-1)/2
                || i-j ==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //A
            for(int j=0; j<n; j++)
            {
                if(i==0&&j>0&&j<(n-1)/2 || j==0&&i>0 || j==(n-1)/2&&i>0 || i==(n-1)/2&&j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //H
            for(int j=0; j<n; j++)
            {
                if(j==0 || j==(n-1)/2 || i==(n-1)/2&&j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }           

            //U
            for(int j=0; j<n; j++)
            {
                if(j==0&&i<(n-1) || j==(n-1)/2&&i<(n-1) || i==(n-1)&&j>0&&j<(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            //L
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==(n-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }           

            System.out.println();
        }
    }
}
