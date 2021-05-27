package gcit.edu.todo21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mTextView = findViewById(R.id.textReady);
    }
    public void startTask(View view){
        mTextView.setText("Napping....");
        new SimpleAsyncTask(mTextView).execute();
    }
}