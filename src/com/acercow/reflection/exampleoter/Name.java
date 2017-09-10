package com.acercow.reflection.exampleoter;

import java.lang.annotation.*;

@Target(ElementType.FIELD) @Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Name {
    String value() default "Gou Dan";
}
