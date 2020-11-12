package org.example.simpletest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class TestExample {
    @BeforeEach
    public void setup() {
        System.out.println("happens before each test");
    }

    @Test
    public void addTwoPlusTwo() {
        int expected = 2;

        assertThat(2, is(equalTo(expected)));
    }
}
