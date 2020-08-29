package cr.ac.ucr.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve,
            btnCero, btnC, btnDelete, btnDivide, btnMultiply, btnPlus, btnMinus, btnDot, btnEquals;
    TextView etOperation, etConcatenar, etTotal;
    double number1, number2, result;
    String operator;

    View view;
    boolean error = false, lack = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Instanciar las variables de cada boton

        btnUno = (Button)findViewById(R.id.button1);
        btnDos = (Button)findViewById(R.id.button2);
        btnTres = (Button)findViewById(R.id.button3);
        btnCuatro = (Button)findViewById(R.id.button4);
        btnCinco = (Button)findViewById(R.id.button5);
        btnSeis = (Button)findViewById(R.id.button6);
        btnSiete = (Button)findViewById(R.id.button7);
        btnOcho = (Button)findViewById(R.id.button8);
        btnNueve = (Button)findViewById(R.id.button9);
        btnCero = (Button)findViewById(R.id.button0);
        btnC = (Button)findViewById(R.id.button_c);
        btnPlus = (Button)findViewById(R.id.button_plus);
        btnMinus = (Button)findViewById(R.id.button_minus);
        btnMultiply = (Button)findViewById(R.id.button_multiply);
        btnDivide = (Button)findViewById(R.id.button_divide);
        btnDot = (Button)findViewById(R.id.button_decimal);
        btnEquals = (Button)findViewById(R.id.button_equals);
        etOperation = (TextView)findViewById(R.id.et_operation);
        etTotal = (TextView) findViewById(R.id.et_total);

    }//fin del OnCreate


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.button0:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "0");
                break;

            case R.id.button1:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "1");
                break;

            case R.id.button2:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "2");
                break;

            case R.id.button3:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "3");
                break;

            case R.id.button4:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "4");
                break;

            case R.id.button5:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "5");
                break;

            case R.id.button6:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "6");
                break;

            case R.id.button7:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "7");
                break;

            case R.id.button8:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "8");
                break;

            case R.id.button9:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + "9");
                break;

            case R.id.button_decimal:
                etConcatenar = (TextView)findViewById(R.id.et_operation);
                lack = false;
                etOperation.setText(etConcatenar.getText().toString() + ".");
                break;

            case R.id.button_divide:
                operator = "/";
                if (lack == true){
                    etOperation.setText("Uy Kieto!!!");
                } else {
                    etConcatenar = (TextView) findViewById(R.id.et_operation);
                    number1 = Double.parseDouble(etConcatenar.getText().toString());
                    etOperation.setText("");
                }
                break;

            case R.id.button_minus:
                operator = "-";
                if (lack == true){
                    etOperation.setText("Uy Kieto!!!");
                } else {
                    etConcatenar = (TextView) findViewById(R.id.et_operation);
                    number1 = Double.parseDouble(etConcatenar.getText().toString());
                    etOperation.setText("");
                }
                break;

            case R.id.button_multiply:
                operator = "*";
                if (lack == true){
                    etOperation.setText("Uy Kieto!!!");
                } else {
                    etConcatenar = (TextView) findViewById(R.id.et_operation);
                    number1 = Double.parseDouble(etConcatenar.getText().toString());
                    etOperation.setText("");
                }
                break;

            case R.id.button_plus:
                operator = "+";
                if (lack == true){
                    etOperation.setText("Uy Kieto!!!");
                } else {
                    etConcatenar = (TextView) findViewById(R.id.et_operation);
                    number1 = Double.parseDouble(etConcatenar.getText().toString());
                    etOperation.setText("");
                }
                break;

            case R.id.button_equals:
                if (lack == true){
                    etOperation.setText("Uy Kieto!!!");
                } else {
                    etConcatenar = (TextView)findViewById(R.id.et_operation);
                    number2 = Double.parseDouble(etConcatenar.getText().toString());
                    if(operator.equals("+")){
                        etOperation.setText("");
                        result = number1 + number2;
                    }
                    if(operator.equals("-")){
                        etOperation.setText("");
                        result = number1 - number2;
                    }
                    if(operator.equals("*")){
                        etOperation.setText("");
                        result = number1 * number2;
                    }
                    if(operator.equals("/")){
                        etOperation.setText("");
                        if(number2 != 0){
                            result = number1 / number2;
                        }else {
                            error = true;
                        }
                    }
                    if (error == true){
                        etOperation.setText("Estas Bien Pendejo...");
                    } else {
                        etOperation.setText(String.valueOf(result));
                    }
                }


                break;

            case R.id.button_c:
                number1 = 0;
                number2 = 0;
                error = false;
                lack = true;
                etOperation.setText("");
                break;
        }
    }


}//fin de la clase MainActivity