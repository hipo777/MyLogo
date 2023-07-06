package org.demre.mylogo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.MaterialToolbar;

import org.demre.mylogo.databinding.FragmentIncorrectaBinding;
import org.demre.mylogo.databinding.FragmentInicioBinding;

public class FragmentIncorrecta extends Fragment {
    private MaterialToolbar topAppbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentIncorrectaBinding binding = FragmentIncorrectaBinding.inflate(inflater, container, false);

        String name = getArguments().getString("key");
        binding.txtCorrect.setText(name+" Vuelve a intentarlo");

        binding.btnVolver.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.popBackStack();
        });

        topAppbar = binding.topAppBar;
        topAppbar.setNavigationOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.popBackStack();
        });

        return binding.getRoot();
    }
}