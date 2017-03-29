package com.project.lx.rxjavatest_01.tag_01.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.project.lx.rxjavatest_01.R;
import com.project.lx.rxjavatest_01.tag_01.observer.Cat;
import com.project.lx.rxjavatest_01.tag_01.observer.Dog;
import com.project.lx.rxjavatest_01.tag_01.observer.Tiger;
import com.project.lx.rxjavatest_01.tag_01.subject.Zoo;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Tag_01Activity extends AppCompatActivity {

    @BindView(R.id.btn_tag_01)
    Button btnTag01;
    @BindView(R.id.text_tag_01)
    TextView textTag01;

    Zoo zoo;
    Dog dog;
    Cat cat;
    Tiger tiger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_01);
        ButterKnife.bind(this);
        initDate();
    }

    public void initDate(){
        zoo = new Zoo();

        dog = new Dog();
        cat = new Cat();
        tiger = new Tiger();

        zoo.add(dog);
        zoo.add(cat);
        zoo.add(tiger);
    }

    @OnClick(R.id.btn_tag_01)
    public void onViewClicked() {
        textTag01.setText(zoo.noitfy());
    }
}
