package test;

public class Practice {

	public static void main(String args[]) {
		String s = "(16)";
		int articleCount = Integer.parseInt(s.split("\\(")[1].split("\\)")[0]);
	System.out.println(articleCount);
	
    
	}
}
