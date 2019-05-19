package gaspar.ifsc.conversormoedas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //botões
        this.mViewHolder.buttonIniciar = findViewById(R.id.button);

        this.mViewHolder.buttonIniciar.setOnClickListener(this);

        this.mViewHolder.buttonMoedas = findViewById(R.id.moedas);

        this.mViewHolder.buttonMoedas.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button){

            //Lógica do button
            Intent intent = new Intent(this, Main3Activity.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.moedas){

            //Lógica do button
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }

    }

    private static class ViewHolder {

        Button buttonIniciar;
        Button buttonMoedas;

    }


}
