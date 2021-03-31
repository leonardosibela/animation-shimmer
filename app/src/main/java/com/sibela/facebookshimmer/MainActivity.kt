package com.sibela.facebookshimmer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.sibela.facebookshimmer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        setupShimmerAnimationListener()
    }

    private fun setupRecyclerView() {
        val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        binding.programingSkillRecycler.apply {
            addItemDecoration(decoration)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ProgrammingSkillAdapter(MockProgrammingSkill.getAll())
        }
    }

    private fun setupShimmerAnimationListener() {
        binding.apply {
            startStopAnimation.setOnClickListener {
                if (itemsShimmer.isShimmerStarted) {
                    itemsShimmer.isVisible = false
                    programingSkillRecycler.isVisible = true
                    startStopAnimation.text = getString(R.string.title_start_animation)
                    itemsShimmer.stopShimmer()
                } else {
                    itemsShimmer.isVisible = true
                    programingSkillRecycler.isVisible = false
                    startStopAnimation.text = getString(R.string.title_stop_animation)
                    itemsShimmer.startShimmer()
                }
            }
        }
    }
}