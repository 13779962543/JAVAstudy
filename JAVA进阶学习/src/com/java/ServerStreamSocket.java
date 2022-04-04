//@Time : 2022-03-16 20:59
//@Author : Levitan
//@File : MyStreamSocket.java
//@SoftWare : IntelliJ IDEA

package com.java;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class ServerStreamSocket extends Socket{
    private final Socket socket;
    private BufferedInputStream input;
    private BufferedOutputStream output;
    public ServerStreamSocket(InetAddress acceptorHost, int acceptorPort) throws SocketException, IOException{
        socket = new Socket(acceptorHost, acceptorPort);
        setStreams();
    }

    public ServerStreamSocket(Socket socket) throws  IOException{
        this.socket = socket;
        setStreams();
    }

    private void setStreams() throws IOException{
        InputStream inStream = socket.getInputStream();
        input = new BufferedInputStream(inStream);
        OutputStream outStream = socket.getOutputStream();
        output = new BufferedOutputStream(outStream);
    }
    public  synchronized void close() throws IOException {
        super.close();
        input.close();
        output.close();
    }

    public BufferedOutputStream getOutput(){
        return output;
    }

    public BufferedInputStream getInput(){
        return input;
    }

}
