package com.michael.copilot.practices;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoPilotPracticeTest {

    @Test
    public void printsNumbersFrom1To100() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CoPilotPractice.main(new String[]{});

        String[] outputLines = outputStream.toString().split(System.lineSeparator());
        assertEquals(100, outputLines.length);
        for (int i = 1; i <= 100; i++) {
            assertEquals(String.valueOf(i), outputLines[i - 1]);
        }
    }

    @Test
    public void doesNotPrintNumbersOutsideRange() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        CoPilotPractice.main(new String[]{});

        String[] outputLines = outputStream.toString().split(System.lineSeparator());
        assertEquals("1", outputLines[0]);
        assertEquals("100", outputLines[outputLines.length - 1]);
    }
}