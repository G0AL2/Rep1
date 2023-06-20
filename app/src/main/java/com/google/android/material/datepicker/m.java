package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmoothCalendarLayoutManager.java */
/* loaded from: classes2.dex */
public class m extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager.java */
    /* loaded from: classes2.dex */
    class a extends androidx.recyclerview.widget.g {
        a(m mVar, Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Q1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.p(i10);
        R1(aVar);
    }
}
