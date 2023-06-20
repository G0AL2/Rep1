package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;

/* loaded from: assets/audience_network.dex */
public final class ZF extends C07296m {
    public ZF(Context context, C6C c6c) {
        super(context, c6c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A02(HashMap<String, ZG> hashMap) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A0C);
    }

    public final InterfaceC07386v A0G() {
        return new ZH(this);
    }
}
