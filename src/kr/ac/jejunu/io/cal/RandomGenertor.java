package kr.ac.jejunu.io.cal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomGenertor {
	private List a;

	public void makeRandomData() {
		String myArray[] = new String[] { "a", "b", "c" };
		List<String> myRandom = new ArrayList(Arrays.asList(myArray));
		// array to arrayList
		for (int i = 0; i < myArray.length; i++) {

			int randomNum = (int) (Math.random() * myRandom.size());

			myRandom.get(randomNum);
			myRandom.remove(randomNum);
			a = myRandom;
		}
	}

	public int getRandomData() {
		int to = Integer.parseInt(a.toString());
		return to;

	}

}
