package com.example.avisos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static final String tag = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(tag, "onCreate");
        //    Toast.makeText(this, "la aplicacion se ha creado". Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="La aplicacion se ha creado";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "onStart");
        //    Toast.makeText(this, "la aplicacion se ha iniciado". Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="La aplicacion se ha iniciado";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 700);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
 /*       Log.i(tag, "onResume");
        //    Toast.makeText(this, "la aplicacion se ha reactivado". Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="La aplicacion se ha reactivado";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();*/
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onresume,  (ViewGroup) findViewById(R.id.toast_on_resume));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.text_Toast);
        texto_Toast.setText("La aplicacion se ha recuperado");

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL, 0,0 );
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "onResume");
        //    Toast.makeText(this, "la aplicacion se ha pausado". Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="La aplicacion se ha pausado";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "onResume");
    //    Toast.makeText(this, "la aplicacion se ha detenido". Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text ="La aplicacion se ha detenido";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,text,duration);
        toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();
    }
}
