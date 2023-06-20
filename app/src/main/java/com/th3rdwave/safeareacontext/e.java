package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: SafeAreaProvider.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class e extends com.facebook.react.views.view.g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: t  reason: collision with root package name */
    private a f28456t;

    /* renamed from: u  reason: collision with root package name */
    private com.th3rdwave.safeareacontext.a f28457u;

    /* renamed from: v  reason: collision with root package name */
    private c f28458v;

    /* compiled from: SafeAreaProvider.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(e eVar, com.th3rdwave.safeareacontext.a aVar, c cVar);
    }

    public e(Context context) {
        super(context);
    }

    private void A() {
        com.th3rdwave.safeareacontext.a c10 = f.c(this);
        c a10 = f.a((ViewGroup) getRootView(), this);
        if (c10 == null || a10 == null) {
            return;
        }
        com.th3rdwave.safeareacontext.a aVar = this.f28457u;
        if (aVar == null || this.f28458v == null || !aVar.a(c10) || !this.f28458v.a(a10)) {
            ((a) f6.a.c(this.f28456t)).a(this, c10, a10);
            this.f28457u = c10;
            this.f28458v = a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        A();
        return true;
    }

    public void setOnInsetsChangeListener(a aVar) {
        this.f28456t = aVar;
    }
}
