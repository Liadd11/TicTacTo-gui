import javax.swing.*;
import java.util.Date; 

public class BoardGui{
    

    public void main(){
        int boardHight = 800;
        int boardWidth = 800;
        int buttonHight = 100;
        int buttonWidth = 100;
        String player = "x"; //which player turn it is

        JFrame window = new JFrame(); // craeting screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setLayout(null);
        window.setSize(boardWidth,boardHight);
        window.setLocationRelativeTo(null);

        // creating buttons
        JButton b1 = new JButton("");
        JButton b2 = new JButton("");
        JButton b3 = new JButton("");
        JButton b4 = new JButton("");
        JButton b5 = new JButton("");
        JButton b6 = new JButton("");
        JButton b7 = new JButton("");
        JButton b8 = new JButton("");
        JButton b9 = new JButton("");

        // adding the buttons to screen
        window.add(b1);
        window.add(b2);
        window.add(b3);
        window.add(b4);
        window.add(b5);
        window.add(b6);
        window.add(b7);
        window.add(b8);
        window.add(b9);

        // putting the bounds of the buttons
        b1.setBounds(200,150,buttonWidth,buttonHight);
        b2.setBounds(350,150,buttonWidth,buttonHight);
        b3.setBounds(500,150,buttonWidth,buttonHight);
        b4.setBounds(200,350,buttonWidth,buttonHight);
        b5.setBounds(350,350,buttonWidth,buttonHight);
        b6.setBounds(500,350,buttonWidth,buttonHight);
        b7.setBounds(200,550,buttonWidth,buttonHight);
        b8.setBounds(350,550,buttonWidth,buttonHight);
        b9.setBounds(500,550,buttonWidth,buttonHight);
        
        
        // printing the player's name on to the buttons
        while(true){
            if(player == "x"){ 
                b1.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b1.setText("X");

                }                
            }
            );
            
            b2.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b2.setText("X");
                    
                    
                }                
            });
            b3.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b3.setText("X");
                    
                    
                }
            });
            b4.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b4.setText("X");
                    
                    
                }
            }); 
            player = "o"; 
            b5.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b5.setText("X");
                    
                    
                }
            });
            b6.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b6.setText("X");
                    
                    
                }
            });
            b7.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b7.setText("X");
                    
                    
                }
            });
            b8.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b8.setText("X");
                    
                    
                }
            });
            b9.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b9.setText("X");
                    
                    
                }
            });
            
        }

        else{
            b1.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b1.setText("O");
                    
                    
                }                
            }
            ); 
            b2.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b2.setText("O");
                    
                    
                }                
            });
            b3.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b3.setText("O");
                    
                    
                }
            });
            player = "x";
            b4.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b4.setText("O");
                    
                    
                }
            });
            player = "x";
            b5.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b5.setText("O");
                    
                    
                }                
            }
            ); 
            b6.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b6.setText("O");
                    
                    
                }                
            });
            b7.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b7.setText("O");
                    
                    

                }
            });
            b8.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b8.setText("O");
                    
                    
                }
            });
            b9.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b9.setText("O");
                    
                    
                }
            });

            
            
        }


           
            
            // setting the screen visible
            window.setVisible(true);
        }
        
        
            
    

        
        
    }
}