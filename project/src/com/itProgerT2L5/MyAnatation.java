package com.itProgerT2L5;

import java.lang.annotation.*;

//@Target(ElementType.CONSTRUCTOR)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnatation {

    int number() default 5;
    String name() default "Bob";
    float digit() default 5.0f;

    enum Types {
        Basic,
        Medium,
        Hard
    }
    Types type() default Types.Medium;

}
