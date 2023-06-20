package androidx.work;

import android.annotation.SuppressLint;
import android.os.Build;
import fe.m0;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkRequest.kt */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    private final UUID f4754a;

    /* renamed from: b  reason: collision with root package name */
    private final o1.u f4755b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f4756c;

    /* compiled from: WorkRequest.kt */
    /* loaded from: classes.dex */
    public static abstract class a<B extends a<B, ?>, W extends x> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<? extends k> f4757a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f4758b;

        /* renamed from: c  reason: collision with root package name */
        private UUID f4759c;

        /* renamed from: d  reason: collision with root package name */
        private o1.u f4760d;

        /* renamed from: e  reason: collision with root package name */
        private final Set<String> f4761e;

        public a(Class<? extends k> cls) {
            Set<String> e10;
            qe.k.f(cls, "workerClass");
            this.f4757a = cls;
            UUID randomUUID = UUID.randomUUID();
            qe.k.e(randomUUID, "randomUUID()");
            this.f4759c = randomUUID;
            String uuid = this.f4759c.toString();
            qe.k.e(uuid, "id.toString()");
            String name = cls.getName();
            qe.k.e(name, "workerClass.name");
            this.f4760d = new o1.u(uuid, name);
            String name2 = cls.getName();
            qe.k.e(name2, "workerClass.name");
            e10 = m0.e(name2);
            this.f4761e = e10;
        }

        public final B a(String str) {
            qe.k.f(str, "tag");
            this.f4761e.add(str);
            return g();
        }

        public final W b() {
            W c10 = c();
            c cVar = this.f4760d.f34914j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && cVar.e()) || cVar.f() || cVar.g() || (i10 >= 23 && cVar.h());
            o1.u uVar = this.f4760d;
            if (uVar.f34921q) {
                if (!z10) {
                    if (!(uVar.f34911g <= 0)) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            qe.k.e(randomUUID, "randomUUID()");
            k(randomUUID);
            return c10;
        }

        public abstract W c();

        public final boolean d() {
            return this.f4758b;
        }

        public final UUID e() {
            return this.f4759c;
        }

        public final Set<String> f() {
            return this.f4761e;
        }

        public abstract B g();

        public final o1.u h() {
            return this.f4760d;
        }

        public final B i(c cVar) {
            qe.k.f(cVar, "constraints");
            this.f4760d.f34914j = cVar;
            return g();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B j(p pVar) {
            qe.k.f(pVar, "policy");
            o1.u uVar = this.f4760d;
            uVar.f34921q = true;
            uVar.f34922r = pVar;
            return g();
        }

        public final B k(UUID uuid) {
            qe.k.f(uuid, "id");
            this.f4759c = uuid;
            String uuid2 = uuid.toString();
            qe.k.e(uuid2, "id.toString()");
            this.f4760d = new o1.u(uuid2, this.f4760d);
            return g();
        }

        public B l(long j10, TimeUnit timeUnit) {
            qe.k.f(timeUnit, "timeUnit");
            this.f4760d.f34911g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f4760d.f34911g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        public final B m(e eVar) {
            qe.k.f(eVar, "inputData");
            this.f4760d.f34909e = eVar;
            return g();
        }
    }

    /* compiled from: WorkRequest.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qe.g gVar) {
            this();
        }
    }

    static {
        new b(null);
    }

    public x(UUID uuid, o1.u uVar, Set<String> set) {
        qe.k.f(uuid, "id");
        qe.k.f(uVar, "workSpec");
        qe.k.f(set, "tags");
        this.f4754a = uuid;
        this.f4755b = uVar;
        this.f4756c = set;
    }

    public UUID a() {
        return this.f4754a;
    }

    public final String b() {
        String uuid = a().toString();
        qe.k.e(uuid, "id.toString()");
        return uuid;
    }

    public final Set<String> c() {
        return this.f4756c;
    }

    public final o1.u d() {
        return this.f4755b;
    }
}
