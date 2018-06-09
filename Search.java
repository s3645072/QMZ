
public class Search {
	
	
	public int bSearch(int[] elems, int target) {
		
		if(elems == null || elems.length == 0) {
			return -1;
		}
		
		int start = 0;
		int end = elems.length-1;
		while(start + 1 < end) {
			int mid = start + (end - start) / 2;
			if(elems[mid] < target) {
				start = mid + 1;
			}
			else if(elems[mid] > target) {
				end = mid;
			}
			else {
				end = mid;
			}
		}
		
		if(elems[start] == target) {
			return start;
		}
		else if(elems[end] == target) {
			return end;
		}
		else {
			return -1;
		}
		
	}

}

