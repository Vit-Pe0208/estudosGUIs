import javax.swing.JFrame;

public class DrawPaneTest {
	public static void main(String[] args)
	{
		DrawPanel panel= new DrawPanel();
		JFrame application = new JFrame();//crair o frame e armazenar nosso desenho
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);//adicionar panel ao frame
		application.setSize(250, 250);//tamanho do frame
		application.setVisible(true);//torna o frame visível
	}		
	

}
