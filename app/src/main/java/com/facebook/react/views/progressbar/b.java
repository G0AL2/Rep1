package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.j;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ProgressBarShadowNode.java */
/* loaded from: classes.dex */
public class b extends j implements m {

    /* renamed from: z  reason: collision with root package name */
    private String f16156z = "Normal";
    private final SparseIntArray A = new SparseIntArray();
    private final SparseIntArray B = new SparseIntArray();
    private final Set<Integer> C = new HashSet();

    public b() {
        r1();
    }

    private void r1() {
        T0(this);
    }

    @Override // com.facebook.yoga.m
    public long c(p pVar, float f10, n nVar, float f11, n nVar2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(q1());
        if (!this.C.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(U(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.A.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.B.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.C.add(Integer.valueOf(styleFromString));
        }
        return o.b(this.B.get(styleFromString), this.A.get(styleFromString));
    }

    public String q1() {
        return this.f16156z;
    }

    @w6.a(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f16156z = str;
    }
}
