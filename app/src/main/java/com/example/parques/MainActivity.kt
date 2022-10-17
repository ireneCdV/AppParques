package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding
import kotlinx.coroutines.internal.artificialFrame

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.BGuardar.setOnClickListener{
            val TAG=" nombre "

            Log.d(TAG, "El parque es ${binding.Nombre.text} ")
            Log.d(TAG, "El parque es ${binding.Descricion.text} ")
            Log.d(TAG, "El parque es ${binding.Telefono.text} ")
            Log.d(TAG, "El parque es ${binding.Web.text} ")

            //PARA LOS CHECKBOX
            if (binding.Deportes.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.Deportes.text} ")
            }
            if (binding.ParqueInfantil.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.ParqueInfantil.text} ")
            }
            if (binding.Restaurante.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.Restaurante.text} ")
            }
            if (binding.ZonaMascotas.isChecked) {
                Log.d(TAG, "LAs actividades que tiene son:   ${binding.ZonaMascotas.text} ")

            }

            //PARA LOS SPINNER
            Log.d(TAG, "La hora de apertura es ${binding.SpinnerHoraApertura.selectedItem}")
            Log.d(TAG, "La hora de apertura es ${binding.SpinnerHoraCierre.selectedItem}")


        }


    }
}