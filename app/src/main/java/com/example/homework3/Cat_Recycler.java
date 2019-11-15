package com.example.homework3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.example.model.Favourite;
import com.example.model.FavouriteResponse;
import com.example.model.cat;
import com.google.gson.Gson;

import java.util.List;


public class Cat_Recycler extends Fragment {

    private RecyclerView recyclerView;

    private OnFragmentInteractionListener mListener;

    public Cat_Recycler() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cat__recycler, container, false);
        recyclerView = view.findViewById(R.id.rv_cats);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        final CatAdapter catAdapter = new CatAdapter();
        //recyclerView.setAdapter(catAdapter);

        final RequestQueue requestQueue = Volley.newRequestQueue(getActivity());

        String url = "https://thecatapi.com/v1/images?api_key=" + getString(R.string.apikey);

        Response.Listener<String> responseListener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                FavouriteResponse favouriteResponse = gson.fromJson(response, FavouriteResponse.class);
                Favourite favourite = favouriteResponse.getResults();
                List<cat> Fav = favourite.getCats();
                database.saveBooksTodatabase(Fav);
                catAdapter.setData(favourite.getCats());
                recyclerView.setAdapter(catAdapter);
                requestQueue.stop();


            }
        };
        return view;
    }



    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
