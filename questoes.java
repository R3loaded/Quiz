package cunhajoao.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class questoes extends AppCompatActivity {

    //Declarando elementos
    RadioButton sim1;
    RadioButton nao1;
    TextView result;
    //----
    RadioButton sim2;
    RadioButton nao2;
    TextView result2;
    //----
    RadioButton sim3;
    RadioButton nao3;
    TextView result3;
    //----
    //----
    RadioButton sim4;
    RadioButton nao4;
    TextView result4;
    //----
    Integer resultado1 = 0;
    Integer resultado2 = 0;
    Integer resultado3 = 0;
    Integer resultado4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes);

        //Instanciando elementos

        /*QUESTAO 1*/
            sim1 = (RadioButton)(findViewById(R.id.sim1));
            nao1 = (RadioButton)(findViewById(R.id.nao1));
            result = (TextView)(findViewById(R.id.result1));
        /*/QUESTAO 1*/

        /*QUESTAO 2*/
            sim2 = (RadioButton)(findViewById(R.id.sim2));
            nao2 = (RadioButton)(findViewById(R.id.nao2));
            result2 = (TextView)(findViewById(R.id.result2));
        /*/QUESTAO 2*/

         /*QUESTAO 3*/
            sim3 = (RadioButton)(findViewById(R.id.sim3));
            nao3 = (RadioButton)(findViewById(R.id.nao3));
            result3 = (TextView)(findViewById(R.id.result3));
        /*/QUESTAO 3*/

        /*QUESTAO 4*/
            sim4 = (RadioButton)(findViewById(R.id.sim4));
            nao4 = (RadioButton)(findViewById(R.id.nao4));
            result4 = (TextView)(findViewById(R.id.result4));
        /*/QUESTAO 4*/

    }

    public void Verificar(View v) {//Funcao de clique, por isso o parametro view v
        /*-------------------------------    QUESTOES 1    --------------------------------------*/
            if(sim1.isChecked()){//Caso tenha sido preenchido
                nao1.setEnabled(false);//Deixar o outro botao desabilitado
                resultado1 = 1;
            }
            if(nao1.isChecked()){
                sim1.setEnabled(false);
                resultado1 = 2;
            }
            else{
                resultado1 = 3;
            }
            if(resultado1 == 1){//Verificação de valor da variavel
                result.setText("Acertou!");
            }
            if(resultado1 == 2){
                result.setText("Errou!");
            }
            if(resultado1 == 3){
                result.setText("Marque uma das opções!");
            }
        /*-------------------------------    /QUESTOES 1    --------------------------------------*/

        /*-------------------------------    QUESTOES 2    --------------------------------------*/
            if(sim2.isChecked()){
                nao2.setEnabled(false);
                resultado2 = 1;
            }
            if(nao2.isChecked()){
                sim2.setEnabled(false);
                resultado2 = 2;
            }
            else{
                resultado2 = 3;
            }
            if(resultado1 == 1){
                result2.setText("Acertou!");
            }
            if(resultado1 == 2){
                result2.setText("Errou!");
            }
            if(resultado1 == 3){
                result2.setText("Marque uma das opções!");
            }
        /*-------------------------------    /QUESTOES 2    --------------------------------------*/
        /*-------------------------------    QUESTOES 3    --------------------------------------*/
        if(sim3.isChecked()){
            nao3.setEnabled(false);
            resultado2 = 2;
        }
        if(nao3.isChecked()){
            sim3.setEnabled(false);
            resultado2 = 1;
        }
        else{
            resultado3 = 3;
        }
        if(resultado3 == 1){
            result3.setText("Acertou!");
        }
        if(resultado3 == 2){
            result3.setText("Errou!");
        }
        if(resultado3 == 3){
            result3.setText("Marque uma das opções!");
        }
        /*-------------------------------    /QUESTOES 3    --------------------------------------*/
        /*-------------------------------    QUESTOES 4    --------------------------------------*/
        if(sim4.isChecked()){
            nao4.setEnabled(false);
            resultado4 = 2;
        }
        if(nao4.isChecked()){
            sim4.setEnabled(false);
            resultado4 = 1;
        }
        else{
            resultado4 = 3;
        }
        if(resultado4 == 1){
            result4.setText("Acertou!");
        }
        if(resultado4 == 2){
            result4.setText("Errou!");
        }
        if(resultado4 == 3){
            result4.setText("Marque uma das opções!");
        }
        /*-------------------------------    /QUESTOES 4    --------------------------------------*/

    }
}
