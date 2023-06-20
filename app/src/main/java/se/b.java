package se;

import fe.c0;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes3.dex */
public final class b extends c0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f36988a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36989b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36990c;

    /* renamed from: d  reason: collision with root package name */
    private int f36991d;

    public b(int i10, int i11, int i12) {
        this.f36988a = i12;
        this.f36989b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f36990c = z10;
        this.f36991d = z10 ? i10 : i11;
    }

    @Override // fe.c0
    public int c() {
        int i10 = this.f36991d;
        if (i10 == this.f36989b) {
            if (this.f36990c) {
                this.f36990c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f36991d = this.f36988a + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f36990c;
    }
}
