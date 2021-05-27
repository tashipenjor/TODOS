package gcit.edu.communication_activity1_to_activity2;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class Input_OutPut_Test {
    @Rule
    public ActivityTestRule mActivity=new ActivityTestRule<>(MainActivity.class);
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("gcit.edu.communication_activity1_to_activity2", appContext.getPackageName());
    }
    @Test
    public void activityLunch(){
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.received_text)).check(matches(isDisplayed()));
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.textViewb)).check(matches(isDisplayed()));

    }
    @Test
    public void textInputOut(){

        onView(withId(R.id.edit_id)).perform(typeText("Hello Bro, HOw are you doing? LOng time No see"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.received_text)).check(matches(withText("Hello Bro, HOw are you doing? LOng time No see")));


        onView(withId(R.id.edit_reply)).perform(typeText("Yes Bro, I was thinking to call you last night"));
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.textViewb)).check(matches(withText("Yes Bro, I was thinking to call you last night")));



    }
}