package Thursday11;

public class updownTriangle {
	public static void main(String[] args) {
		int n=9;
		int star=n;
		int space=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				if(i==1||j==1||j==star) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			space++;
			star-=2;
			System.out.println(" ");
		}
	}

}
