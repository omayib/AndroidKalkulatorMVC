package com.kalkulator.app.model;

import android.content.Context;

import com.kalkulator.app.listener.onMultiplySuccessListener;
import com.kalkulator.app.listener.onSubstractSuccessListener;
import com.kalkulator.app.listener.onSumSuccessListener;

public class Perkalian {
	double a = 0, b = 0;
	onMultiplySuccessListener onsum;

	public Perkalian(double a, double b, Context mainActivity) {
		super();
		this.a = a;
		this.b = b;
		onsum = (onMultiplySuccessListener) mainActivity;
	}

	public void kalikan() {
		onsum.onMultiplySuccess(a * b);
	}

}
