package com.anfaas.viewpager;

public class car {
    int imageId;
    String car_name;
    public  car(int imageId,String car_name)
    {
        this.car_name=car_name;
        this.imageId=imageId;
    }
    int getImageId()
    {
        return this.imageId;
    }
    String getcar_name()
    {
     return  this.car_name;

    }
    void setImageId(int imageIdi)
    {
        this.imageId=imageIdi;
    }
    void setCar_name(String car_name)
    {
        this.car_name=car_name;

    }

}
