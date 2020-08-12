package com.roombookingapplication.service;

import com.roombookingapplication.dto.RoomDto;
import com.roombookingapplication.entity.Room;
import com.roombookingapplication.repository.RoomRepository;

public class DefaultRoomManagementService implements RoomManagementService {

    private final RoomRepository roomRepository;
    private final RoomConverter roomConverter;

    public DefaultRoomManagementService(RoomRepository roomRepository, RoomConverter roomConverter) {
        this.roomRepository = roomRepository;
        this.roomConverter = roomConverter;
    }

    @Override
    public RoomDto saveRoom(RoomDto roomDto) {
        Room room = roomRepository.save(roomConverter.fromRoomDtoToRoom(roomDto));
        return roomConverter.fromRoomToRoomDto(room);
    }

    @Override
    public void deleteByRoomId(Integer roomId) {

    }
}
