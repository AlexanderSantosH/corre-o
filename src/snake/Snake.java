/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class Snake extends JFrame
{
     
    


    // Método construtor da classe
    public Snake ()
    {
        
        
        // Adiciona o JPanel do jogo
        add(new Grade());
        

        // Define a saida da aplicação
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Define o tamanho da janela
        setSize(420, 440);
        // A localização
        
        
         
        setLocationRelativeTo(null);
        // O titulo da janela
        setTitle("Jogo da Cobrinha");

        // Impede o redimensionamento da janela
        setResizable(false);
        // Mostra a janela
        setVisible(true);
    }

    public static void main(String[] args) 
    {
       
        // Cria o novo JFrame
        new Snake();
        
    }

}