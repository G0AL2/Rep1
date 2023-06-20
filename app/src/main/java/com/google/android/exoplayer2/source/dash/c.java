package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import da.g0;
import da.l;
import da.p;
import java.io.IOException;
import m9.i;
import m9.j;

/* compiled from: DashUtil.java */
/* loaded from: classes2.dex */
public final class c {
    public static p a(j jVar, String str, i iVar, int i10) {
        return new p.b().i(iVar.b(str)).h(iVar.f34375a).g(iVar.f34376b).f(c(jVar, iVar)).b(i10).a();
    }

    public static m9.c b(l lVar, Uri uri) throws IOException {
        return (m9.c) g0.f(lVar, new m9.d(), uri, 4);
    }

    public static String c(j jVar, i iVar) {
        String a10 = jVar.a();
        return a10 != null ? a10 : iVar.b(jVar.f34380b.get(0).f34328a).toString();
    }
}
