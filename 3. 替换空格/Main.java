import java.util.*;

class Main {

	public static void main(String[] args){
		Main main = new Main();

		System.out.println(main.replaceSpace(new StringBuffer("We Are Happy")));

	}

	public String replaceSpace(StringBuffer str) {
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == ' ') {
    			str.deleteCharAt(i);
    			str.insert(i, "%20");
    		}
    	}

    	return str.toString();
    }
}