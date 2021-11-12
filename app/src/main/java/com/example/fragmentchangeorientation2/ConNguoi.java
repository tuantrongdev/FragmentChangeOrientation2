package com.example.fragmentchangeorientation2;

public class ConNguoi {
    private int tuoi;
    private String ten;
    private String diachi;
    private int anh;

    public ConNguoi(int tuoi, String ten, String diachi, int anh) {
        this.tuoi = tuoi;
        this.ten = ten;
        this.diachi = diachi;
        this.anh = anh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }
}
