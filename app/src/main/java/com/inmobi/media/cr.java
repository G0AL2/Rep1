package com.inmobi.media;

import android.widget.RelativeLayout;
import com.inmobi.media.ic;

/* compiled from: AdMarkupViewHandler.java */
/* loaded from: classes3.dex */
public abstract class cr {

    /* renamed from: a  reason: collision with root package name */
    private final String f24999a = cr.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private df f25000b = df.PORTRAIT;

    /* renamed from: c  reason: collision with root package name */
    private float f25001c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f25002d;

    public cr(RelativeLayout relativeLayout) {
        this.f25002d = relativeLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    public void a(df dfVar) {
        this.f25000b = dfVar;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();

    public abstract void f();

    public void g() {
        RelativeLayout.LayoutParams layoutParams;
        if (this.f25001c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f25002d.setLayoutParams(layoutParams2);
            return;
        }
        ic.a b10 = ic.b(this.f25002d.getContext());
        if (this.f25000b.a()) {
            layoutParams = new RelativeLayout.LayoutParams((int) (b10.f25743a * this.f25001c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (b10.f25744b * this.f25001c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f25002d.setLayoutParams(layoutParams);
    }

    public void a(float f10) {
        this.f25001c = f10;
    }
}
