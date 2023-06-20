package ib;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
/* loaded from: classes3.dex */
abstract class a<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    private b f31892a = b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f31893b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractIterator.java */
    /* renamed from: ib.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C0407a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f31894a;

        static {
            int[] iArr = new int[b.values().length];
            f31894a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31894a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractIterator.java */
    /* loaded from: classes3.dex */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f31892a = b.FAILED;
        this.f31893b = b();
        if (this.f31892a != b.DONE) {
            this.f31892a = b.READY;
            return true;
        }
        return false;
    }

    protected abstract T b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T c() {
        this.f31892a = b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        l.o(this.f31892a != b.FAILED);
        int i10 = C0407a.f31894a[this.f31892a.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return d();
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f31892a = b.NOT_READY;
            T t10 = (T) h.a(this.f31893b);
            this.f31893b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
