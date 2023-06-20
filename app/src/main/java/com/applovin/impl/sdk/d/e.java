package com.applovin.impl.sdk.d;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private long f8311a;

    /* renamed from: b  reason: collision with root package name */
    private long f8312b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8313c;

    /* renamed from: d  reason: collision with root package name */
    private long f8314d;

    /* renamed from: e  reason: collision with root package name */
    private long f8315e;

    /* renamed from: f  reason: collision with root package name */
    private int f8316f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f8317g;

    public void a() {
        this.f8313c = true;
    }

    public void a(int i10) {
        this.f8316f = i10;
    }

    public void a(long j10) {
        this.f8311a += j10;
    }

    public void a(Exception exc) {
        this.f8317g = exc;
    }

    public void b(long j10) {
        this.f8312b += j10;
    }

    public boolean b() {
        return this.f8313c;
    }

    public long c() {
        return this.f8311a;
    }

    public long d() {
        return this.f8312b;
    }

    public void e() {
        this.f8314d++;
    }

    public void f() {
        this.f8315e++;
    }

    public long g() {
        return this.f8314d;
    }

    public long h() {
        return this.f8315e;
    }

    public Exception i() {
        return this.f8317g;
    }

    public int j() {
        return this.f8316f;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f8311a + ", totalCachedBytes=" + this.f8312b + ", isHTMLCachingCancelled=" + this.f8313c + ", htmlResourceCacheSuccessCount=" + this.f8314d + ", htmlResourceCacheFailureCount=" + this.f8315e + '}';
    }
}
