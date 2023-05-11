package com.example.yourtest


import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.Test

class ActivityTest {

    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd() {
        runBlocking {
            Espresso.onView(withId(R.id.firstName)).perform(ViewActions.typeText("24"))
            Espresso.onView(withId(R.id.firstName)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.firstName)).perform(ViewActions.typeText("6"))
            Espresso.onView(withId(R.id.firstName)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.CalculateBtn)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("30")))
            delay(2000)
        }
    }

    @Test
    fun simpleDivide() {
        runBlocking {
            Espresso.onView(withId(R.id.secondnName)).perform(ViewActions.typeText("24"))
            Espresso.onView(withId(R.id.secondnName)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.secondnName)).perform(ViewActions.typeText("6"))
            Espresso.onView(withId(R.id.secondnName)).perform(ViewActions.closeSoftKeyboard())
            delay(1000)
            Espresso.onView(withId(R.id.devideBtn)).perform(ViewActions.click())
            delay(1000)
            Espresso.onView(withId(R.id.resultTv))
                .check(ViewAssertions.matches(ViewMatchers.withText("4")))
            delay(2000)
        }
    }
}