package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    private float f22500c;

    /* renamed from: f  reason: collision with root package name */
    private ua.d f22503f;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f22498a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final ua.f f22499b = new a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f22501d = true;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<b> f22502e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes3.dex */
    class a extends ua.f {
        a() {
        }

        @Override // ua.f
        public void a(int i10) {
            f.this.f22501d = true;
            b bVar = (b) f.this.f22502e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // ua.f
        public void b(Typeface typeface, boolean z10) {
            if (z10) {
                return;
            }
            f.this.f22501d = true;
            b bVar = (b) f.this.f22502e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public f(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f22498a.measureText(charSequence, 0, charSequence.length());
    }

    public ua.d d() {
        return this.f22503f;
    }

    public TextPaint e() {
        return this.f22498a;
    }

    public float f(String str) {
        if (!this.f22501d) {
            return this.f22500c;
        }
        float c10 = c(str);
        this.f22500c = c10;
        this.f22501d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f22502e = new WeakReference<>(bVar);
    }

    public void h(ua.d dVar, Context context) {
        if (this.f22503f != dVar) {
            this.f22503f = dVar;
            if (dVar != null) {
                dVar.j(context, this.f22498a, this.f22499b);
                b bVar = this.f22502e.get();
                if (bVar != null) {
                    this.f22498a.drawableState = bVar.getState();
                }
                dVar.i(context, this.f22498a, this.f22499b);
                this.f22501d = true;
            }
            b bVar2 = this.f22502e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f22501d = z10;
    }

    public void j(Context context) {
        this.f22503f.i(context, this.f22498a, this.f22499b);
    }
}
