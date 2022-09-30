package codility;

public class Chapter1 {
	
	/**
	 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that
	 * is surrounded by ones at both ends in the binary representation 
	 * of N.For example, number 9 has binary representation 1001 and contains a binary
	 * gap of length 2. The number 529 has binary representation 1000010001 and contains 
	 * two binary gaps: one of length 4 and one of length 3. The number 20 has binary
	 *  representation 10100 and contains one binary gap of length 1. The number 15 has
	 * binary representation 1111 and has no binary gaps. The number 32 has binary 
	 * representation 100000 and has no binary gaps.
	 * 
	 * 
	 */

	public static int solution(int n) {

		// counts how many '0' in a range
		int c = 0;
		// max_gap in a range
		int m = 0;
		// covert Integer number to String
		String S = Integer.toBinaryString(n);
		// for loop
		for (int i = 0; i < S.length(); i++) {
			// access each element
			char s = S.charAt(i);
			// check if the element String is == 1
			if (s == '1') {
				// if equals 1, check if the count is more than max_gap
				if (c > m) {
					// max_gab receive counts number
					m = c;
				}
				// declare counts equal 0 to restart the count's number in a new range
				c = 0;
			} else {
				// if char in an array is not equal 1 then add +1 to count
				c++;
			}
		}
		return m;
	}
}