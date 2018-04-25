package tw.edu.ntut.csie.app01_103a50035;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private EditText mEdtScore;
    private Button mBtnOK;
    private TextView mTxtGrade;
    private ScoreToGrade sToG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtScore = (EditText) findViewById(R.id.editTextScore);
        mBtnOK = (Button) findViewById(R.id.buttonOk);
        mTxtGrade = (TextView) findViewById(R.id.textViewGrade);
        sToG = new ScoreToGrade();

        mBtnOK.setOnClickListener(btnOKOnClick);
    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int score = Integer.parseInt(mEdtScore.getText().toString());

            String strGrade = getString(R.string.grade);
            String grade = sToG.letterGrade(score);
            if (grade == "X") strGrade += "輸入分數應介於[0..100]";
            else strGrade += grade;

            mTxtGrade.setText(strGrade);
        }
    };
}
