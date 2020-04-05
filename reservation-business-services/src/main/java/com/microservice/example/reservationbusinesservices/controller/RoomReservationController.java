package com.microservice.example.reservationbusinesservices.controller;

import com.microservice.example.reservationbusinesservices.client.RoomService;
import com.microservice.example.reservationbusinesservices.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class RoomReservationController {

    /*@Autowired
    private RestTemplate restTemplate;*/

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms() {
        return roomService.findAll(null);
    }

    /*@RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> getAllRooms() {
        ResponseEntity<List<Room>> roomsResponse = this.restTemplate.exchange(
                "http://room-services/rooms", HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Room>>() {
                });
        return roomsResponse.getBody();
    }*/
}
