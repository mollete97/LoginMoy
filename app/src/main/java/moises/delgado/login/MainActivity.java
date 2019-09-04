package moises.delgado.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNombre, editTextPass;
    Button btnIngreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //match con la vista
        setContentView(R.layout.activity_main);
        //match de los widgets
        editTextNombre =  findViewById(R.id.editText);
        editTextPass =  findViewById(R.id.editPass);
        btnIngreso = findViewById(R.id.btnEntrar);
        btnIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String nombreUsuario = editTextNombre.getText().toString();
                 String password = editTextPass.getText().toString();
                 if (nombreUsuario.isEmpty() || password.isEmpty()){
                     //nombre de usuario vacio

                 }else{
                     if (nombreUsuario.equals("mollo")&& password.equals("4321")){
                         //imprimir bienvenido
                         mensajito("Welcome!!!");
                     }else{
                         //imprimir datos erroneos
                         mensajito("Los datos son erròneos");
                     }
                 }

            }
        });


    }
    public void mensajito(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
    }
}
