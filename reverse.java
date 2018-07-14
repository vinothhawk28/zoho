package vinoth;
import java.util.Scanner;
public class reverse {
public static void main(String[] args) {
	int s;
	Scanner in=new Scanner(System.in);
	s=in.nextInt();
	String a=Integer.toString(s);
	StringBuilder sb=new StringBuilder(a);
	StringBuilder t=sb.reverse();
	System.out.println(t);
}
}
