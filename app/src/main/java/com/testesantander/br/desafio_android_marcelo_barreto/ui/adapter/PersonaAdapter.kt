package com.testesantander.br.desafio_android_marcelo_barreto.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import com.testesantander.br.desafio_android_marcelo_barreto.R
import com.testesantander.br.desafio_android_marcelo_barreto.model.PersonagemResult
import com.testesantander.br.desafio_android_marcelo_barreto.ui.utils.PersonagemClickListener
import com.testesantander.br.desafio_android_marcelo_barreto.ui.viewHolder.PersonaViewHolder


class PersonaAdapter (var personas: ArrayList<PersonagemResult>, private val personaOnclick : PersonagemClickListener):
    RecyclerView.Adapter<PersonaViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PersonaViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.persona_item_card_view,parent,false))

    override fun getItemCount() = personas.size

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        holder.bind(personas[position])
        holder.itemView.setOnClickListener { personaOnclick.onClick(personas[position])


        }

    }

}