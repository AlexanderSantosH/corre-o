/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;


public class TocarSom extends JFrame {

    JButton tocar = new JButton("audio");

    public TocarSom() {

        play("audio");

    }
  
 
    
    
    
    
    

    public void play(String nomeDoAudio) {
        URL url = getClass().getResource(nomeDoAudio + ".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }

}
