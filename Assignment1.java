public class Assignment1 {

	public static void main(String[] args) {
		String str1 = "Hello Dear Friend";
		//Output as  :  Friends Dear Hello
		String output = reverseString(str1);
		System.out.println(output);


	}

	private static String reverseString(String input) {
		String str2[]=input.split(" ");
		String str3=" ";
		for(int j=(str2.length)-1;j>=0;j--) {
			str3+=str2[j]+" ";
		}

		return str3;
	}

}
