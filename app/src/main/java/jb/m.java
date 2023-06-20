package jb;

import java.util.Comparator;

/* compiled from: ComparisonChain.java */
/* loaded from: classes3.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private static final m f33032a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final m f33033b = new b(-1);

    /* renamed from: c  reason: collision with root package name */
    private static final m f33034c = new b(1);

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes3.dex */
    class a extends m {
        a() {
            super(null);
        }

        @Override // jb.m
        public m d(int i10, int i11) {
            return j(mb.d.e(i10, i11));
        }

        @Override // jb.m
        public <T> m e(T t10, T t11, Comparator<T> comparator) {
            return j(comparator.compare(t10, t11));
        }

        @Override // jb.m
        public m f(boolean z10, boolean z11) {
            return j(mb.a.a(z10, z11));
        }

        @Override // jb.m
        public m g(boolean z10, boolean z11) {
            return j(mb.a.a(z11, z10));
        }

        @Override // jb.m
        public int h() {
            return 0;
        }

        m j(int i10) {
            if (i10 < 0) {
                return m.f33033b;
            }
            return i10 > 0 ? m.f33034c : m.f33032a;
        }
    }

    /* compiled from: ComparisonChain.java */
    /* loaded from: classes3.dex */
    private static final class b extends m {

        /* renamed from: d  reason: collision with root package name */
        final int f33035d;

        b(int i10) {
            super(null);
            this.f33035d = i10;
        }

        @Override // jb.m
        public m d(int i10, int i11) {
            return this;
        }

        @Override // jb.m
        public <T> m e(T t10, T t11, Comparator<T> comparator) {
            return this;
        }

        @Override // jb.m
        public m f(boolean z10, boolean z11) {
            return this;
        }

        @Override // jb.m
        public m g(boolean z10, boolean z11) {
            return this;
        }

        @Override // jb.m
        public int h() {
            return this.f33035d;
        }
    }

    /* synthetic */ m(a aVar) {
        this();
    }

    public static m i() {
        return f33032a;
    }

    public abstract m d(int i10, int i11);

    public abstract <T> m e(T t10, T t11, Comparator<T> comparator);

    public abstract m f(boolean z10, boolean z11);

    public abstract m g(boolean z10, boolean z11);

    public abstract int h();

    private m() {
    }
}
