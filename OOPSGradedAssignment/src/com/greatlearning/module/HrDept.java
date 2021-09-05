package com.greatlearning.module;

public class HrDept extends SuperDept{
	public String deptName() {
		return "HR Department";
	}
	
	public String getTodaysWork() {
		return "Fill today's worksheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}

}
