package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        app.getMainScreen().confirm();
    }

    @Test
    public void appLaunchTest(){
        Assert.assertTrue(app.getMainScreen().isNoReminderTestPresent());
    }
}
