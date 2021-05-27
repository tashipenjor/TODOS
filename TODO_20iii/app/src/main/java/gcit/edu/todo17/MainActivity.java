package gcit.edu.todo17;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private int score1,score2;
    TextView increase,decrease;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increase=findViewById(R.id.score1);
        decrease=findViewById(R.id.score2);
    }

    public void increase(View view) {


        int viewID = view.getId();
        switch (viewID) {
            case R.id.increase:
                score1++;
                increase.setText(String.valueOf(score1));
                break;

            case R.id.increase2:
                score2++;
                decrease.setText(String.valueOf(score2));
                break;


        }
    }

    public void decrease(View view) {
            int viewID = view.getId();
            switch(viewID){


                case R.id.decrease:
                    score1 --;
                    increase.setText(String.valueOf(score1));
                    break;

                case R.id.decrease2:
                    score2 --;
                    decrease.setText(String.valueOf(score2));

                    break;
            }

        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.night){
            int nightmode= AppCompatDelegate.getDefaultNightMode();
            if (nightmode==AppCompatDelegate.MODE_NIGHT_YES){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        }
        return true;
    }

}