package alec.vivas.com.vivasalecexe1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view) {
        Intent i = null;
        if (view.getId() == R.id.places) {
            i = new Intent(this, main.class);
            startActivity(i);

        }
    }

    public void callmyService(View view){
        Intent intent = null;
        intent = new Intent(this, myService.class);
        startActivity(intent);

    }
}
