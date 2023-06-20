package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.util.DisplayMetrics;

/* loaded from: assets/audience_network.dex */
public final class ZY extends C07296m {
    public ContentResolver A00;
    public DisplayMetrics A01;

    public ZY(Context context, C6C c6c) {
        super(context, c6c);
        this.A01 = context.getResources().getDisplayMetrics();
        this.A00 = context.getContentResolver();
    }

    public final InterfaceC07386v A0G() {
        return new ZZ(this);
    }

    public final InterfaceC07386v A0H() {
        return new C1430Zc(this);
    }

    public final InterfaceC07386v A0I() {
        return new C1429Zb(this);
    }

    public final InterfaceC07386v A0J() {
        return new C1431Zd(this);
    }

    public final InterfaceC07386v A0K() {
        return new C1428Za(this);
    }
}
