import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonSum(View view) {
        EditText num1 = (EditText) findViewById(R.id.editText1);
        EditText num2 = (EditText) findViewById(R.id.editText2);
        TextView resText = (TextView) findViewById(R.id.TextView);

        int number1 = Integer.parseInt(num1.getText().toString());
        int number2 = Integer.parseInt(num2.getText().toString());
        int sum = number1 + number2;

        resText.setText(Integer.toString(sum));
    }
    public void onMyButtonSub(View view){
        EditText nam1 = (EditText) findViewById(R.id.editText1);
        EditText nam2 = (EditText) findViewById(R.id.editText2);
        TextView Text = (TextView) findViewById(R.id.TextView);

        int ber1 = Integer.parseInt(nam1.getText().toString());
        int ber2 = Integer.parseInt(nam2.getText().toString());
        int sub = ber1 - ber2;
        Text.setText(Integer.toString(sub));
    }
    public void onMyButtonDiv (View view){
        EditText num = (EditText) findViewById(R.id.editText1);
        EditText Num = (EditText) findViewById(R.id.editText2);
        TextView res = (TextView) findViewById(R.id.TextView);

        int n1 = Integer.parseInt(num.getText().toString());
        int n2 = Integer.parseInt(Num.getText().toString());
        int div = n1 / n2;
        res.setText(Integer.toString(div));
    }

    public void onMyButtonInc (View view){
        EditText m1 = (EditText) findViewById(R.id.editText1);
        EditText m2 = (EditText) findViewById(R.id.editText2);
        TextView result = (TextView) findViewById(R.id.TextView);

        int nu = Integer.parseInt(m1.getText().toString());
        int nu2 = Integer.parseInt(m2.getText().toString());
        int inc = nu * nu2;
        result.setText(Integer.toString(inc));
    }

    }
