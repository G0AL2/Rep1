package ue;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* loaded from: classes3.dex */
public class h extends g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f37719a;

        public a(Iterator it) {
            this.f37719a = it;
        }

        @Override // ue.d
        public Iterator<T> iterator() {
            return this.f37719a;
        }
    }

    public static <T> d<T> a(Iterator<? extends T> it) {
        qe.k.f(it, "<this>");
        return b(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> d<T> b(d<? extends T> dVar) {
        qe.k.f(dVar, "<this>");
        return dVar instanceof ue.a ? dVar : new ue.a(dVar);
    }
}
