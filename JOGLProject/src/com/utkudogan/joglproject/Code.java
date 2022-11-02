/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utkudogan.joglproject;

/**
 *
 * @author utku.dogan
 */
import javax.swing.*;
import static com.jogamp.opengl.GL4.*;
import com.jogamp.opengl.*;
import static com.jogamp.opengl.GL.GL_COLOR_BUFFER_BIT;
import com.jogamp.opengl.awt.GLCanvas;

public class Code extends javax.swing.JFrame implements GLEventListener {

    private GLCanvas myCanvas;

    public Code() {
        setTitle("Chapter2 - program1");
        setSize(600, 400);
        setLocation(200, 400);
        myCanvas = new GLCanvas();
        myCanvas.addGLEventListener(this);
        this.add(myCanvas);
        this.setVisible(true);
    }

    public void display(GLAutoDrawable drawable) {
        GL4 gl = (GL4) GLContext.getCurrentGL();
        gl.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        gl.glClear(GL_COLOR_BUFFER_BIT);
    }

    public static void main(String[] args) {
        new Code();
    }

    public void init(GLAutoDrawable drawable) {
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    }

    public void dispose(GLAutoDrawable drawable) {
    }

}
