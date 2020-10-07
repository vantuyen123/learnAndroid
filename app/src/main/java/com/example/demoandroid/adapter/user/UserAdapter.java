package com.example.demoandroid.adapter.user;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 *
 */
public class UserAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<User> listUsers;
    public UserAdapter(Context context, int layout,List<User> listUsers)
    {
        this.listUsers = listUsers;
        this.context = context;
        this.layout = layout;
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
