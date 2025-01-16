package com.example.paf_day05_ecommerce.service;

import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    public void onMessage(String message, String channel) {
        System.out.println("Received message from channel " + channel + ": " + message);
        // Simulate processing
        try {
            Thread.sleep(1000); // Simulate processing time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Error during processing: " + e.getMessage());
        }
    }
}
