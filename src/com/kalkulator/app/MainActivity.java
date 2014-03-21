package com.kalkulator.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.kalkulator.app.listener.onDevideSuccessListener;
import com.kalkulator.app.listener.onMultiplySuccessListener;
import com.kalkulator.app.listener.onSubstractSuccessListener;
import com.kalkulator.app.listener.onSumSuccessListener;
import com.kalkulator.app.model.Pembagian;
import com.kalkulator.app.model.Pengurangan;
import com.kalkulator.app.model.Penjumlahan;
import com.kalkulator.app.model.Perkalian;

public class MainActivity extends Activity implements OnClickListener,
		onSumSuccessListener, onSubstractSuccessListener,
		onMultiplySuccessListener, onDevideSuccessListener {

	Button bPlus, bMin, bMultiple, bDivide;
	EditText in1, in2, out;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		in1 = (EditText) findViewById(R.id.idSatu);
		in2 = (EditText) findViewById(R.id.idDua);
		out = (EditText) findViewById(R.id.idHasil);
		bPlus = (Button) findViewById(R.id.idBtnJumlah);
		bMin = (Button) findViewById(R.id.idBtnKurang);
		bMultiple = (Button) findViewById(R.id.idBtnKali);
		bDivide = (Button) findViewById(R.id.idBtnBagi);
		bPlus.setOnClickListener(this);
		bMin.setOnClickListener(this);
		bMultiple.setOnClickListener(this);
		bDivide.setOnClickListener(this);

		in1.setText("0");
		in2.setText("0");

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		double angka1 = Double.parseDouble(in1.getText().toString());
		double angka2 = Double.parseDouble(in2.getText().toString());
		switch (v.getId()) {
		case R.id.idBtnJumlah:
			Penjumlahan penjumlahan = new Penjumlahan(angka1, angka2, this);
			penjumlahan.jumlah();

			break;
		case R.id.idBtnKurang:
			Pengurangan pengurangan = new Pengurangan(angka1, angka2, this);
			pengurangan.kurangkan();

			break;
		case R.id.idBtnKali:
			Perkalian perkalian = new Perkalian(angka1, angka2, this);
			perkalian.kalikan();

			break;
		case R.id.idBtnBagi:
			Pembagian pembagian = new Pembagian(angka1, angka2, this);
			pembagian.bagi();
			break;
		}

	}

	@Override
	public void onSumSuccess(double result) {
		// TODO Auto-generated method stub
		Log.d("hasil jumlah", String.valueOf(result));
		out.setText(String.valueOf(result));
	}

	@Override
	public void onSubstractSuccess(double result) {
		// TODO Auto-generated method stub
		Log.d("hasil pengurangan", String.valueOf(result));
		out.setText(String.valueOf(result));

	}

	@Override
	public void onDevideSuccess(double result) {
		// TODO Auto-generated method stub
		Log.d("hasil pengurangan", String.valueOf(result));
		out.setText(String.valueOf(result));

	}

	@Override
	public void onMultiplySuccess(double result) {
		// TODO Auto-generated method stub
		Log.d("hasil pengurangan", String.valueOf(result));
		out.setText(String.valueOf(result));

	}

}
