package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6W  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6W {
    public final C6C A00;
    public final Map<Integer, C07356s> A01;
    public final AtomicBoolean A02 = new AtomicBoolean();

    public C6W(C6C c6c, Map<Integer, C07356s> map) {
        this.A00 = c6c;
        this.A01 = map;
        this.A02.compareAndSet(false, true);
    }

    private int A00(int i10) {
        if (this.A00.A0e(i10) != null) {
            return this.A00.A0e(i10).intValue();
        }
        return this.A00.A0R();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.6H != com.facebook.ads.internal.botdetection.interval.buffer.CircularBuffer<com.facebook.ads.internal.botdetection.signals.model.signal_value.SignalValueTypeDef> */
    private synchronized void A01(C7A c7a, C07356s c07356s) {
        int A00 = c07356s.A00();
        Map<Integer, C6H<C7A>> A03 = C07406x.A01().A03();
        if (A03.containsKey(Integer.valueOf(A00))) {
            C6H<C7A> c6h = A03.get(Integer.valueOf(A00));
            C7A A02 = c6h != null ? c6h.A02() : null;
            if (c6h == null) {
                c6h = new C6H<>(A00(A00));
            }
            if (!c7a.A0B(A02, c07356s.A03())) {
                c6h.A04(c7a);
                C07406x.A01().A04(A00, c6h, c7a.A05());
            }
        } else {
            C6H<C7A> c6h2 = new C6H<>(A00(A00));
            c6h2.A04(c7a);
            C07406x.A01().A04(A00, c6h2, c7a.A05());
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public final void A02(C7A c7a, C6V c6v) {
        if (!this.A02.get()) {
            return;
        }
        try {
            switch (c6v) {
                case A0E:
                    C07356s c07356s = this.A01.get(10800);
                    if (c7a != null && c07356s != null) {
                        A01(c7a, c07356s);
                        break;
                    } else {
                        return;
                    }
                case A03:
                    C07356s c07356s2 = this.A01.get(10810);
                    if (c7a != null && c07356s2 != null) {
                        A01(c7a, c07356s2);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A09:
                    C07356s c07356s3 = this.A01.get(10812);
                    if (c7a != null && c07356s3 != null) {
                        A01(c7a, c07356s3);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A06:
                    C07356s c07356s4 = this.A01.get(10813);
                    if (c7a != null && c07356s4 != null) {
                        A01(c7a, c07356s4);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A0A:
                    C07356s c07356s5 = this.A01.get(10814);
                    if (c7a != null && c07356s5 != null) {
                        A01(c7a, c07356s5);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A0B:
                    C07356s c07356s6 = this.A01.get(10815);
                    if (c7a != null && c07356s6 != null) {
                        A01(c7a, c07356s6);
                        break;
                    } else {
                        return;
                    }
                case A0D:
                    C07356s c07356s7 = this.A01.get(10816);
                    if (c7a != null && c07356s7 != null) {
                        A01(c7a, c07356s7);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A08:
                    C07356s c07356s8 = this.A01.get(10817);
                    if (c7a != null && c07356s8 != null) {
                        A01(c7a, c07356s8);
                        break;
                    } else {
                        return;
                    }
                case A05:
                    C07356s c07356s9 = this.A01.get(10818);
                    if (c7a != null && c07356s9 != null) {
                        A01(c7a, c07356s9);
                        break;
                    } else {
                        return;
                    }
                    break;
                case A04:
                    C07356s c07356s10 = this.A01.get(10819);
                    if (c7a != null && c07356s10 != null) {
                        A01(c7a, c07356s10);
                        break;
                    } else {
                        return;
                    }
                case A0C:
                    C07356s c07356s11 = this.A01.get(10820);
                    if (c7a != null && c07356s11 != null) {
                        A01(c7a, c07356s11);
                        break;
                    } else {
                        return;
                    }
                    break;
            }
        } catch (Throwable th) {
            C6O.A03(th);
        }
    }
}
