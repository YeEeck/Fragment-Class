package com.yeck.fragment_class;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private int num = 1;
    private ArrayList<Fragment> fragmentList = new ArrayList<>();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.index_TextView);

        Fragment fragment1 = new Fragment1();
        Fragment fragment2 = new Fragment2();
        Fragment fragment3 = new Fragment3();

        fragmentList.add(fragment1);
        fragmentList.add(fragment2);
        fragmentList.add(fragment3);

        updateFragment();
    }

    @SuppressLint("SetTextI18n")
    public void nextBtnClick(View view) {
        if (num < fragmentList.size()) {
            num++;
        } else {
            num = 1;
        }

        updateFragment();
        textView.setText(Integer.toString(num));
    }

    @SuppressLint("SetTextI18n")
    public void lastBtnClick(View view) {
        if (num > 1) {
            num--;
        } else {
            num = fragmentList.size();
        }

        updateFragment();
        textView.setText(Integer.toString(num));
    }

    private void updateFragment() {
        Fragment fragmentTemp = fragmentList.get(num - 1);
        getSupportFragmentManager().beginTransaction().replace(R.id.container1, fragmentTemp).commit();
        getSupportFragmentManager().beginTransaction().show(fragmentTemp);
    }

}
