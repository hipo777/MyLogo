package org.demre.mylogo;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.snackbar.Snackbar;

import org.demre.mylogo.databinding.FragmentPreguntaBinding;

public class FragmentPregunta extends Fragment {
    private MaterialToolbar topAppbar;
    private int radioButtonResult = -1;

    private String name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentPreguntaBinding binding = FragmentPreguntaBinding.inflate(inflater, container, false);

        name = getArguments().getString("key");
        binding.txtObtenido.setText("Hola " + name);

        binding.radioGroup.setOnCheckedChangeListener((group, checkedId) -> radioButtonResult = checkedId);

        binding.btnComprobar.setOnClickListener(v -> {
            if (radioButtonResult !=-1){
                if (radioButtonResult == R.id.radioAdventista){
                    Bundle envoltorio = new Bundle();
                    envoltorio.putString("key", name);
                    Navigation.findNavController(v).navigate(R.id.action_fragmentPregunta_to_fragmentCorrecta, envoltorio);

                }else {
                    Bundle envoltorio = new Bundle();
                    envoltorio.putString("key", name);
                    Navigation.findNavController(v).navigate(R.id.action_fragmentPregunta_to_fragmentIncorrecta, envoltorio);
                }
            }else {
                Snackbar.make(v, "Selecciona una opción", Snackbar.LENGTH_LONG).show();
            }
        });

        topAppbar = binding.topAppBar;
        topAppbar.setNavigationOnClickListener(v -> {
            NavController navController = Navigation.findNavController(v);
            navController.popBackStack();
        });

        return binding.getRoot();
    }
}