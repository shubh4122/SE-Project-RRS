package com.android.seproject;

public class train {

    String train_no, source, dest, arr_time, dept_time, train_name, avail_seats, price_sl;
    public train(String train_no, String source, String dest, String arr_time, String dept_time, String train_name, String avail_seats, String price_sl) {
        this.train_no = train_no;
        this.source = source;
        this.dest = dest;
        this.arr_time = arr_time;
        this.dept_time = dept_time;
        this.train_name = train_name;
        this.avail_seats = avail_seats;
        this.price_sl = price_sl;
    }

    public String getTrain_no() {
        return train_no;
    }

    public void setTrain_no(String temp) {
        this.train_no = temp;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String temp) {
        this.dest = temp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String temp) {
        this.source = temp;
    }

    public String getArr_time() {
        return arr_time;
    }

    public void setArr_time(String temp) {
        this.arr_time = temp;
    }

    public String getDept_time() {
        return dept_time;
    }

    public void setDept_time(String temp) {
        this.dept_time = temp;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String temp) {
        this.train_name = temp;
    }

    public String getavail_seats() {
        return avail_seats;
    }

    public void setavail_seats(String temp) {
        this.avail_seats = temp;
    }

    public String getPrice() {
        return price_sl;
    }

    public void setPrice(String temp) {
        this.price_sl = temp;
    }
}
