package ch5;

public class ArrayEx_API {

	public static void main(String[] args) {
		
//		String str = "abc";
		
		char data[] = {'a', 'b', 'c'};
		String str = new String(data);
		System.out.println("str 출력 : "+str);
		
		for(int i=0; i<data.length; i++) {
			System.out.println("data["+i+"] : "+data[i]);
		}
		System.out.println();
		
		System.out.println("abc");
		String str2 = "cde";
		System.out.println("합쳐보자 abc" + str2);
		String c = "abc".substring(2,3);
		String d = str2.substring(1, 2);
		
		System.out.println(c);
		System.out.println(d);
	     
	    

	}

}
