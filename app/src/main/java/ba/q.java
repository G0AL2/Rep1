package ba;

import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import i9.u;
import i9.w0;
import j8.j3;
import j8.p1;
import java.util.List;

/* compiled from: ExoTrackSelection.java */
/* loaded from: classes2.dex */
public interface q extends t {

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final w0 f5125a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f5126b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5127c;

        public a(w0 w0Var, int... iArr) {
            this(w0Var, iArr, 0);
        }

        public a(w0 w0Var, int[] iArr, int i10) {
            this.f5125a = w0Var;
            this.f5126b = iArr;
            this.f5127c = i10;
        }
    }

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes2.dex */
    public interface b {
        q[] a(a[] aVarArr, da.f fVar, u.b bVar, j3 j3Var);
    }

    int a();

    boolean b(int i10, long j10);

    boolean c(int i10, long j10);

    void disable();

    void enable();

    void f(float f10);

    Object g();

    void h();

    void j(long j10, long j11, long j12, List<? extends k9.n> list, MediaChunkIterator[] mediaChunkIteratorArr);

    void l(boolean z10);

    int m(long j10, List<? extends k9.n> list);

    int n();

    p1 p();

    int q();

    boolean r(long j10, k9.f fVar, List<? extends k9.n> list);

    void s();
}
