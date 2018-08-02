package com.reflection.api;

import java.lang.reflect.Field;

public class FieldClass {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class c = Class.forName("com.reflection.api.ReflectionApi");
		System.out.println(c.getName());

		ReflectionApi ref = (ReflectionApi) c.newInstance();

		 ref.method1();
		// FOR PUBLIC FIELDS.
		Field[] f = c.getFields();

		for (int i = 0; i < f.length; i++) {

			System.out.println("Public fields are:::" + f[i]);
		}

		// FOR PRIVATE FIELDS.

		Field[] fp = c.getDeclaredFields();

		for (int i = 0; i < fp.length; i++) {

			System.out.println("Private Fields are:::" + fp[i]);
		}

	}
}
