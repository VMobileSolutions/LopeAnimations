package com.thedeveloperworldisyours.lope.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.thedeveloperworldisyours.lope.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UpActivity extends AppCompatActivity {

    @BindView(R.id.activity_up_toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.up_activity);
        overridePendingTransition(R.anim.up_go_in, R.anim.up_go_out);
        ButterKnife.bind(this);
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void back(View view) {
        finishMyActivity();
    }

    @Override
    public void onBackPressed() {
        finishMyActivity();
    }

    public void finishMyActivity() {
        finish();
        overridePendingTransition(R.anim.up_back_in, R.anim.up_back_out);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finishMyActivity();
                break;
        }
        return true;
    }
}
