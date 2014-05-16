package com.octo.reactive.audit;

import java.lang.annotation.*;

/**
 * Created by pprados on 07/05/2014.
 */
// FIXME: dans le package client
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.METHOD)
public @interface SuppressAuditReactive
{
	String value() default "Assume the latency here";
}