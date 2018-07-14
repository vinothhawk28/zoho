package vinoth;
import java. util.*;
public class binary {
public static void main(String[] args) {
	int n;
	Scanner in=new Scanner (System.in);
	n=in.nextInt();
	int p=0;
	int x=0;
	while(n!=0){
		x+=((n%10)*Math.pow(2,p));
		n/=10;
		p++;}
	System.out.println(x);		
	}
}

