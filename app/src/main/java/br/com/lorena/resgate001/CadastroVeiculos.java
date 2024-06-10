package br.com.lorena.resgate001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroVeiculos extends AppCompatActivity {

    private EditText editTextVehicleType;
    private EditText editTextVehicleModel;
    private EditText editTextVehicleYear;
    private EditText editTextVehiclePlate;
    private EditText editTextVehicleBrand;
    private EditText editTextVehicleCapacity;
    private Button buttonRegisterVehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_veiculos);

        editTextVehicleType = findViewById(R.id.editTextVehicleType);
        editTextVehicleModel = findViewById(R.id.editTextVehicleModel);
        editTextVehicleYear = findViewById(R.id.editTextVehicleYear);
        editTextVehiclePlate = findViewById(R.id.editTextVehiclePlate);
        editTextVehicleBrand = findViewById(R.id.editTextVehicleBrand);
        editTextVehicleCapacity = findViewById(R.id.editTextVehicleCapacity);
        buttonRegisterVehicle = findViewById(R.id.buttonRegisterVehicle);

        buttonRegisterVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vehicleType = editTextVehicleType.getText().toString().trim();
                String vehicleModel = editTextVehicleModel.getText().toString().trim();
                String vehicleYear = editTextVehicleYear.getText().toString().trim();
                String vehiclePlate = editTextVehiclePlate.getText().toString().trim();
                String vehicleBrand = editTextVehicleBrand.getText().toString().trim();
                String vehicleCapacity = editTextVehicleCapacity.getText().toString().trim();

                if (vehicleType.isEmpty() || vehicleModel.isEmpty() || vehicleYear.isEmpty() ||
                        vehiclePlate.isEmpty() || vehicleBrand.isEmpty() || vehicleCapacity.isEmpty()) {
                    Toast.makeText(CadastroVeiculos.this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Aqui você pode adicionar a lógica para salvar o veículo no backend
                    Toast.makeText(CadastroVeiculos.this, "Veículo registrado com sucesso", Toast.LENGTH_SHORT).show();
                    finish(); // Volta para a tela anterior
                }
            }
        });
    }
}