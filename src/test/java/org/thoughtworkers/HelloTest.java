package org.thoughtworkers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloTest {
    @Test
    public void shouldSayHelloToTheWorld() throws Exception {
        Hello hello = new Hello();
        assertThat(hello.say(), is("Hello, world!"));
    }
}
