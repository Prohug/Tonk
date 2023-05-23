import java.util.*;
public class Camain {

	public static void main(String[] args) {
		float a;
		float b;
		char c;
		float f=0;
		System.out.println("输入a的值:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		System.out.println("输入b的值:");
		b=sc.nextFloat();
		System.out.println("输入运算符:");
		c=sc.next().charAt(0);
		switch(c) {
		case '+': 
			Plus ca=new Plus();
			f=ca.plus(a, b);
			break;
		case '-':
			Sub cb=new Sub();
			f=cb.sub(a, b);
			break;
		case '*':
			Mu cc=new Mu();
			cc.mutip(a, b);
			break;
		case '/':
			Re cd=new Re();
			f=cd.reduce(a, b);
			break;
		default :
			System.out.println("Error f=0");
			break;
			
		}

		System.out.printf("answer=%.2f",f);
	}

}
