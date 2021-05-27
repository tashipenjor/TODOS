package gcit.edu.todo21;

import android.os.AsyncTask;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsyncTask  extends AsyncTask<Void,Void,String> {
    private WeakReference<TextView>mTextView;
    public SimpleAsyncTask(TextView tv) {
        mTextView = new WeakReference<>(tv);
    }

    @Override
    protected String doInBackground(Void... voids) {
        Random random=new Random();
        int n=random.nextInt(11);
        int s=n*300;
        try{
            Thread.sleep(s);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        return "Awoke at last after for"+s+"millisecond";
    }

    @Override
    protected void onPostExecute(String s) {
      mTextView.get().setText(s);
    }
}
