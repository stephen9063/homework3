package com.example.homework3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ViewTarget;
import com.example.model.cat;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {

    private List<cat> catsToAdapt;

    public void setData(List<cat> catsToAdapt) {

        this.catsToAdapt = catsToAdapt;
    }
    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cat, parent,false);

        CatViewHolder catViewHolder = new CatViewHolder(view);
        return catViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CatAdapter.CatViewHolder holder, int position) {

        final cat catAtPosition = catsToAdapt.get(position);
        holder.textView.setText(catAtPosition.getName());
        holder.bind(catAtPosition);
    }

    @Override
    public int getItemCount() {
        return catsToAdapt.size();
    }

    public static class CatViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView textView;
        public ImageView imageView;

        public CatViewHolder(View v) {
            super(v);
            view = v;
            textView = v.findViewById(R.id.catname);
            imageView = v.findViewById(R.id.imageView);
        }

        public void bind(final cat cat) {
            textView.setText(cat.getName());
            
            String imageUrl = cat.getUrl();
            Glide.with(view.getContext()).load(imageUrl).into(imageView);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, CatDetail.class);
                    intent.putExtra("id", cat.getId());
                    
                }
            });


        }
    }


}
