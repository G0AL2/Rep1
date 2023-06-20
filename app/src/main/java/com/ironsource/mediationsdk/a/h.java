package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.a.b;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.o;

/* loaded from: classes3.dex */
public final class h extends b {

    /* renamed from: w  reason: collision with root package name */
    private static h f26728w;

    /* renamed from: x  reason: collision with root package name */
    private String f26729x;

    private h() {
        this.f26691r = "outcome";
        this.f26690q = 3;
        this.f26692s = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f26729x = "";
    }

    public static synchronized h d() {
        h hVar;
        synchronized (h.class) {
            if (f26728w == null) {
                h hVar2 = new h();
                f26728w = hVar2;
                hVar2.a();
            }
            hVar = f26728w;
        }
        return hVar;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final void b() {
        this.f26693t.add(1000);
        this.f26693t.add(1001);
        this.f26693t.add(1002);
        this.f26693t.add(1003);
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
        this.f26693t.add(Integer.valueOf((int) IronSourceConstants.RV_MEDIATION_LOAD_ERROR));
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean c(c cVar) {
        return cVar.a() == 305;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final String d(int i10) {
        return (i10 == 15 || (i10 >= 300 && i10 < 400)) ? this.f26729x : "";
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final boolean d(c cVar) {
        int a10 = cVar.a();
        return a10 == 14 || a10 == 514 || a10 == 305 || a10 == 1003 || a10 == 1005 || a10 == 1203 || a10 == 1010 || a10 == 1301 || a10 == 1302;
    }

    @Override // com.ironsource.mediationsdk.a.b
    protected final int e(c cVar) {
        return o.a().b((b.e(cVar.a()) == b.a.OFFERWALL.f26714f ? 1 : 0) ^ 1);
    }
}
