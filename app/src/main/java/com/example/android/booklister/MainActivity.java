package com.example.android.booklister;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String SEARCH_NAME = "SEARCH_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText searchFor = (EditText) findViewById(R.id.search_name);
                String searchName = String.valueOf(searchFor.getText());
                if (searchName.length() == 0) {
                    Toast.makeText(getBaseContext(), getString(R.string.toast1), Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, BookActivity.class);

                    //new activity();
                    i.putExtra(SEARCH_NAME, searchName);
                    startActivity(i);
                }
            }
        });
    }
}
