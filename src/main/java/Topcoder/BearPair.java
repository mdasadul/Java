package Topcoder;

public class BearPair {

	public int bigDistance(String s) {
		int distance = -1,  start = 0, end = s.length() - 1;
		
		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
			}else {
				distance = end-start;
				break;
			}
		}
		start = 0; end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				end--;
			}else {
				if(distance<(end-start)) {
				distance = end-start;
				}
				break;
			}
		}

		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BearPair obj = new BearPair();
		System.out.println(obj.bigDistance("xxyyxyxyyyyyyxxxyxyxxxyxyxyyyyyxxxxxxyyyyyyyyxxxxx"));
		System.out.println(obj.bigDistance("bear"));

	}

}
// abbbbbdcaa
