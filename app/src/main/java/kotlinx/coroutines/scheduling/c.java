package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.x;
import we.z;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: f  reason: collision with root package name */
    private static final z f33575f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f33576g;

    static {
        int b10;
        int d10;
        c cVar = new c();
        f33576g = cVar;
        b10 = se.f.b(64, v.a());
        d10 = x.d("kotlinx.coroutines.io.parallelism", b10, 0, 0, 12, null);
        f33575f = cVar.m0(d10);
    }

    private c() {
        super(0, 0, null, 7, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    public final z s0() {
        return f33575f;
    }

    @Override // we.z
    public String toString() {
        return "DefaultDispatcher";
    }
}
