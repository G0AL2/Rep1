package ue;

import fe.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pe.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sequences.kt */
/* loaded from: classes3.dex */
public class j extends i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Iterables.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterable<T>, re.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f37720a;

        public a(d dVar) {
            this.f37720a = dVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f37720a.iterator();
        }
    }

    public static <T> Iterable<T> c(d<? extends T> dVar) {
        qe.k.f(dVar, "<this>");
        return new a(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> d<T> d(d<? extends T> dVar, int i10) {
        qe.k.f(dVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? dVar : dVar instanceof c ? ((c) dVar).a(i10) : new b(dVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T, A extends Appendable> A e(d<? extends T> dVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        qe.k.f(dVar, "<this>");
        qe.k.f(a10, "buffer");
        qe.k.f(charSequence, "separator");
        qe.k.f(charSequence2, "prefix");
        qe.k.f(charSequence3, "postfix");
        qe.k.f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : dVar) {
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

    public static final <T> String f(d<? extends T> dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        qe.k.f(dVar, "<this>");
        qe.k.f(charSequence, "separator");
        qe.k.f(charSequence2, "prefix");
        qe.k.f(charSequence3, "postfix");
        qe.k.f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) e(dVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        qe.k.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String g(d dVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
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
        return f(dVar, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static <T, R> d<R> h(d<? extends T> dVar, l<? super T, ? extends R> lVar) {
        qe.k.f(dVar, "<this>");
        qe.k.f(lVar, "transform");
        return new k(dVar, lVar);
    }

    public static final <T, C extends Collection<? super T>> C i(d<? extends T> dVar, C c10) {
        qe.k.f(dVar, "<this>");
        qe.k.f(c10, "destination");
        for (T t10 : dVar) {
            c10.add(t10);
        }
        return c10;
    }

    public static <T> List<T> j(d<? extends T> dVar) {
        List<T> m10;
        qe.k.f(dVar, "<this>");
        m10 = p.m(k(dVar));
        return m10;
    }

    public static final <T> List<T> k(d<? extends T> dVar) {
        qe.k.f(dVar, "<this>");
        return (List) i(dVar, new ArrayList());
    }
}
