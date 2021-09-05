package com.greatlearning.service;
import com.greatlearning.module.*;

public class Main {

	public static void main(String[] args) {
		
		AdminDept admin = new AdminDept();
		HrDept hr = new HrDept();
		TechDept tech = new TechDept();
		
		System.out.println(admin.deptName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("");
		System.out.println(hr.deptName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.doActivity());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("");
		System.out.println(tech.deptName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
		

	}

}
