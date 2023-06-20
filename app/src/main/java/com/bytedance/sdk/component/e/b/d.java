package com.bytedance.sdk.component.e.b;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.b.a.h;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.l;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: PostExecutor.java */
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: a  reason: collision with root package name */
    l f10323a;

    public d(i iVar) {
        super(iVar);
        this.f10323a = null;
    }

    public void a(JSONObject jSONObject) {
        this.f10323a = l.a(h.a("application/json; charset=utf-8"), jSONObject != null ? jSONObject.toString() : JsonUtils.EMPTY_JSON);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.f10323a = l.a(h.a("application/json; charset=utf-8"), str);
    }

    public void a(final com.bytedance.sdk.component.e.a.a aVar) {
        try {
            k.a aVar2 = new k.a();
            if (TextUtils.isEmpty(this.f10322f)) {
                aVar.a(this, new IOException("Url is Empty"));
                return;
            }
            aVar2.a(this.f10322f);
            if (this.f10323a == null) {
                if (aVar != null) {
                    aVar.a(this, new IOException("RequestBody is null, content type is not support!!"));
                    return;
                }
                return;
            }
            a(aVar2);
            aVar2.a((Object) b());
            this.f10319c.a(aVar2.a(this.f10323a).b()).a(new com.bytedance.sdk.component.b.a.c() { // from class: com.bytedance.sdk.component.e.b.d.1
                @Override // com.bytedance.sdk.component.b.a.c
                public void a(com.bytedance.sdk.component.b.a.b bVar, IOException iOException) {
                    com.bytedance.sdk.component.e.a.a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.a(d.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.b.a.c
                public void a(com.bytedance.sdk.component.b.a.b bVar, m mVar) throws IOException {
                    if (aVar != null) {
                        HashMap hashMap = new HashMap();
                        if (mVar != null) {
                            e g10 = mVar.g();
                            if (g10 != null) {
                                for (int i10 = 0; i10 < g10.a(); i10++) {
                                    hashMap.put(g10.a(i10), g10.b(i10));
                                }
                            }
                            aVar.a(d.this, new com.bytedance.sdk.component.e.b(mVar.d(), mVar.c(), mVar.e(), hashMap, mVar.f().b(), mVar.b(), mVar.a()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            aVar.a(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.e.b a() {
        k.a aVar;
        try {
            aVar = new k.a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (TextUtils.isEmpty(this.f10322f)) {
            com.bytedance.sdk.component.e.d.d.b("PostExecutor", "execute: Url is Empty");
            return null;
        }
        aVar.a(this.f10322f);
        if (this.f10323a == null) {
            com.bytedance.sdk.component.e.d.d.b("PostExecutor", "RequestBody is null, content type is not support!!");
            return null;
        }
        a(aVar);
        aVar.a((Object) b());
        m a10 = this.f10319c.a(aVar.a(this.f10323a).b()).a();
        if (a10 != null) {
            HashMap hashMap = new HashMap();
            e g10 = a10.g();
            if (g10 != null) {
                for (int i10 = 0; i10 < g10.a(); i10++) {
                    hashMap.put(g10.a(i10), g10.b(i10));
                }
                return new com.bytedance.sdk.component.e.b(a10.d(), a10.c(), a10.e(), hashMap, a10.f().b(), a10.b(), a10.a());
            }
        }
        return null;
    }
}
