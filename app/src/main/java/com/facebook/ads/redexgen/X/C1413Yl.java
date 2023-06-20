package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Yl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1413Yl extends C07296m {
    public final Context A00;

    public C1413Yl(Context context, C6C c6c) {
        super(context, c6c);
        this.A00 = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A03(HashMap<String, C1414Ym> hashMap) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A0C);
    }

    public final InterfaceC07386v A0G(List<C07376u> list, EnumC07346r enumC07346r) {
        return new C1415Yn(this, list, enumC07346r);
    }
}
