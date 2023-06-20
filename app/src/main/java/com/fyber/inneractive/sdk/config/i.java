package com.fyber.inneractive.sdk.config;

import android.content.Context;
import com.fyber.inneractive.sdk.network.f0;
import com.fyber.inneractive.sdk.network.m0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16986a;

    /* renamed from: b  reason: collision with root package name */
    public h f16987b = new h();

    /* renamed from: c  reason: collision with root package name */
    public List<b> f16988c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f16989d = false;

    /* renamed from: e  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.b f16990e = new com.fyber.inneractive.sdk.cache.b();

    /* loaded from: classes.dex */
    public class a implements com.fyber.inneractive.sdk.network.u<h> {
        public a() {
        }

        @Override // com.fyber.inneractive.sdk.network.u
        public void a(h hVar, Exception exc, boolean z10) {
            h hVar2 = hVar;
            if (hVar2 != null) {
                i iVar = i.this;
                iVar.getClass();
                if (hVar2.equals(iVar.f16987b)) {
                    return;
                }
                iVar.f16989d = true;
                iVar.f16987b = hVar2;
                for (b bVar : iVar.f16988c) {
                    bVar.onGlobalConfigChanged(iVar, iVar.f16987b);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onGlobalConfigChanged(i iVar, h hVar);
    }

    public i(Context context) {
        this.f16986a = context;
    }

    public h a() {
        return this.f16987b;
    }

    public void b() {
        f0 f0Var = new f0(new a(), this.f16986a, this.f16990e);
        IAConfigManager.J.f16884t.f17705a.offer(f0Var);
        f0Var.a(m0.QUEUED);
    }
}
