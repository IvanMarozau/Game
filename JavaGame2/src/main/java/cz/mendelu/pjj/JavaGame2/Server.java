package cz.mendelu.pjj.JavaGame2;

import cz.mendelu.pjj.JavaGame2.Greenfoot.HraWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.util.Arrays;

import com.google.gson.Gson;

/**
 * Třída server
 * @author xmarozau
 * @version etapa 5
 */
public class Server extends Thread {
    private HraWorld hraWorld;

    public Server(HraWorld hraWorld) {
        this.hraWorld = hraWorld;
    }

    @Override
    public void run() {
        try {
            var gson = new Gson();
            var ss = new ServerSocket(4000);
            while (!isInterrupted()) {
                var cs = ss.accept();
                try ( var w = new OutputStreamWriter(cs.getOutputStream());
                      var r = new BufferedReader(new InputStreamReader(cs.getInputStream()))
                ) {

                    while(!isInterrupted()) {
                        w.write(gson.toJson(hraWorld.getHra()));
                        w.write(" > ");
                        w.flush();
                        var line = r.readLine().split(",", 2);
                        var x = Integer.parseInt(line[0]);
                        var y = Integer.parseInt(line[1]);
                        System.out.println("Make move: " + Arrays.toString(line));
                        hraWorld.makeMove(x,y);


                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}