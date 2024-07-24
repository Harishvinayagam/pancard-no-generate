import java.util.*;
public class pancardnogenerate
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("***Pan Card No Generation***");
		System.out.println("Enter your Name:");
		String str =sc.next();
		String c=String.valueOf(str.charAt(0)).toUpperCase();
		String m = randstr(4);
		Random rand1 =new Random();
		StringBuilder sb1 =new StringBuilder();
		sb1.append(m);
		sb1.append(c);
		int randno=rand1.nextInt(10000);
		sb1.append(randno);
		String l=randstr(1);
		sb1.append(l);
		HashSet<String> hs = new HashSet<>();
		hs.add(sb1.toString());
		System.out.println("Your Pan Card Number Is"+" "+hs);


	}
	public static  String randstr(int len)
		{
			int max=26;
			char [] alphabet={ 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
			Random rand =new Random();
			StringBuilder sb =new StringBuilder();
			for(int i=0;i<len;i++)
			{
				sb.append(alphabet[rand.nextInt(max)]);
			}
			return sb.toString().toUpperCase();
	}

}