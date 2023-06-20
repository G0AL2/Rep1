package com.fyber.inneractive.sdk.network;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface b0<T> {

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    a0 a(InputStream inputStream, Map<String, List<String>> map, int i10) throws Exception;

    j a(String str) throws Exception;

    String a();

    void a(a0 a0Var, String str, String str2);

    void a(m0 m0Var);

    void a(T t10, Exception exc, boolean z10);

    void b();

    String c();

    boolean e();

    l0 f();

    com.fyber.inneractive.sdk.network.a<T> g();

    com.fyber.inneractive.sdk.config.global.s h();

    o0 i();

    boolean j();

    byte[] k();

    m0 l();

    String m();

    y n();

    int p();

    Map<String, String> q();
}
