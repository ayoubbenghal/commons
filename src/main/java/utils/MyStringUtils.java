package utils;

public class MyStringUtils {
	
	public static boolean isNullOrEmply(String chaine){
		
		boolean b = chaine.equals(null) || chaine.trim().isEmpty();
		return b;
	}
  public static void main(String[] args) {
	System.out.println(isNullOrEmply(" ABC"));
	System.out.println(isNullOrEmply(" "));
	System.out.println(isNullOrEmply(""));
	System.out.println(isNullOrEmply("      "));   
	
	
	
}

}
