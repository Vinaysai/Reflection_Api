package com.reflection.api;

public class ReflectionApi {

	private int a;
	private String b;
	public int c;

	// For Private Constructor class.Modify to public to ConstructorClass.
	// getConstrucors method return public constructor and getDeclaredConstructor
	// returns private Constructors.
	private ReflectionApi() {

		System.out.println("In public class constructor::");
	}

	public void method1() {
		System.out.println("In public Method::");
	}

	private void method2() {

		System.out.println("this is a private mehod...!!");
	}

	private String method3(String name) {

		System.out.println("My name is :::" + name);

		return name;
	}

}
