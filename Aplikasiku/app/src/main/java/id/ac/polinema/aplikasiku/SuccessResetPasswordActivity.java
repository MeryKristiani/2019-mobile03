package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SuccessResetPasswordActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_success_reset_password);

		Thread myThread = new Thread() {
			@Override
			public void run() {
				try {
					sleep(2000);
					Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
					startActivity(intent);
					finish();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		myThread.start();
	}
}
