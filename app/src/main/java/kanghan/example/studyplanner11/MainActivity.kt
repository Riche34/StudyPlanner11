package kanghan.example.studyplanner11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_two.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //first of add design library
        //now create an adpaper class

//        toolBar.setTitle("Tab Layout")
//        setSupportActionBar(toolBar)

        //these lines are set our adapter
        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewPager.adapter = fragmentAdapter
        // and this line will our tablayout with viewpager
        tabLayout.setupWithViewPager(viewPager)




        // now check it

    }
}
