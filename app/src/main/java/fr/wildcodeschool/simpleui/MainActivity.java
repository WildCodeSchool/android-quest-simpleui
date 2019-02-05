package fr.wildcodeschool.simpleui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSend = findViewById(R.id.buttonSend);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView editFirstname = findViewById(R.id.editFirstname);
                TextView editLastname = findViewById(R.id.editLastname);
                String firstname = editFirstname.getText().toString();
                String lastname = editLastname.getText().toString();

                Toast.makeText(MainActivity.this, String.format(getString(R.string.welcome_firstname_lastname),
                        firstname, lastname), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
