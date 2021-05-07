package gcit.edu.todo_14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.AdapterView.*;

public class MainActivity3 extends AppCompatActivity  implements OnItemSelectedListener {
    TextView showmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message=intent.getStringExtra(gcit.edu.todo_14.MainActivity.EXTRA_MESSAGE);
        showmsg=findViewById(R.id.message_display);
        showmsg.setText(message);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerbhai);
        if(spinner!=null){
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.lists, android.R.layout.simple_spinner_dropdown_item);
        if(spinner!=null){
            spinner.setAdapter(adapter);
            spinner.getDisplay();
        }
    }

    public void onRadio(View view) {
        boolean check=((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.wrong:
                Toast.makeText(this, "You have choose wrong choice", Toast.LENGTH_SHORT).show();
                break;
            case R.id.right:
                Toast.makeText(this, "You have choose right choice", Toast.LENGTH_SHORT).show();
                break;
            case R.id.wrongor:
                Toast.makeText(this, "You have are idiot bro", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String messag=parent.getItemAtPosition(position).toString();
        displayToast(messag);

    }

    private void displayToast(String messa) {
        Toast.makeText(getApplicationContext(),messa, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}