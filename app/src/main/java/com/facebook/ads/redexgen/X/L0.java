package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class L0 {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC1068Ky> A02 = new AtomicReference<>();

    @SuppressLint({"RethrownThrowableArgument"})
    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            LF.A00().A8p(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, th);
            InterfaceC1068Ky interfaceC1068Ky = A02.get();
            if (interfaceC1068Ky != null) {
                interfaceC1068Ky.AE0(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z10, InterfaceC1068Ky interfaceC1068Ky) {
        A01.set(z10);
        A02.set(interfaceC1068Ky);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
