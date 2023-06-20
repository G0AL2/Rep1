package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.d;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* loaded from: classes.dex */
public class l extends a {
    public l(Map<String, String> map, com.fyber.inneractive.sdk.web.d dVar, p0 p0Var) {
        super(map, dVar, p0Var);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public void a() {
        d0.a aVar;
        String str = this.f17489b.get(ImagesContract.URL);
        IAlog.d("IAmraidActionOpen: opening Internal Browser For Url: %s", str);
        com.fyber.inneractive.sdk.web.d dVar = this.f17490c;
        if (dVar != null) {
            p0 p0Var = this.f17491d;
            L l10 = dVar.f20370g;
            if (l10 != 0) {
                aVar = ((d.f) l10).a(str, p0Var);
            } else {
                aVar = new d0.a(d0.c.FAILED, new Exception("No webview listener available"), dVar.g() == null ? "null" : dVar.g().getClass().getName());
            }
            if (aVar.f20243a == d0.c.FAILED) {
                com.fyber.inneractive.sdk.web.d dVar2 = this.f17490c;
                f fVar = f.OPEN;
                Throwable th = aVar.f20244b;
                dVar2.a(fVar, th == null ? "unknown error" : th.getMessage());
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public String c() {
        return this.f17489b.get(ImagesContract.URL);
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public void d() {
        com.fyber.inneractive.sdk.web.d dVar = this.f17490c;
        if (dVar != null) {
            dVar.a(f.OPEN, "No native click was detected in a timely fashion");
        }
    }
}
