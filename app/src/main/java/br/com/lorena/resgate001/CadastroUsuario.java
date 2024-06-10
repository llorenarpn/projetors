package br.com.lorena.resgate001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroUsuario extends AppCompatActivity {
    private EditText editTextCPF;
    private EditText editTextName;
    private EditText editTextPhone;
    private EditText editTextPassword;
    private EditText editTextConfirmPassword;
    private Button buttonRegisterUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_usuario);

        editTextCPF = findViewById(R.id.editTextCPF);
        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);
        buttonRegisterUser = findViewById(R.id.buttonRegisterUser);
        buttonRegisterUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cpf = editTextCPF.getText().toString().trim();
                String name = editTextName.getText().toString().trim();
                String phone = editTextPhone.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String confirmPassword = editTextConfirmPassword.getText().toString().trim();

                if (cpf.isEmpty() || name.isEmpty() || phone.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    Toast.makeText(CadastroUsuario.this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    Toast.makeText(CadastroUsuario.this, "As senhas não coincidem", Toast.LENGTH_SHORT).show();
                } else {
                    // Aqui você pode adicionar a lógica para salvar o usuário no backend
                    Toast.makeText(CadastroUsuario.this, "Cadastro bem-sucedido", Toast.LENGTH_SHORT).show();
                    finish(); // Volta para a tela de login
                }
            }
        });
    }
}