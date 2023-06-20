package jb;

import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
/* loaded from: classes3.dex */
public abstract class b<T> extends u0<T> {

    /* renamed from: a  reason: collision with root package name */
    private EnumC0416b f32934a = EnumC0416b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private T f32935b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AbstractIterator.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f32936a;

        static {
            int[] iArr = new int[EnumC0416b.values().length];
            f32936a = iArr;
            try {
                iArr[EnumC0416b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32936a[EnumC0416b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AbstractIterator.java */
    /* renamed from: jb.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0416b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean d() {
        this.f32934a = EnumC0416b.FAILED;
        this.f32935b = b();
        if (this.f32934a != EnumC0416b.DONE) {
            this.f32934a = EnumC0416b.READY;
            return true;
        }
        return false;
    }

    protected abstract T b();

    /* JADX INFO: Access modifiers changed from: protected */
    public final T c() {
        this.f32934a = EnumC0416b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ib.l.o(this.f32934a != EnumC0416b.FAILED);
        int i10 = a.f32936a[this.f32934a.ordinal()];
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
            this.f32934a = EnumC0416b.NOT_READY;
            T t10 = (T) g0.a(this.f32935b);
            this.f32935b = null;
            return t10;
        }
        throw new NoSuchElementException();
    }
}
