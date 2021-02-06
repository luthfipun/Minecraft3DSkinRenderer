package com.example.minecraft3dskin

import android.graphics.Bitmap
import android.graphics.PixelFormat
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.example.minecraft3dskin.databinding.ActivityMainBinding
import luthfipun.minecraft3dskinrender.skins.render.MinecraftSkinRenderer
import luthfipun.minecraft3dskinrender.skins.render.SkinRender
import luthfipun.minecraft3dskinrender.skins.utils.ScreenSize
import kotlin.math.roundToInt


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var minecraftSkinRenderer: MinecraftSkinRenderer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {

        minecraftSkinRenderer = MinecraftSkinRenderer(this, R.drawable.empty, false)

        binding.apply {
            surfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0)
            surfaceView.holder.setFormat(PixelFormat.RGBA_8888)
            surfaceView.holder.setFormat(PixelFormat.TRANSLUCENT)
            surfaceView.setZOrderOnTop(true)
            surfaceView.setRenderer(minecraftSkinRenderer, resources.displayMetrics.density)
            surfaceView.renderMode = 1
        }
        minecraftSkinRenderer?.mCharacter?.SetRunning(true)

        var height = (ScreenSize.getHeightPX(this) * 0.50).roundToInt()
        var width = ScreenSize.getWidthPX(this).toDouble().roundToInt()

        if (height > width){
            width = height
        }

        val layoutParams: ConstraintLayout.LayoutParams = ConstraintLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height)
        layoutParams.setMargins(0, (ViewGroup.LayoutParams.MATCH_PARENT * 0.15).roundToInt(), 0, 0)
        binding.container.layoutParams = layoutParams
        minecraftSkinRenderer?.setSkinBitmap(SkinRender.createBitmapFromDrawable(this, R.drawable.char1)) // Load from drawable

//        setSkinFromURI() // load from url
    }

    private fun setSkinFromURI() {
        Glide.with(this)
                .asBitmap()
                .load("")
                .listener(object : RequestListener<Bitmap> {
                    override fun onLoadFailed(e: GlideException?, model: Any?, target: Target<Bitmap>?, isFirstResource: Boolean): Boolean {
                        Log.e("ENOG", e?.localizedMessage.toString())
                        return false
                    }

                    override fun onResourceReady(resource: Bitmap?, model: Any?, target: Target<Bitmap>?, dataSource: DataSource?, isFirstResource: Boolean): Boolean {
                        minecraftSkinRenderer?.setSkinBitmap(resource)
                        return false
                    }
                })
                .submit()
    }
}