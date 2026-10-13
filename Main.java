package userinut;
import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in); 
		 String []fr;		 
int n=sc.nextInt();
sc.nextLine();
fr=new String[n];

for(int i=0;i<fr.length;i++) {
	fr[i]=sc.nextLine();
}
for(int i=0;i<fr.length;i++) {
	
	 System.out.println(fr[i]);
}

	 }
}
