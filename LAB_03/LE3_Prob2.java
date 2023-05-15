/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class AbsTest implements TestTable{

}
public class Main
{
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
	}
}
class Test implements TestTable{
    public void display(){
        System.out.println("In class Test");
    }
}
interface TestTable{
    void display();
}