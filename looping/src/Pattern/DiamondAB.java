package Pattern;

public class DiamondAB {
public static void main(String[] args) {
	int n=9;
	int star=1;
	int space=n/2;
	int s=0;
	
	char chw='B';
	for(int i=1;i<=n;i++) {
		for(int sp=1;sp<=space;sp++) {
			System.out.print(" ");
		}
//		int count=star/2;
		char ch='A';
		for(int st=1;st<=star;st++) {
        System.out.print(ch);
         if(st<=star/2)// A; 1<=0 F ch-- ; 
        	 //A;1<=1 T ch++ B, 2<=1 F ch-- A;
        	 // A ; 1<=2 T ch++ B; 2<=2 T ch++ C; 3<=2 F ch-- B; 4<=2 F ch-- A;
        	               
        	 ch++;
         else
        	 ch--;
		}
		if(i<(n/2)+1) {
			space--;
			star+=2;
			
		}
		else {
			space++;
			star-=2;
		}
		

		
		System.out.println( );
	}
}
}
