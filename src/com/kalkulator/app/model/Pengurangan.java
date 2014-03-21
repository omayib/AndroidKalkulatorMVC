package com.kalkulator.app.model;

import android.content.Context;

import com.kalkulator.app.listener.onSubstractSuccessListener;
import com.kalkulator.app.listener.onSumSuccessListener;

public class Pengurangan {
	double a=0, b=0;
	onSubstractSuccessListener onsum;

	public Pengurangan(double a, double b, Context mainActivity) {
		super();
		this.a = a;
		this.b = b;
		onsum = (onSubstractSuccessListener) mainActivity;
	}

	public void kurangkan() {
		onsum.onSubstractSuccess(a - b);
	}

}
