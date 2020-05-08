package com.example.notebook2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(MainActivity.this, R.string.open_settings, Toast.LENGTH_LONG).show();
                Intent intentSetting = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intentSetting);
                return true;

            case R.id.action_open_notes:
                Toast.makeText(MainActivity.this, R.string.open_notebook, Toast.LENGTH_LONG).show();
                Intent intentNotes = new Intent(getApplicationContext(), NotesActivity.class);
                startActivity(intentNotes);
                return true;

            case R.id.action_exit:
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}