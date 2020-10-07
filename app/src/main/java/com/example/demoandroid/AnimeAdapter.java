package com.example.demoandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class AnimeAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<AnimeImage> animeImageList;

    public AnimeAdapter(Context context, int layout, List<AnimeImage> animeImageList) {
        this.context = context;
        this.layout = layout;
        this.animeImageList = animeImageList;
    }

    @Override
    public int getCount() {
        return animeImageList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private static class ViewHolder {
        ImageView image;
        TextView name, description;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.name = (TextView) view.findViewById(R.id.textViewTitle);
            holder.description = (TextView) view.findViewById(R.id.textViewDescription);
            holder.image = (ImageView) view.findViewById(R.id.imageViewAnime);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        //assign value
        AnimeImage anime = animeImageList.get(i);
        holder.name.setText(anime.getName());
        holder.description.setText(anime.getDescription());
        holder.image.setImageResource(anime.getImage());
        return view;

    }
}
