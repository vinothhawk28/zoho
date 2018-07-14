package vinoth;
import java.util.Scanner;
public class append {
public static void main(String[] args) {
	String s;
	Scanner in=new Scanner(System.in);
	s=in.next();
	StringBuilder sb=new StringBuilder(s);
	sb.append(".");
	System.out.println(sb);
}
}
