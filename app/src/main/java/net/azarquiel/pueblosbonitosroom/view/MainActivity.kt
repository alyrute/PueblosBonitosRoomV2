package net.azarquiel.pueblosbonitosroom.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.azarquiel.alltricks.util.Util
import net.azarquiel.pueblosbonitosroom.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Util.inyecta(this, "pueblosbonitos.sqlite")
    }
}