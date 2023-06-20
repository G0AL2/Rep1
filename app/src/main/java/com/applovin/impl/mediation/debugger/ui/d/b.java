package com.applovin.impl.mediation.debugger.ui.d;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public TextView f7680a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f7681b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f7682c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f7683d;

    /* renamed from: e  reason: collision with root package name */
    private c f7684e;

    /* renamed from: f  reason: collision with root package name */
    private int f7685f;

    public int a() {
        return this.f7685f;
    }

    public void a(int i10) {
        this.f7685f = i10;
    }

    public void a(c cVar) {
        this.f7684e = cVar;
        this.f7680a.setText(cVar.k());
        this.f7680a.setTextColor(cVar.n());
        if (this.f7681b != null) {
            if (TextUtils.isEmpty(cVar.c_())) {
                this.f7681b.setVisibility(8);
            } else {
                this.f7681b.setTypeface(null, 0);
                this.f7681b.setVisibility(0);
                this.f7681b.setText(cVar.c_());
                this.f7681b.setTextColor(cVar.c());
                if (cVar.d_()) {
                    this.f7681b.setTypeface(null, 1);
                }
            }
        }
        if (this.f7682c != null) {
            if (cVar.e() > 0) {
                this.f7682c.setImageResource(cVar.e());
                this.f7682c.setColorFilter(cVar.o());
                this.f7682c.setVisibility(0);
            } else {
                this.f7682c.setVisibility(8);
            }
        }
        if (this.f7683d != null) {
            if (cVar.f() <= 0) {
                this.f7683d.setVisibility(8);
                return;
            }
            this.f7683d.setImageResource(cVar.f());
            this.f7683d.setColorFilter(cVar.g());
            this.f7683d.setVisibility(0);
        }
    }

    public c b() {
        return this.f7684e;
    }
}
