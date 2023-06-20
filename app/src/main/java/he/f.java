package he;

import java.util.Comparator;
import qe.k;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
final class f implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f31416a = new f();

    private f() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        k.f(comparable, "a");
        k.f(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return e.f31415a;
    }
}
