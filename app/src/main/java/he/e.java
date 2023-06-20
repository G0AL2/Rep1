package he;

import java.util.Comparator;
import qe.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class e implements Comparator<Comparable<? super Object>> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f31415a = new e();

    private e() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        k.f(comparable, "a");
        k.f(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return f.f31416a;
    }
}
