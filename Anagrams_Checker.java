import java.util.*;
class Anagrams_Checker
{
	static String dic[]=new String[2000];
	static String pra[]=new String[2000];
	static int dicl,pral;
	static Scanner sc=new Scanner(System.in);
	public static void main(String arghh[])
	{
		dicl=input(dic);
		pral=input(pra);
		for(int i=0;i<pral;i++)
		anagrams(i,pra[i],dic,-1,"");
	}
	static void anagrams(int y,String s,String dic[],int x,String ans)
	{
		if(valids(s))
		System.out.println(pra[y]+" = "+ans);
		for(int i=x+1;i<dicl;i++)
		{
			if(valid(s,dic[i]))
			{
				String st=remove(s,dic[i]);
				anagrams(y,st,dic,i,ans+dic[i]+" ");
			}
		}
	}
	static boolean valid(String s,String st)
	{
		for(int i=0;i<st.length();i++)
		{
			int c=0,cc=0;
			char ch=st.charAt(i);
			for(int j=0;j<st.length();j++)
			if(st.indexOf(ch)!=-1)
			c++;
			for(int j=0;j<s.length();j++)
			if(s.indexOf(ch)!=-1)
			cc++;
			if(c>cc)
			return false;
		}
		s=s+" ";
		String x="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			x=x+ch;
			else
			{
				if(x.equals(st))
				return false;
				x="";
			}
		}
		return true;
	}
	static String remove(String s,String st)
	{
		for(int i=0;i<st.length();i++)
		{
			int n=s.indexOf(st.charAt(i));
			try
			{
				s=s.substring(0,n)+s.substring(n+1);
			}
			catch(Exception e){}
		}
		return s;
	}
	static Boolean valids(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			return false;
		}
		return true;
	}
	static int input(String a[])
	{
		int i=0;
		do
		{
			a[i++]=sc.nextLine();
		}while(!a[i-1].equals("#"));
		return i-1;
	}
}