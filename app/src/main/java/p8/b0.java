package p8;

import java.io.IOException;
import p8.a0;

/* compiled from: TrueHdSampleRechunker.java */
/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f35615a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f35616b;

    /* renamed from: c  reason: collision with root package name */
    private int f35617c;

    /* renamed from: d  reason: collision with root package name */
    private long f35618d;

    /* renamed from: e  reason: collision with root package name */
    private int f35619e;

    /* renamed from: f  reason: collision with root package name */
    private int f35620f;

    /* renamed from: g  reason: collision with root package name */
    private int f35621g;

    public void a(a0 a0Var, a0.a aVar) {
        if (this.f35617c > 0) {
            a0Var.e(this.f35618d, this.f35619e, this.f35620f, this.f35621g, aVar);
            this.f35617c = 0;
        }
    }

    public void b() {
        this.f35616b = false;
        this.f35617c = 0;
    }

    public void c(a0 a0Var, long j10, int i10, int i11, int i12, a0.a aVar) {
        ea.a.g(this.f35621g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f35616b) {
            int i13 = this.f35617c;
            int i14 = i13 + 1;
            this.f35617c = i14;
            if (i13 == 0) {
                this.f35618d = j10;
                this.f35619e = i10;
                this.f35620f = 0;
            }
            this.f35620f += i11;
            this.f35621g = i12;
            if (i14 >= 16) {
                a(a0Var, aVar);
            }
        }
    }

    public void d(j jVar) throws IOException {
        if (this.f35616b) {
            return;
        }
        jVar.p(this.f35615a, 0, 10);
        jVar.f();
        if (l8.b.i(this.f35615a) == 0) {
            return;
        }
        this.f35616b = true;
    }
}
