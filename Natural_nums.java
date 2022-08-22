package Even_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Natural_nums {

	public static void main(String[] args){
		
		List<Integer> alist = new ArrayList<>();
		
		for (int i = 0; i <= 100;i++){
			if (i % 3 == 0)
				alist.add(i);
				if (alist.size() == 10)
				System.out.println(alist);

		}
	}
}
