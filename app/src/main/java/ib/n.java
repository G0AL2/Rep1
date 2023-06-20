package ib;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* compiled from: Predicates.java */
/* loaded from: classes3.dex */
public final class n {

    /* compiled from: Predicates.java */
    /* loaded from: classes3.dex */
    private static class b<T> implements m<T>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends m<? super T>> f31908a;

        @Override // ib.m
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f31908a.size(); i10++) {
                if (!this.f31908a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f31908a.equals(((b) obj).f31908a);
            }
            return false;
        }

        public int hashCode() {
            return this.f31908a.hashCode() + 306654252;
        }

        public String toString() {
            return n.d("and", this.f31908a);
        }

        private b(List<? extends m<? super T>> list) {
            this.f31908a = list;
        }
    }

    public static <T> m<T> b(m<? super T> mVar, m<? super T> mVar2) {
        return new b(c((m) l.j(mVar), (m) l.j(mVar2)));
    }

    private static <T> List<m<? super T>> c(m<? super T> mVar, m<? super T> mVar2) {
        return Arrays.asList(mVar, mVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
