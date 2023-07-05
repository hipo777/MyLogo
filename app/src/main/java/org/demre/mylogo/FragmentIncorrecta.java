package org.demre.mylogo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.demre.mylogo.databinding.FragmentIncorrectaBinding;
import org.demre.mylogo.databinding.FragmentInicioBinding;

public class FragmentIncorrecta extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentIncorrectaBinding binding = FragmentIncorrectaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}