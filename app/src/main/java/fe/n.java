package fe;

import java.util.List;

/* loaded from: classes3.dex */
public final class n extends x {
    public static /* bridge */ /* synthetic */ Appendable A(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pe.l lVar, int i11, Object obj) {
        Appendable z10;
        z10 = x.z(iterable, appendable, (r14 & 2) != 0 ? ", " : charSequence, (r14 & 4) != 0 ? "" : charSequence2, (r14 & 8) == 0 ? charSequence3 : "", (r14 & 16) != 0 ? -1 : i10, (r14 & 32) != 0 ? "..." : charSequence4, (r14 & 64) != 0 ? null : lVar);
        return z10;
    }

    public static /* bridge */ /* synthetic */ <T> T D(List<? extends T> list) {
        return (T) x.D(list);
    }

    public static /* bridge */ /* synthetic */ <T> T G(Iterable<? extends T> iterable) {
        return (T) x.G(iterable);
    }

    public static /* bridge */ /* synthetic */ <T> List<T> d(T t10) {
        return o.d(t10);
    }

    public static /* bridge */ /* synthetic */ <T> List<T> h() {
        return p.h();
    }

    public static /* bridge */ /* synthetic */ <T> int i(List<? extends T> list) {
        return p.i(list);
    }

    public static /* bridge */ /* synthetic */ void o() {
        p.o();
    }

    public static /* bridge */ /* synthetic */ <T> T u(List<T> list) {
        return (T) u.u(list);
    }

    public static /* bridge */ /* synthetic */ <T> T y(List<? extends T> list) {
        return (T) x.y(list);
    }
}
