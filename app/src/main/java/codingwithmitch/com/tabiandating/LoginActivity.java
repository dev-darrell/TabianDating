package codingwithmitch.com.tabiandating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "LoginActivity";
    private Button mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Log.d(TAG, "onCreate: Started method");
        mLogin = findViewById(R.id.btn_login);

        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (mLogin.getId() == R.id.btn_login) {
            Log.d(TAG, "onClick: Logging in the user.");

            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
//            finish();
        }
    }
}