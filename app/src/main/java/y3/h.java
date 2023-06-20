package y3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ImmutableSet.java */
/* loaded from: classes.dex */
public class h<E> extends HashSet<E> {
    private h(Set<E> set) {
        super(set);
    }

    public static <E> h<E> a(E... eArr) {
        HashSet hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return new h<>(hashSet);
    }
}
