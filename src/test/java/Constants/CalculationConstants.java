package Constants;

public enum CalculationConstants {
    //PERSON_1 (-1, 0),
    PERSON_2 (0.00, 30),
    PERSON_3 (0.01, 30),
    PERSON_4 (4.99, 30),
    PERSON_5 (5.00, 30),
    PERSON_6 (5.01, 20),
    PERSON_7 (11.99, 20),
    PERSON_8 (12.00, 20),
    PERSON_9 (12.01, 15),
    PERSON_10 (14.99, 15),
    PERSON_11 (15.00, 15),
    PERSON_12 (15.01, 0),
    PERSON_1 (-1, 0);


    private final double testSalary;
    private final double expectedDiscount;

    CalculationConstants(double testSalary, double expectedDiscount) {
        this.testSalary = testSalary;
        this.expectedDiscount = expectedDiscount;
    }

    public double getTestSalary() {
        return testSalary;
    }

    public double getExpectedDiscount() {
        return expectedDiscount;
    }

}


