package cunhajoao.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Trocar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Trocar = (Button)(findViewById(R.id.trocar));
    }

    public void Trocar(View v){

        Intent questoes = new Intent(this, questoes.class); //Instanciando a nova intent
        startActivity(questoes); //Executando ela(mudança de tela)
    }
}
