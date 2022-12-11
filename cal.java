import java.util.Scanner;
class cal{
	public static void main(String[] args){
		Scanner src=new Scanner(System.in);
		System.out.println("which table you want\n Enter the number:");
	int a=src.nextInt();
	int i=0;
	for(i=1;i<=10;++i){
	intt c=a*i;
	System.out.println(a+"x"+i+"="+c);
	}

	} 
}