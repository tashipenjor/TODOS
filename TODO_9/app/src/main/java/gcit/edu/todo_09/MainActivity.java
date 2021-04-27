package gcit.edu.todo_09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText first, second;
    private TextView showresult;

    operation result=new operation();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(EditText)findViewById(R.id.editTextFirst);
        second=(EditText)findViewById(R.id.editTextSecond);
        showresult= (TextView)findViewById(R.id.textView);


    }

    public void add(View view) {
        String firstv=first.getText().toString();
        String secondv=second.getText().toString() ;
        Log.d("Error: ",""+Integer.valueOf(firstv));
       int resultv= result.add(Integer.valueOf(firstv),Integer.valueOf(secondv));
        showresult.setText(String.valueOf(resultv));

    }

    public void sub(View view) {
        String firstv=first.getText().toString();
        String secondv=second.getText().toString() ;
        int sub=result.sub(Integer.valueOf(firstv),Integer.valueOf(secondv));
        showresult.setText(String.valueOf(sub));
        Log.e("ERROR","Something went wrong");
    }

    public void mul(View view) {
        String firstv=first.getText().toString();
        String secondv=second.getText().toString() ;
        int mul=result.mul(Integer.valueOf(firstv),Integer.valueOf(secondv));
        showresult.setText(String.valueOf(mul));
    }

    public void div(View view) {
        String firstv=first.getText().toString();
        String secondv=second.getText().toString() ;
       int div= result.div(Integer.valueOf(firstv),Integer.valueOf(secondv));
        showresult.setText(String.valueOf(div));
    }
}