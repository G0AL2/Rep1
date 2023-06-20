package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ye.t;
import ye.u;

/* compiled from: ReactCookieJarContainer.java */
/* loaded from: classes.dex */
public class l implements a {

    /* renamed from: b  reason: collision with root package name */
    private ye.n f15605b = null;

    @Override // ye.n
    public List<ye.m> a(u uVar) {
        ye.n nVar = this.f15605b;
        if (nVar != null) {
            List<ye.m> a10 = nVar.a(uVar);
            ArrayList arrayList = new ArrayList();
            for (ye.m mVar : a10) {
                try {
                    new t.a().a(mVar.e(), mVar.g());
                    arrayList.add(mVar);
                } catch (IllegalArgumentException unused) {
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.react.modules.network.a
    public void b() {
        this.f15605b = null;
    }

    @Override // ye.n
    public void c(u uVar, List<ye.m> list) {
        ye.n nVar = this.f15605b;
        if (nVar != null) {
            nVar.c(uVar, list);
        }
    }

    @Override // com.facebook.react.modules.network.a
    public void d(ye.n nVar) {
        this.f15605b = nVar;
    }
}
