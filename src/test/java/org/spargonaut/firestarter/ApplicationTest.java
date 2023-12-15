package org.spargonaut.firestarter;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class ApplicationTest {

    @Rule
    public OutputCapture capture = new OutputCapture();

    @Test
    public void shouldPrintHelloWorldToStandardOut() {
        Application.main(null);
        assertThat(capture.toString(), is("Hello World!\n"));
    }
}
