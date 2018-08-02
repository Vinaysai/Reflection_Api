package com.reflection.api;

import java.lang.reflect.Constructor;

public class ConstructorsPrivate {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("com.reflection.api.ReflectionApi");
		System.out.println(c.getName());

		// For Private Constructor class.Modify to public to ConstructorClass.
		// getConstrucors method return public constructor and getDeclaredConstructor
		// returns private Constructors.
		Constructor[] fp = c.getDeclaredConstructors();

		for (int i = 0; i < fp.length; i++) {

			System.out.println("Constructors are:::" + fp[i]);
		}
	}

}
