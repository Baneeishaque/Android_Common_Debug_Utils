package ndk.utils_android_debug;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import tech.linjiang.pandora.Pandora;

public class Debug_Activity extends AppCompatActivity {

    Button button_pandora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        button_pandora = findViewById(R.id.button_pandora);
        button_pandora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pandora.get().open();
            }
        });
    }
}
