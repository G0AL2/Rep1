package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Message;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6S {
    @Nullable
    public static C6S A07;
    public static final AtomicBoolean A08 = new AtomicBoolean();
    public C6R A00 = new C6R(this, C7G.A00().A03().getLooper());
    public C07186b A01;
    public C07196c A02;
    public List<EnumC07226f> A03;
    public final Context A04;
    public final C6C A05;
    public final EnumC07426z A06;

    public C6S(C6C c6c, Context context) {
        this.A05 = c6c;
        this.A04 = context;
        this.A06 = c6c.A0a();
    }

    public static synchronized C6S A00(Context context, C6C c6c) {
        C6S c6s;
        synchronized (C6S.class) {
            if (A07 == null) {
                A07 = new C6S(c6c, context);
            }
            c6s = A07;
        }
        return c6s;
    }

    private synchronized void A02() {
        A08.set(false);
        this.A03 = new ArrayList();
    }

    public final synchronized void A03() {
        if (this.A01 != null) {
            this.A01.A03(this.A03);
        }
        A02();
    }

    public final synchronized void A04(Map<Integer, C07356s> map, EnumC07396w enumC07396w) {
        A02();
        C6W c6w = new C6W(this.A05, map);
        for (Map.Entry<Integer, C07356s> entry : map.entrySet()) {
            C07356s value = entry.getValue();
            if (value != null && value.A04(enumC07396w)) {
                int intValue = entry.getKey().intValue();
                if (intValue != 10800) {
                    switch (intValue) {
                        case 10810:
                            this.A03.add(EnumC07226f.A04);
                            continue;
                        case 10811:
                            this.A03.add(EnumC07226f.A08);
                            continue;
                        case 10812:
                            this.A03.add(EnumC07226f.A0A);
                            continue;
                        case 10813:
                            this.A03.add(EnumC07226f.A07);
                            continue;
                        case 10814:
                            this.A03.add(EnumC07226f.A0B);
                            continue;
                        case 10815:
                            this.A03.add(EnumC07226f.A0C);
                            continue;
                        case 10816:
                            this.A03.add(EnumC07226f.A0E);
                            continue;
                        case 10817:
                            this.A03.add(EnumC07226f.A09);
                            continue;
                        case 10818:
                            this.A03.add(EnumC07226f.A06);
                            continue;
                        case 10819:
                            this.A03.add(EnumC07226f.A05);
                            continue;
                        case 10820:
                            this.A03.add(EnumC07226f.A0D);
                            continue;
                        default:
                            continue;
                    }
                } else {
                    this.A02 = new C07196c(this.A04, c6w, this.A06);
                    A08.set(true);
                }
            }
        }
        this.A01 = new C07186b(this.A04, c6w, this.A06);
        this.A01.A02(this.A03);
        if (!this.A00.getLooper().getThread().isAlive()) {
            this.A00 = new C6R(this, C7G.A00().A03().getLooper());
        }
    }

    public final synchronized boolean A05(MotionEvent motionEvent) {
        if (!A08.get()) {
            return false;
        }
        Message message = new Message();
        message.what = C6Q.A03.ordinal();
        message.obj = motionEvent;
        this.A00.sendMessage(message);
        return true;
    }
}
