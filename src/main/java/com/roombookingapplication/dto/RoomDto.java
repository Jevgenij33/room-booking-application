package com.roombookingapplication.dto;

import java.util.Objects;

public class RoomDto {

    private Integer id;
    private String roomName;
    private Integer capacity;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomDto roomDto = (RoomDto) o;
        return Objects.equals(id, roomDto.id) &&
                Objects.equals(roomName, roomDto.roomName) &&
                Objects.equals(capacity, roomDto.capacity) &&
                Objects.equals(description, roomDto.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomName, capacity, description);
    }
}
