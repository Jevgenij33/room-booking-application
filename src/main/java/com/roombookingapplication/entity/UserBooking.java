package com.roombookingapplication.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class UserBooking implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Users idUser;
    private Room idRoom;
    private LocalDateTime startBooking;
    private LocalDateTime endBooking;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getIdUser() {
        return idUser;
    }

    public void setIdUser(Users idUser) {
        this.idUser = idUser;
    }

    public Room getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(Room idRoom) {
        this.idRoom = idRoom;
    }

    public LocalDateTime getStartBooking() {
        return startBooking;
    }

    public void setStartBooking(LocalDateTime startBooking) {
        this.startBooking = startBooking;
    }

    public LocalDateTime getEndBooking() {
        return endBooking;
    }

    public void setEndBooking(LocalDateTime endBooking) {
        this.endBooking = endBooking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserBooking that = (UserBooking) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idUser, that.idUser) &&
                Objects.equals(idRoom, that.idRoom) &&
                Objects.equals(startBooking, that.startBooking) &&
                Objects.equals(endBooking, that.endBooking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idUser, idRoom, startBooking, endBooking);
    }

    @Override
    public String toString() {
        return "UserBooking{" +
                "id=" + id +
                ", idUser=" + idUser +
                ", idRoom=" + idRoom +
                ", startBooking=" + startBooking +
                ", endBooking=" + endBooking +
                '}';
    }
}
