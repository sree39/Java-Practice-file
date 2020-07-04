package com.wipro.strings;

public class LowerUpper {
public static void main(String[]args) {
String s="A012upXz";
String str="";
for(int i=0;i<s.length();i++)
{
	 Character c =s.charAt(i); 
	 if(Character.isLetter(c)) {
	 if(Character.isUpperCase(c)) {
		 str+= Character.toLowerCase(c);
	 }
	 else
	 {
	    str+= Character.toUpperCase(c);
	 }
	 }
}
System.out.println(str);
StringBuffer sb=new StringBuffer(str);
sb.reverse();
System.out.println(sb);

for(int i=0;i<sb.length();i++)
{
	if(i%2==0)
	{
		System.out.println();
	}
}
}
}
