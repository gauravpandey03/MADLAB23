/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

class arjun extends qualities{
    void obey()
    {
        System.out.println("obedient");
    }
    
    void kind()
    {
        System.out.println("kind");
    }
} 
class duryodhan extends qualities{
    void obey()
    {
        System.out.println("Not obedient");
    }
    
    void kind()
    {
        System.out.println("Not kind");
    }
} 
abstract class qualities{
    void fight()
    {
        System.out.println("All bharatvanshis are fighters");
    }
    
    abstract void obey();
    abstract void kind();
}

public class Main
{
	public static void main(String[] args) {
		arjun a = new arjun();
	    duryodhan d = new duryodhan();
		
		a.fight();
		a.obey();
		a.kind();
		
		d.fight();
		d.obey();
		d.kind();
	}
}