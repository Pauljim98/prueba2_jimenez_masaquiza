package fisei;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
public class logininicio extends AppCompatActivity {

    private EditText editTextEmail, editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();


                if (!email.isEmpty() && !password.isEmpty()) {

                    openMainActivity();Activity();
                } else {
                    Toast.makeText(logininicio.this, "Ingrese correo y contraseña", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void openMainActivity() {

        Intent intent = new Intent(logininicio.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
