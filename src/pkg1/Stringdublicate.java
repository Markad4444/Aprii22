package pkg1;

import java.util.ArrayList;

public class Stringdublicate {
	public static void main(String[] args) {
		String a ="abbcccddddeeeee";
		ArrayList list = new ArrayList();
		for(int i=0; i< a.length(); i++)
		{ int count=0;
		if(!list.contains(a.charAt(i)))
		{ 
			for(int j=i+1; j<a.length();j++)
			{ if(a.charAt(i)==a.charAt(j))
			{ 
				count++;
				list.add(a.charAt(i));
			}
			
			}
			System.out.println(a.charAt(i) + "repeated" + count);
			}
		//System.out.println(a.charAt(i) + "repeated" + count);
		}
		}
		
	}


