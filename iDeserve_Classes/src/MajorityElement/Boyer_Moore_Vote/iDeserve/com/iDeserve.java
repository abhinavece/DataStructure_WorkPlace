package MajorityElement.Boyer_Moore_Vote.iDeserve.com;

public class iDeserve {
	public static void main(String[] args) {
		int[] array = { 4, 7, 4, 4, 7, 4, 4, 9, 4, 3 };
		findMajorityElement(array);
	}

	public static void findMajorityElement(int[] array) {
		int candidate = findCandidate(array);
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (candidate == array[i]) {
				count++;
			}
		}
		if (count > array.length / 2) {
			System.out.println(candidate);
		}
	}

	public static int findCandidate(int[] array) {
		int count = 0;
		int candidate = 0;
		for (int i = 0; i < array.length; i++) {
			if (count == 0) {
				candidate = array[i];
				count = 1;
				continue;
			} else {
				if (candidate == array[i]) {
					count++;
				} else {
					count--;
				}
			}
		}
		return candidate;
	}

}
