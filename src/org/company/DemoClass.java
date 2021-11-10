package org.company;

public class DemoClass {
	private void javaClass() {
		System.out.println("java class started");
	}

	private void pythonClass() {
		System.out.println("python class not started");

	}

	public static void main(String[] args) {
		DemoClass d = new DemoClass();// obj//hep//jvm
		d.javaClass();
		d.pythonClass();

	}

}
