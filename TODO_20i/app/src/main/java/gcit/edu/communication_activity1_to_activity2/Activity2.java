package gcit.edu.communication_activity1_to_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    public static final String EXTRA_replay="gcit.edu.communication_activity1_to_activity2.extra.MESSAGE";
    private EditText reply_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        reply_text=(EditText)findViewById(R.id.edit_reply);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = (TextView) findViewById(R.id.received_text);
        textView.setText(message);
    }

    public void returnText(View view) {
        String reply = reply_text.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_replay, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}