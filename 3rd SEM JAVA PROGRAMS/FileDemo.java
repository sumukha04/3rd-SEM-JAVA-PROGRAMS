package sumukha.java.programs;
import java.io.*;
import java.util.*;
public class FileDemo {
public static void main(String args[]) {
	String filename;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the filename\n");
	filename=s.nextLine();
	File f1=new File(filename);
	System.out.println("*************\n");
	System.out.println("FILE INFORMATION\n");
	System.out.println("*************\n");
	System.out.println("NAME OF THE FILE\n"+f1.getName());
	System.out.println("PATH OF THE FILE\n"+f1.getPath());
	System.out.println("PARENT\n"+f1.getParent());
	if(f1.exists())
		System.out.println("THE FILE EXISTS\n");
	else
		System.out.println("THE FILE DOES NOT EXIST\n");
		if(f1.canRead())
			System.out.println("THE FILE CAN BE READ\n");
		else
			System.out.println("THE FILE CANNOT BE READ\n");
		if(f1.canWrite())
			System.out.println("THE FILE CAN BE WRITTEN\n");
		else
			System.out.println("THE FILE CANNOT BE WRITTEN\n");
		if(f1.isDirectory())
			System.out.println("IT IS A DIRECTORY\n");
		else
			System.out.println("IT IS NOT A DIRECTORY\n");
		if(f1.isFile())
			System.out.println("IT IS A FILE\n");
		else
			System.out.println("IT IS NOT A FILE\n");
		System.out.println("FILE LAST MODIFIES\n"+f1.lastModified());
		System.out.println("LENGTH\n"+f1.length());
		System.out.println("FILE DELETED\n"+f1.delete());
}
}
