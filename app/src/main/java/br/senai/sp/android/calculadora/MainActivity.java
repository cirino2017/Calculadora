package br.senai.sp.android.calculadora;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String txtVisor;
    private TextView visor;
    private String operacao;
    private double valorA;
    private double valorB;
    private double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visor = (TextView) findViewById(R.id.txtVisor);
        txtVisor = visor.getText().toString();

    }

    /*public void potenciaClick(View view) {
        resultado = Double.parseDouble(visor.getText().toString());

        txtVisor = "";
        visor.setText(txtVisor);


        if (txtVisor.length() > 0) {
            String raiz = String.valueOf(Math.pow(resultado, Double.parseDouble(visor.getText().toString())));
        } else {
            Toast.makeText(MainActivity.this, "Informe o segundo número", Toast.LENGTH_SHORT).show();
        }

    }*/

    public void raizClick(View view) {

        valorA = Double.parseDouble(txtVisor);
        resultado = Math.sqrt(valorA);
        txtVisor = String.valueOf(resultado);
        visor.setText(txtVisor);
    }


    public void igualClick(View view) {
        valorB = Double.parseDouble(visor.getText().toString());

        switch (operacao) {

            case "+":
                resultado = valorA + valorB;
                break;
            case "-":
                resultado = valorA - valorB;
                break;

            case "*":
                resultado = valorA * valorB;
                break;

            case "/":
                resultado = valorA / valorB;
                break;
        }

        txtVisor = String.valueOf(resultado);
        visor.setText(txtVisor);

    }

    public void operacaoClick(View view) {
        valorA = Double.parseDouble(visor.getText().toString());
        operacao = ((Button) view).getText().toString();
        txtVisor = "";
        visor.setText(txtVisor);
    }

    /*Toast.makeText(MainActivity.this, "Informe o segundo número" + botao.get, Toast.LENGTH_SHORT).show();*/

    public void limparTudoClick(View view) {
        valorA = 0;
        valorB = 0;
        resultado = 0;
        operacao = "";
        txtVisor = "";
        visor.setText(txtVisor);
    }

    /**
     * Este método remove um caracter do visor
     *
     * @param view
     */
    public void limparUmClick(View view) {
        txtVisor = visor.getText().toString();

        if (txtVisor.length() > 0) {
            txtVisor = txtVisor.substring(0, txtVisor.length() - 1);// qual posicao; quantos caracteres ele vai pegar
            visor.setText(txtVisor);
        }
    }

    public void numeroClick(View view) {
        Button botao = (Button) view;

        if (!(botao.getText().equals("0") && txtVisor.length() == 0)) {
            txtVisor = txtVisor + botao.getText();
        }

        visor.setText(txtVisor);
    }
}

/* final Button btnRaiz = (Button) findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.length() > 0) {
                    visor.setText(String.valueOf(Math.sqrt(Double.parseDouble(txtVisor))));
                }
            }
        });*/

         /* final Button btnSomar = (Button) findViewById(R.id.btnSomar);
        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                acmSoma += Double.parseDouble(visor.getText().toString());
                txtVisor = "";
                visor.setText(txtVisor);
            }
        });*/


       /* final Button btnIgual = (Button) findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });*/

      /* final Button btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = "";
                visor.setText(txtVisor);
            }
        });*/

/*  final Button btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtVisor.length() > 0) {
                    txtVisor = txtVisor + "0";
                    visor.setText(txtVisor);
                }
            }
        });

        final Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "1";
                visor.setText(txtVisor);
            }
        });

        final Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "2";
                visor.setText(txtVisor);
            }
        });

        final Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "3";
                visor.setText(txtVisor);
            }
        });

        final Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "4";
                visor.setText(txtVisor);
            }
        });

        final Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "5";
                visor.setText(txtVisor);
            }
        });

        final Button btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "6";
                visor.setText(txtVisor);
            }
        });

        final Button btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "7";
                visor.setText(txtVisor);
            }
        });

        final Button btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "8";
                visor.setText(txtVisor);
            }
        });

        final Button btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtVisor = txtVisor + "9";
                visor.setText(txtVisor);
            }
        });*/