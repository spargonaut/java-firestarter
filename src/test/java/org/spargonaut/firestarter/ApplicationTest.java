package org.spargonaut.firestarter;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.system.OutputCaptureRule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ApplicationTest {

    @Rule
    public OutputCaptureRule captureRule = new OutputCaptureRule();

    @Test
    public void shouldPrintHelloWorldToStandardOut() {
        Application.main(null);
        assertThat(captureRule.toString(), is("Hello World!\n"));
    }
}
