package hr.fer.rassus.pdqreview;

import org.junit.jupiter.api.Test;

import static hr.fer.rassus.pdqreview.Constants.*;
import static hr.fer.rassus.pdqreview.Constants.S7;
import static org.junit.jupiter.api.Assertions.*;

public class PDQReporterTest {

    @Test
    public void firstTest() {
        double lambda = 1;
        PDQReporter reporter = new PDQReporter(lambda);
        createNodes(reporter);

        assertEquals("0.379", reporter.getResidenceTime());
    }

    @Test
    public void secondTest() {
        double lambda = 2;
        PDQReporter reporter = new PDQReporter(lambda);
        createNodes(reporter);

        assertEquals("0.437", reporter.getResidenceTime());
    }

    @Test
    public void thirdTest() {
        double lambda = 4;
        PDQReporter reporter = new PDQReporter(lambda);
        createNodes(reporter);

        assertEquals("0.660", reporter.getResidenceTime());
    }

    @Test
    public void forthTest() {
        double lambda = 6;
        PDQReporter reporter = new PDQReporter(lambda);
        createNodes(reporter);

        assertEquals("2.237", reporter.getResidenceTime());
    }

    @Test
    public void fifthTest() {
        double lambda = 8;
        PDQReporter reporter = new PDQReporter(lambda);
        createNodes(reporter);

        assertEquals("-0.147", reporter.getResidenceTime());
    }

    private void createNodes(PDQReporter reporter) {
        reporter.createNode("one", v1, S1);
        reporter.createNode("two", v2, S2);
        reporter.createNode("three", v3, S3);
        reporter.createNode("four", v4, S4);
        reporter.createNode("five", v5, S5);
        reporter.createNode("six", v6, S6);
        reporter.createNode("seven", v7, S7);
    }

}