package com.example.demo.learning.junit.annotations

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

@Target(AnnotationTarget.TYPE, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@Tag("fast")
annotation class Fast() {

}
