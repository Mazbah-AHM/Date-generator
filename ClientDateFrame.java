import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientDateFrame extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblServerDate;
	private JLabel lblStatusValue;
	
	private int width = 700;
	private int height = 200;


	public ClientDateFrame () {
		

		this.setLayout(new BorderLayout());
		this.setTitle("TCP Application: Client Side");
		this.setSize(width, height);
		

        this.setLocationRelativeTo(null);
		

		lblServerDate = new JLabel("-");
		lblStatusValue = new JLabel("-");
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		loadComponent();
		
	}
	
	@param serverDate:
	@throws UnsupportedEncodingException 

	public void updateServerDate (String serverDate) throws UnsupportedEncodingException {
		
		String Arabic = new String("صباح الخير".getBytes(), "UTF-8");
		String Melayu=new String("Selamat Pagi".getBytes(), "UTF-8");
		String Korean=new String("좋은 아침".getBytes(), "UTF-8");
		
	

		if (serverDate.contains("arabic")){
			
			
		System.out.print("Good morning in Arabic is"+Arabic);
		
		
		}
		
		else if (serverDate.contains("melayu")){
			
			
			System.out.print("Good morning in Arabic is "+Melayu);
			
			
			}
		
		else if (serverDate.contains("korean")){
			
			
			System.out.print("Good morning in Korean is "+Korean);
			
			
			}
		else {
			
			System.out.print("No Input has been received");
			
		}
		
	
		}
	

	@param connStatus: Connection status (true/false)

	public void updateConnectionStatus (boolean connStatus) {
		

		String status = "No connection to server.";
		
		if (connStatus)
			status = "Connection has established.";
		
		this.lblStatusValue.setText(status);
	}

	@param font
	@return Swing components organized in a panel.

	private JPanel getConnectionStatusPanel(Font font) {
		

		JPanel panel = new JPanel();
		JLabel lblConnStatus = new JLabel ("Connection status: ");
		

		lblConnStatus.setFont(font);
		lblStatusValue.setFont(font);
		lblConnStatus.setBackground(Color.WHITE);
		lblConnStatus.setOpaque(true);
		lblStatusValue.setBackground(Color.WHITE);
		lblStatusValue.setOpaque(true);

		panel.add(lblConnStatus);
		panel.add(lblStatusValue);
		
		return panel;
		
	}
	@param font
	@return Swing components organized in panel
	
	private JPanel getServerDatePanel(Font font) {

		JPanel panel = new JPanel();
		JLabel lblDate = new JLabel ("Date (from Server): ");


		lblDate.setFont(font);
		lblServerDate.setFont(font);
		lblDate.setBackground(Color.WHITE);
		lblDate.setOpaque(true);
		lblServerDate.setBackground(Color.WHITE);
		lblServerDate.setOpaque(true);


	
		
		
		return panel;
	} 
	

	private void loadComponent() {
		

		Font font = this.getFontStyle();
		

		JPanel northPanel = this.getConnectionStatusPanel(font);		
		this.add(northPanel, BorderLayout.NORTH);
		

		JPanel center = getServerDatePanel(font);
		this.add(center, BorderLayout.CENTER);
		
	}
	
	@return
	
	private Font getFontStyle() {
		
		Font font = new Font ("Serif", Font.PLAIN, 30);
		
		return font;
		
	}
	
	
	
	
	
}
