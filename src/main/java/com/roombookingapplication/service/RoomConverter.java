package com.roombookingapplication.service;

import com.roombookingapplication.dto.RoomDto;
import com.roombookingapplication.entity.Room;

public class RoomConverter {

    public RoomDto fromRoomToRoomDto(Room room) {
        RoomDto roomDto = new RoomDto();
        roomDto.setId(room.getId());
        roomDto.setRoomName(room.getRoomName());
        roomDto.setCapacity(room.getCapacity());
        roomDto.setDescription(room.getDescription());
        return roomDto;
    }

    public Room fromRoomDtoToRoom(RoomDto roomDto) {
        Room room = new Room();
        room.setId(roomDto.getId());
        room.setRoomName(roomDto.getRoomName());
        room.setCapacity(roomDto.getCapacity());
        room.setDescription(roomDto.getDescription());
        return room;
    }
}
