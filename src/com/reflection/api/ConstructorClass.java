package com.reflection.api;

import java.lang.reflect.Constructor;

public class ConstructorClass {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class c = Class.forName("com.reflection.api.ReflectionApi");
		System.out.println(c.getName());

		ReflectionApi ref = (ReflectionApi) c.newInstance();

		ref.method1();

		// FOR PUBLIC Constructor.

		Constructor[] fp = c.getConstructors();
		for (int i = 0; i < fp.length; i++) {

			System.out.println("Constructors are:::" + fp[i]);
		}

	}
}