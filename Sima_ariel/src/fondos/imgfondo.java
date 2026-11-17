/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fondos;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class imgfondo extends JPanel {

    public imgfondo(){
        this.setSize (535, 384) ;
    }


@Override
    protected void paintComponent(Graphics g) {
    ImageIcon imagenFondo = new ImageIcon(getClass().getResource ("/fondos/img/sima.png" ));
    g.drawImage (imagenFondo.getImage () , 0, 0, getWidth(), getHeight(), null) ;
    setOpaque (false) ;
    super.paintComponent (g) ;
    }
}
