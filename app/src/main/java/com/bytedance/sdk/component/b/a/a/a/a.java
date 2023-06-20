package com.bytedance.sdk.component.b.a.a.a;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NetCall.java */
/* loaded from: classes.dex */
public class a implements com.bytedance.sdk.component.b.a.b {

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f9984c = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    k f9985a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.sdk.component.b.a.d f9986b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(k kVar, com.bytedance.sdk.component.b.a.d dVar) {
        this.f9985a = kVar;
        this.f9986b = dVar;
    }

    private boolean c() {
        if (this.f9985a.d() == null) {
            return false;
        }
        return this.f9985a.d().containsKey("Content-Type");
    }

    @Override // com.bytedance.sdk.component.b.a.b
    public m a() throws IOException {
        List<com.bytedance.sdk.component.b.a.g> list;
        this.f9986b.c().remove(this);
        this.f9986b.d().add(this);
        if (this.f9986b.c().size() + this.f9986b.d().size() <= this.f9986b.a() && !f9984c.get()) {
            i iVar = this.f9985a.f10072a;
            if (iVar != null && (list = iVar.f10052a) != null && list.size() > 0) {
                ArrayList arrayList = new ArrayList(this.f9985a.f10072a.f10052a);
                arrayList.add(new com.bytedance.sdk.component.b.a.g() { // from class: com.bytedance.sdk.component.b.a.a.a.a.1
                    @Override // com.bytedance.sdk.component.b.a.g
                    public m a(g.a aVar) throws IOException {
                        return a.this.a(aVar.a());
                    }
                });
                return ((com.bytedance.sdk.component.b.a.g) arrayList.get(0)).a(new b(arrayList, this.f9985a));
            }
            return a(this.f9985a);
        }
        this.f9986b.d().remove(this);
        return null;
    }

    /* renamed from: b */
    public com.bytedance.sdk.component.b.a.b clone() {
        return new a(this.f9985a, this.f9986b);
    }

    public m a(k kVar) throws IOException {
        HttpURLConnection httpURLConnection;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(kVar.b().a().toString()).openConnection();
                if (kVar.d() != null && kVar.d().size() > 0) {
                    for (Map.Entry<String, List<String>> entry : kVar.d().entrySet()) {
                        for (String str : entry.getValue()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), str);
                        }
                    }
                }
                if (kVar.f() == null) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    if (!c() && kVar.f().f10080a != null && !TextUtils.isEmpty(kVar.f().f10080a.a())) {
                        httpURLConnection.addRequestProperty("Content-Type", kVar.f().f10080a.a());
                    }
                    httpURLConnection.setRequestMethod(kVar.c());
                    if ("POST".equalsIgnoreCase(kVar.c())) {
                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        outputStream.write(kVar.f().f10081b.getBytes());
                        outputStream.flush();
                        outputStream.close();
                    }
                }
                i iVar = kVar.f10072a;
                if (iVar != null) {
                    TimeUnit timeUnit = iVar.f10054c;
                    if (timeUnit != null) {
                        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(iVar.f10053b));
                    }
                    i iVar2 = kVar.f10072a;
                    if (iVar2.f10054c != null) {
                        httpURLConnection.setReadTimeout((int) iVar2.f10056e.toMillis(iVar2.f10055d));
                    }
                }
                httpURLConnection.connect();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            if (f9984c.get()) {
                httpURLConnection.disconnect();
                this.f9986b.d().remove(this);
                return null;
            }
            return new f(httpURLConnection, kVar);
        } finally {
            this.f9986b.d().remove(this);
        }
    }

    @Override // com.bytedance.sdk.component.b.a.b
    public void a(final com.bytedance.sdk.component.b.a.c cVar) {
        this.f9986b.b().submit(new Runnable() { // from class: com.bytedance.sdk.component.b.a.a.a.a.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    m a10 = a.this.a();
                    if (a10 == null) {
                        cVar.a(a.this, new IOException("response is null"));
                    } else {
                        cVar.a(a.this, a10);
                    }
                } catch (IOException e10) {
                    e10.printStackTrace();
                    cVar.a(a.this, e10);
                }
            }
        });
    }
}
