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


    /**
     * Called when the button divide is clicked
     */
    void btnDivideClicked(){

        double divident = 0, divisor = 0, result;
        boolean error = false;

        try {
            divident = Double.parseDouble(txtDivident.getText().toString());
            divisor = Double.parseDouble(txtDivisor.getText().toString());
        }catch (Exception e){
            error = true;
        }

        if(!error){
            result = divident / divisor;
            lblOutput.setText("Output: \t" + result);
        }else {
            lblOutput.setText("Bitte geben Sie gueltige Werte ein.");
        }


        System.out.println("Neue Branch Test");

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
