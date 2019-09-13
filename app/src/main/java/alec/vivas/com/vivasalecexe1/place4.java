package alec.vivas.com.vivasalecexe1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class place4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place4);
    }

    public void apglinkbtn(View v) {
        Uri uri = Uri.parse("https://www.facebook.com/alphagaminglacson/?ref=page_internal");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
