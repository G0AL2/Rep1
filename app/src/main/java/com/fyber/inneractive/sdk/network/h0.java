package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class h0 extends e0<String> {

    /* renamed from: g  reason: collision with root package name */
    public final String f17565g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicInteger f17566h;

    public h0(u<String> uVar, String str) {
        this(uVar, str, v.b().a());
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String a() {
        return this.f17565g;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public l0 f() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public boolean j() {
        return this.f17566h.getAndIncrement() < 4;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public y n() {
        return y.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public int p() {
        return ((int) Math.pow(2.0d, this.f17566h.get())) * 1000;
    }

    public h0(u<String> uVar, String str, g gVar) {
        super(uVar, gVar);
        this.f17566h = new AtomicInteger();
        this.f17565g = str;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.network.b0
    public a0 a(InputStream inputStream, Map<String, List<String>> map, int i10) throws Exception {
        try {
            a0 a0Var = new a0();
            a0Var.f17523a = String.valueOf(i10);
            if (inputStream != null) {
                a0Var.f17524b = com.fyber.inneractive.sdk.util.s.a(inputStream, false).toString();
            }
            return a0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse hit network request", e10, new Object[0]);
            throw new z(e10);
        }
    }
}
