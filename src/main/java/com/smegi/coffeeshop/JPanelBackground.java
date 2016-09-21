/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smegi.coffeeshop;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Pakijaner
 */
public class JPanelBackground extends JPanel {

    Image image;

    public JPanelBackground(String path) {
        System.out.println(getClass().getResourceAsStream(path));
        try {
            image = ImageIO.read(getClass().getResourceAsStream(path));
        } catch (IOException ex) {
            Logger.getLogger(JPanelBackground.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }
}
