/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n=4;
	    for (int i=n; i>=1; i--)
        {
            for (int j=n-i; j>0; j--)
            {
    
                System.out.print(" ");
            }
  
          
            for (int j=0; j<=i; j++ )
            {
               
                System.out.print("* ");
            }
  
           
            System.out.println();
        }
    }
}
