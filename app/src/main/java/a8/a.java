package a8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w7.l;

/* compiled from: ClientMetrics.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final f f82a;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f83b;

    /* renamed from: c  reason: collision with root package name */
    private final b f84c;

    /* renamed from: d  reason: collision with root package name */
    private final String f85d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: a8.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0006a {

        /* renamed from: a  reason: collision with root package name */
        private f f86a = null;

        /* renamed from: b  reason: collision with root package name */
        private List<d> f87b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private b f88c = null;

        /* renamed from: d  reason: collision with root package name */
        private String f89d = "";

        C0006a() {
        }

        public C0006a a(d dVar) {
            this.f87b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f86a, Collections.unmodifiableList(this.f87b), this.f88c, this.f89d);
        }

        public C0006a c(String str) {
            this.f89d = str;
            return this;
        }

        public C0006a d(b bVar) {
            this.f88c = bVar;
            return this;
        }

        public C0006a e(f fVar) {
            this.f86a = fVar;
            return this;
        }
    }

    static {
        new C0006a().b();
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f82a = fVar;
        this.f83b = list;
        this.f84c = bVar;
        this.f85d = str;
    }

    public static C0006a e() {
        return new C0006a();
    }

    @oc.d(tag = 4)
    public String a() {
        return this.f85d;
    }

    @oc.d(tag = 3)
    public b b() {
        return this.f84c;
    }

    @oc.d(tag = 2)
    public List<d> c() {
        return this.f83b;
    }

    @oc.d(tag = 1)
    public f d() {
        return this.f82a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
