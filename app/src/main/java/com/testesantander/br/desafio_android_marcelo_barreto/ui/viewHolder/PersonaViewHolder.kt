package com.testesantander.br.desafio_android_marcelo_barreto.ui.viewHolder

import android.os.Build
import android.view.View
import android.widget.ProgressBar
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.testesantander.br.desafio_android_marcelo_barreto.R
import com.testesantander.br.desafio_android_marcelo_barreto.model.PersonagemResult
import com.testesantander.br.desafio_android_marcelo_barreto.ui.utils.Util
import kotlinx.android.synthetic.main.persona_item_card_view.view.*


class PersonaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var persona_name = view.txt_nome
    var iv_persona = view.iv_persona
    var progressBar: ProgressBar = view.progressBar

    @RequiresApi(Build.VERSION_CODES.N)
    fun bind(personas: PersonagemResult) {
        val path = "${personas.thunbnail.patch}.${personas.thunbnail.extension}"
        persona_name.text = personas.name
        Util.getPicture(itemView.context,path,iv_persona,progressBar)
    }
}