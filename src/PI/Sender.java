package PI;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sender extends Thread {
	boolean finished = false;
	private Socket socket;
	public int SERVERPORT = 8080;
	public int SERVERGET = 8081;
	public String serverAddress = null;

	@Override
	public void run() {
		while (true) {
			while (!finished) {
				if (socket == null && serverAddress != null) {
					try {
						socket = new Socket(serverAddress, SERVERGET);

					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				PrintWriter outp = null;

				if (socket != null) {
					System.out.println("11");
					try {
						outp = new PrintWriter(socket.getOutputStream(), true);
						outp.println("5");
						System.out.println("12");
						stopMe();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void stopMe() {
		finished = true;
	}

}
