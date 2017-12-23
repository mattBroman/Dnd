package nosaj.broman.dnd;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button createButton = (Button)findViewById(R.id.Create);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CreateMenu.class);
                startActivity(intent);
            }
        });

        Button sheets = (Button)findViewById(R.id.Sheets);
        sheets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SheetsMenu.class);
                startActivity(intent);
            }
        });

        Button dm = (Button)(findViewById(R.id.DM));
        dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DmMenu.class);
                startActivity(intent);
            }
        });

    }
}
