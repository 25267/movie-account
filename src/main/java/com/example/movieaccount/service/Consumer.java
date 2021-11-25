package com.example.movieaccount.service;

import com.example.movieaccount.model.Booking;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    @KafkaListener(topics = "movie_book", groupId = "json")
    public void consume(Booking booking) {
        System.out.println("user with id: " + booking.getAccount_id() + " booked movie with id: " + booking.getMovie_id());

    }

}
