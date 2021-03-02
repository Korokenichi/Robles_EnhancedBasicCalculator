package mcm.edu.ph.enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnAdd, btnSub, btnDiv, btnMul, btnMod;


        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnMod = findViewById(R.id.btnMod);



        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){

        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double op1 = 0.0;
        Double op2 = 0.0;
        Double answer = 0.0;

        op1 = Double.parseDouble(txtOperand1.getText().toString());
        op2 = Double.parseDouble(txtOperand2.getText().toString());

        switch(v.getId()) {
            case R.id.btnAdd:
                txtAnswer.setText(Double.toString(doAdddition(op1,op2)));
                break;
            case R.id.btnDiv:
                txtAnswer.setText(Double.toString(doDivision(op1,op2)));
                break;
            case R.id.btnMul:
                txtAnswer.setText(Double.toString(doMultiplication(op1,op2)));
                break;
            case R.id.btnSub:
                txtAnswer.setText(Double.toString(doSubtraction(op1,op2)));
                break;
            case R.id.btnMod:
                txtAnswer.setText(Double.toString(doModulo(op1,op2)));
                break;
        }
    }
    public static double doAdddition(double x, double y){
        return x + y;
    }

    public static double doDivision(double operand1, double operand2){
        return operand1 / operand2;
    }
    public static double doMultiplication(double operand1, double operand2){
        return operand1 * operand2;
    }

    public static double doSubtraction(double operand1, double operand2){
        return operand1 - operand2;
    }

    public static double doModulo(double operand1, double operand2){
        return operand1 % operand2;
    }
}