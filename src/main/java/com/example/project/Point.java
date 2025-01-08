package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      double distanceX = other.x - x;
      double distanceY = other.y - y;
      double completeDistance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
      return completeDistance;
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }

    public void setX(int num) {
      x = num;
    }

    public void setY(int num) {
      y = num;
    }
  }
  