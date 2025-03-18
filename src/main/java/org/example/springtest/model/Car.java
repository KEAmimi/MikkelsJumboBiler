package org.example.springtest.model;

public class Car {
    int id;
    String brand;
    int modelyear;
    String type;
    String colour;
    String licensePLate;
    String image;

    public Car(int id, String brand, int modelyear, String type, String colour, String licensePLate, String image) {
        this.id = id;
        this.brand = brand;
        this.modelyear = modelyear;
        this.type = type;
        this.colour = colour;
        this.licensePLate = licensePLate;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModelyear() {
        return modelyear;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLicensePLate() {
        return licensePLate;
    }

    public void setLicensePLate(String licensePLate) {
        this.licensePLate = licensePLate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
