package androidx.work;

import android.annotation.SuppressLint;
import androidx.work.u;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkQuery.java */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final List<UUID> f4746a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f4747b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f4748c;

    /* renamed from: d  reason: collision with root package name */
    private final List<u.a> f4749d;

    /* compiled from: WorkQuery.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        List<UUID> f4750a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        List<String> f4751b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        List<String> f4752c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        List<u.a> f4753d = new ArrayList();

        private a() {
        }

        @SuppressLint({"BuilderSetStyle"})
        public static a c(List<u.a> list) {
            a aVar = new a();
            aVar.a(list);
            return aVar;
        }

        public a a(List<u.a> list) {
            this.f4753d.addAll(list);
            return this;
        }

        public w b() {
            if (this.f4750a.isEmpty() && this.f4751b.isEmpty() && this.f4752c.isEmpty() && this.f4753d.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new w(this);
        }
    }

    w(a aVar) {
        this.f4746a = aVar.f4750a;
        this.f4747b = aVar.f4751b;
        this.f4748c = aVar.f4752c;
        this.f4749d = aVar.f4753d;
    }

    public List<UUID> a() {
        return this.f4746a;
    }

    public List<u.a> b() {
        return this.f4749d;
    }

    public List<String> c() {
        return this.f4748c;
    }

    public List<String> d() {
        return this.f4747b;
    }
}
