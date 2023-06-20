package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: VideoOnTouchLayout.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f13151a;

    /* renamed from: d  reason: collision with root package name */
    private float f13154d;

    /* renamed from: e  reason: collision with root package name */
    private float f13155e;

    /* renamed from: f  reason: collision with root package name */
    private int f13156f;

    /* renamed from: g  reason: collision with root package name */
    private int f13157g;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13161k;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13152b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13153c = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13158h = true;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13159i = false;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnTouchListener f13160j = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.d.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (d.this.f13151a.o()) {
                return d.this.f13152b || !d.this.f13153c;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                d dVar = d.this;
                dVar.f13161k = dVar.a(motionEvent);
                d.this.f13154d = x10;
                d.this.f13155e = y10;
                d.this.f13156f = (int) x10;
                d.this.f13157g = (int) y10;
                d.this.f13158h = true;
                if (d.this.f13151a != null && d.this.f13153c && !d.this.f13152b) {
                    d.this.f13151a.a(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x10 - d.this.f13156f) > 20.0f || Math.abs(y10 - d.this.f13157g) > 20.0f) {
                    d.this.f13158h = false;
                }
                if (!d.this.f13152b) {
                    d.this.f13158h = true;
                }
                d.this.f13159i = false;
                d.this.f13154d = 0.0f;
                d.this.f13155e = 0.0f;
                d.this.f13156f = 0;
                if (d.this.f13151a != null) {
                    d.this.f13151a.a(view, d.this.f13158h);
                }
                d.this.f13161k = false;
            } else if (action != 2) {
                if (action == 3) {
                    d.this.f13161k = false;
                }
            } else if (d.this.f13152b && !d.this.f13161k) {
                float abs = Math.abs(x10 - d.this.f13154d);
                float abs2 = Math.abs(y10 - d.this.f13155e);
                if (!d.this.f13159i) {
                    if (abs <= 20.0f && abs2 <= 20.0f) {
                        return true;
                    }
                    d.this.f13159i = true;
                }
                if (d.this.f13151a != null) {
                    d.this.f13151a.n();
                }
                d.this.f13154d = x10;
                d.this.f13155e = y10;
            }
            return d.this.f13152b || !d.this.f13153c;
        }
    };

    /* compiled from: VideoOnTouchLayout.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(View view, boolean z10);

        void n();

        boolean o();
    }

    public d(a aVar) {
        this.f13151a = aVar;
    }

    public void a(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f13160j);
        }
    }

    public void a(boolean z10) {
        this.f13153c = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            int c10 = v.c(m.a().getApplicationContext());
            int d10 = v.d(m.a().getApplicationContext());
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f10 = c10;
            if (rawX > f10 * 0.01f && rawX < f10 * 0.99f) {
                float f11 = d10;
                if (rawY > 0.01f * f11 && rawY < f11 * 0.99f) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
