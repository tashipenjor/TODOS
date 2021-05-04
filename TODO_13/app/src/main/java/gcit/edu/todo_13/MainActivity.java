package gcit.edu.todo_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    public final static String EXTRA_MESSAGE = "com.gcit.todo_4.MESSAGE";
    String carry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chicken(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"You have ordered Chicken Curry!",Toast.LENGTH_LONG);
        String msg="You have ordered Chicken Curry!";
        carry=msg;
        toast.show();
    }

    public void chocolate(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"You have ordered Chocolate!",Toast.LENGTH_LONG);
        String msg="You have ordered Chocolate!";
        carry=msg;
        toast.show();
    }

    public void emadatshi(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"You have ordered Ema Datshi",Toast.LENGTH_LONG);
        String msg="You have ordered Ema Datshi";
        carry=msg;

        toast.show();
    }

    public void gotocall(View view) {


        Intent obj = new Intent(this, MainActivity2.class);
        obj.putExtra("EXTRA_MESSAGE", carry);
        startActivityForResult(obj,TEXT_REQUEST);

    }

}