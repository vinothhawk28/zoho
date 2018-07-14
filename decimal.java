package vinoth;
import java.util.*;
public class strong {
public static void main(String[] args) {
	int a,t=0;
	String b="";
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
  while(a!=0){
	  t=a%2;
	  b=b+""+t;
	  a=a/2;
  }
  System.out.println(b);
}
}
