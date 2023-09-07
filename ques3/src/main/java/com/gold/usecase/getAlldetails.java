package com.gold.usecase;

import java.util.List;

import com.gold.dAo.TestDao;
import com.gold.entity.Test;

public class getAlldetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDao ts=new TestDao();
		List<Test> res=ts.getAllDetails();
		System.out.println(res);

	}

}
