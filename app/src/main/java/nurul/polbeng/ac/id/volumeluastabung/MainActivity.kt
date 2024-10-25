package nurul.polbeng.ac.id.volumeluastabung

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var lengthInput: EditText
    private lateinit var widthInput: EditText
    private lateinit var heightInput: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lengthInput = findViewById(R.id.lengthInput)
        widthInput = findViewById(R.id.widthInput)
        heightInput = findViewById(R.id.heightInput)
        resultTextView = findViewById(R.id.resultTextView)
        val calculateButton: Button = findViewById(R.id.calculateButton)

        calculateButton.setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {
        val length = lengthInput.text.toString().toDoubleOrNull()
        val width = widthInput.text.toString().toDoubleOrNull()
        val height = heightInput.text.toString().toDoubleOrNull()

        if (length != null && width != null && height != null) {
            val volume = length * width * height
            val area = 2 * (length * width + width * height + length * height)
            resultTextView.text = "Volume: $volume\nLuas: $area"
        } else {
            resultTextView.text = "Silakan masukkan angka yang valid."
        }
    }
}