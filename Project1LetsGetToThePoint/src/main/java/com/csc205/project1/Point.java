package com.csc205.project1;

public class Point {

    private double x, y;        //declaring variables


    public Point() {            //constructor class
        x = y = 0;
    }

    public Point(double x, double y) {      //constructor with arguments of 2 doubles
        this.x = x;
        this.y = y;
    }


    public double distance(Point p) {               //finding distance using pythagorean theorem equation
        return Math.sqrt(Math.pow((this.x - p.getX()), 2)) + (Math.pow((this.y - p.getY()), 2));
    }

    public double getX() {      //accessor method for x
        return x;
    }

    public void setX(double x) {    //mutator method for x
        this.x = x;
    }

    public double getY() {      //accessor method for y
        return y;
    }

    public void setY(double y) {    //mutator method for x
        this.y = y;
    }


    public void setPoint(double new_x, double new_y) {          //set new coordinate points
        this.x = new_x;
        this.y = new_y;
    }


    public void shiftX(double dist) {       //shifting x by given dist amount
        this.x = this.x + dist;
    }

    public void shiftY(double dist) {       //shifting y by given dist amount
        this.y = this.y + dist;
    }

    public void rotate(double radian) {                                 // rotating point by double 'radian'
        this.x = (x * (Math.cos(radian))) - (y * (Math.sin(radian)));
        this.y = (x * (Math.sin(radian))) + (y * (Math.cos(radian)));
    }


    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
}
//commit edit