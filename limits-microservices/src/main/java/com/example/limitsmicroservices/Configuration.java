package com.example.limitsmicroservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-server")
class Configuration {

    private int minimum;
    private int maximum;

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
