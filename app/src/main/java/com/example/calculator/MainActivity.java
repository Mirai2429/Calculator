package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
    Button cong, tru, nhan, chia, bang, btDot, btC;
    TextView mainscreen, secondscreen;
    String tinhtoan, pheptoan;
    Boolean checkDot = false, checkBang = false;
    Double so1;
    Double so2;
    Double kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manhinh();

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "0");
                }
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "1");
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "2");
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "3");
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "4");
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "5");
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "6");
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "7");
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "8");
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    tinhtoan = mainscreen.getText().toString();
                    mainscreen.setText(tinhtoan + "9");
                }
            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondscreen.setText("");
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "";
                checkDot = false;
                checkBang = false;
            }
        });

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    if(!checkDot)
                    {
                        tinhtoan = mainscreen.getText().toString();
                        mainscreen.setText(tinhtoan + ".");
                        checkDot = true;
                    }
                }
            }
        });

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainscreen.getText() == "")
                {
                    so1 = Double.valueOf(0);
                    secondscreen.setText("0 + ");
                } else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " + ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "+";
                checkDot = false;
                checkBang = false;
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainscreen.getText() == "")
                {
                    so1 = Double.valueOf(0);
                    secondscreen.setText("0 - ");
                } else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " - ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "-";
                checkDot = false;
                checkBang = false;
            }
        });

        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainscreen.getText() == "")
                {
                    so1 = Double.valueOf(0);
                    secondscreen.setText("0 * ");
                } else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " * ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "*";
                checkDot = false;
                checkBang = false;
            }
        });

        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mainscreen.getText() == "")
                {
                    so1 = Double.valueOf(0);
                    secondscreen.setText("0 / ");
                } else {
                    so1 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(mainscreen.getText().toString() + " / ");
                }
                mainscreen.setText("");
                tinhtoan = "";
                pheptoan = "/";
                checkDot = false;
                checkBang = false;
            }
        });

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!checkBang)
                {
                    checkDot = false;
                    tinhtoan = mainscreen.getText().toString();
                    so2 = Double.parseDouble(mainscreen.getText() + "");
                    secondscreen.setText(secondscreen.getText().toString() + mainscreen.getText().toString());
                    mainscreen.setText("");
                    if(pheptoan == "+")
                        kq = so1 + so2;
                    else if(pheptoan == "-")
                        kq = so1 - so2;
                    else if(pheptoan == "*")
                        kq = so1 * so2;
                    else if(pheptoan == "/")
                        kq = so1 / so2;
                    checkBang = true;
                    mainscreen.setText(kq + "");
                }
                pheptoan = "";
            }
        });
    }
    protected void manhinh()
    {
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        btDot = findViewById(R.id.btDot);
        btC = findViewById(R.id.btC);
        bang = findViewById(R.id.btKQ);
        cong = findViewById(R.id.btCong);
        tru = findViewById(R.id.btTru);
        nhan = findViewById(R.id.btNhan);
        chia = findViewById(R.id.btChia);
        mainscreen = findViewById(R.id.man_hinh);
        secondscreen = findViewById(R.id.man_hinh_phu);
    }
}