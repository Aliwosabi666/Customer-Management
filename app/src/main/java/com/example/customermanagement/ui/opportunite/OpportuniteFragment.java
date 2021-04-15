package com.example.customermanagement.ui.opportunite;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.customermanagement.R;

public class OpportuniteFragment extends Fragment {

    private OpportuniteViewModel opportuniteViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        opportuniteViewModel =
                new ViewModelProvider(this).get(OpportuniteViewModel.class);
        View root = inflater.inflate(R.layout.fragment_opportunite, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        opportuniteViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}