package com.example.chattingzalo;

public class Message {
    private int hinhDaiDien;
    private String ten;
    private String tinNhanGanNhat;

    public int getHinhDaiDien() {
        return hinhDaiDien;
    }

    public void setHinhDaiDien(int hinhDaiDien) {
        this.hinhDaiDien = hinhDaiDien;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTinNhanGanNhat() {
        return tinNhanGanNhat;
    }

    public void setTinNhanGanNhat(String tinNhanGanNhat) {
        this.tinNhanGanNhat = tinNhanGanNhat;
    }

    public Message(int hinhDaiDien, String ten, String tinNhanGanNhat) {
        this.hinhDaiDien = hinhDaiDien;
        this.ten = ten;
        this.tinNhanGanNhat = tinNhanGanNhat;
    }
}
