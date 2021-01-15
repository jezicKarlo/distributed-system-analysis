package hr.fer.rassus.pdqreview;

public class Constants {

    private Constants() {
    }

    static final int NUMBER_OF_SERVERS = 1;

    private static final double a = 0.2;
    private static final double b = 0.3;
    private static final double c = 0.5;
    private static final double d = 0.3;
    private static final double e = 0.7;
    private static final double f = 0.5;
    private static final double g = 0.1;
    private static final double h = 0.3;

    static final double S1 = 0.003;
    static final double S2 = 0.001;
    static final double S3 = 0.01;
    static final double S4 = 0.04;
    static final double S5 = 0.1;
    static final double S6 = 0.13;
    static final double S7 = 0.15;

    static final double v1 = 1;
    static final double v2 = (1 - h*g) / (1 - h * g - f * (d + h * e));
    static final double v3 = a * (1 - h*g) / (1 - h * g - f * (d + h * e));
    static final double v4 = b * (1 - h*g) / (1 - h * g - f * (d + h * e));
    static final double v5 = c * (1 - h*g) / (1 - h * g - f * (d + h * e));
    static final double v6 = (d + h * e) / (1 - h * g - f * (d + h * e));
    static final double v7 = (e * (1 - h * g) + g * (d + h * e)) / (1 - h * g - f * (d + h * e));
}
