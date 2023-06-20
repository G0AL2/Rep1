package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;

/* loaded from: classes.dex */
public class i extends c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Context context, b bVar, d dVar) {
        super(CrashType.ENSURE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a10 = super.a(aVar);
        g(a10);
        s.a(a10, (Header) null, this.f6584a);
        return a10;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean a() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean c() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean d() {
        return false;
    }
}
