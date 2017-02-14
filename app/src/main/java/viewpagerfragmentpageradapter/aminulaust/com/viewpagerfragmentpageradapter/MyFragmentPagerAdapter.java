package viewpagerfragmentpageradapter.aminulaust.com.viewpagerfragmentpageradapter;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    // Holds tab titles
    private String tabTitles[] = new String[] { "Frag #1", "Frag #2", "Frag #3","Frag #4","Frag #5","Frag #6" };
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 6;
    }

    // Return the correct Fragment based on index
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new TabFragment1();
        } else if(position == 1) {
            return new TabFragment2();
        } else if(position == 2) {
            return new TabFragment3();
        }else if(position == 3) {
            return new TabFragment4();
        } else if(position == 4) {
            return new TabFragment5();
        }else if(position == 5) {
            return new TabFragment6();
        }

        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the tab title to SlidingTabLayout
        return tabTitles[position];
    }
}