package jb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes3.dex */
public abstract class c0<K0, V0> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultimapBuilder.java */
    /* loaded from: classes3.dex */
    public class a extends e<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f32942a;

        a(int i10) {
            this.f32942a = i10;
        }

        @Override // jb.c0.e
        <K, V> Map<K, Collection<V>> c() {
            return j0.c(this.f32942a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MultimapBuilder.java */
    /* loaded from: classes3.dex */
    public class b extends e<K0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f32943a;

        b(Comparator comparator) {
            this.f32943a = comparator;
        }

        @Override // jb.c0.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f32943a);
        }
    }

    /* compiled from: MultimapBuilder.java */
    /* loaded from: classes3.dex */
    private static final class c<V> implements ib.q<List<V>>, Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f32944a;

        c(int i10) {
            this.f32944a = h.b(i10, "expectedValuesPerKey");
        }

        @Override // ib.q
        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f32944a);
        }
    }

    /* compiled from: MultimapBuilder.java */
    /* loaded from: classes3.dex */
    public static abstract class d<K0, V0> extends c0<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> x<K, V> e();
    }

    /* compiled from: MultimapBuilder.java */
    /* loaded from: classes3.dex */
    public static abstract class e<K0> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: MultimapBuilder.java */
        /* loaded from: classes3.dex */
        public class a extends d<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f32945a;

            a(int i10) {
                this.f32945a = i10;
            }

            @Override // jb.c0.d
            public <K extends K0, V> x<K, V> e() {
                return d0.b(e.this.c(), new c(this.f32945a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i10) {
            h.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ c0(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        h.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(i0.b());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        ib.l.j(comparator);
        return new b(comparator);
    }

    private c0() {
    }
}
