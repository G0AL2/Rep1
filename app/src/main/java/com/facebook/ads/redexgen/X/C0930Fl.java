package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Fl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0930Fl {
    public static String[] A04 = {"HGHzNcawqnVFgJx8ceQNwcxcn1SDkpDb", "AD2ta0a", "biSUTEi4nYJndXTTLsT", "38FOXeSW4cnwnxdXp60to", "WtyRCcfaPM", "iLolo35", "fvJAwdggv90DLF", "FbA7S8K"};
    public final int A00;
    @Nullable
    public final FY A01;
    public final long A02;
    public final CopyOnWriteArrayList<C0929Fk> A03;

    public C0930Fl() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C0930Fl(CopyOnWriteArrayList<C0929Fk> copyOnWriteArrayList, int i10, @Nullable FY fy, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = fy;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long A01 = AG.A01(j10);
        if (A01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.A02;
        if (A04[2].length() != 19) {
            throw new RuntimeException();
        }
        A04[7] = "vQJR5ZN";
        return j11 + A01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    @CheckResult
    public final C0930Fl A02(int i10, @Nullable FY fy, long j10) {
        return new C0930Fl(this.A03, i10, fy, j10);
    }

    public final void A03() {
        IK.A04(this.A01 != null);
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0920Fb(this, listenerAndHandler.A01));
        }
    }

    public final void A04() {
        IK.A04(this.A01 != null);
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0921Fc(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        IK.A04(this.A01 != null);
        Iterator<C0929Fk> it = this.A03.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A04[7].length() != 7) {
                throw new RuntimeException();
            }
            A04[2] = "JAadAeVCHcunsRCfoQL";
            if (hasNext) {
                C0929Fk listenerAndHandler = it.next();
                A01(listenerAndHandler.A00, new RunnableC0926Fh(this, listenerAndHandler.A01));
            } else {
                return;
            }
        }
    }

    public final void A06(int i10, @Nullable Format format, int i11, @Nullable Object obj, long j10) {
        A0C(new C0932Fn(1, i10, format, i11, obj, A00(j10), -9223372036854775807L));
    }

    public final void A07(Handler handler, InterfaceC0933Fo interfaceC0933Fo) {
        IK.A03((handler == null || interfaceC0933Fo == null) ? false : true);
        this.A03.add(new C0929Fk(handler, interfaceC0933Fo));
    }

    public final void A08(C0931Fm c0931Fm, C0932Fn c0932Fn) {
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk next = it.next();
            A01(next.A00, new RunnableC0924Ff(this, next.A01, c0931Fm, c0932Fn));
        }
    }

    public final void A09(C0931Fm c0931Fm, C0932Fn c0932Fn) {
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk next = it.next();
            A01(next.A00, new RunnableC0923Fe(this, next.A01, c0931Fm, c0932Fn));
        }
    }

    public final void A0A(C0931Fm c0931Fm, C0932Fn c0932Fn) {
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk next = it.next();
            A01(next.A00, new RunnableC0922Fd(this, next.A01, c0931Fm, c0932Fn));
        }
    }

    public final void A0B(C0931Fm c0931Fm, C0932Fn c0932Fn, IOException iOException, boolean z10) {
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0925Fg(this, listenerAndHandler.A01, c0931Fm, c0932Fn, iOException, z10));
        }
    }

    public final void A0C(C0932Fn c0932Fn) {
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk next = it.next();
            A01(next.A00, new RunnableC0928Fj(this, next.A01, c0932Fn));
        }
    }

    public final void A0D(InterfaceC0933Fo interfaceC0933Fo) {
        Iterator<C0929Fk> it = this.A03.iterator();
        while (it.hasNext()) {
            C0929Fk next = it.next();
            if (next.A01 == interfaceC0933Fo) {
                this.A03.remove(next);
            }
        }
    }

    public final void A0E(C0979Hi c0979Hi, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12) {
        A0A(new C0931Fm(c0979Hi, j12, 0L, 0L), new C0932Fn(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0F(C0979Hi c0979Hi, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
        A08(new C0931Fm(c0979Hi, j12, j13, j14), new C0932Fn(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0G(C0979Hi c0979Hi, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
        A09(new C0931Fm(c0979Hi, j12, j13, j14), new C0932Fn(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0H(C0979Hi c0979Hi, int i10, int i11, @Nullable Format format, int i12, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        A0B(new C0931Fm(c0979Hi, j12, j13, j14), new C0932Fn(i10, i11, format, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }
}
