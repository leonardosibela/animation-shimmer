package com.sibela.facebookshimmer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sibela.facebookshimmer.databinding.ItemProgrammingSkillBinding

class ProgrammingSkillAdapter(private val programmingSkills: List<ProgrammingSkill>) :
    RecyclerView.Adapter<ProgrammingSkillAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(ItemProgrammingSkillBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val programmingSkill = programmingSkills[position]
        holder.bind(programmingSkill)
    }

    override fun getItemCount() = programmingSkills.size

    class ViewHolder(private val binding: ItemProgrammingSkillBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(programmingSkill: ProgrammingSkill) {
            binding.apply {
                txLanguageName.text = programmingSkill.name
                txSeniorityLevel.text = programmingSkill.seniority
                txYearsExperience.text = programmingSkill.yearsOfExperience.toString()
            }
        }
    }
}