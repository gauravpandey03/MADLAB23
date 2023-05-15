/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int n=Integer.parseInt(args[0]);
	    for(int i=1;i<11;i++){
		System.out.print(n);
		System.out.print("x");
		System.out.print(i);
		System.out.print("=");
		System.out.println(n*i);
	}
}
}
