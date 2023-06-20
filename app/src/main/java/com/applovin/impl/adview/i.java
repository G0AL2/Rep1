package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class i extends View {

    /* renamed from: a  reason: collision with root package name */
    protected float f7049a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f7050b;

    /* loaded from: classes.dex */
    public enum a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: e  reason: collision with root package name */
        private final int f7056e;

        a(int i10) {
            this.f7056e = i10;
        }

        public int a() {
            return this.f7056e;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public i(Context context) {
        super(context);
        this.f7049a = 1.0f;
        this.f7050b = context;
    }

    public static i a(a aVar, Context context) {
        return aVar.equals(a.INVISIBLE) ? new p(context) : aVar.equals(a.WHITE_ON_TRANSPARENT) ? new q(context) : aVar.equals(a.TRANSPARENT_SKIP) ? new r(context) : new w(context);
    }

    public void a(int i10) {
        setViewScale(i10 / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f7049a * 30.0f;
    }

    public abstract a getStyle();

    public void setViewScale(float f10) {
        this.f7049a = f10;
    }
}
