package i9;

/* compiled from: CompositeSequenceableLoader.java */
/* loaded from: classes2.dex */
public class g implements p0 {

    /* renamed from: a  reason: collision with root package name */
    protected final p0[] f31621a;

    public g(p0[] p0VarArr) {
        this.f31621a = p0VarArr;
    }

    @Override // i9.p0
    public final long b() {
        long j10 = Long.MAX_VALUE;
        for (p0 p0Var : this.f31621a) {
            long b10 = p0Var.b();
            if (b10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, b10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // i9.p0
    public boolean c() {
        for (p0 p0Var : this.f31621a) {
            if (p0Var.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // i9.p0
    public boolean d(long j10) {
        p0[] p0VarArr;
        boolean z10;
        boolean z11 = false;
        do {
            long b10 = b();
            if (b10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (p0 p0Var : this.f31621a) {
                long b11 = p0Var.b();
                boolean z12 = b11 != Long.MIN_VALUE && b11 <= j10;
                if (b11 == b10 || z12) {
                    z10 |= p0Var.d(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // i9.p0
    public final long g() {
        long j10 = Long.MAX_VALUE;
        for (p0 p0Var : this.f31621a) {
            long g10 = p0Var.g();
            if (g10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, g10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // i9.p0
    public final void h(long j10) {
        for (p0 p0Var : this.f31621a) {
            p0Var.h(j10);
        }
    }
}
