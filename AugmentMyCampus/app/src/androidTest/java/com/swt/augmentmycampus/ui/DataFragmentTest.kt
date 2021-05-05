package com.swt.augmentmycampus.ui

import androidx.fragment.app.testing.FragmentScenario
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.swt.augmentmycampus.MainActivity
import com.swt.augmentmycampus.R
import com.swt.augmentmycampus.ScanActivity
import com.swt.augmentmycampus.ui.data.DataFragment
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DataFragmentTest {

    @get:Rule
    var mainActivity: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testNavigateToDataFragment() {
        onView(withId(R.id.navigation_data)).perform(click())
        onView(withId(R.id.fragment_data_id)).check(matches(isDisplayed()))
    }

    @Test
    fun testDataFragmentHasHeaderLabel() {
        onView(withId(R.id.navigation_data)).perform(click())
        onView(withId(R.id.fragment_data_id)).check(matches(isDisplayed()))
        onView(withId(R.id.label_header)).check(matches(isDisplayed()))
        onView(withId(R.id.label_header)).check(matches(withText("Agile Software Development")))
    }


}