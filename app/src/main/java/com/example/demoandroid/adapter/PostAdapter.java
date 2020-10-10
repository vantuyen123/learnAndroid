package com.example.demoandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.example.demoandroid.Post.PostItem;
import com.example.demoandroid.R;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class PostAdapter extends Adapter<PostAdapter.PostViewHolder> {
    private List<PostItem> postItems;

    public PostAdapter(List<PostItem> postItems) {
        this.postItems = postItems;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item,
                        parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.setPostImage(postItems.get(position));
    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder {
        RoundedImageView postImageView;

        PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.imgPost);
        }

        void setPostImage(PostItem postItem) {
            postImageView.setImageResource(postItem.getImage());
        }
    }

}
