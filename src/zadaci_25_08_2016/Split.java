package zadaci_25_08_2016;

import java.util.ArrayList;

public class Split {

	public static void main(String[] args) {
		//poziv metode
		String[] s = split("ab#12#453", "#");
		//ispis
		for (int i = 0; i < s.length; i++) {
			if (i == s.length - 1)
				System.out.print(s[i]);
			else
				System.out.print(s[i] + ", ");
		}
		System.out.println();
		//poziv metode
		String[] s2 = split("a?b?gf#e", "[?#]");
		//ispis
		for (int i = 0; i < s2.length; i++) {
			if (i == s2.length - 1)
				System.out.print(s2[i]);
			else
				System.out.print(s2[i] + ", ");
		}

	}

	public static String[] split(String s, String regex) {
		//create ArrayList because we don't know num of elements
		ArrayList<String> stringX = new ArrayList<>();
		
		String str = "";
		//starting index
		int start = 0;

		// Converts regex to character array
		char[] regexToChar = regex.toCharArray();

		// if we find regex, we split string
		for (int i = 0; i < s.length(); i++) {
			// take one char per loop from string
			char karakter = s.charAt(i);
			for (int j = 0; j < regexToChar.length; j++) {
				// compare char to regex array
				if (karakter == regexToChar[j]) {
					// split string from beginig to regex
					str = s.substring(start, i);

					// and add to ArrayListu
					stringX.add(str);

					// add regex also
					stringX.add(regexToChar[j] + "");

					// and increment start for next substring
					start = i + 1;
				}
			}

			if (i == s.length() - 1) {
				str = s.substring(start, s.length());
				stringX.add(str);
			}

		}
		// add elements from ArrayList to String[]
		String[] stringSplit = new String[stringX.size()];
		for (int i = 0; i < stringSplit.length; i++) {
			stringSplit[i] = stringX.get(i);
		}
		// return Array
		return stringSplit;
	}

}
