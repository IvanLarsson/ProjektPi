package PI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class okeyy extends Thread{
	private static ServerSocket serverSocket;
	private static Socket clientSocket;
	private static BufferedReader bufferedReader;
	private static String inputLine;


	static int Val = 0;

	GUI_Pi pi = new GUI_Pi();
	public okeyy() {

		
	
		// frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame1.add(viewer);
		// frame1.setResizable(false);// så att man inte kan göra fönstret
		// större
		// // eller mindre
		// frame1.pack();
		// frame1.setVisible(true);

		// Wait for client to connect on 63400
		try {
			serverSocket = new ServerSocket(8080);

			// clientSocket = serverSocket.accept();
			// // Create a reader
			// bufferedReader = new BufferedReader(new InputStreamReader(
			// clientSocket.getInputStream()));
			// Get the client message
			// serverSocket.isClosed();
			// clientSocket.isClosed();
			// while ((inputLine = bufferedReader.readLine()) != null)
			while (true) {
				if ((clientSocket == null) || (clientSocket.isClosed())) {
					System.out.println("test");
					clientSocket = serverSocket.accept();
					// Create a reader
					bufferedReader = new BufferedReader(new InputStreamReader(
							clientSocket.getInputStream()));
				}
				if ((inputLine = bufferedReader.readLine()) != null) {
					System.out.println(inputLine);

				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public void run(){
		while (true){
			if(serverSocket==null){
				try {
					serverSocket = new ServerSocket(8080);
					clientSocket = serverSocket.accept();
					bufferedReader = new BufferedReader(new InputStreamReader(
							clientSocket.getInputStream()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			try {
				if ((inputLine = bufferedReader.readLine()) != null) {
					System.out.println(inputLine);
					if(inputLine.equals("10")){
						System.out.println(inputLine);
						this.pi.goForward();
					}
					else if (inputLine.equals("12")){
						this.pi.goBack();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI_Pi.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		okeyy ok = new okeyy();
		ok.start();

	}

}
