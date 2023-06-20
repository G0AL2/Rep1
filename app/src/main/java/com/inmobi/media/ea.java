package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.inmobi.media.ei;
import java.lang.ref.WeakReference;

/* compiled from: DecorViewVisibilityTracker.java */
/* loaded from: classes3.dex */
final class ea extends ei {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25193a = "ea";

    /* renamed from: d  reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f25194d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<View> f25195e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ea(ei.a aVar, Activity activity) {
        super(aVar, (byte) 1);
        View decorView = activity.getWindow().getDecorView();
        this.f25195e = new WeakReference<>(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.inmobi.media.ea.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ea.this.h();
                    return true;
                }
            };
            this.f25194d = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    private void i() {
        View view = this.f25195e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f25194d);
            }
        }
    }

    @Override // com.inmobi.media.ei
    protected final int a() {
        return 100;
    }

    @Override // com.inmobi.media.ei
    protected final void b() {
    }

    @Override // com.inmobi.media.ei
    public final void c() {
        if (this.f25240b) {
            return;
        }
        i();
        super.c();
    }

    @Override // com.inmobi.media.ei
    public final void d() {
        if (this.f25240b) {
            View view = this.f25195e.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f25194d);
                }
            }
            super.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.inmobi.media.ei
    public final void e() {
        i();
        super.e();
    }
}
