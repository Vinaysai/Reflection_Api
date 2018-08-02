package com.reflection.api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodClass {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

		Class c = Class.forName("com.reflection.api.ReflectionApi");
		System.out.println(c.getName());
		ReflectionApi ref = (ReflectionApi) c.newInstance();

		// Calling all methods.
		Method[] m1 = c.getMethods();
		for (int i = 0; i < m1.length; i++) {

			System.out.println(" This Methods are:::" + m1[i]);
		}
		// Calling all methods.
		Method[] m2 = c.getDeclaredMethods();
		for (int i = 0; i < m2.length; i++) {

			System.out.println("Methods are:::" + m2[i]);
		}

		// Sending Parmeters to the private Method.
		Method m = c.getDeclaredMethod("method3", new Class[] { String.class });

		m.setAccessible(true);
		m.invoke(ref, "Vinay");
	}
}
