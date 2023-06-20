package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Uw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1323Uw implements InterfaceC0992Hx {
    public static String[] A03 = {"zA1HDLVhPd9PsL9PenCbpcrAKXxlN0d6", "FLS1DqH1RbizqOpj", "1z8O9NEtb5xyjYGA", "8w8GUSv0BTEQmaLhHrYTkFjQIFXWxu0p", "o1jGjvwpoOOHSDmJh0w1BZ4ZQReO8O7V", "", "IXAYHKYtOagUrLCRc2OBPi2ErH2JE5Q2", "ufrZt7t49gDVq6vRzV1VlqPqnp3Kfu3W"};
    public HandlerC0986Hr<? extends InterfaceC0987Hs> A00;
    public IOException A01;
    public final ExecutorService A02;

    public C1323Uw(String str) {
        this.A02 = C1020Iz.A0T(str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hq != com.facebook.ads.internal.exoplayer2.upstream.Loader$Callback<T extends com.facebook.ads.redexgen.X.Hs> */
    public final <T extends InterfaceC0987Hs> long A04(T loadable, InterfaceC0985Hq<T> interfaceC0985Hq, int i10) {
        Looper myLooper = Looper.myLooper();
        IK.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0986Hr(this, myLooper, loadable, interfaceC0985Hq, i10, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i10) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0986Hr<? extends InterfaceC0987Hs> handlerC0986Hr = this.A00;
            if (handlerC0986Hr != null) {
                if (A03[0].charAt(1) != 'f') {
                    String[] strArr = A03;
                    strArr[2] = "ShO16ogjgPVIHMzl";
                    strArr[1] = "8gZONBnlwtDMou1V";
                    if (i10 == Integer.MIN_VALUE) {
                        i10 = handlerC0986Hr.A03;
                    }
                    handlerC0986Hr.A05(i10);
                    return;
                }
                throw new RuntimeException();
            }
            return;
        }
        throw iOException;
    }

    public final void A07(@Nullable InterfaceC0988Ht interfaceC0988Ht) {
        HandlerC0986Hr<? extends InterfaceC0987Hs> handlerC0986Hr = this.A00;
        if (handlerC0986Hr != null) {
            handlerC0986Hr.A07(true);
        }
        if (interfaceC0988Ht != null) {
            this.A02.execute(new RunnableC0989Hu(interfaceC0988Ht));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
