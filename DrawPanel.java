import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
	public void paintComponent(Graphics g)//objeto graphics pode desenhar linhas, círculos,ovai e outros elementos gráficos
	{
		super.paintComponent(g);//assegura que o painel seja exibido corretamente.
		
		int largura=getWidth();
		int altura=getHeight();
		
		g.drawLine(0, 0, 200, 10);
		g.drawLine(0, 0, 185, 25);
		g.drawLine(0, 0, 170, 40);
		g.drawLine(0, 0, 155, 55);
		g.drawLine(0, 0, 140, 70);
		g.drawLine(0, 0, 125, 85);
		g.drawLine(0, 0, 110, 100);
		g.drawLine(0, 0, 95, 115);
		g.drawLine(0, 0, 80, 130);
		g.drawLine(0, 0, 65, 145);
		g.drawLine(0, 0, 50, 155);
		g.drawLine(0, 0, 35, 165);
		g.drawLine(0, 0, 20, 175);
		g.drawLine(0, 0, 10, 200);
		
		g.drawLine(0,200,10,0);
		g.drawLine(0, 185, 25, 0);
		g.drawLine(0,  170, 40,0);
		g.drawLine(0, 155, 55,0);
		g.drawLine(0, 140, 70,0);
		g.drawLine(0, 125, 85,0);
		g.drawLine(0, 110, 100,0);
		g.drawLine(0, 95, 115,0);
		g.drawLine(0, 80, 130,0);
		g.drawLine(0, 65, 145,0);
		g.drawLine(0, 50, 155,0);
		g.drawLine(0, 35, 165,0);
		g.drawLine(0, 20, 175,0);
		g.drawLine(0, 10, 200,0);
		
		

		
		
	
		
		
	}
		
		
		
		
	}
	
	
	
	
	


