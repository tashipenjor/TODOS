package gcit.edu.todo_14;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.gcit.todo_14.MESSAGE";

    String carry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbarD);
        setSupportActionBar(toolbar);
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


        Intent obj = new Intent(this, MainActivity3.class);
        obj.putExtra(EXTRA_MESSAGE,carry);
        startActivity(obj);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.one:
                Intent intent=new Intent(gcit.edu.todo_14.MainActivity.this, gcit.edu.todo_14.MainActivity3.class);
                intent.putExtra(EXTRA_MESSAGE,carry);
                startActivity(intent);
                return  true;

            case R.id.two:
                Toast.makeText(this, "You have selected Mango for now", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.three:
                Toast.makeText(this, "You have selected orange for now", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.four:
                Toast.makeText(this, "You have selected Banana for now", Toast.LENGTH_SHORT).show();
                return  true;
            default:
                break;


        }

        return false;
    }
}