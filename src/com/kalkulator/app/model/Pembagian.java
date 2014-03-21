package com.kalkulator.app.model;

import android.content.Context;

import com.kalkulator.app.listener.onDevideSuccessListener;
import com.kalkulator.app.listener.onMultiplySuccessListener;
import com.kalkulator.app.listener.onSubstractSuccessListener;
import com.kalkulator.app.listener.onSumSuccessListener;

public class Pembagian {
	double a = 0, b = 0;
	onDevideSuccessListener onsum;

	public Pembagian(double a, double b, Context mainActivity) {
		super();
		this.a = a;
		this.b = b;
		onsum = (onDevideSuccessListener) mainActivity;
	}

	public void bagi() {
		onsum.onDevideSuccess(a / b);
	}

}
