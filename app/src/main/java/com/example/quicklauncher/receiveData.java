package com.example.quicklauncher;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class receiveData extends AsyncTask<Void, Void, Void> {
    String data ;
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("https://lasertag.azurewebsites.net/?inp=state" );
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();            // set connection to with the url to the internet
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = " ";
            while(line != null){
                line = bufferedReader.readLine();
                data = data + line;
            }
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        playerScore.data.setText(this.data);
    }
}
