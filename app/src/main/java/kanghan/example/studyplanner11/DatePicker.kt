package kanghan.example.studyplanner11

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_date_picker.*

class DatePicker : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)


        BtnRtnDay.setOnClickListener {
            val dpd =datePicker
            val returnIntent = Intent()
            val s:String = "${dpd.year}/ ${dpd.month + 1} / ${dpd.dayOfMonth}"
            returnIntent.putExtra("returnValue", s)
            Log.d("date_rtn", "${dpd.year}/ ${dpd.month+ 1} / ${dpd.dayOfMonth}")
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
    }
}
