package ch04;

public class Code07_1 {
	public static void main(String[] args) {
		Outter: for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"_"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
	}
}
