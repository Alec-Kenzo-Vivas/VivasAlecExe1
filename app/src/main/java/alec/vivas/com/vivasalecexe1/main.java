package alec.vivas.com.vivasalecexe1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainplaces);
    }

    public void place1(View view) {
        Intent i = null;
        if (view.getId() == R.id.mcdo) {
            i = new Intent(this, place1.class);
            startActivity(i);
        }
    }
    public void place2(View view) {
        Intent i = null;
        if (view.getId() == R.id.jb) {
            i = new Intent(this, place2.class);
            startActivity(i);
        }
    }
    public void place3(View view) {
        Intent i = null;
        if (view.getId() == R.id.kfc) {
            i = new Intent(this, place3.class);
            startActivity(i);
        }
    }
    public void place4(View view) {
        Intent i = null;
        if (view.getId() == R.id.ag) {
            i = new Intent(this, place4.class);
            startActivity(i);
        }
    }
    public void back(View view) {
        Intent i = null;
        if (view.getId() == R.id.back) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
