package com.example.uribefache.myfirstapp;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{
    private MainActivity mainActivity;
    private EditText editText;

    public MainActivityTest(){
        super(MainActivity.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        editText = (EditText)mainActivity.findViewById(R.id.edit_message);
    }

    public void testPreconditions() {
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("editText is null", editText);
    }

    public void testEditTextHint() {
        final String expected = mainActivity.getString(R.string.edit_message);
        final String actual = editText.getHint().toString();
        assertEquals(expected, actual);
    }

}
