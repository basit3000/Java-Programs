import java.util.Scanner;
class library{
public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	String pName[] = {"Cardboard", "Luddo Board", "Chess Board", "Carrom Board", "Scrabble Board"};
	String temp1 = " ";
	int data[ ][ ]=new int[5][3], i, j, count=0, temp=0;
	for(i=0; i<data.length; i++){
		System.out.println("Please enter Product quantity, Batch and finally Price.");
		for(j=0;j<data[0].length;j++){
 			data[i][j]=sc.nextInt();
			count++;
		}
		System.out.println();
	}

	for(i=0;i<data.length-1;i++){
 		for(j=i+1;j<data.length;j++){
  			if(data[i][0]<data[j][0]){
   				for(int k=0;k<data[0].length;k++){
					temp=data[i][k];
    					data[i][k]=data[j][k];
    					data[j][k]=temp;
						temp1=pName[i];
						pName[i]=pName[j];
						pName[j]=temp1;
					}
				}
			}
		}
		System.out.println("Product Name\t\tProduct Qty\tBatch\t\tPrice");
		for(i=0;i<data.length;i++){
			System.out.print(pName[i]+"\t\t");
			for(j=0;j<data[0].length;j++){
				System.out.print(data[i][j]+"\t\t");
			}
			System.out.println();
		}
	}
}
