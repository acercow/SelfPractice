package com.acercow.annotation;

import java.lang.reflect.Field;

public class CustomUtils {

    public static void getInfo(Class<?> clazz) {
        String name = "";
        String gender = "";
        String profile;

        Field fields[] = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Name.class)) {
                Name arg0 = field.getAnnotation(Name.class);
                name = name + arg0;
                System.out. println("name :: " + name);
            }
            if(field.isAnnotationPresent(Gender.class)) {
                Gender arg0 = field.getAnnotation(Gender.class);
                gender = gender + arg0;
                System.out.println("gender :: " + gender);
            }
            if (field.isAnnotationPresent(Profile.class)) {
                Profile arg0 = field.getAnnotation(Profile.class);
                profile = "[id=" + arg0.id() + ", height=" + arg0.height() + ", nativePlace="
                        + arg0.nativePlace() + "]";
                System.out.println("profile :: " + profile);
            }
        }
    }
}
