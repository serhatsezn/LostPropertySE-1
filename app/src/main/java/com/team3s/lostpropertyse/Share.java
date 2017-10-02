package com.team3s.lostpropertyse;

public class Share {
    public int id = -1;
    public String questions ;
    public String desc;
    private String post_image;
    private String name;
    private String image;
    private String addressname;
    private String post_time;
    private String post_date;
    private String token;
    private String isletmeAdi;
    private double latMap;
    private double longMap;

    public Share(){
    }
    public Share(String questions, String desc, String post_image, String name, String image, String addressname, String post_time, String post_date, String token, String isletmeAdi, double latMap, double longMap){
        this.questions = questions;
        this.desc = desc;
        this.post_image = post_image;
        this.name = name;
        this.image = image;
        this.addressname = addressname;
        this.post_time = post_time;
        this.post_date = post_date;
        this.token = token;
        this.isletmeAdi = isletmeAdi;
        this.latMap = latMap;
        this.longMap = longMap;


    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPost_image() {
        return post_image;
    }

    public void setPost_image(String post_image) {
        this.post_image = post_image;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getaddressname() {
        return addressname;
    }

    public void setaddressname(String addressname) {
        this.addressname = addressname;
    }

    public String getPost_time() {
        return post_time;
    }

    public void setPost_time(String post_time) {
        this.post_time = post_time;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getisletmeAdi() {
        return isletmeAdi;
    }

    public void setisletmeAdi(String isletmeAdi) {
        this.isletmeAdi = isletmeAdi;
    }

    public Double getLatMap() {
        return latMap;
    }

    public void setLatMap(Double latMap) {
        this.latMap = latMap;
    }

    public Double getLongMap() {
        return longMap;
    }

    public void setLngMap(Double longMap) {
        this.longMap = longMap;
    }
}
