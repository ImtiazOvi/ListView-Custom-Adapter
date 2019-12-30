package com.master.listviewexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = MainActivity.this;


        dummydataLoad();
    }

    UserModel model = null;

    public void dummydataLoad() {

        ListView list_view = findViewById(R.id.list_view);
        ArrayList<UserModel> arrayList = new ArrayList<>();

        model = new UserModel();
        model.setName("Rokibu");
        model.setTitle("ADB");
        arrayList.add(model);

        model = new UserModel();
        model.setName("Shofikul Islam");
        model.setTitle("Software Engineer");
        arrayList.add(model);


        model = new UserModel();
        model.setName("Rokibu");
        model.setTitle("ADB");
        arrayList.add(model);

        model = new UserModel();
        model.setName("Shofikul Islam");
        model.setTitle("Software Engineer");
        arrayList.add(model);

        model = new UserModel();
        model.setName("Rokibu");
        model.setTitle("ADB");
        arrayList.add(model);

        model = new UserModel();
        model.setName("Shofikul Islam");
        model.setTitle("Software Engineer");
        arrayList.add(model);

        Log.d("arrayList_size", "are" + arrayList.size());

        CustomAdapter adapter = new CustomAdapter(mContext, arrayList);
        list_view.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }

}
