package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.x;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final long f33596a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f33597b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f33598c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f33599d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f33600e;

    /* renamed from: f  reason: collision with root package name */
    public static n f33601f;

    static {
        long e10;
        int d10;
        int b10;
        int d11;
        int f10;
        int d12;
        long e11;
        e10 = x.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f33596a = e10;
        d10 = x.d("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, null);
        f33597b = d10;
        x.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        b10 = se.f.b(v.a(), 2);
        d11 = x.d("kotlinx.coroutines.scheduler.core.pool.size", b10, 1, 0, 8, null);
        f33598c = d11;
        f10 = se.f.f(v.a() * 128, d11, 2097150);
        d12 = x.d("kotlinx.coroutines.scheduler.max.pool.size", f10, 0, 2097150, 4, null);
        f33599d = d12;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e11 = x.e("kotlinx.coroutines.scheduler.keep.alive.sec", 5L, 0L, 0L, 12, null);
        f33600e = timeUnit.toNanos(e11);
        f33601f = g.f33587a;
    }
}
