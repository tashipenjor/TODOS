package gcit.edu.todo_16;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ListAdapter  extends RecyclerView.Adapter<ListAdapter.WordViewHolder> {
    private final LinkedList<String> mwork;
    private LayoutInflater mInflater;

    public ListAdapter(Context context, LinkedList<String>mwork){
        mInflater=LayoutInflater.from(context);
        this.mwork=mwork;
    }

    @NonNull
    @Override
    public ListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView=mInflater.inflate(R.layout.worldlist_item,parent,false);
        return  new WordViewHolder(mItemView,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.WordViewHolder holder, int position) {
        String mCurrent=mwork.get(position);
        holder.wordItemView.setText(mCurrent);

    }

    @Override
    public int getItemCount() {
        return mwork.size();
    }
    class  WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private  final TextView wordItemView;
        final  ListAdapter mAdapter;
        public  WordViewHolder(@NonNull View itemView,ListAdapter mAdapter){
            super(itemView);
            wordItemView=itemView.findViewById(R.id.word);
            this.mAdapter=mAdapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mposition=getLayoutPosition();
            String element= mwork.get(mposition);
            mwork.set(mposition,"clicked"+element);
            mAdapter.notifyDataSetChanged();

        }
    }
}
