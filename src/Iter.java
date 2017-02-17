

import java.util.ArrayList;
import java.util.Arrays;

public class Iter implements Subsets {
  @Override
	public ArrayList<ArrayList<Integer>> subsets(int[] A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (A == null) return result;
		int n = A.length;
		if (n == 0) return result;

		Arrays.sort(A);

		for (int i = 0; i < (1 << n); i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0)
						list.add(A[j]);
			}
			result.add(list);
		}

		return result;
	}
}
