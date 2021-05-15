package gcit.edu.todo_15;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int Mnum;
    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.Mnum=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return  new Fragment1();
            case 1:return  new Fragment2();
            case 2:return  new Fragment3();
            default:  return null;

        }


    }

    @Override
    public int getCount() {
        return Mnum;
    }
}
