import java.util.Scanner;
class ar
{
public static void main(String args[])
{int counta=0;
int countb=0;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter elements...");
char[] a=sc.next().toCharArray();

for (int i=0;i<a.length;i++)
{if((a[i]=='a')||(a[i]=='b'))
{
 if (a[i]=='a')
{counta++;
}
else
{countb++;
}
}
}

if((((counta%2)!=0)||((countb%2)==0))||(((counta%2)!=0)&&((countb%2)==0))||((counta%2)!=0)||((countb%2)==0))
{
System.out.println("String is accepted");
}
else
{
System.out.println("String is not accepted");
}
}
}