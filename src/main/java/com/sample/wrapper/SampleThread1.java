package com.sample.wrapper;

public class SampleThread1 extends Thread {

	public SampleThread1(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		System.out.println(this.getClass().getCanonicalName() + " Thread Name: " + this.getName() + " Group Name: " + this.getThreadGroup().getName());
	}

}
