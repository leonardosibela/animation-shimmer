package com.sibela.facebookshimmer

object MockProgrammingSkill {

    fun getAll() = ArrayList<ProgrammingSkill>().apply {
        add(ProgrammingSkill("Java", "Sênior", 6))
        add(ProgrammingSkill("Shell Script", "Pleno", 3))
        add(ProgrammingSkill("Kotlin", "Pleno", 2))
        add(ProgrammingSkill("PHP", "Pleno", 2))
        add(ProgrammingSkill("C#", "Júnior", 2))
        add(ProgrammingSkill("Python", "Júnior", 1))
        add(ProgrammingSkill("Dart", "Júnior", 1))
        add(ProgrammingSkill("Java Script", "Júnior", 1))
    }
}