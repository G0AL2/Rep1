package k9;

import java.util.NoSuchElementException;

/* compiled from: BaseMediaChunkIterator.java */
/* loaded from: classes2.dex */
public abstract class b implements o {

    /* renamed from: b  reason: collision with root package name */
    private final long f33361b;

    /* renamed from: c  reason: collision with root package name */
    private final long f33362c;

    /* renamed from: d  reason: collision with root package name */
    private long f33363d;

    public b(long j10, long j11) {
        this.f33361b = j10;
        this.f33362c = j11;
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        long j10 = this.f33363d;
        if (j10 < this.f33361b || j10 > this.f33362c) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long d() {
        return this.f33363d;
    }

    public boolean e() {
        return this.f33363d > this.f33362c;
    }

    public void f() {
        this.f33363d = this.f33361b - 1;
    }

    @Override // k9.o
    public boolean next() {
        this.f33363d++;
        return !e();
    }
}
