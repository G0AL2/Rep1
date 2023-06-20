package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.m;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private String f8643a;

    /* renamed from: b  reason: collision with root package name */
    private String f8644b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f8645c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f8646d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f8647e;

    /* renamed from: f  reason: collision with root package name */
    private String f8648f;

    /* renamed from: g  reason: collision with root package name */
    private final T f8649g;

    /* renamed from: h  reason: collision with root package name */
    private final int f8650h;

    /* renamed from: i  reason: collision with root package name */
    private int f8651i;

    /* renamed from: j  reason: collision with root package name */
    private final int f8652j;

    /* renamed from: k  reason: collision with root package name */
    private final int f8653k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f8654l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f8655m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f8656n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f8657o;

    /* loaded from: classes.dex */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        String f8658a;

        /* renamed from: b  reason: collision with root package name */
        String f8659b;

        /* renamed from: c  reason: collision with root package name */
        String f8660c;

        /* renamed from: e  reason: collision with root package name */
        Map<String, String> f8662e;

        /* renamed from: f  reason: collision with root package name */
        JSONObject f8663f;

        /* renamed from: g  reason: collision with root package name */
        T f8664g;

        /* renamed from: i  reason: collision with root package name */
        int f8666i;

        /* renamed from: j  reason: collision with root package name */
        int f8667j;

        /* renamed from: k  reason: collision with root package name */
        boolean f8668k;

        /* renamed from: l  reason: collision with root package name */
        boolean f8669l;

        /* renamed from: m  reason: collision with root package name */
        boolean f8670m;

        /* renamed from: n  reason: collision with root package name */
        boolean f8671n;

        /* renamed from: h  reason: collision with root package name */
        int f8665h = 1;

        /* renamed from: d  reason: collision with root package name */
        Map<String, String> f8661d = new HashMap();

        public a(m mVar) {
            this.f8666i = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cO)).intValue();
            this.f8667j = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cN)).intValue();
            this.f8669l = ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cM)).booleanValue();
            this.f8670m = ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ep)).booleanValue();
            this.f8671n = ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eu)).booleanValue();
        }

        public a<T> a(int i10) {
            this.f8665h = i10;
            return this;
        }

        public a<T> a(T t10) {
            this.f8664g = t10;
            return this;
        }

        public a<T> a(String str) {
            this.f8659b = str;
            return this;
        }

        public a<T> a(Map<String, String> map) {
            this.f8661d = map;
            return this;
        }

        public a<T> a(JSONObject jSONObject) {
            this.f8663f = jSONObject;
            return this;
        }

        public a<T> a(boolean z10) {
            this.f8668k = z10;
            return this;
        }

        public c<T> a() {
            return new c<>(this);
        }

        public a<T> b(int i10) {
            this.f8666i = i10;
            return this;
        }

        public a<T> b(String str) {
            this.f8658a = str;
            return this;
        }

        public a<T> b(Map<String, String> map) {
            this.f8662e = map;
            return this;
        }

        public a<T> b(boolean z10) {
            this.f8669l = z10;
            return this;
        }

        public a<T> c(int i10) {
            this.f8667j = i10;
            return this;
        }

        public a<T> c(String str) {
            this.f8660c = str;
            return this;
        }

        public a<T> c(boolean z10) {
            this.f8670m = z10;
            return this;
        }

        public a<T> d(boolean z10) {
            this.f8671n = z10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(a<T> aVar) {
        this.f8643a = aVar.f8659b;
        this.f8644b = aVar.f8658a;
        this.f8645c = aVar.f8661d;
        this.f8646d = aVar.f8662e;
        this.f8647e = aVar.f8663f;
        this.f8648f = aVar.f8660c;
        this.f8649g = aVar.f8664g;
        int i10 = aVar.f8665h;
        this.f8650h = i10;
        this.f8651i = i10;
        this.f8652j = aVar.f8666i;
        this.f8653k = aVar.f8667j;
        this.f8654l = aVar.f8668k;
        this.f8655m = aVar.f8669l;
        this.f8656n = aVar.f8670m;
        this.f8657o = aVar.f8671n;
    }

    public static <T> a<T> a(m mVar) {
        return new a<>(mVar);
    }

    public String a() {
        return this.f8643a;
    }

    public void a(int i10) {
        this.f8651i = i10;
    }

    public void a(String str) {
        this.f8643a = str;
    }

    public String b() {
        return this.f8644b;
    }

    public void b(String str) {
        this.f8644b = str;
    }

    public Map<String, String> c() {
        return this.f8645c;
    }

    public Map<String, String> d() {
        return this.f8646d;
    }

    public JSONObject e() {
        return this.f8647e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f8643a;
            if (str == null ? cVar.f8643a == null : str.equals(cVar.f8643a)) {
                Map<String, String> map = this.f8645c;
                if (map == null ? cVar.f8645c == null : map.equals(cVar.f8645c)) {
                    Map<String, String> map2 = this.f8646d;
                    if (map2 == null ? cVar.f8646d == null : map2.equals(cVar.f8646d)) {
                        String str2 = this.f8648f;
                        if (str2 == null ? cVar.f8648f == null : str2.equals(cVar.f8648f)) {
                            String str3 = this.f8644b;
                            if (str3 == null ? cVar.f8644b == null : str3.equals(cVar.f8644b)) {
                                JSONObject jSONObject = this.f8647e;
                                if (jSONObject == null ? cVar.f8647e == null : jSONObject.equals(cVar.f8647e)) {
                                    T t10 = this.f8649g;
                                    if (t10 == null ? cVar.f8649g == null : t10.equals(cVar.f8649g)) {
                                        return this.f8650h == cVar.f8650h && this.f8651i == cVar.f8651i && this.f8652j == cVar.f8652j && this.f8653k == cVar.f8653k && this.f8654l == cVar.f8654l && this.f8655m == cVar.f8655m && this.f8656n == cVar.f8656n && this.f8657o == cVar.f8657o;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public String f() {
        return this.f8648f;
    }

    public T g() {
        return this.f8649g;
    }

    public int h() {
        return this.f8651i;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f8643a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8648f;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8644b;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        T t10 = this.f8649g;
        int hashCode5 = ((((((((((((((((hashCode4 + (t10 != null ? t10.hashCode() : 0)) * 31) + this.f8650h) * 31) + this.f8651i) * 31) + this.f8652j) * 31) + this.f8653k) * 31) + (this.f8654l ? 1 : 0)) * 31) + (this.f8655m ? 1 : 0)) * 31) + (this.f8656n ? 1 : 0)) * 31) + (this.f8657o ? 1 : 0);
        Map<String, String> map = this.f8645c;
        if (map != null) {
            hashCode5 = (hashCode5 * 31) + map.hashCode();
        }
        Map<String, String> map2 = this.f8646d;
        if (map2 != null) {
            hashCode5 = (hashCode5 * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f8647e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (hashCode5 * 31) + new String(charArray).hashCode();
        }
        return hashCode5;
    }

    public int i() {
        return this.f8650h - this.f8651i;
    }

    public int j() {
        return this.f8652j;
    }

    public int k() {
        return this.f8653k;
    }

    public boolean l() {
        return this.f8654l;
    }

    public boolean m() {
        return this.f8655m;
    }

    public boolean n() {
        return this.f8656n;
    }

    public boolean o() {
        return this.f8657o;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f8643a + ", backupEndpoint=" + this.f8648f + ", httpMethod=" + this.f8644b + ", httpHeaders=" + this.f8646d + ", body=" + this.f8647e + ", emptyResponse=" + this.f8649g + ", initialRetryAttempts=" + this.f8650h + ", retryAttemptsLeft=" + this.f8651i + ", timeoutMillis=" + this.f8652j + ", retryDelayMillis=" + this.f8653k + ", exponentialRetries=" + this.f8654l + ", retryOnAllErrors=" + this.f8655m + ", encodingEnabled=" + this.f8656n + ", gzipBodyEncoding=" + this.f8657o + '}';
    }
}
