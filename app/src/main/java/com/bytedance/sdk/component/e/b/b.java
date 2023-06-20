package com.bytedance.sdk.component.e.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.a;
import com.bytedance.sdk.component.b.a.e;
import com.bytedance.sdk.component.b.a.f;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: GetExecutor.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public static final com.bytedance.sdk.component.b.a.a f10312a = new a.C0154a().a().b();

    /* renamed from: b  reason: collision with root package name */
    public static final com.bytedance.sdk.component.b.a.a f10313b = new a.C0154a().b();

    /* renamed from: g  reason: collision with root package name */
    private com.bytedance.sdk.component.b.a.a f10314g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f10315h;

    public b(i iVar) {
        super(iVar);
        this.f10314g = f10312a;
        this.f10315h = new HashMap();
    }

    public void a(String str, String str2) {
        if (str == null) {
            com.bytedance.sdk.component.e.d.d.b("GetExecutor", "name cannot be null !!!");
        } else {
            this.f10315h.put(str, str2);
        }
    }

    public void a(final com.bytedance.sdk.component.e.a.a aVar) {
        try {
            k.a aVar2 = new k.a();
            f.a aVar3 = new f.a();
            Uri parse = Uri.parse(this.f10322f);
            aVar3.a(parse.getScheme());
            aVar3.b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar3.c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String str : queryParameterNames) {
                    this.f10315h.put(str, parse.getQueryParameter(str));
                }
            }
            for (Map.Entry<String, String> entry : this.f10315h.entrySet()) {
                aVar3.a(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            a(aVar2);
            aVar2.a(this.f10314g);
            aVar2.a((Object) b());
            this.f10319c.a(aVar2.a(aVar3.b()).a().b()).a(new com.bytedance.sdk.component.b.a.c() { // from class: com.bytedance.sdk.component.e.b.b.1
                @Override // com.bytedance.sdk.component.b.a.c
                public void a(com.bytedance.sdk.component.b.a.b bVar, IOException iOException) {
                    com.bytedance.sdk.component.e.a.a aVar4 = aVar;
                    if (aVar4 != null) {
                        aVar4.a(b.this, iOException);
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
                            aVar.a(b.this, new com.bytedance.sdk.component.e.b(mVar.d(), mVar.c(), mVar.e(), hashMap, mVar.f().b(), mVar.b(), mVar.a()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            if (aVar != null) {
                aVar.a(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.e.b a() {
        try {
            k.a aVar = new k.a();
            f.a aVar2 = new f.a();
            Uri parse = Uri.parse(this.f10322f);
            aVar2.a(parse.getScheme());
            aVar2.b(parse.getHost());
            String encodedPath = parse.getEncodedPath();
            if (!TextUtils.isEmpty(encodedPath)) {
                if (encodedPath.startsWith("/")) {
                    encodedPath = encodedPath.substring(1);
                }
                aVar2.c(encodedPath);
            }
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String str : queryParameterNames) {
                    this.f10315h.put(str, parse.getQueryParameter(str));
                }
            }
            for (Map.Entry<String, String> entry : this.f10315h.entrySet()) {
                aVar2.a(URLEncoder.encode(entry.getKey(), "UTF-8"), URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            a(aVar);
            aVar.a(this.f10314g);
            aVar.a((Object) b());
            m a10 = this.f10319c.a(aVar.a(aVar2.b()).a().b()).a();
            if (a10 != null) {
                HashMap hashMap = new HashMap();
                e g10 = a10.g();
                if (g10 != null) {
                    for (int i10 = 0; i10 < g10.a(); i10++) {
                        hashMap.put(g10.a(i10), g10.b(i10));
                    }
                }
                return new com.bytedance.sdk.component.e.b(a10.d(), a10.c(), a10.e(), hashMap, a10.f().b(), a10.b(), a10.a());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
