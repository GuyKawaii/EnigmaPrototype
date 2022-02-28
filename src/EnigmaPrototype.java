public class EnigmaPrototype {
	
	public int charToInt(char c) {
		// converts range [' ', A-Å] to range [0-29]
		if (c == ' ') {
			return 0;
		} else if (65 <= c && c <= 90) {
			return (int) c - 64;
		} else if (c == 'Æ') {
			return 27;
		} else if (c == 'Ø') {
			return 28;
		} else { // (c == 'Å')
			return 29;
		}
	}
	
	public char intToChar(int charValue) {
		// converts range [0-29] to range [' ', A-Å]
		if (charValue == 0) {
			return ' ';
		} else if (1 <= charValue && charValue <= 26) {
			return (char) (charValue + 64);
		} else if (charValue == 27) {
			return 'Æ';
		} else if (charValue == 28) {
			return 'Ø';
		} else { // (charValue == 29)
			return 'Å';
		}
	}
	
	public void printTest(char c) {
		boolean isEqual = (c == intToChar(charToInt(c)));
		System.out.printf("'%c'   ->   charToInt   '%2d'   ->   intToChar   '%c'   passed: %b\n", c, charToInt(c), intToChar(charToInt(c)), isEqual);
	}
	
	public static void main(String[] args) {
		EnigmaPrototype e = new EnigmaPrototype();
		
		// print test cases
		e.printTest(' ');
		e.printTest('A');
		e.printTest('Z');
		e.printTest('Æ');
		e.printTest('Ø');
		e.printTest('Å');
	}
}
