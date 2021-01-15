package hr.fer.rassus.pdqreview;


import static hr.fer.rassus.pdqreview.Constants.*;

public class Review {


    public static void main(String[] args) {
        PDQReporter reporter = new PDQReporter(lambda);

        reporter.createNode("one", v1, S1);
        reporter.createNode("two", v2, S2);
        reporter.createNode("three", v3, S3);
        reporter.createNode("four", v4, S4);
        reporter.createNode("five", v5, S5);
        reporter.createNode("six", v6, S6);
        reporter.createNode("seven", v7, S7);

        System.out.println(reporter.getResidenceTime());
    }




}
