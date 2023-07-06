package org.demre.mylogo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import org.demre.mylogo.databinding.FragmentInicioBinding;

import java.util.Objects;

public class FragmentInicio extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        FragmentInicioBinding binding = FragmentInicioBinding.inflate(inflater, container, false);

        binding.btnSiguiente.setOnClickListener(v -> {
            String datoIngresado = binding.textNombre.getEditText().getText().toString();

            if (datoIngresado.isEmpty()){
                Snackbar.make(v, "Debe ingresar un nombre", Snackbar.LENGTH_LONG).show();
            }else {
                Bundle envoltorio = new Bundle();
                envoltorio.putString("key", datoIngresado);
                Navigation.findNavController(v).navigate(R.id.action_fragmentInicio_to_fragmentPregunta, envoltorio);
            }

        });

        return binding.getRoot();
    }
}