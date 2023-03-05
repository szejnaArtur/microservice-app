package com.example.limitsmicroservices;


class Limits {

    private int minimum;
    private int maximum;

    public Limits(final int minimum, final int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    void setMinimum(final int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    void setMaximum(final int maximum) {
        this.maximum = maximum;
    }
}
