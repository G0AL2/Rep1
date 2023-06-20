package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import fc.d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import ob.e;
import vb.f;
import yb.g;
import yb.l;
import yb.r;
import yb.t;
import yb.v;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes3.dex */
public class a {

    /* compiled from: FirebaseCrashlytics.java */
    /* renamed from: com.google.firebase.crashlytics.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0306a implements Continuation<Void, Object> {
        C0306a() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public Object then(Task<Void> task) throws Exception {
            if (task.isSuccessful()) {
                return null;
            }
            f.f().e("Error fetching settings.", task.getException());
            return null;
        }
    }

    /* compiled from: FirebaseCrashlytics.java */
    /* loaded from: classes3.dex */
    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f23375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f23376b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f23377c;

        b(boolean z10, l lVar, d dVar) {
            this.f23375a = z10;
            this.f23376b = lVar;
            this.f23377c = dVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            if (this.f23375a) {
                this.f23376b.g(this.f23377c);
                return null;
            }
            return null;
        }
    }

    private a(l lVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(e eVar, tc.d dVar, sc.a<vb.a> aVar, sc.a<rb.a> aVar2) {
        Context l10 = eVar.l();
        String packageName = l10.getPackageName();
        f f10 = f.f();
        f10.g("Initializing Firebase Crashlytics " + l.i() + " for " + packageName);
        dc.f fVar = new dc.f(l10);
        r rVar = new r(eVar);
        v vVar = new v(l10, packageName, dVar, rVar);
        vb.d dVar2 = new vb.d(aVar);
        ub.d dVar3 = new ub.d(aVar2);
        l lVar = new l(eVar, vVar, dVar2, rVar, dVar3.e(), dVar3.d(), fVar, t.c("Crashlytics Exception Handler"));
        String c10 = eVar.q().c();
        String n10 = g.n(l10);
        f f11 = f.f();
        f11.b("Mapping file ID is: " + n10);
        try {
            yb.a a10 = yb.a.a(l10, vVar, c10, n10, new vb.e(l10));
            f f12 = f.f();
            f12.i("Installer package name is: " + a10.f39362c);
            ExecutorService c11 = t.c("com.google.firebase.crashlytics.startup");
            d l11 = d.l(l10, c10, vVar, new cc.b(), a10.f39364e, a10.f39365f, fVar, rVar);
            l11.p(c11).continueWith(c11, new C0306a());
            Tasks.call(c11, new b(lVar.n(a10, l11), lVar, l11));
            return new a(lVar);
        } catch (PackageManager.NameNotFoundException e10) {
            f.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }
}
