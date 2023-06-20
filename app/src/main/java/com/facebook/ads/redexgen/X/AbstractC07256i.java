package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC07256i {
    public final Context A00;
    public final C6C A01;

    public AbstractC07256i(Context context, C6C c6c) {
        this.A00 = context;
        this.A01 = c6c;
    }

    private int A00(C6C c6c, C07356s c07356s) {
        if (c6c.A0e(c07356s.A00()) != null) {
            return c6c.A0e(c07356s.A00()).intValue();
        }
        if (c07356s.A03().contains(EnumC07426z.A0B)) {
            return c6c.A0S();
        }
        if (c07356s.A03().contains(EnumC07426z.A08)) {
            return c6c.A0R();
        }
        return c6c.A0V();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void A01(EnumC07396w enumC07396w, List<C07356s> list) {
        C7A A5J;
        C7A c7a;
        Map<Integer, C6H<C7A>> A03 = C07406x.A01().A03();
        for (C07356s c07356s : list) {
            InterfaceC07386v signalExecutor = c07356s.A02(enumC07396w);
            if (signalExecutor != null && (A5J = signalExecutor.A5J()) != null && A5J.A07() != null) {
                if (c07356s.A03().contains(EnumC07426z.A0B) && A03.containsKey(Integer.valueOf(c07356s.A00()))) {
                    C6H<C7A> c6h = A03.get(Integer.valueOf(c07356s.A00()));
                    if (c6h != null) {
                        c7a = c6h.A02();
                    } else {
                        c7a = null;
                    }
                    if (c6h == null) {
                        c6h = new C6H<>(A00(this.A01, c07356s));
                    }
                    if (c7a == null || !A5J.A0B(c7a, c07356s.A03())) {
                        c6h.A04(A5J);
                        C07406x.A01().A04(c07356s.A00(), c6h, A5J.A05());
                    }
                } else {
                    C6H<C7A> c6h2 = new C6H<>(A00(this.A01, c07356s));
                    c6h2.A04(A5J);
                    C07406x.A01().A04(c07356s.A00(), c6h2, A5J.A05());
                }
            }
        }
    }
}
