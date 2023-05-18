package xyz.techrelation.queueinfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var textViewIce1000: TextView
    private lateinit var textViewIce2010: TextView
    private lateinit var textViewIce3020: TextView
    private lateinit var textViewIce4030: TextView
    private lateinit var textViewIce5040: TextView
    private lateinit var textViewIce6050: TextView
    private lateinit var textViewIce7060: TextView
    private lateinit var textViewIce8070: TextView
    private lateinit var textViewIce9080: TextView
    private lateinit var textViewIce9090: TextView

    private lateinit var textViewTaiyaki1000: TextView
    private lateinit var textViewTaiyaki2010: TextView
    private lateinit var textViewTaiyaki3020: TextView
    private lateinit var textViewTaiyaki3030: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var iceStatusCode = 0
        var iceNowSelectedView = 0
        var taiyakiStatusCode = 0
        var taiyakiNowSelectedView = 0
        var iceOpen = false
        var taiyakiOpen = false

        val iceSwitch: Switch = findViewById(R.id.iceSwitch)
        val taiyakiSwitch: Switch = findViewById(R.id.taiyakiSwitch)
        val gearView: ImageView = findViewById(R.id.gearView)

         textViewIce1000 = this.findViewById(R.id.textViewIce1000)
         textViewIce2010 = this.findViewById(R.id.textViewIce2010)
         textViewIce3020 = this.findViewById(R.id.textViewIce3020)
         textViewIce4030 = this.findViewById(R.id.textViewIce4030)
         textViewIce5040 = this.findViewById(R.id.textViewIce5040)
         textViewIce6050 = this.findViewById(R.id.textViewIce6050)
         textViewIce7060 = this.findViewById(R.id.textViewIce7060)
         textViewIce8070 = this.findViewById(R.id.textViewIce8070)
         textViewIce9080 = this.findViewById(R.id.textViewIce9080)
         textViewIce9090 = this.findViewById(R.id.textViewIce9090)

        textViewTaiyaki1000 = this.findViewById(R.id.textViewTaiyaki1000)
        textViewTaiyaki2010 = this.findViewById(R.id.textViewTaiyaki2010)
        textViewTaiyaki3020 = this.findViewById(R.id.textViewTaiyaki3020)
        textViewTaiyaki3030 = this.findViewById(R.id.textViewTaiyaki3030)

        iceSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            run {
                if (isChecked) {
                    iceOpen = true
                    updateAllIceViewNotSelected()
                } else {
                    iceOpen = false
                    iceStatusCode = 0
                    textViewIce1000.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce2010.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce3020.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce4030.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce5040.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce6050.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce7060.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce8070.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce9080.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewIce9090.setBackgroundResource(R.drawable.frame_style_notactive)
                }
            }


        }
        taiyakiSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            run {
                if (isChecked) {
                    taiyakiOpen = true
                    updateAllTaiyakiViewNotSelected()
                } else {
                    taiyakiOpen = false
                    taiyakiStatusCode = 0
                    textViewTaiyaki1000.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewTaiyaki2010.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewTaiyaki3020.setBackgroundResource(R.drawable.frame_style_notactive)
                    textViewTaiyaki3030.setBackgroundResource(R.drawable.frame_style_notactive)

                }
            }
        }

        gearView.setOnClickListener {
            val intent : Intent = Intent(this,SettingActivity().javaClass)
            startActivity(intent)
        }

        textViewIce1000.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 1000
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce1000.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce2010.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 2010
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce2010.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce3020.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 3020
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce3020.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce4030.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 4030
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce4030.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce5040.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 5040
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce5040.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce6050.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 6050
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce6050.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce7060.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 7060
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce7060.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce8070.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 8070
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce8070.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce9080.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 9080
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce9080.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewIce9090.setOnClickListener {
            if (iceOpen) {
                iceNowSelectedView = 9090
                if (iceStatusCode != iceNowSelectedView) {
                    iceStatusCode = iceNowSelectedView
                    updateAllIceViewNotSelected()
                    textViewIce9090.setBackgroundResource(R.drawable.frame_style_iceselected)
                    //checkUpdate()
                }
            }
        }

        textViewTaiyaki1000.setOnClickListener {
            if (taiyakiOpen) {
                taiyakiNowSelectedView = 1000
                if (taiyakiStatusCode != taiyakiNowSelectedView) {
                    taiyakiStatusCode = taiyakiNowSelectedView
                    updateAllTaiyakiViewNotSelected()
                    textViewTaiyaki1000.setBackgroundResource(R.drawable.frame_style_taiyakiselected)
                    //checkUpdate()
                }
            }
        }

        textViewTaiyaki2010.setOnClickListener {
            if (taiyakiOpen) {
                taiyakiNowSelectedView = 2010
                if (taiyakiStatusCode != taiyakiNowSelectedView) {
                    taiyakiStatusCode = taiyakiNowSelectedView
                    updateAllTaiyakiViewNotSelected()
                    textViewTaiyaki2010.setBackgroundResource(R.drawable.frame_style_taiyakiselected)
                    //checkUpdate()
                }
            }
        }

        textViewTaiyaki3020.setOnClickListener {
            if (taiyakiOpen) {
                taiyakiNowSelectedView = 3020
                if (taiyakiStatusCode != taiyakiNowSelectedView) {
                    taiyakiStatusCode = taiyakiNowSelectedView
                    updateAllTaiyakiViewNotSelected()
                    textViewTaiyaki3020.setBackgroundResource(R.drawable.frame_style_taiyakiselected)
                    //checkUpdate()
                }
            }
        }

        textViewTaiyaki3030.setOnClickListener {
            if (taiyakiOpen) {
                taiyakiNowSelectedView = 3030
                if (taiyakiStatusCode != taiyakiNowSelectedView) {
                    taiyakiStatusCode = taiyakiNowSelectedView
                    updateAllTaiyakiViewNotSelected()
                    textViewTaiyaki3030.setBackgroundResource(R.drawable.frame_style_taiyakiselected)
                    //checkUpdate()
                }
            }
        }

    }

     fun updateAllIceViewNotSelected() {
         textViewIce1000.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce2010.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce3020.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce4030.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce5040.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce6050.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce7060.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce8070.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce9080.setBackgroundResource(R.drawable.frame_style_icenotselected)
         textViewIce9090.setBackgroundResource(R.drawable.frame_style_icenotselected)
    }

    fun updateAllTaiyakiViewNotSelected(){
        textViewTaiyaki1000.setBackgroundResource(R.drawable.frame_style_taiyakinotselected)
        textViewTaiyaki2010.setBackgroundResource(R.drawable.frame_style_taiyakinotselected)
        textViewTaiyaki3020.setBackgroundResource(R.drawable.frame_style_taiyakinotselected)
        textViewTaiyaki3030.setBackgroundResource(R.drawable.frame_style_taiyakinotselected)
    }
}