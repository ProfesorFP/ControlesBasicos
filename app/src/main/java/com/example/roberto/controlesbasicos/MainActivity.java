package com.example.roberto.controlesbasicos;

import android.content.DialogInterface;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSimple;
    ToggleButton btnToggle;
    ToggleButton btnCustomToggle;
    Switch btnSwitch;
    TextView lblMensaje;
    ImageButton btnImage;
    ImageButton btnImageSinBorde;
    CheckBox checkBox;
    RadioButton btnRadio1;
    RadioButton btnRadio2;

    @Override
    public void onClick(View v){
        /*if (v==btnSimple) {

        }*/
        switch (v.getId()) {
            case R.id.btnSimple :
                lblMensaje.setText("Botón Simple pulsado");
                break;
            case R.id.btnSwitch :
                if ( btnSwitch.isChecked())
                    lblMensaje.setText("Botón Switch pulsado: ON");
                else
                    lblMensaje.setText("Botón Switch pulsado: OFF");
                break;
            case R.id.btnToogle :
                if ( btnToggle.isChecked())
                    lblMensaje.setText("Botón Toggle pulsado: ON");
                else
                    lblMensaje.setText("Botón Toggle pulsado: OFF");
                break;
            case R.id.btnCustomToggle :
                if ( btnCustomToggle.isChecked())
                    lblMensaje.setText("Botón Toggle personalizado pulsado: ON");
                else
                    lblMensaje.setText("Botón Toggle personalizado pulsado: OFF");
                break;
            case R.id.imageButton:
                lblMensaje.setText("Botón Imagen pulsado");
                ImageButton im = (ImageButton)findViewById(R.id.imageButton);
                im.setImageResource(R.mipmap.ic_launcher);
                break;
            case R.id.checkBox:
                if ( checkBox.isChecked())
                    lblMensaje.setText("CheckBox pulsado: ON");
                else
                    lblMensaje.setText("CheckBox pulsado: OFF");
                break;
            case R.id.btnRadio1:
                if ( btnRadio1.isChecked())
                    lblMensaje.setText("RadioButton 1 pulsado");
                break;
            case R.id.btnRadio2:
                if ( btnRadio2.isChecked())
                    lblMensaje.setText("RadioButton 2 pulsado");
                break;

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblMensaje = (TextView)findViewById(R.id.lblMensaje);

        btnSimple = (Button)findViewById(R.id.btnSimple);
        btnSimple.setOnClickListener(this);
        btnToggle = (ToggleButton)findViewById(R.id.btnToogle);
        btnToggle.setOnClickListener(this);
        btnCustomToggle = (ToggleButton)findViewById(R.id.btnCustomToggle);
        btnCustomToggle.setOnClickListener(this);
        btnSwitch = (Switch) findViewById(R.id.btnSwitch);
        btnSwitch.setOnClickListener(this);
        btnImage = (ImageButton)findViewById(R.id.imageButton);
        btnImage.setOnClickListener(this);
        btnImageSinBorde = (ImageButton)findViewById(R.id.imageButton2);
        btnImageSinBorde.setOnClickListener(this);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(this);
        btnRadio1 = (RadioButton)findViewById(R.id.btnRadio1);
        btnRadio1.setOnClickListener(this);
        btnRadio2 = (RadioButton)findViewById(R.id.btnRadio2);
        btnRadio2.setOnClickListener(this);

        //obtenemos referencia al layout donde deseamos incluir nuestro control
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativeLayout);
        //creamos un control de tipo boton
        Button btnTag = new Button(this);
        //creamos los parámetros que tendrá el boton dentro del layout
        RelativeLayout.LayoutParams rl =new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
        //dado que lo vamos a incluir en un relative layout vamos a indicarle la posición
        rl.addRule(RelativeLayout.BELOW,R.id.imageButton2);

        btnTag.setLayoutParams(rl);
        btnTag.setText("Botón Dinámico" );
        //añadimos el botón al layout
        layout.addView(btnTag);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
