package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.o;

/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: w  reason: collision with root package name */
    private static d f26720w;

    /* renamed from: x  reason: collision with root package name */
    private String f26721x;

    private d() {
        this.f26691r = "ironbeast";
        this.f26690q = 2;
        this.f26692s = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f26721x = "";
    }

    public static synchronized d d() {
        d dVar;
        synchronized (d.class) {
            if (f26720w == null) {
                d dVar2 = new d();
                f26720w = dVar2;
                dVar2.a();
            }
            dVar = f26720w;
        }
        return dVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final void b() {
        this.f26693t.add(2001);
        this.f26693t.add(2002);
        this.f26693t.add(2003);
        this.f26693t.add(2004);
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.f26693t.add(3001);
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_RELOAD_FAILED));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f26693t.add(3002);
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f26693t.add(3005);
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.BN_INSTANCE_SHOW));
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean c(c cVar) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final String d(int i10) {
        return this.f26721x;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean d(c cVar) {
        int a10 = cVar.a();
        return a10 == 2204 || a10 == 2004 || a10 == 2005 || a10 == 2301 || a10 == 2300 || a10 == 3009;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final int e(c cVar) {
        return o.a().b(b.e(cVar.a()) == b.a.BANNER.f26714f ? 3 : 2);
    }
}
