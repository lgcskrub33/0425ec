
public class test {
	
	public static void main(String[] args)
	{
		
//		int[]  arr= new int[] {1,2,3,4};
//		int[] arr1 = {1,2,3,4};
//		int[] arr2 = new int[100];
//		
//		int myint=1;
//		char mychar='a';
//		boolean mybool = true;
		
		int[] myArr= new int[100];
		
		for(int i=0; i<myArr.length ; i++)
		{
			myArr[i] = i;
		}
		
		int[][] myArr2 = new int[3][5];
		int[][] myArr3 = new int[3][];
		
		myArr2[2][1] = 10;
		//myArr3[2][1] = 10; // �����߻��� �Ʒ�ó�� �ؾ���
		myArr3[2] = new int[5];
		myArr3[2][1] = 10; // �� �̾߱�� myArr3[0], [1], [2] �̰͵��� ���̰� �� �ٸ��� �ִٴ¸� 
		System.out.println(myArr3[2][1]);
		myArr3[0] = new int [100];
		myArr3[1] = new int [200];
		//redefine??
		myArr3[2] = new int[3];
		System.out.println(myArr3[2][1]);
		
		
		
		
		
		
		
		
		

		
	
		
	}
	

}
