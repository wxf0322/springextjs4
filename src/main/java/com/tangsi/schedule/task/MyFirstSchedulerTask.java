package com.tangsi.schedule.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFirstSchedulerTask {
	
	public void run() {
		System.out.println("ִ�ж�ʱ����,ʱ��Ϊ"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
