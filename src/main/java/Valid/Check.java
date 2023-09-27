package Valid;

public class Check {
	public static Boolean checkNull(String a) {
		if(a.isEmpty()) {
			return true;
		}
		return false;
	}
	public static Boolean checkNumber1(String a) {
		boolean isNumber = a.matches("[0-9]+");
		return isNumber;
	}
	public static Boolean checkString(String a) {
    	boolean String = true;
    	for (int i = 0; i < a.length(); i++) {
    	    if (Character.isDigit(a.charAt(i))) {
    	        String = false;
    	        break;
    	    }
    	}
    	//true là chuỗi toàn chữ, false là kí tự số
    	 return String;
    }
}
