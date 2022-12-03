package com.example.assignment2

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class Predictions : DialogFragment(R.layout.predictions)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val doneBT: Button = view.findViewById(R.id.doneBT);

        doneBT.setOnClickListener()
        {
            val rg : RadioGroup = view.findViewById(R.id.radioGroup)

            val selectedOption: Int = rg.checkedRadioButtonId

            val radioButton = view.findViewById<RadioButton>(selectedOption)

            if(radioButton.text == "Morocco")
                Toast.makeText(context, "Great prediction :D", Toast.LENGTH_SHORT).show()

            else
                Toast.makeText(context, "I'm putting Morocco instead :D", Toast.LENGTH_SHORT).show()

            val m1: MainActivity = getActivity() as MainActivity;

            m1.receivePrediction("Morocco")
            dismiss()
        }
    }
}