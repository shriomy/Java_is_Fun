package com.my.exercises;

public class OuterClass {
    private int x =10;

    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
    class InnerClass {
        private int y = 5;
        public void setY(int y) {
            this.y = y;
        }
        public int getY() {
            return y;
        }
    }
    //refer main class
}
