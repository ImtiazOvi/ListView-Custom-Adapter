package com.master.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Context mContext;

    ArrayList<UserModel> marrayList;

    public CustomAdapter(Context mContext, ArrayList<UserModel> arrayList) {
        this.mContext = mContext;
        this.marrayList = arrayList;

    }


    @Override
    public int getCount() {
        return marrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        UserModel model = marrayList.get(position);

        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);

        TextView txtName = listItem.findViewById(R.id.txt_name);
        TextView txtTitle = listItem.findViewById(R.id.txt_title);
        txtName.setText(model.getName());
        txtTitle.setText(model.getTitle());
        return listItem;
    }
}
