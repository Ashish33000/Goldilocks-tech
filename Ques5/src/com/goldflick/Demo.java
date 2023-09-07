package com.goldflick;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("Ram", 36);
		map.put("shyam", 60);
		
		for(Map.Entry<String, Integer> em:map.entrySet()) {
			System.out.println(em.getKey()+" "+em.getValue());
		}

	}

}
