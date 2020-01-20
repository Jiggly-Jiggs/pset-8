public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {

		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		// write your code here
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}

		return false;
	}

	public String[] endsMeet(String[] values, int n) {

		// write your code here
		if (values == null || values.length < n || n < 0) {
			return new String[0];
		}

		String[] conjuction = new String[n * 2];
		for (int i = 0; i < n; i++) {
			conjuction[i] = values[i];
		}

		int j = n;
		for (int i = values.length - n; i < values.length; i++) {
			conjuction[j] = values [i];
			j++;
		}

		return conjuction;
	}

	public int difference(int[] numbers) {

		// write your code here
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		int max = 0;
		int min = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				min = numbers[i];
				max = numbers[i];
			}
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}

		int differnce = max - min;

		return differnce;
	}

	public double biggest(double[] numbers) {

		// write your code here
		if (numbers == null || numbers.length % 2 == 0 || numbers.length < 3) {
			return -1;
		}

		int middleNum = (int)(Math.ceil(numbers.length / 2));
		double max = -1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
					return -1;
				}

				if ((i == 0 || i == numbers.length - 1 || i == middleNum) && numbers[i] > max) {
					max = numbers[i];
				}
			}

		return max;
	}

	public String[] middle(String[] values) {

		// write your code here
		if (values == null || values.length % 2 == 0 || values.length < 3) {
			return new String[0];
		}
		for (int i = 0; i < values.length; i++) {
			if (values[i] == null) {
				return new String[0];
			}
		}

		int middleNum = (int)(Math.ceil(values.length / 2));
		String[] middleNums = {values[middleNum - 1], values[middleNum], values [middleNum + 1]};

		return middleNums;

	}

	public boolean increasing(int[] numbers) {

		// write your code here
		if (numbers == null || numbers.length < 3) {
		return false;
	}

	for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers[i - 1] < numbers[i] && numbers[i] < numbers [i + 1]) {
				return true;
			}
	}

		return false; // default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {

		// write your code here
		if (numbers == null || numbers.length < 1) {
			return false;
		}

		boolean lastPlace = false;
		int gap = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == x) {
				lastPlace = true;
				gap = 0;
			} else {
				if (i == 1 && lastPlace == false) {
					return false;
				} else if (lastPlace == false) {
					gap++;
				}
				lastPlace = false;
			}

			if (gap == 2) {
				return false;
			}
		}

		return true;
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
