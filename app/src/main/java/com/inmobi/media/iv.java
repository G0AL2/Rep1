package com.inmobi.media;

/* compiled from: SessionManager.java */
/* loaded from: classes3.dex */
public class iv {

    /* renamed from: g  reason: collision with root package name */
    private static final String f25800g = "iv";

    /* renamed from: a  reason: collision with root package name */
    long f25801a;

    /* renamed from: b  reason: collision with root package name */
    long f25802b;

    /* renamed from: c  reason: collision with root package name */
    long f25803c;

    /* renamed from: d  reason: collision with root package name */
    long f25804d;

    /* renamed from: e  reason: collision with root package name */
    long f25805e;

    /* renamed from: f  reason: collision with root package name */
    long f25806f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SessionManager.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final iv f25807a = new iv((byte) 0);
    }

    /* synthetic */ iv(byte b10) {
        this();
    }

    public static iv a() {
        return a.f25807a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b() {
        iw.a();
        if (iw.e().sessionEnabled) {
            ih.a().f25771c = System.currentTimeMillis();
        }
    }

    private void d(long j10) {
        this.f25801a += j10;
    }

    private void e(long j10) {
        this.f25802b += j10;
    }

    private void f(long j10) {
        this.f25803c += j10;
    }

    private void g(long j10) {
        this.f25804d += j10;
    }

    public final void c(long j10) {
        this.f25805e += j10;
    }

    private iv() {
        this.f25801a = 0L;
        this.f25802b = 0L;
        this.f25803c = 0L;
        this.f25804d = 0L;
        this.f25805e = 0L;
        this.f25806f = 0L;
    }

    public final void a(long j10) {
        int a10 = ib.a();
        if (a10 == 0) {
            f(j10);
        } else if (a10 != 1) {
        } else {
            d(j10);
        }
    }

    public final void b(long j10) {
        int a10 = ib.a();
        if (a10 == 0) {
            g(j10);
        } else if (a10 != 1) {
        } else {
            e(j10);
        }
    }
}
