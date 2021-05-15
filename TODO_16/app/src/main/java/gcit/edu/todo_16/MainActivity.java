package gcit.edu.todo_16;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String>mwork=new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i=0;i<20;i++){
            mwork.addLast("Word"+i);
        }
        RecyclerView mRecycle=(RecyclerView)findViewById(R.id.recyclerView);
        ListAdapter mAdapter=new ListAdapter(this,mwork);
        mRecycle.setAdapter(mAdapter);
        LinearLayoutManager obj=new LinearLayoutManager(this);
        mRecycle.setLayoutManager(obj);
        FloatingActionButton fab=findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  wordlistsize=mwork.size();
                mwork.addLast("Word"+wordlistsize);
                mRecycle.getAdapter().notifyItemInserted(wordlistsize);
                mRecycle.smoothScrollToPosition(wordlistsize);

            }
        });
    }
}