package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.ads.redexgen.X.b8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1524b8 implements C6E {
    public EnumC07396w A00;
    public C7K A01;
    public C7L A02;
    public final C6C A03;
    public final C07246h A04;
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C1524b8(C6C c6c, C07246h c07246h) {
        this.A03 = c6c;
        this.A04 = c07246h;
    }

    private final synchronized void A04() {
        if (this.A02 != null && this.A05.get()) {
            this.A01.A01(this.A02);
            C7G.A00().A04();
            this.A04.A02();
            this.A05.compareAndSet(true, false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.redexgen.X.7L] */
    public final synchronized void A05(final EnumC07396w enumC07396w) {
        if (this.A05.get() || enumC07396w == null) {
            return;
        }
        if (this.A03.A0k() && C7J.A0E(enumC07396w)) {
            this.A01 = new C7K(C7G.A00().A03().getLooper());
            this.A00 = enumC07396w;
            final Runnable runnable = new Runnable(enumC07396w) { // from class: com.facebook.ads.redexgen.X.6G
                public EnumC07396w A00;

                {
                    this.A00 = enumC07396w;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C07246h c07246h;
                    C7K c7k;
                    C7L c7l;
                    C6C c6c;
                    if (L0.A02(this)) {
                        return;
                    }
                    try {
                        c07246h = C1524b8.this.A04;
                        c07246h.A04(EnumC07416y.A03, this.A00, null);
                        c7k = C1524b8.this.A01;
                        c7l = C1524b8.this.A02;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        c6c = C1524b8.this.A03;
                        c7k.A02(c7l, timeUnit.toMillis(c6c.A0T()));
                    } catch (Throwable th) {
                        L0.A00(th, this);
                    }
                }
            };
            this.A02 = new Runnable(runnable) { // from class: com.facebook.ads.redexgen.X.7L
                public final Runnable A00;

                {
                    this.A00 = runnable;
                }

                @Override // java.lang.Runnable
                @SuppressLint({"CatchGeneralException"})
                public final void run() {
                    if (L0.A02(this)) {
                        return;
                    }
                    try {
                        this.A00.run();
                    } catch (Throwable t10) {
                        try {
                            C6O.A03(t10);
                        } catch (Throwable t11) {
                            L0.A00(t11, this);
                        }
                    }
                }
            };
            this.A04.A03(enumC07396w);
            this.A01.A00(this.A02);
            this.A05.compareAndSet(false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C6E
    public final synchronized void AFL(EnumC07396w enumC07396w) {
        if (this.A00 == enumC07396w) {
            return;
        }
        this.A00 = enumC07396w;
        if (enumC07396w == EnumC07396w.A04) {
            A04();
        } else {
            A05(enumC07396w);
        }
    }
}
