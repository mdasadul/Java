package Topcoder;

public class CoinFlipsDiv2 {
	public int countCoins(String state) {
		int count =0;
		if(state.length() <=1) {
			return 0;
		}
		if(state.charAt(0) !=state.charAt(1)) {
			count++;
		}
		for(int i=1;i<state.length()-1;++i) {
			if(state.charAt(i-1) !=state.charAt(i)) {
				count++;
			}else if(state.charAt(i) !=state.charAt(i+1)) {
				count++;
			}
		}
		if(state.charAt(state.length()-2) !=state.charAt(state.length()-1)) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinFlipsDiv2 obj = new CoinFlipsDiv2();
		System.out.println(obj.countCoins("HTHHT"));
		System.out.println(obj.countCoins("HHHTTTHHHTTTHTHTH"));
		System.out.println(obj.countCoins("HHHHH"));
		System.out.println(obj.countCoins("HHTHHH"));
		System.out.println(obj.countCoins("HT"));
	}

}
