package com.heena.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String author() default "Pankaj";

    String date();

    int revision() default 1;

    String comments();

}
