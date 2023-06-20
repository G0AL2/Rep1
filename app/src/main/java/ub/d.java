package ub;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rb.a;
import sc.a;

/* compiled from: AnalyticsDeferredProxy.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    private final sc.a<rb.a> f37703a;

    /* renamed from: b */
    private volatile wb.a f37704b;

    /* renamed from: c */
    private volatile xb.b f37705c;

    /* renamed from: d */
    private final List<xb.a> f37706d;

    public d(sc.a<rb.a> aVar) {
        this(aVar, new xb.c(), new wb.f());
    }

    public static /* synthetic */ void a(d dVar, sc.b bVar) {
        dVar.i(bVar);
    }

    public static /* synthetic */ void b(d dVar, String str, Bundle bundle) {
        dVar.g(str, bundle);
    }

    public static /* synthetic */ void c(d dVar, xb.a aVar) {
        dVar.h(aVar);
    }

    private void f() {
        this.f37703a.a(new a.InterfaceC0500a() { // from class: ub.a
            @Override // sc.a.InterfaceC0500a
            public final void a(sc.b bVar) {
                d.a(d.this, bVar);
            }
        });
    }

    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f37704b.a(str, bundle);
    }

    public /* synthetic */ void h(xb.a aVar) {
        synchronized (this) {
            if (this.f37705c instanceof xb.c) {
                this.f37706d.add(aVar);
            }
            this.f37705c.a(aVar);
        }
    }

    public /* synthetic */ void i(sc.b bVar) {
        vb.f.f().b("AnalyticsConnector now available.");
        rb.a aVar = (rb.a) bVar.get();
        wb.e eVar = new wb.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            vb.f.f().b("Registered Firebase Analytics listener.");
            wb.d dVar = new wb.d();
            wb.c cVar = new wb.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (xb.a aVar2 : this.f37706d) {
                    dVar.a(aVar2);
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f37705c = dVar;
                this.f37704b = cVar;
            }
            return;
        }
        vb.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.InterfaceC0491a j(rb.a aVar, e eVar) {
        a.InterfaceC0491a g10 = aVar.g("clx", eVar);
        if (g10 == null) {
            vb.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            g10 = aVar.g(AppMeasurement.CRASH_ORIGIN, eVar);
            if (g10 != null) {
                vb.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return g10;
    }

    public wb.a d() {
        return new wb.a() { // from class: ub.b
            @Override // wb.a
            public final void a(String str, Bundle bundle) {
                d.b(d.this, str, bundle);
            }
        };
    }

    public xb.b e() {
        return new xb.b() { // from class: ub.c
            @Override // xb.b
            public final void a(xb.a aVar) {
                d.c(d.this, aVar);
            }
        };
    }

    public d(sc.a<rb.a> aVar, xb.b bVar, wb.a aVar2) {
        this.f37703a = aVar;
        this.f37705c = bVar;
        this.f37706d = new ArrayList();
        this.f37704b = aVar2;
        f();
    }
}
