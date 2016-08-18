import java.util.Scanner;


public class Rev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String s2=sb.toString();
		System.out.println(sb);
		s2=s2.replaceAll("[AEIOUaeiou]", "");
        System.out.println(s2);
	}

}
