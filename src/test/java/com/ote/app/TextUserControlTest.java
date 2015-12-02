package com.ote.app;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Olivier on 01/12/2015.
 */
public class TextUserControlTest {

    @Test
    public void adding_a_text_should_be_copied_into_result1_and_result2() {

        ITextUserControlView viewMock = new TextUserControlViewMock();
        viewMock.setText("toto");
        viewMock.setResult1("result1");
        viewMock.setResult2("result2");

        // Call action
        viewMock.getButtonAction().handle(null);

        Assert.assertThat("bad result", viewMock.getResult1(), Matchers.equalTo("result1\r\ntoto"));
        Assert.assertThat("bad result", viewMock.getResult2(), Matchers.equalTo("result2;toto"));
    }


}
