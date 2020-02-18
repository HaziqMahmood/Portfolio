package com.qa.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Oddity {
	public static void main(String[] args) {
		Oddity odd = new Oddity();
		int[] nums= new int[] {19,21,3,4,6,8,9,10};
		System.out.println(odd.oddity(nums));
		
	}
	public List<Integer> oddity(int[] nums){
		List<Integer> odds = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2!=0) {
				odds.add(nums[i]);
			}
		}
		return odds;
		
	}

	   
	

		
		}
