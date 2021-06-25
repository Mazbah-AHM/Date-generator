import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;



public class ClientDateApplication {

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		ClientDateFrame clientDateFrame = new ClientDateFrame();
		clientDateFrame.setVisible(true);
		
		Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
		
		clientDateFrame.updateConnectionStatus(socket.isConnected());
		
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		
		String currentDate = bufferedReader.readLine();
		clientDateFrame.updateServerDate(currentDate);
		
		bufferedReader.close();
		socket.close();

	}

}
