package com.nastygal.hooks;

import com.nastygal.common.BrowserClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserClass {
    @Before
    public void setup() {
        launchBrowswer("Chrome");
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
