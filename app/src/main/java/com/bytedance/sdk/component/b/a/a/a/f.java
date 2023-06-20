package com.bytedance.sdk.component.b.a.a.a;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.j;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import com.bytedance.sdk.component.b.a.n;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: NetResponse.java */
/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: a  reason: collision with root package name */
    HttpURLConnection f10001a;

    /* renamed from: b  reason: collision with root package name */
    k f10002b;

    public f(HttpURLConnection httpURLConnection, k kVar) {
        this.f10001a = httpURLConnection;
        this.f10002b = kVar;
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public long a() {
        return 0L;
    }

    public String a(String str) {
        return this.f10001a.getHeaderField(str);
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public long b() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public int c() {
        try {
            return this.f10001a.getResponseCode();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.bytedance.sdk.component.b.a.m, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            f().close();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public boolean d() {
        return c() >= 200 && c() < 300;
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public String e() throws IOException {
        return this.f10001a.getResponseMessage();
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public n f() {
        try {
            return new g(this.f10001a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public com.bytedance.sdk.component.b.a.e g() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f10001a.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || c() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new com.bytedance.sdk.component.b.a.e((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public j h() {
        return j.HTTP_1_1;
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.b.a.m
    public String a(String str, String str2) {
        return !TextUtils.isEmpty(a(str)) ? a(str) : str2;
    }
}
