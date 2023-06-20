package mf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.kt */
/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: d  reason: collision with root package name */
    public static final f0 f34457d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f34458a;

    /* renamed from: b  reason: collision with root package name */
    private long f34459b;

    /* renamed from: c  reason: collision with root package name */
    private long f34460c;

    /* compiled from: Timeout.kt */
    /* loaded from: classes3.dex */
    public static final class a extends f0 {
        a() {
        }

        @Override // mf.f0
        public f0 d(long j10) {
            return this;
        }

        @Override // mf.f0
        public void f() {
        }

        @Override // mf.f0
        public f0 g(long j10, TimeUnit timeUnit) {
            qe.k.f(timeUnit, "unit");
            return this;
        }
    }

    /* compiled from: Timeout.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    static {
        new b(null);
        f34457d = new a();
    }

    public f0 a() {
        this.f34458a = false;
        return this;
    }

    public f0 b() {
        this.f34460c = 0L;
        return this;
    }

    public long c() {
        if (this.f34458a) {
            return this.f34459b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public f0 d(long j10) {
        this.f34458a = true;
        this.f34459b = j10;
        return this;
    }

    public boolean e() {
        return this.f34458a;
    }

    public void f() throws IOException {
        if (!Thread.interrupted()) {
            if (this.f34458a && this.f34459b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        Thread.currentThread().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public f0 g(long j10, TimeUnit timeUnit) {
        qe.k.f(timeUnit, "unit");
        if (j10 >= 0) {
            this.f34460c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f34460c;
    }
}
