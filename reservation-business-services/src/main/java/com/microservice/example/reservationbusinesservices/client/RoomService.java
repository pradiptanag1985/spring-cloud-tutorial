package com.microservice.example.reservationbusinesservices.client;

import com.microservice.example.reservationbusinesservices.domain.Room;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "room-services")
public interface RoomService {

    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);
}
