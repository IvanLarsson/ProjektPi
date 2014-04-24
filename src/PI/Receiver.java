package PI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Receiver extends Thread {
	private static ServerSocket serverSocket;
	private static Socket clientSocket;
	private static BufferedReader bufferedReader;
	private static String inputLine;
	private Sender sender;

	static int Val = 0;

	GUI_Pi pi;

	public Receiver() {

		sender = new Sender();
		sender.start();
		pi = new GUI_Pi(sender);
		// try {
		// while (true) {
		// if ((clientSocket == null) || (clientSocket.isClosed()) &&
		// serverSocket!=null) {
		// System.out.println("test");
		// clientSocket = serverSocket.accept();
		// // Create a reader
		// bufferedReader = new BufferedReader(new InputStreamReader(
		// clientSocket.getInputStream()));
		// }
		// if ((inputLine = bufferedReader.readLine()) != null) {
		// System.out.println(inputLine);
		// if (inputLine.contains(".")) {
		// sender.serverAddress = inputLine;
		// }
		// }
		// pi.sendReceived(inputLine);
		// }
		// } catch (IOException e) {
		// System.out.println(e);
		// }
	}

	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(8080);

			while (true) {
				if ((clientSocket == null) || (clientSocket.isClosed())
						&& serverSocket != null) {
					System.out.println("test");
					clientSocket = serverSocket.accept();
					clientSocket.setSoTimeout(5000);
					// Create a reader
					bufferedReader = new BufferedReader(new InputStreamReader(
							clientSocket.getInputStream()));
				}
				try {
					if (bufferedReader != null) {
						// if(bufferedReader.read()==-1){
						// System.out.print("Lost connection");
						// clientSocket.close();
						// clientSocket = null;
						// }
						if ((inputLine = bufferedReader.readLine()) != null) {
							System.out.println(inputLine);
							if (inputLine.contains(".")) {
								sender.serverAddress = inputLine;
							}
						} else if ((inputLine = bufferedReader.readLine()) == null) {
							clientSocket.close();
							clientSocket = null;
							System.out.println("Lost connection");
						}
						pi.sendReceived(inputLine);
					}
				} catch (SocketTimeoutException e) {
					System.out.println("Disconnected");
					clientSocket.close();
					clientSocket = null;
				}
			}
		} catch (IOException e) {

			System.out.println(e);
		}

		// while (true) {
		// if (serverSocket == null) {
		// try {
		// serverSocket = new ServerSocket(8080);
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }
		// if(serverSocket!=null&&clientSocket==null){
		// try {
		// clientSocket = serverSocket.accept();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// try {
		// bufferedReader = new BufferedReader(new InputStreamReader(
		// clientSocket.getInputStream()));
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// if(bufferedReader!=null){
		// try {
		// System.out.println("Tar imot");
		// if ((inputLine = bufferedReader.readLine()) != null) {
		// System.out.println(inputLine);
		// if (inputLine.contains(".")) {
		// sender.serverAddress = inputLine;
		// }
		// if (inputLine.equals("10")) {
		// System.out.println(inputLine);
		// }
		// pi.sendReceived(inputLine);
		// }
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// }
	}
}
