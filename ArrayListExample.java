package sumukha.java.programs;
import java.util.*;
import java.io.*;
public class ArrayListExample {
public static void main(String args[])throws IOException {
	ArrayList<String>obj=new ArrayList<String>();
	DataInputStream in=new DataInputStream(System.in);
	int c, ch;
	int i, j;
	String str, str1;
	do {
		System.out.println("STRING MANIPULATION\n");
		System.out.println("************************\n");
		System.out.println("1.APPEND AT END\t 2.INSERT AT PARTICULAR INDEX\t 3.SEARCH\t");
		System.out.println("4.LIST STRING THAT STARTING WITH LETTER\t 5.DISPLAY\t");
		System.out.println("ENTER THE CHOICE\n");
		c=Integer.parseInt(in.readLine());
		switch(c) {
		case 1: System.out.println("ENTER THE STRING\n");
		str=in.readLine();
		obj.add(str);
		break;
		case 2: System.out.println("ENTER THE STRING\n");
		str=in.readLine();
		System.out.println("SPECIFY THE INDEX/POSITION TO INSERT\n");
		i=Integer.parseInt(in.readLine());
		obj.add(i-1, str);
		System.out.println("THE ARRAY LIST HAS FOLLOWING ELEMENTS\n");
		break;
		case 3: System.out.println("Enter the string to search\n");
		str=in.readLine();
				j=obj.indexOf(str);
				if(j==1)
					System.out.println("ELEMENT NOT FOUND\n");
				else
					System.out.println("INDEX OF: "+str+" is"+j);
				break;
		case 4: System.out.println("ENETR THE CHARATCTER TO LIST THE STRING THAT STARTS WITH SPECIFIED CHARACTER\n");
		str=in.readLine();
		for(i=0;i<(obj.size()-1);i++) {
			str1=obj.get(i);
			if(str1.startsWith(str)) {
				System.out.println("str1");
				
			}
		}
		break;
		case 5: System.out.println("The array list has the following elements\n"+obj);
		break;
		}
		System.out.println("ENTER 0 TO BREAK AND 1 TO CONTINUE\n");
		ch=Integer.parseInt(in.readLine());
	}while(ch==1);
}
}
