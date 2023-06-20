package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import n5.b;
import ye.b0;
import ye.d;
import ye.t;
import ye.z;

/* compiled from: ReactOkHttpNetworkFetcher.java */
/* loaded from: classes.dex */
class a extends b {

    /* renamed from: d  reason: collision with root package name */
    private final Executor f15556d;

    public a(z zVar) {
        super(zVar);
        this.f15556d = zVar.p().d();
    }

    private Map<String, String> n(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // n5.b, com.facebook.imagepipeline.producers.k0
    /* renamed from: i */
    public void a(b.c cVar, k0.a aVar) {
        cVar.f34643f = SystemClock.elapsedRealtime();
        Uri g10 = cVar.g();
        Map<String, String> n10 = cVar.b().k() instanceof r6.a ? n(((r6.a) cVar.b().k()).x()) : null;
        if (n10 == null) {
            n10 = Collections.emptyMap();
        }
        j(cVar, aVar, new b0.a().c(new d.a().e().a()).l(g10.toString()).f(t.f(n10)).d().b());
    }
}
