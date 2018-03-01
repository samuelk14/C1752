package proyecto2.app1.com.example.pc.c175;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton1, boton2, boton3, boton4, boton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);
        boton4 = (Button) findViewById(R.id.boton4);
        boton5 = (Button) findViewById(R.id.boton5);
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        try {
            switch (view.getId()) {
                case R.id.boton1:
                    Intent i1 = new Intent(this, Main3Activity.class);
                    BlankFragment fragment1 = new BlankFragment();
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction FragmentTransaction = fragmentManager.beginTransaction();
                    FragmentTransaction.add(R.id.frameLayout, fragment1, null);
                    startActivity(i1);
                    return;

                case R.id.boton2:
                    Integer verificador = 2;
                    Intent in = new Intent(this, MainNavActivity.class);
                    in.putExtra("clave", verificador);
                    startActivity(in);
                    return;

                case R.id.boton3:
                    Integer verificator = 3;
                    Intent inn = new Intent(this, MainNavActivity.class);
                    inn.putExtra("clave", verificator);
                    startActivity(inn);
                    return;


            }
        } catch (Exception e) {
            System.out.print("Verifique valores ingresados");
        }

    }


}
