package com.fyber.inneractive.sdk.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public final class o implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f20441a;

    /* renamed from: b  reason: collision with root package name */
    public float f20442b;

    /* renamed from: c  reason: collision with root package name */
    public float f20443c;

    /* renamed from: d  reason: collision with root package name */
    public float f20444d;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public o(a aVar, Context context) {
        this.f20441a = aVar;
        this.f20444d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float f10;
        if (this.f20441a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((com.fyber.inneractive.sdk.web.a) this.f20441a).d();
                this.f20442b = motionEvent.getX();
                this.f20443c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((com.fyber.inneractive.sdk.web.a) this.f20441a).d();
                this.f20443c = -1.0f;
                this.f20442b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                if (this.f20442b >= 0.0f && this.f20443c >= 0.0f) {
                    float round = Math.round(Math.abs(this.f20443c - motionEvent.getY()));
                    float f11 = this.f20444d;
                    if (Math.round(Math.abs(f10 - motionEvent.getX())) < f11 && round < f11) {
                        com.fyber.inneractive.sdk.web.a aVar = (com.fyber.inneractive.sdk.web.a) this.f20441a;
                        aVar.getClass();
                        IAlog.a("IAWebViewController onClicked()", new Object[0]);
                        if (aVar.f20375l != null) {
                            IAlog.d("Native click detected in time. Processing pending click", new Object[0]);
                            aVar.f20375l.d();
                            Runnable runnable = aVar.f20376m;
                            if (runnable != null) {
                                com.fyber.inneractive.sdk.util.n.f20310b.removeCallbacks(runnable);
                            }
                            aVar.f20375l = null;
                            aVar.d();
                        } else {
                            if (aVar.f20377n != null) {
                                com.fyber.inneractive.sdk.util.n.f20310b.postDelayed(aVar.f20377n, IAConfigManager.J.f16886v.f16987b.a("click_timeout", 1000, 1000));
                            }
                            aVar.f20373j = true;
                        }
                    }
                    this.f20442b = -1.0f;
                    this.f20443c = -1.0f;
                }
            }
        }
        return false;
    }
}
