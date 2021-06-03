package com.example.demo.hotel.entity;

import com.example.demo.hotel.entity.enums.ReservationStatus;

import java.security.Timestamp;
import java.util.Objects;

public class Reservation {

    private long Id;

    private long roomId;

    private long userId;

    private double price;

    private ReservationStatus status;

    private Timestamp startDate;

    public Reservation() {
    }

    public Reservation(long id, long roomId, long userId, double price, ReservationStatus status, Timestamp startDate) {
        Id = id;
        this.roomId = roomId;
        this.userId = userId;
        this.price = price;
        this.status = status;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "Id=" + Id +
                ", roomId=" + roomId +
                ", userId=" + userId +
                ", price=" + price +
                ", status=" + status +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Id == that.Id && roomId == that.roomId && userId == that.userId && Double.compare(that.price, price) == 0 && status == that.status && Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, roomId, userId, price, status, startDate);
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }
}
