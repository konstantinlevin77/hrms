package com.konstantinlevin77.hrms.validation.abstracts;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.konstantinlevin77.hrms.validation.concretes.EmployerEmailValidator;

@Documented
@Constraint(validatedBy = EmployerEmailValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployerEmailConstraint {
    String message() default "Bu e-posta ile kaydolmuş bir kullanıcı bulunmaktadır.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}