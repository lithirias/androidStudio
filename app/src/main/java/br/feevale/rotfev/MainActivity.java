package br.feevale.rotfev;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
     EditText inNome;
     EditText inEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        inNome = findViewById(R.id.inNome);
        inEmail = findViewById(R.id.inEmail);
    }

    public void processarClickAdd(View n){
        Pessoa p = new Pessoa();
        p.setNome(inNome.getText().toString());
        p.setEmail(inEmail.getText().toString());
        Toast.makeText(getBaseContext(), p.toString(), Toast.LENGTH_LONG).show();
    }
}