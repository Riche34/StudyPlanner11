package kanghan.example.studyplanner11

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter (fm : FragmentManager) : FragmentPagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> {
                //now create three fragment
                FragmentOne()
            }
            1 -> {
                //now create three fragment
                FragmentTwo()
            }
            2 -> {
                //now create three fragment
                FragmentThree()
                //this method is set our tabs position
            }
            else -> {
                //now create three fragment
                FragmentFour()
                //this method is set our tabs position
            }
        }
    }

    override fun getCount(): Int {
        return 4
        // and this method will return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "메인"
            1 -> "설정"
            2 -> "데일리"
            else ->"통계"
        }
        // and this method will set our tabs title
        // now move in main activity
    }
}