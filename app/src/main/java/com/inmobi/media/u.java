package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* compiled from: EmbeddedBrowserCustomView.java */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes3.dex */
public class u extends RelativeLayout {

    /* renamed from: a */
    private static final String f26007a = u.class.getSimpleName();

    /* renamed from: b */
    private final int f26008b;

    /* renamed from: c */
    private int f26009c;

    /* renamed from: d */
    private y f26010d;

    /* renamed from: e */
    private x f26011e;

    /* renamed from: f */
    private t f26012f;

    public u(Context context) {
        super(context);
        this.f26008b = 48;
        this.f26009c = -1;
        this.f26012f = null;
    }

    public static /* synthetic */ boolean a(u uVar, View view, MotionEvent motionEvent) {
        return uVar.c(view, motionEvent);
    }

    public /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        if (this.f26010d == null) {
            a();
            return true;
        } else if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (this.f26010d.canGoBack()) {
                this.f26010d.goBack();
            } else {
                a();
            }
            return true;
        } else {
            if (motionEvent.getAction() == 0) {
                view.setBackgroundColor(-16711681);
            }
            return true;
        }
    }

    public static /* synthetic */ boolean b(u uVar, View view, MotionEvent motionEvent) {
        return uVar.b(view, motionEvent);
    }

    public /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            y yVar = this.f26010d;
            if (yVar != null) {
                yVar.reload();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static /* synthetic */ boolean c(u uVar, View view, MotionEvent motionEvent) {
        return uVar.a(view, motionEvent);
    }

    public /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            a();
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }

    public static /* synthetic */ boolean d(u uVar, View view, MotionEvent motionEvent) {
        return uVar.d(view, motionEvent);
    }

    public final void a(String str, v vVar, boolean z10) {
        if (this.f26010d == null) {
            y yVar = new y(getContext());
            this.f26010d = yVar;
            yVar.setId(i.f25725h);
        }
        if (this.f26009c != str.hashCode()) {
            if (vVar == v.URL) {
                this.f26010d.loadUrl(str);
            } else {
                this.f26010d.loadData(str, "text/html", "UTF-8");
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(10);
            layoutParams.addRule(2, i.f25720c);
            if (findViewById(i.f25725h) != null) {
                this.f26010d.setLayoutParams(layoutParams);
            } else {
                addView(this.f26010d, layoutParams);
            }
            this.f26009c = str.hashCode();
        }
        if (z10) {
            if (findViewById(i.f25720c) != null) {
                return;
            }
            float f10 = ic.a().f25747c;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setId(i.f25720c);
            linearLayout.setWeightSum(100.0f);
            linearLayout.setBackgroundResource(17301658);
            linearLayout.setBackgroundColor(-7829368);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (48.0f * f10));
            layoutParams2.addRule(12);
            addView(linearLayout, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
            layoutParams3.weight = 25.0f;
            cp cpVar = new cp(getContext(), f10, (byte) 2);
            cpVar.setId(i.f25726i);
            cpVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.j0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return u.d(u.this, view, motionEvent);
                }
            });
            linearLayout.addView(cpVar, layoutParams3);
            cp cpVar2 = new cp(getContext(), f10, (byte) 3);
            cpVar2.setId(i.f25729l);
            cpVar2.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.g0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return u.a(u.this, view, motionEvent);
                }
            });
            linearLayout.addView(cpVar2, layoutParams3);
            cp cpVar3 = new cp(getContext(), f10, (byte) 4);
            cpVar3.setId(i.f25728k);
            cpVar3.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.h0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return u.b(u.this, view, motionEvent);
                }
            });
            linearLayout.addView(cpVar3, layoutParams3);
            cp cpVar4 = new cp(getContext(), f10, (byte) 6);
            cpVar4.setId(i.f25727j);
            cpVar4.setOnTouchListener(new View.OnTouchListener() { // from class: com.inmobi.media.i0
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return u.c(u.this, view, motionEvent);
                }
            });
            linearLayout.addView(cpVar4, layoutParams3);
            return;
        }
        View findViewById = findViewById(i.f25720c);
        if (findViewById != null) {
            removeView(findViewById);
        }
    }

    public t getUserLeftApplicationListener() {
        return this.f26012f;
    }

    public void setEmbeddedBrowserUpdateListener(x xVar) {
        this.f26011e = xVar;
    }

    public void setUserLeftApplicationListener(t tVar) {
        this.f26012f = tVar;
    }

    public final void b() {
        y yVar = this.f26010d;
        if (yVar != null) {
            yVar.destroy();
        }
        this.f26010d = null;
        this.f26011e = null;
        this.f26012f = null;
        removeAllViews();
    }

    public final void a() {
        x xVar = this.f26011e;
        if (xVar != null) {
            xVar.finish();
        }
    }

    public /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            view.setBackgroundColor(-7829368);
            if (this.f26010d.canGoForward()) {
                this.f26010d.goForward();
            }
            return true;
        }
        if (motionEvent.getAction() == 0) {
            view.setBackgroundColor(-16711681);
        }
        return true;
    }
}
