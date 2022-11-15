package com.example.kt1;

public class CongAn {
    private String ten;
    private String capbac;
    private String noicongtac;
    private String sosao;
    private int hinh;

    public CongAn(String ten, String capbac, String noicongtac, String sosao, int hinh) {
        this.ten = ten;
        this.capbac = capbac;
        this.noicongtac = noicongtac;
        this.sosao = sosao;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public String getNoicongtac() {
        return noicongtac;
    }

    public void setNoicongtac(String noicongtac) {
        this.noicongtac = noicongtac;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
