package com.example.day0927.dto;

public class BoxModelBean {
    private String boxName;//箱门名称
    private int linear;//副柜分隔符
    private int boxSpan;//箱门高度
    private int article;//物品状态
    private int boxSize;//箱门尺寸
    private int boxType;//箱门类型
    private int door;//开关状态
    private int boxId;//箱门编号
    private int deskId;//副柜编号
    private int deskType;//副柜类型
    private boolean usable;//使用状态
    private boolean fault;//故障状态

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public int getLinear() {
        return linear;
    }

    public void setLinear(int linear) {
        this.linear = linear;
    }

    public int getBoxSpan() {
        return boxSpan;
    }

    public void setBoxSpan(int boxSpan) {
        this.boxSpan = boxSpan;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public int getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }

    public int getBoxType() {
        return boxType;
    }

    public void setBoxType(int boxType) {
        this.boxType = boxType;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getBoxId() {
        return boxId;
    }

    public void setBoxId(int boxId) {
        this.boxId = boxId;
    }

    public int getDeskId() {
        return deskId;
    }

    public void setDeskId(int deskId) {
        this.deskId = deskId;
    }

    public int getDeskType() {
        return deskType;
    }

    public void setDeskType(int deskType) {
        this.deskType = deskType;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    public boolean isFault() {
        return fault;
    }

    public void setFault(boolean fault) {
        this.fault = fault;
    }

}
