package com.acercow.annotation;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Profile {
    public int id() default -1;
    public int height() default 0;
    public String nativePlace() default "";
}