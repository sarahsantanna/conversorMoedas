package gaspar.ifsc.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        this.mViewHolder.editValue = findViewById(R.id.edit_valor);
        this.mViewHolder.textDolar = findViewById(R.id.text_dolar);
        this.mViewHolder.textEuro = findViewById(R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.buttonCalculate);
        this.mViewHolder.buttonCalculate.setOnClickListener(this);

        //p/ limpar os valores
        this.clearValues();
    }

    private void clearValues() {

        this.mViewHolder.textDolar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonCalculate){
            //Lógica do button
            String value = this.mViewHolder.editValue.getText().toString();
            if ("".equals(value)){
                //Mostra mensagem ao usuário
                Toast.makeText(this,  this.getString(R.string.informe_valor), Toast.LENGTH_LONG).show();
            } else {

                Double real = Double.valueOf(value);

                this.mViewHolder.textDolar.setText(String.format("%.2f", (real / 4)));
                this.mViewHolder.textEuro.setText(String.format("%.2f", (real / 5)));

            }
        }
    }

    private static class ViewHolder{

        EditText editValue;
        TextView textDolar;
        TextView textEuro;
        Button buttonCalculate;

    }
}
