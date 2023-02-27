/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CheongSun;

/**
 *
 * @author WINDOWS 10
 */
public class Robot { 
    public int xPos;
    public int yPos;

    public Robot(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void move(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void turn() {
        System.out.println("Robot is turning");
    }

    public void detectObstacle() {
        System.out.println("Robot is detecting obstacles");
    }

    public void communicate() {
        System.out.println("Robot is communicating with other robots");
    }
}