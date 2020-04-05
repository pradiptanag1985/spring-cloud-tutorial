package com.microservice.example.reservationbusinesservices.client;

import com.microservice.example.reservationbusinesservices.domain.Room;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoomServiceFallbackImpl implements RoomService {
    @Override
    public List<Room> findAll(String roomNumber) {
        Room room = new Room();
        room.setId(1L);
        room.setRoomName("Default Room Name");
        room.setBedInfo("Default Bed Info");
        room.setRoomNumber("100");
        List<Room> roomList = new ArrayList<>();
        roomList.add(room);
        return roomList;
    }
}
