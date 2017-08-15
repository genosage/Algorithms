import java.util.*;

public class Main {
	static String[] letters = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}

	public static ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> result = new ArrayList<String>();
		StringBuilder current = new StringBuilder();
		iteration(0, digits, current, result);
		return result;
	}

	public static void iteration(int deep, String digits, StringBuilder current, ArrayList<String> result) {
		if (deep == digits.length()) {
			result.add(current.toString());
			return;
		} else {
			int index = digits.charAt(deep) - '0';

			for (int i = 0; i < letters[index].length(); i++) {
				current.append(letters[index].charAt(i));
				iteration(deep + 1, digits, current, result);
				current.deleteCharAt(current.length() - 1);
			}
		}
	}

}