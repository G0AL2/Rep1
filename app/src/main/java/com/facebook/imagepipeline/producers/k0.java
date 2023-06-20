package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public interface k0<FETCH_STATE extends w> {

    /* compiled from: NetworkFetcher.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b(Throwable th);

        void c(InputStream inputStream, int i10) throws IOException;
    }

    void a(FETCH_STATE fetch_state, a aVar);

    void b(FETCH_STATE fetch_state, int i10);

    boolean c(FETCH_STATE fetch_state);

    Map<String, String> d(FETCH_STATE fetch_state, int i10);

    FETCH_STATE e(l<w5.e> lVar, p0 p0Var);
}
