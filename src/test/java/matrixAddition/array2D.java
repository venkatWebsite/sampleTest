package matrixAddition;

public class array2D {
	
	
	public static void main(String[] args) {
		
		int[][] a = {
				
				{1,2,1},
				{1,3,1},
				{1,4,1}				
		};
		
		int[][] b = {
				
				{1,2,1},
				{1,3,1},
				{1,4,1}		
		};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				
				System.out.print(a[i][j]+" ");
			}

			System.out.println();
		}
		
		System.out.println("***************");
		for(int[] b1 :b) {
			for( int b2: b1) {
				
				System.out.print(b2+" ");
				
			}
			System.out.println();
		}
		int[][] c= new int[3][3];
	
		System.out.println("***************");
		for(int i=0; i<c.length;i++) {
			for(int j=0; j<c[i].length;j++) {
			
				c[i][j]= a[i][j]+b[i][j];
				
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
