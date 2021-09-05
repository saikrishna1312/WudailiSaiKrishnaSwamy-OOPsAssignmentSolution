package com.greatlearning.module;

public class AdminDept extends SuperDept{
	public String deptName() {
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		return "Complete your document submission";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
