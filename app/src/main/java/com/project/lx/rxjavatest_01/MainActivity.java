package com.project.lx.rxjavatest_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.project.lx.rxjavatest_01.tag_01.ui.Tag_01Activity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_main_tag_01)
    Button btnMainTag01;
    @BindView(R.id.btn_main_tag_02)
    Button btnMainTag02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_main_tag_01, R.id.btn_main_tag_02})
    public void onViewClicked(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.btn_main_tag_01:
                intent.setClass(this, Tag_01Activity.class);
                break;
            case R.id.btn_main_tag_02:
                break;
        }
        startActivity(intent);
    }
}
