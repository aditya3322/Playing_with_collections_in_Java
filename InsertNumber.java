import java.util.*;

public class InsertNumber {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
		insertUsingIteration(list, 55);
		insertUsingBinarySearch(list, 55);
		System.out.println("Result: " + list);
	}

	public static void insertUsingIteration(ArrayList<Integer> list, int num) {
		int indx = -1;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > num) {
				indx = i;
				break;
			}
		}
		list.add(indx, num);
	}

	public static void insertUsingBinarySearch(List<Integer> list, int number) {
		int position = findInsertPosition(list, 0, list.size() - 1, number);
		list.add(position, number);
	}

	public static int findInsertPosition(List<Integer> list, int start,	int end, int num) {
		int mid = (start + end) / 2;
		if (list.get(end) < num)
			findInsertPosition(list, start, end, num);
		else
			return mid + 1;
		return -1;
	}
}
