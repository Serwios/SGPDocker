package com.company.monitoring.controller;


import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@EnableScheduling
public class DemoController {
    private final Counter requestsTotal;

    public DemoController(MeterRegistry registry) {
        this.requestsTotal = registry.counter("demo_requests_total");
    }

    @Scheduled(fixedRate = 2000, timeUnit = TimeUnit.MILLISECONDS)
    public void hello() {
        System.out.println("Incremented: " + requestsTotal.count());;
        requestsTotal.increment();
    }
}
