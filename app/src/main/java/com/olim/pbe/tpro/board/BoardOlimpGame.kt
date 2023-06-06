package com.olim.pbe.tpro.board

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.olim.pbe.tpro.databinding.ActivityBoardOlimpGameBinding
import com.olim.pbe.tpro.delegate.DelegateUtils
import com.olim.pbe.tpro.utils.GameSupport
import com.olim.pbe.tpro.view.Ball
import kotlin.math.abs

class BoardOlimpGame : AppCompatActivity() {
    private lateinit var binding: ActivityBoardOlimpGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBoardOlimpGameBinding.inflate(layoutInflater)
        val delegate = DelegateUtils.game
        setContentView(binding.root)

        binding.myach.setOnClickListener(delegate)
        val supp = GameSupport(binding, callbackPerson1 = { x, y ->
            val myachX =binding.myach.x
            val myachY =binding.myach.y
            if (abs(x-myachX)<=80 && abs(y-myachY)<=80){
                Log.e("Person1", "Drag")
                val dm = resources.displayMetrics
                val k = binding.myach.y+binding.myach.height
                Ball().ball(binding.myach, binding.myach.x, binding.myach.y-k, binding.myach.x, dm.heightPixels.toFloat(), binding.myach.y) { x, y ->
                    return@ball false
                }
            }
        }, callbackPerson2 = { x, y ->
            val myachX =binding.myach.x
            val myachY =binding.myach.y
            if (abs(x-myachX)<=80 && abs(y-myachY)<=80){
                val k = binding.myach.y+binding.myach.height
                Ball().ball(binding.myach, binding.myach.x, binding.myach.y-k, binding.myach.x, 0f-k, binding.myach.y) { x, y ->
                    return@ball false
                }
            }
        })
        binding.container.setOnDragListener(supp.maskDragListener)
        supp.attachViewDragListener()
    }
}