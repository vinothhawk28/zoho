package vinoth;
import java.util.Scanner;
public class swap {
public static void main(String[] args) {
	int a,i;
	String y="",g="";
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	int s[]=new int[a];	
	for( i=0;i<a;i++){
		s[i]=in.nextInt();
	}
	if(a%2!=0){	
	 g=Integer.toString(s[a-1]);}
	for(i=1;i<a;i+=2){
			y=s[i]+" "+s[i-1];
			System.out.print(y+" ");}
	System.out.println(g);}		
}
