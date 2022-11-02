/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArayuzIslemleri;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author utku.dogan
 */
public class RenkVeIconlar {

// Iconlar
private Icon cancelBeyaz = new ImageIcon(getClass().getResource("/Images/cancel-beyaz.png"));
private Icon cancelSiyah = new ImageIcon(getClass().getResource("/Images/cancel-siyah.png"));
private Icon minimizeBeyaz = new ImageIcon(getClass().getResource("/Images/minimize-beyaz.png"));
private Icon minimizeSiyah = new ImageIcon(getClass().getResource("/Images/minimize-siyah.png"));


// Renkler

private Color mavi = new Color(102,102,255);

    public Icon getCancelBeyaz() {
        return cancelBeyaz;
    }

    public Icon getCancelSiyah() {
        return cancelSiyah;
    }

    public Icon getMinimizeBeyaz() {
        return minimizeBeyaz;
    }

    public Icon getMinimizeSiyah() {
        return minimizeSiyah;
    }

    public Color getMavi() {
        return mavi;
    }


    
}
