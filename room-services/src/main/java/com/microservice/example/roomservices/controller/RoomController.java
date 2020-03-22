package com.microservice.example.roomservices.controller;

import com.microservice.example.roomservices.model.Room;
import com.microservice.example.roomservices.repository.RoomRepository;
import io.micrometer.core.instrument.util.StringUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/rooms")
@Api(value ="rooms")
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value = "Get All Rooms", notes = "Get All Rooms in the System")
    public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber) {
        if (StringUtils.isNotEmpty(roomNumber))
            return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
        return (List<Room>) this.roomRepository.findAll();
    }
}
