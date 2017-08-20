package com.sergii.shutyi.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class MyAnnotationAnalyzer {
    public void invokeMethods(Class<?> clazz) throws Exception {
        Method[] methods = clazz.getMethods();
        int pass = 0;
        int fail = 0;

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                try {
                    method.invoke(null);
                    pass++;
                } catch (Exception e) {
                    fail++;
                }
            }
        }
        System.out.println("pass = " + pass + ", fail = " + fail);
    }

    public void info(Class<?> clazz) throws Exception {
        String className = clazz.getName();
        String classSimpleName = clazz.getSimpleName();
        String classCanonicalName = clazz.getCanonicalName();

        System.out.println("class name = " + className);
        System.out.println("class simple name = " + classSimpleName);
        System.out.println("class canonical name = " + classCanonicalName);

        Field[] fields = clazz.getDeclaredFields();

        for (Field field:fields) {
            System.out.println("field name = " + field.getName());
            System.out.println("field type = " + field.getType());
            System.out.println("field modifiers = " + field.getModifiers());
        }

        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation annotation:annotations) {
            System.out.println("annotation = " + annotation.toString());
        }
    }
}
