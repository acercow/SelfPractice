package com.acercow.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface Gender {

    public enum GenderType {
        Male("男"),
        Female("nv"),
        Other("中性");

        private String genderStr;

        private GenderType(String str) {
            this.genderStr = str;
        }

        @Override
        public String toString() {
            return genderStr;
        }
    }

    GenderType gender() default GenderType.Male;
}
