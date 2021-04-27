package dev.blais.paginglistfeed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.blais.paginglistfeed.ui.main.PageListFragment

class PageListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_list_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PageListFragment.newInstance()).commitNow()
        }
    }
}