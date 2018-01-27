package com.entity;

public class Page {

    private  int end;
    private int ben;
    private String  sidx;
    private String  sord;

    public Page(int end, int ben) {
        this.end = end;
        this.ben = ben;
    }

    public Page(int end, int ben, String sidx, String sord) {
        this.end = end;
        this.ben = ben;
        this.sidx = sidx;
        this.sord = sord;
    }

    public Page() {
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getBen() {
        return ben;
    }

    public void setBen(int ben) {
        this.ben = ben;
    }
}
