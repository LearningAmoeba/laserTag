package com.example.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class playerScore extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_score);
        listView = (ListView)findViewById(R.id.playerScoreList); // store the id of playerScoreList
        HashMap<String,String> nameScore = new HashMap<>(); // create a hash map to store the name and score pairs
        nameScore.put("Archit  10", "10");
        nameScore.put("Yu  20", "20");
        nameScore.put("Evan  30", "30");
        nameScore.put("Aidan  40", "40");
        nameScore.put("Rayyan  50", "50");

        List<HashMap <String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});

        Iterator it = nameScore.entrySet().iterator();
        while(it.hasNext()){
            HashMap<String, String> resultingMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultingMap.put("First Line", pair.getKey().toString());
            resultingMap.put("Second Line", pair.getValue().toString());
            listItems.add(resultingMap);
        }
        listView.setAdapter(adapter);

        Button ScoreBoard = (Button)findViewById(R.id.returnToPlayPage );  // create a button
        ScoreBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ScoreBoard = new Intent(getApplicationContext(),playPage .class);
                startActivity(ScoreBoard);
            }
        });
    }
}
