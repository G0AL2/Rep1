package androidx.room;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: QueryInterceptorProgram.kt */
/* loaded from: classes.dex */
public final class f0 implements z0.i {

    /* renamed from: a  reason: collision with root package name */
    private final List<Object> f3908a = new ArrayList();

    private final void b(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        if (i11 >= this.f3908a.size() && (size = this.f3908a.size()) <= i11) {
            while (true) {
                this.f3908a.add(null);
                if (size == i11) {
                    break;
                }
                size++;
            }
        }
        this.f3908a.set(i11, obj);
    }

    @Override // z0.i
    public void A0(int i10, long j10) {
        b(i10, Long.valueOf(j10));
    }

    @Override // z0.i
    public void D0(int i10, byte[] bArr) {
        qe.k.f(bArr, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        b(i10, bArr);
    }

    @Override // z0.i
    public void P0(int i10) {
        b(i10, null);
    }

    public final List<Object> a() {
        return this.f3908a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // z0.i
    public void g(int i10, double d10) {
        b(i10, Double.valueOf(d10));
    }

    @Override // z0.i
    public void p0(int i10, String str) {
        qe.k.f(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        b(i10, str);
    }
}
