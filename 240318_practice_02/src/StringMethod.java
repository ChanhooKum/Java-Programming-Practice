public class StringMethod {

	static String addString(String s1, int index, String s2) {		
		return ((s1.substring(0,index+1)).concat(s2)).concat(s1.substring(index+1,s1.length()));
	}
	
	static String reverse(String s) {
		String r = ""; 
		for (int i = s.length(); i > 0 ; i--) {
			r = r.concat(Character.toString(s.charAt(i-1)));
		}
		return r;
	}
	
	
	static String removeString (String s1, String s2) {
		boolean found = true;
		while(found) {
			found = false;
			int i = 0;
			while (i != s1.length() - s2.length() + 1) {
			if ((s1.substring(i, i + s2.length())).equals(s2)) {
				found = true;
				s1 = (s1.substring(0,i)).concat(s1.substring(i + s2.length(),s1.length()));
				break;
				}
			i++;
			}
		}
		return s1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(addString("0123456", 3, "-"));
		System.out.println(reverse("abc"));
		System.out.println(removeString("01001000", "00"));	
	}

}
