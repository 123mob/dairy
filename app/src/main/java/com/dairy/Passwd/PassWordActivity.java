package com.dairy.Passwd;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dairy.R;

public class PassWordActivity extends Activity {

    MyApplication myApplication;
    private EditText editText;
    private Button sure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_word);
        myApplication = (MyApplication) getApplication();
        editText = (EditText) findViewById(R.id.passworld);
        sure = (Button) findViewById(R.id.ture);

        sure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String passwd = editText.getText().toString();
                if (passwd!=null && passwd.equals("1")){
                 //   System.out.println(passwd+":::"+myApplication.password);

                    Toast.makeText(PassWordActivity.this,"密码正确", Toast.LENGTH_LONG).show();
                    myApplication.isLocked = false;
                    PassWordActivity.this.finish();
                }else {
                    Toast.makeText(PassWordActivity.this,"密码错误", Toast.LENGTH_LONG).show();
                    editText.setText("");
                }
            }
        });
    }
}
