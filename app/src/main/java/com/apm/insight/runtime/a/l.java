package com.apm.insight.runtime.a;

import android.content.Context;
import com.apm.insight.CrashType;
import com.apm.insight.entity.Header;
import com.apm.insight.l.s;
import com.apm.insight.nativecrash.NativeCrashCollector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Context context, b bVar, d dVar) {
        super(CrashType.NATIVE, context, bVar, dVar);
    }

    @Override // com.apm.insight.runtime.a.c
    public com.apm.insight.entity.a a(int i10, com.apm.insight.entity.a aVar) {
        com.apm.insight.entity.a a10 = super.a(i10, aVar);
        if (i10 == 0) {
            Header a11 = Header.a(this.f6585b);
            a11.c();
            a10.a(a11);
            s.a(a10, a11, this.f6584a);
        } else if (i10 == 1) {
            Header i11 = a10.i();
            i11.d();
            i11.e();
        } else if (i10 == 2) {
            Header.a(a10.i());
        }
        return a10;
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean a() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    public int b() {
        return NativeCrashCollector.a();
    }

    @Override // com.apm.insight.runtime.a.c
    protected boolean d() {
        return false;
    }

    @Override // com.apm.insight.runtime.a.c
    protected void h(com.apm.insight.entity.a aVar) {
    }
}
