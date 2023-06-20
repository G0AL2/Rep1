package com.fyber.inneractive.sdk.network;

import android.os.Build;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class g0 extends e0<String> {

    /* renamed from: g  reason: collision with root package name */
    public String f17562g;

    /* renamed from: h  reason: collision with root package name */
    public final String f17563h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f17564i;

    public g0(u<String> uVar, String str, String str2, g gVar) {
        super(uVar, gVar);
        this.f17564i = new AtomicInteger();
        this.f17563h = str;
        this.f17562g = str2;
        this.f17551c = gVar;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String a() {
        return this.f17563h;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public l0 f() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public boolean j() {
        return this.f17564i.getAndIncrement() < 4;
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public byte[] k() {
        byte[] bytes;
        try {
            IAlog.a("NetworkRequestEvent: network request body %s", this.f17562g);
            if (Build.VERSION.SDK_INT >= 19) {
                bytes = this.f17562g.getBytes(StandardCharsets.UTF_8);
            } else {
                bytes = this.f17562g.getBytes("UTF-8");
            }
            return bytes;
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public y n() {
        return y.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public int p() {
        return ((int) Math.pow(2.0d, this.f17564i.get())) * 1000;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.network.b0
    public a0 a(InputStream inputStream, Map<String, List<String>> map, int i10) throws Exception {
        try {
            a0 a0Var = new a0();
            a0Var.f17523a = String.valueOf(i10);
            return a0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse event network request", e10, new Object[0]);
            throw new z(e10);
        }
    }
}
