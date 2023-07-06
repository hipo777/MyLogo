package org.demre.mylogo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.demre.mylogo.databinding.FragmentPreguntaBinding;

public class FragmentPregunta extends Fragment {

    private String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentPreguntaBinding binding = FragmentPreguntaBinding.inflate(inflater, container, false);

        String nombre = getArguments().getString("key");
        binding.txtObtenido.setText("Hola " + nombre);

        /*
        Bundle bundle = getArguments();
        if (bundle != null) {
            name = bundle.getString("name");
        }
        // Display the name in the textView
        binding.txtObtenido.setText("HOLA " + name);*/

        return binding.getRoot();
    }
}