package com.fyber.inneractive.sdk.network;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class f0<T> extends e0<T> {

    /* renamed from: g  reason: collision with root package name */
    public final Context f17559g;

    /* renamed from: h  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a<T> f17560h;

    /* renamed from: i  reason: collision with root package name */
    public t<T> f17561i;

    public f0(u<T> uVar, Context context, com.fyber.inneractive.sdk.cache.a<T> aVar) {
        super(uVar, v.b().a());
        this.f17559g = context;
        this.f17560h = aVar;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public a0 a(InputStream inputStream, Map<String, List<String>> map, int i10) throws Exception {
        a0 a0Var = new a0();
        try {
            String stringBuffer = com.fyber.inneractive.sdk.util.s.a(inputStream, false).toString();
            a0Var.f17523a = this.f17560h.a(stringBuffer);
            a0Var.f17524b = stringBuffer;
            return a0Var;
        } catch (Exception e10) {
            IAlog.a("failed parse cacheable network request", e10, new Object[0]);
            if (e10 instanceof InvalidAppIdException) {
                throw e10;
            }
            throw new z(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public String c() {
        return this.f17560h.c();
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public l0 f() {
        return l0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public a<T> g() {
        com.fyber.inneractive.sdk.cache.h hVar;
        Context context = this.f17559g;
        com.fyber.inneractive.sdk.cache.a<T> aVar = this.f17560h;
        t<T> tVar = new t<>(context, aVar);
        this.f17561i = tVar;
        try {
            if (!aVar.d()) {
                hVar = new com.fyber.inneractive.sdk.cache.h(new t.a());
            } else {
                T a10 = tVar.f17700b.a(tVar.a(tVar.f17700b.c()));
                if (tVar.f17701c == null) {
                    tVar.f17701c = context.getSharedPreferences("IAConfigurationPreferences", 0);
                }
                hVar = new com.fyber.inneractive.sdk.cache.h(a10, tVar.f17701c.getString(tVar.f17700b.b(), null));
            }
        } catch (Exception e10) {
            if (tVar.f17701c == null) {
                tVar.f17701c = tVar.f17699a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f17701c.edit().remove(tVar.f17700b.b()).apply();
            hVar = new com.fyber.inneractive.sdk.cache.h(e10);
        }
        return new a<>(hVar.f16830b, hVar.f16829a, this.f17560h.c());
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public boolean j() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public y n() {
        return y.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public int p() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.b0
    public String a() {
        return this.f17560h.a();
    }

    @Override // com.fyber.inneractive.sdk.network.e0, com.fyber.inneractive.sdk.network.b0
    public void a(a0 a0Var, String str, String str2) {
        t<T> tVar = this.f17561i;
        if (tVar != null) {
            if (tVar.f17701c == null) {
                tVar.f17701c = tVar.f17699a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            tVar.f17701c.edit().putString(tVar.f17700b.b(), str2).apply();
            if (a0Var.f17524b.isEmpty() || str.isEmpty()) {
                return;
            }
            if (!this.f17561i.a(str, a0Var.f17524b)) {
                IAlog.b("Failed to cache file", new Object[0]);
            } else {
                this.f17560h.a((com.fyber.inneractive.sdk.cache.a<T>) a0Var.f17523a);
            }
        }
    }
}
