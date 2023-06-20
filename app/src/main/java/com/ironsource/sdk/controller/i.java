package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.sdk.controller.x;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* loaded from: classes3.dex */
public final class i extends FrameLayout implements com.ironsource.sdk.j.g {

    /* renamed from: a  reason: collision with root package name */
    Context f27805a;

    /* renamed from: b  reason: collision with root package name */
    x f27806b;

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup b10 = i.b(i.this);
            if (b10 != null) {
                b10.addView(i.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup b10 = i.b(i.this);
            if (b10 != null) {
                b10.removeView(i.this);
            }
        }
    }

    public i(Context context) {
        super(context);
        this.f27805a = context;
        setClickable(true);
    }

    static /* synthetic */ ViewGroup b(i iVar) {
        Activity activity = (Activity) iVar.f27805a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        int identifier;
        try {
            Context context = this.f27805a;
            if (context == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID)) <= 0) {
                return 0;
            }
            return this.f27805a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        Activity activity = (Activity) this.f27805a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (com.ironsource.environment.h.o(activity) == 1) {
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    if (i10 - i11 > 0) {
                        return i10 - i11;
                    }
                    return 0;
                }
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 - i13 > 0) {
                    return i12 - i13;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27806b.l();
        this.f27806b.a(true, "main");
    }

    @Override // com.ironsource.sdk.j.g
    public final boolean onBackButtonPressed() {
        new com.ironsource.sdk.i.a();
        return com.ironsource.sdk.i.a.a((Activity) this.f27805a);
    }

    @Override // com.ironsource.sdk.j.g
    public final void onCloseRequested() {
        ((Activity) this.f27805a).runOnUiThread(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27806b.k();
        this.f27806b.a(false, "main");
        x xVar = this.f27806b;
        if (xVar != null) {
            xVar.f27917x = x.g.Gone;
            xVar.G = null;
            xVar.V = null;
        }
        removeAllViews();
    }

    @Override // com.ironsource.sdk.j.g
    public final void onOrientationChanged(String str, int i10) {
    }
}
