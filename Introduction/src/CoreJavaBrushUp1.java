
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		boolean myCard = true;
		
		System.out.println(myNum+ " is the value of myNum variable");
		System.out.println(website);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6};
		
		
		for (int i = 0; i<arr2.length; i++)
		{
			
			System.out.println(arr2[i]);
		}
		
		
		String[] name = {"Rahul", "Shetty", "Selenium"};
		
		for (int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for (String s: name)
		{
			System.out.println(s);
		}
		

	}

}
