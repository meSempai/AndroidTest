package com.example.yourtest

import com.example.yourtest.Math
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("12", math?.add("5", "7"))
    }

    @Test
    fun symbolAdd() {
        assertEquals("12", math?.add("5", "7"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("12.0", math?.add("5.0", "7"))
    }

    @Test
    fun simpleDivide() {
        assertEquals("6", math?.divide("12", "2"))
    }

    @Test
    fun zeroDivide() {
        assertEquals("На ноль делить нельзя", math?.divide("12", "0"))
    }

    @Test
    fun emptyAdd(){
        assertEquals("Вы ввели символы",math?.divide("12",""))
    }

    @Test
    fun negativeAdd(){
        assertEquals("12",math?.add("-5","-7"))
    }


    @After
    fun detach() {
        math = null
    }
}