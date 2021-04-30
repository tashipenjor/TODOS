package gcit.edu.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView t1;
    private String mcolorarray[] = {
            "red", "pink", "purple", "deep_purple", "indigo",
            "blue", "light_blue", "cyan", "teal", "green", "light_green", "lime", "yellow", "amber", "orange", "deep_orange", "brown", "grey", "blue_grey", "black"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.textview);
    }

    public void OnSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("color",t1.getCurrentTextColor());
    }

        public void changecolor (View view){
            Random random = new Random();
            String colorname = mcolorarray[random.nextInt(20)];
            int colorresource = getResources().getIdentifier(colorname,"color",getApplicationContext().getPackageName() );
            int colorres= ContextCompat.getColor(this,colorresource);
            t1.setTextColor(colorres);
        }


}