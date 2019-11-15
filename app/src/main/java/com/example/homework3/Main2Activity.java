package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.homework3.profile;

import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity /*implements profile.OnFragmentInteractionListener*/{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Fragment fragment = new Cat_Recycler();
        swapFragment(fragment);

    }

    private void swapFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_slot, fragment);
        fragmentTransaction.commit();
    }

    /*@Override
    public void onFragmentInteraction(String string) {
        Toast.makeText(this, "Hello! I have come from the fragment. Message: " + string, Toast.LENGTH_SHORT).show();
    }*/
}
