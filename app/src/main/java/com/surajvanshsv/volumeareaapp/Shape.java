package com.surajvanshsv.volumeareaapp;

// This class Is acting as model class
// it represents the data structure or individual data items
// that your adapter is going to be display
public class Shape {

    int shapeImg;
    String shapeName;


    public Shape(int shapeImg, String shapeName) {
        this.shapeImg = shapeImg;
        this.shapeName = shapeName;
    }

    public int getShapeImg() {
        return shapeImg;
    }

    public void setShapeImg(int shapeImg) {
        this.shapeImg = shapeImg;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
