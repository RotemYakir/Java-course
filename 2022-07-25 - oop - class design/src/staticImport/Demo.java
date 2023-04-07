package staticImport;

//import
import java.util.Scanner;
//static import - for static variables and method
import static java.lang.Math.PI;
import static java.lang.Math.random;;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner("aaa");

		System.out.println(PI);
		System.out.println(random());

	}

}