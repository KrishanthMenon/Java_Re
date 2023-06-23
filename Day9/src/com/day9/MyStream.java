package com.day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {

	public static void main(String args[]) {

		List<Integer> ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(5);
		ls.add(5);

		Stream s = ls.stream();

		List<Integer> filterList=ls.stream().filter(num->num>2).collect(Collectors.toList());                   
				                   
		List<Integer> filterList1=ls.stream().filter(data->data>=0).map(data->data/3).collect(Collectors.toList());
		
		long count=ls.stream().count();

		System.out.println("max" +ls.stream().min(Collections.reverseOrder()));
		
		System.out.println("min"+ ls.stream().max(Collections.reverseOrder()));
		
		
		IntSummaryStatistics state=ls.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println("Count "+state.getCount());
		System.out.println("Sum " +state.getSum());
		System.out.println("min "+state.getMax());
		System.out.println("max "+state.getMin());
		System.out.println("avg "+state.getAverage());
		
	}

}
