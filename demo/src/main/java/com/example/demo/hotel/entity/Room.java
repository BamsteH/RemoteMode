package com.example.demo.hotel.entity;

import com.example.demo.hotel.entity.enums.RoomCategory;
import com.example.demo.hotel.entity.enums.RoomStatus;
import com.example.demo.hotel.entity.enums.UserRole;

import java.util.Objects;

public class Room {

    private long id;

    private long roomNumber;

    private long guestNumber;

    private RoomCategory category;

    private RoomStatus status;

    private double price;

    public Room() {
    }

    public Room(long id, long roomNumber, long guestNumber, RoomCategory category, RoomStatus status, double price) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.guestNumber = guestNumber;
        this.category = category;
        this.status = status;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                ", guestNumber=" + guestNumber +
                ", category=" + category +
                ", status=" + status +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id && roomNumber == room.roomNumber && guestNumber == room.guestNumber && Double.compare(room.price, price) == 0 && category == room.category && status == room.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roomNumber, guestNumber, category, status, price);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(long guestNumber) {
        this.guestNumber = guestNumber;
    }

    public RoomCategory getCategory() {
        return category;
    }

    public void setCategory(RoomCategory category) {
        this.category = category;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
