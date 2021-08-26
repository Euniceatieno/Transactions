package com.example.wallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.google.android.material.textfield.TextInputEditText
import java.time.temporal.TemporalAmount

class MainActivity : AppCompatActivity() {
    lateinit var etDEscription:TextInputEditText
    lateinit var etRef:TextInputEditText
    lateinit var etDate:TextInputEditText
    lateinit var etAmount: TextInputEditText
    lateinit var spCard:Spinner
    lateinit var btnTransact:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        transact()

    }
    fun transact(){
        etDEscription=findViewById(R.id.etDEscription)
        etRef=findViewById(R.id.etRef)
        etDate=findViewById(R.id.etDate)
        etAmount=findViewById(R.id.etAmount)
        spCard=findViewById(R.id.spCard)
        var cards= arrayOf("DEBIT","CREDIT")
        var cardsAdapter=
            ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cards)
        cardsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spCard.adapter=cardsAdapter

        btnTransact=findViewById(R.id.btnTransact)

        btnTransact.setOnClickListener {
            var error = true
            var description = etDEscription.text.toString()
        if (description.isEmpty()) {
            error = true
            etDEscription.setError("Description is required")
        }

        var reference = etRef.text.toString()
        if (reference.isEmpty()) {
            error = true
            etRef.setError("Reference is required")
        }
            var date = etDate.text.toString()
            if (date.isEmpty()) {
                error = true
                etDate.setError("Date is required")
            }
            var amount = etAmount.text.toString()
            if (amount.isEmpty()) {
                error = true
                etAmount.setError("Amount is required")
            }
            var intent=Intent(baseContext,transactiondetails::class.java)
            startActivity(intent)

    }


        }




    }
