package com.kalkulator.app.model;

import android.content.Context;

import com.kalkulator.app.listener.onSumSuccessListener;

public class Penjumlahan {
	double a=0, b=0;
	onSumSuccessListener onsum;

	public Penjumlahan(double a, double b, Context mainActivity) {
		super();
		this.a = a;
		this.b = b;
		onsum = (onSumSuccessListener) mainActivity;
	}

	public void jumlah() {
		onsum.onSumSuccess(a + b);
	}

}
