package ba;

import android.os.Bundle;
import ba.w;
import i9.w0;
import j8.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jb.s;
import jb.t;

/* compiled from: TrackSelectionOverrides.java */
/* loaded from: classes2.dex */
public final class w implements j8.g {

    /* renamed from: b */
    public static final w f5141b = new w(jb.t.k());

    /* renamed from: c */
    public static final g.a<w> f5142c = new g.a() { // from class: ba.v
        @Override // j8.g.a
        public final j8.g a(Bundle bundle) {
            return w.a(bundle);
        }
    };

    /* renamed from: a */
    private final jb.t<w0, c> f5143a;

    /* compiled from: TrackSelectionOverrides.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final HashMap<w0, c> f5144a = new HashMap<>();

        public b a(c cVar) {
            this.f5144a.put(cVar.f5146a, cVar);
            return this;
        }

        public w b() {
            return new w(this.f5144a);
        }
    }

    public static /* synthetic */ w a(Bundle bundle) {
        return d(bundle);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    public static /* synthetic */ w d(Bundle bundle) {
        List c10 = ea.b.c(c.f5145c, bundle.getParcelableArrayList(c(0)), jb.s.t());
        t.a aVar = new t.a();
        for (int i10 = 0; i10 < c10.size(); i10++) {
            c cVar = (c) c10.get(i10);
            aVar.d(cVar.f5146a, cVar);
        }
        return new w(aVar.b());
    }

    public c b(w0 w0Var) {
        return this.f5143a.get(w0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return this.f5143a.equals(((w) obj).f5143a);
    }

    public int hashCode() {
        return this.f5143a.hashCode();
    }

    private w(Map<w0, c> map) {
        this.f5143a = jb.t.d(map);
    }

    /* compiled from: TrackSelectionOverrides.java */
    /* loaded from: classes2.dex */
    public static final class c implements j8.g {

        /* renamed from: c */
        public static final g.a<c> f5145c = new g.a() { // from class: ba.x
            @Override // j8.g.a
            public final j8.g a(Bundle bundle) {
                return w.c.a(bundle);
            }
        };

        /* renamed from: a */
        public final w0 f5146a;

        /* renamed from: b */
        public final jb.s<Integer> f5147b;

        public c(w0 w0Var) {
            this.f5146a = w0Var;
            s.a aVar = new s.a();
            for (int i10 = 0; i10 < w0Var.f31846a; i10++) {
                aVar.a(Integer.valueOf(i10));
            }
            this.f5147b = aVar.h();
        }

        public static /* synthetic */ c a(Bundle bundle) {
            return d(bundle);
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public static /* synthetic */ c d(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(c(0));
            ea.a.e(bundle2);
            w0 a10 = w0.f31845e.a(bundle2);
            int[] intArray = bundle.getIntArray(c(1));
            if (intArray == null) {
                return new c(a10);
            }
            return new c(a10, mb.d.c(intArray));
        }

        public int b() {
            return ea.v.l(this.f5146a.c(0).f32709l);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5146a.equals(cVar.f5146a) && this.f5147b.equals(cVar.f5147b);
        }

        public int hashCode() {
            return this.f5146a.hashCode() + (this.f5147b.hashCode() * 31);
        }

        public c(w0 w0Var, List<Integer> list) {
            if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= w0Var.f31846a)) {
                throw new IndexOutOfBoundsException();
            }
            this.f5146a = w0Var;
            this.f5147b = jb.s.p(list);
        }
    }
}
