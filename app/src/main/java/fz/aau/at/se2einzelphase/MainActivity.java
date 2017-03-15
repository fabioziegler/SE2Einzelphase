package fz.aau.at.se2einzelphase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btnDivide;
    private TextView lblOutput;
    private EditText txtDivisor;
    private EditText txtDivident;



    void btnDivideClicked(){






    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDivide = (Button) findViewById(R.id.btnDivide);
        lblOutput = (TextView) findViewById(R.id.lblOutput);
        txtDivident = (EditText) findViewById(R.id.txtDivident);
        txtDivisor = (EditText) findViewById(R.id.txtDivisor);

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnDivideClicked();
            }
        });
    }


}
