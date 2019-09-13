package alec.vivas.com.vivasalecexe1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class place1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place1);
    }

    public void mcdolinkbtn(View v) {
        Uri uri = Uri.parse("https://www.clickthecity.com/food-drink/b/yh7de4/mcdonald-s-dapitan");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
