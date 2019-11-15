package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.model.cat;

public class CatDetail extends AppCompatActivity {

    TextView catnameTextView;
    TextView catDescripTextView;
    TextView catweightTextView;
    TextView catoriginTextView;
    TextView cattemTextView;
    TextView catlifeTextView;
    TextView catwikiTextView;
    TextView catdogTextView;
    ImageView catpicImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_detail);

        catnameTextView = findViewById(R.id.catNamedetail);
        catDescripTextView = findViewById(R.id.catDescribe);
        catweightTextView = findViewById(R.id.catWeight);
        catoriginTextView = findViewById(R.id.catOrigin);
        cattemTextView = findViewById(R.id.catTemperament);
        catlifeTextView = findViewById(R.id.catLifeSpan);
        //catwikiTextView = findViewById(R.id.catWikipedia);*/
        catdogTextView = findViewById(R.id.catDogFriendliness);
        catpicImageView = findViewById(R.id.catImagedetail);
        catwikiTextView = findViewById(R.id.catwiki);


        Intent intent = getIntent();

        long id = intent.getLongExtra("id",0);
        cat c = database.getCatById(id);

        catnameTextView.setText(c.getName());
        catDescripTextView.setText("Cat Detail: " + c.getDescription());
        catweightTextView.setText("Cat Weight: " + c.getWeight_imperial());
        catoriginTextView.setText("Cat Origin: " + c.getOrigin());
        cattemTextView.setText("Cat Temperament: " + c.getTemperament());
        catlifeTextView.setText("Cat Life Span: " + c.getLife_span());
        catdogTextView.setText("Dog Friendly level: " + c.getDog_friendly());
        catwikiTextView.setText("Wiki" + c.getWikipedia_url());

        String imageUrl = c.getUrl();
        Glide.with(this).load(imageUrl).into(catpicImageView);
    }
}
