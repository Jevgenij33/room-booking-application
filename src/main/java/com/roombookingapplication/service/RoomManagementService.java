package com.roombookingapplication.service;

import com.roombookingapplication.dto.RoomDto;

public interface RoomManagementService {

    public RoomDto saveRoom(RoomDto roomDto);

    public void deleteByRoomId(Integer roomId);
}
