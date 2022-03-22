package com.yeck.fragment_class;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Objects;


public class Fragment1 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        String[] list = {"石家庄", "沈阳", "哈尔滨", "杭州", "福州", "济南", "广州", "武汉", "成都", "昆明", "兰州", "台北", "南宁", "银川", "太原", "长春", "南京", "合肥", "南昌", "郑州", "长沙", "海口", "贵阳", "西安", "西宁", "呼和浩特", "拉萨", "乌鲁木齐"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(Objects.requireNonNull(getActivity()), R.layout.support_simple_spinner_dropdown_item, list);

        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

}
