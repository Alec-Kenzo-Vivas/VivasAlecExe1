package alec.vivas.com.vivasalecexe1;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class myService extends IntentService {
    public myService(){super("myService");}

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("Service", "Service is Running Successfully");
    }
}
