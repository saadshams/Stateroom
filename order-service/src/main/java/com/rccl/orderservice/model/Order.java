package com.rccl.orderservice.model;

public class Order {

    private int id;

    private int menuId;

    private int roomId;

    public Order() {
    }

    public Order(int id, int menuId, int roomId) {
        this.id = id;
        this.menuId = menuId;
        this.roomId = roomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
