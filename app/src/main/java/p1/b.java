package p1;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import androidx.work.o;
import androidx.work.u;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.work.impl.o f35433a = new androidx.work.impl.o();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class a extends b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f35434b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UUID f35435c;

        a(e0 e0Var, UUID uuid) {
            this.f35434b = e0Var;
            this.f35435c = uuid;
        }

        @Override // p1.b
        void h() {
            WorkDatabase s10 = this.f35434b.s();
            s10.beginTransaction();
            try {
                a(this.f35434b, this.f35435c.toString());
                s10.setTransactionSuccessful();
                s10.endTransaction();
                g(this.f35434b);
            } catch (Throwable th) {
                s10.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CancelWorkRunnable.java */
    /* renamed from: p1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0472b extends b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f35436b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35437c;

        C0472b(e0 e0Var, String str) {
            this.f35436b = e0Var;
            this.f35437c = str;
        }

        @Override // p1.b
        void h() {
            WorkDatabase s10 = this.f35436b.s();
            s10.beginTransaction();
            try {
                for (String str : s10.h().j(this.f35437c)) {
                    a(this.f35436b, str);
                }
                s10.setTransactionSuccessful();
                s10.endTransaction();
                g(this.f35436b);
            } catch (Throwable th) {
                s10.endTransaction();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    class c extends b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f35438b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f35439c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f35440d;

        c(e0 e0Var, String str, boolean z10) {
            this.f35438b = e0Var;
            this.f35439c = str;
            this.f35440d = z10;
        }

        @Override // p1.b
        void h() {
            WorkDatabase s10 = this.f35438b.s();
            s10.beginTransaction();
            try {
                for (String str : s10.h().f(this.f35439c)) {
                    a(this.f35438b, str);
                }
                s10.setTransactionSuccessful();
                s10.endTransaction();
                if (this.f35440d) {
                    g(this.f35438b);
                }
            } catch (Throwable th) {
                s10.endTransaction();
                throw th;
            }
        }
    }

    public static b b(UUID uuid, e0 e0Var) {
        return new a(e0Var, uuid);
    }

    public static b c(String str, e0 e0Var, boolean z10) {
        return new c(e0Var, str, z10);
    }

    public static b d(String str, e0 e0Var) {
        return new C0472b(e0Var, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        o1.v h10 = workDatabase.h();
        o1.b b10 = workDatabase.b();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            u.a g10 = h10.g(str2);
            if (g10 != u.a.SUCCEEDED && g10 != u.a.FAILED) {
                h10.q(u.a.CANCELLED, str2);
            }
            linkedList.addAll(b10.a(str2));
        }
    }

    void a(e0 e0Var, String str) {
        f(e0Var.s(), str);
        e0Var.p().r(str);
        for (androidx.work.impl.t tVar : e0Var.q()) {
            tVar.c(str);
        }
    }

    public androidx.work.o e() {
        return this.f35433a;
    }

    void g(e0 e0Var) {
        androidx.work.impl.u.b(e0Var.l(), e0Var.s(), e0Var.q());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f35433a.b(androidx.work.o.f4726a);
        } catch (Throwable th) {
            this.f35433a.b(new o.b.a(th));
        }
    }
}
