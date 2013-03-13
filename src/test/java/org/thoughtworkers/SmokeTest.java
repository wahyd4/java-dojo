package org.thoughtworkers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SmokeTest {
    @Test
    public void shouldAlwaysPass() throws Exception {
        assertThat(1, is(1));
    }
}
