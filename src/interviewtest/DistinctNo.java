package interviewtest;

import java.util.ArrayList;

public class DistinctNo {

	public static void main(String[] args) {
		Integer[] value = {2,3,4,3,5,3,6,2,7};
		Distinct d = new Distinct();
		ArrayList<Integer> v2 = d.change(value);
		for(int i = 0; i < v2.size(); i++){
			System.out.print(v2.get(i) + " ");
		}
	}
}

class Distinct<E>{
	
	
	public ArrayList<E> change(E[] value){
		
		ArrayList<E> al = new ArrayList<>();
	
	for(int i = 0; i < value.length; i++){
		if(!al.contains(value[i]))
			al.add(value[i]);
	}
	
	return al;
	
	
}
}
