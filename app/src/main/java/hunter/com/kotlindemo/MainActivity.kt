package hunter.com.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val menu= SlidingMenu(this)
        menu.setMenu(1)
    }

}
