package fe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: _Collections.kt */
/* loaded from: classes3.dex */
public class x extends w {

    /* compiled from: Sequences.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements ue.d<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f30329a;

        public a(Iterable iterable) {
            this.f30329a = iterable;
        }

        @Override // ue.d
        public Iterator<T> iterator() {
            return this.f30329a.iterator();
        }
    }

    public static final <T> String B(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pe.l<? super T, ? extends CharSequence> lVar) {
        qe.k.f(iterable, "<this>");
        qe.k.f(charSequence, "separator");
        qe.k.f(charSequence2, "prefix");
        qe.k.f(charSequence3, "postfix");
        qe.k.f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) z(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        qe.k.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String C(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pe.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        int i12 = (i11 & 8) != 0 ? -1 : i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return B(iterable, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static <T> T D(List<? extends T> list) {
        int i10;
        qe.k.f(list, "<this>");
        if (!list.isEmpty()) {
            i10 = p.i(list);
            return list.get(i10);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> List<T> E(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        qe.k.f(collection, "<this>");
        qe.k.f(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        u.s(arrayList2, iterable);
        return arrayList2;
    }

    public static <T> List<T> F(Collection<? extends T> collection, T t10) {
        qe.k.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> T G(Iterable<? extends T> iterable) {
        qe.k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) H((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T H(List<? extends T> list) {
        qe.k.f(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T extends Comparable<? super T>> List<T> I(Iterable<? extends T> iterable) {
        List<T> b10;
        List<T> N;
        qe.k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                N = N(iterable);
                return N;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sorted>");
            Comparable[] comparableArr = (Comparable[]) array;
            k.l(comparableArr);
            b10 = k.b(comparableArr);
            return b10;
        }
        List<T> O = O(iterable);
        t.q(O);
        return O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> J(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> b10;
        List<T> N;
        qe.k.f(iterable, "<this>");
        qe.k.f(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                N = N(iterable);
                return N;
            }
            Object[] array = collection.toArray(new Object[0]);
            qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            qe.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
            k.m(array, comparator);
            b10 = k.b(array);
            return b10;
        }
        List<T> O = O(iterable);
        t.r(O, comparator);
        return O;
    }

    public static final <T> List<T> K(Iterable<? extends T> iterable, int i10) {
        List<T> m10;
        List<T> d10;
        List<T> N;
        List<T> h10;
        qe.k.f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            h10 = p.h();
            return h10;
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    N = N(iterable);
                    return N;
                } else if (i10 == 1) {
                    d10 = o.d(x(iterable));
                    return d10;
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t10 : iterable) {
                arrayList.add(t10);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            m10 = p.m(arrayList);
            return m10;
        }
    }

    public static final <T, C extends Collection<? super T>> C L(Iterable<? extends T> iterable, C c10) {
        qe.k.f(iterable, "<this>");
        qe.k.f(c10, "destination");
        for (T t10 : iterable) {
            c10.add(t10);
        }
        return c10;
    }

    public static int[] M(Collection<Integer> collection) {
        qe.k.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer num : collection) {
            iArr[i10] = num.intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> N(Iterable<? extends T> iterable) {
        List<T> m10;
        List<T> h10;
        List<T> d10;
        List<T> P;
        qe.k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                h10 = p.h();
                return h10;
            } else if (size != 1) {
                P = P(collection);
                return P;
            } else {
                d10 = o.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return d10;
            }
        }
        m10 = p.m(O(iterable));
        return m10;
    }

    public static final <T> List<T> O(Iterable<? extends T> iterable) {
        List<T> P;
        qe.k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            P = P((Collection) iterable);
            return P;
        }
        return (List) L(iterable, new ArrayList());
    }

    public static <T> List<T> P(Collection<? extends T> collection) {
        qe.k.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> Q(Iterable<? extends T> iterable) {
        Set<T> d10;
        Set<T> c10;
        int d11;
        qe.k.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                d10 = m0.d();
                return d10;
            } else if (size != 1) {
                d11 = g0.d(collection.size());
                return (Set) L(iterable, new LinkedHashSet(d11));
            } else {
                c10 = l0.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                return c10;
            }
        }
        return m0.f((Set) L(iterable, new LinkedHashSet()));
    }

    public static <T> ue.d<T> v(Iterable<? extends T> iterable) {
        qe.k.f(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> List<T> w(List<? extends T> list, int i10) {
        int b10;
        qe.k.f(list, "<this>");
        if (i10 >= 0) {
            b10 = se.f.b(list.size() - i10, 0);
            return K(list, b10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> T x(Iterable<? extends T> iterable) {
        qe.k.f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) n.y((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T y(List<? extends T> list) {
        qe.k.f(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T, A extends Appendable> A z(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, pe.l<? super T, ? extends CharSequence> lVar) {
        qe.k.f(iterable, "<this>");
        qe.k.f(a10, "buffer");
        qe.k.f(charSequence, "separator");
        qe.k.f(charSequence2, "prefix");
        qe.k.f(charSequence3, "postfix");
        qe.k.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            ve.h.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }
}
