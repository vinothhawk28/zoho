package vinoth;
import java.util.*;
public class power {
public static void main(String[] args) {
	int a,b,r=0;
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	int q=(int) Math.sqrt(a);
	System.out.println(q);
	if(Math.pow(q, b)!=a){
		System.out.println("No");
	}
	else{
		System.out.println("Yes");
	}
}
}
