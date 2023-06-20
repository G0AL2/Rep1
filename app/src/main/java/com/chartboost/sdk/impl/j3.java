package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Libraries.CBUtility;

/* loaded from: classes.dex */
public abstract class j3 extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public Integer f14096a;

    /* renamed from: b  reason: collision with root package name */
    public y0 f14097b;

    /* renamed from: c  reason: collision with root package name */
    public w0 f14098c;

    /* renamed from: d  reason: collision with root package name */
    public RelativeLayout f14099d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14100e;

    /* renamed from: f  reason: collision with root package name */
    private int f14101f;

    /* renamed from: g  reason: collision with root package name */
    private int f14102g;

    /* renamed from: h  reason: collision with root package name */
    private int f14103h;

    /* renamed from: i  reason: collision with root package name */
    private int f14104i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f14105j;

    /* renamed from: k  reason: collision with root package name */
    private final k3 f14106k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j3.this.requestLayout();
        }
    }

    public j3(Context context, k3 k3Var) {
        super(context);
        this.f14096a = null;
        this.f14097b = null;
        this.f14100e = false;
        this.f14101f = -1;
        this.f14102g = -1;
        this.f14103h = -1;
        this.f14104i = -1;
        this.f14105j = context;
        this.f14106k = k3Var;
        setFocusableInTouchMode(true);
        requestFocus();
    }

    public void a() {
    }

    public final void a(boolean z10, com.chartboost.sdk.Model.c cVar) {
        if (z10) {
            this.f14096a = null;
        }
        a((Activity) getContext(), cVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14106k.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f14103h = i10;
        this.f14104i = i11;
    }

    public boolean a(Activity activity, com.chartboost.sdk.Model.c cVar) {
        int i10;
        int i11;
        if (this.f14103h == -1 || this.f14104i == -1) {
            try {
                i10 = getWidth();
                i11 = getHeight();
                if (i10 == 0 || i11 == 0) {
                    View findViewById = activity.getWindow().findViewById(16908290);
                    if (findViewById == null) {
                        findViewById = activity.getWindow().getDecorView();
                    }
                    int width = findViewById.getWidth();
                    i11 = findViewById.getHeight();
                    i10 = width;
                }
            } catch (Exception unused) {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 || i11 == 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i12 = displayMetrics.widthPixels;
                i11 = displayMetrics.heightPixels;
                i10 = i12;
            }
            this.f14103h = i10;
            this.f14104i = i11;
        }
        return a(cVar, this.f14103h, this.f14104i);
    }

    private boolean a(com.chartboost.sdk.Model.c cVar, int i10, int i11) {
        Integer num;
        boolean z10 = true;
        if (cVar != null) {
            return true;
        }
        if (this.f14100e) {
            return false;
        }
        int a10 = CBUtility.a(this.f14105j);
        if (this.f14101f == i10 && this.f14102g == i11 && (num = this.f14096a) != null && num.intValue() == a10) {
            return true;
        }
        this.f14100e = true;
        try {
            this.f14106k.a(a10);
            post(new a());
            this.f14101f = i10;
            this.f14102g = i11;
            this.f14096a = Integer.valueOf(a10);
        } catch (Exception e10) {
            CBLogging.a("test", "Exception raised while layouting Subviews", e10);
            z10 = false;
        }
        this.f14100e = false;
        return z10;
    }
}
