package com.ironsource.mediationsdk.adunit.b;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class g extends f {
    public g(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.INIT_STARTED);
    }

    public final void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j10));
        a(b.INIT_ENDED, hashMap);
    }
}
