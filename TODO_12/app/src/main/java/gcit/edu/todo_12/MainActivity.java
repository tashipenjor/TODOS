package gcit.edu.todo_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chicken(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"You have ordered Chicken Curry!",Toast.LENGTH_LONG);
        toast.show();
    }

    public void chocolate(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"You have ordered Chocolate!",Toast.LENGTH_LONG);
        toast.show();
    }

    public void emadatshi(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"You have ordered Ema Datshi",Toast.LENGTH_LONG);
        toast.show();
    }

    public void gotocall(View view) {
        Uri uri= Uri.parse("tel: ");
        Intent inten=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(inten);
    }
}