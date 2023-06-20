package fe;

import java.util.Collection;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Iterables.kt */
/* loaded from: classes3.dex */
public class q extends p {
    public static <T> int p(Iterable<? extends T> iterable, int i10) {
        qe.k.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
