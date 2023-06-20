package com.bytedance.sdk.component.b.a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: OkHttpClient.java */
/* loaded from: classes.dex */
public abstract class i implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public List<g> f10052a;

    /* renamed from: b  reason: collision with root package name */
    public long f10053b;

    /* renamed from: c  reason: collision with root package name */
    public TimeUnit f10054c;

    /* renamed from: d  reason: collision with root package name */
    public long f10055d;

    /* renamed from: e  reason: collision with root package name */
    public TimeUnit f10056e;

    /* renamed from: f  reason: collision with root package name */
    public long f10057f;

    /* renamed from: g  reason: collision with root package name */
    public TimeUnit f10058g;

    public i(a aVar) {
        this.f10053b = aVar.f10060b;
        this.f10055d = aVar.f10062d;
        this.f10057f = aVar.f10064f;
        List<g> list = aVar.f10059a;
        this.f10052a = list;
        this.f10054c = aVar.f10061c;
        this.f10056e = aVar.f10063e;
        this.f10058g = aVar.f10065g;
        this.f10052a = list;
    }

    public abstract b a(k kVar);

    public abstract d a();

    public a b() {
        return new a(this);
    }

    /* compiled from: OkHttpClient.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<g> f10059a;

        /* renamed from: b  reason: collision with root package name */
        public long f10060b;

        /* renamed from: c  reason: collision with root package name */
        public TimeUnit f10061c;

        /* renamed from: d  reason: collision with root package name */
        public long f10062d;

        /* renamed from: e  reason: collision with root package name */
        public TimeUnit f10063e;

        /* renamed from: f  reason: collision with root package name */
        public long f10064f;

        /* renamed from: g  reason: collision with root package name */
        public TimeUnit f10065g;

        public a() {
            this.f10059a = new ArrayList();
            this.f10060b = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f10061c = timeUnit;
            this.f10062d = 10000L;
            this.f10063e = timeUnit;
            this.f10064f = 10000L;
            this.f10065g = timeUnit;
        }

        public a a(long j10, TimeUnit timeUnit) {
            this.f10060b = j10;
            this.f10061c = timeUnit;
            return this;
        }

        public a b(long j10, TimeUnit timeUnit) {
            this.f10062d = j10;
            this.f10063e = timeUnit;
            return this;
        }

        public a c(long j10, TimeUnit timeUnit) {
            this.f10064f = j10;
            this.f10065g = timeUnit;
            return this;
        }

        public a a(g gVar) {
            this.f10059a.add(gVar);
            return this;
        }

        public i a() {
            return com.bytedance.sdk.component.b.a.a.a.a(this);
        }

        public a(i iVar) {
            this.f10059a = new ArrayList();
            this.f10060b = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f10061c = timeUnit;
            this.f10062d = 10000L;
            this.f10063e = timeUnit;
            this.f10064f = 10000L;
            this.f10065g = timeUnit;
            this.f10060b = iVar.f10053b;
            this.f10061c = iVar.f10054c;
            this.f10062d = iVar.f10055d;
            this.f10063e = iVar.f10056e;
            this.f10064f = iVar.f10057f;
            this.f10065g = iVar.f10058g;
        }
    }
}
