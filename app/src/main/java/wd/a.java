package wd;

import android.content.Context;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.j;
import com.unity3d.scar.adapter.common.k;
import xd.c;
import xd.e;
import yd.d;

/* compiled from: ScarAdapter.java */
/* loaded from: classes3.dex */
public class a extends j {

    /* renamed from: e  reason: collision with root package name */
    private d f38575e;

    /* compiled from: ScarAdapter.java */
    /* renamed from: wd.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0533a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f38576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ od.c f38577b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: wd.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0534a implements od.b {
            C0534a() {
            }

            @Override // od.b
            public void onAdLoaded() {
                ((j) a.this).f28512b.put(RunnableC0533a.this.f38577b.c(), RunnableC0533a.this.f38576a);
            }
        }

        RunnableC0533a(c cVar, od.c cVar2) {
            this.f38576a = cVar;
            this.f38577b = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38576a.b(new C0534a());
        }
    }

    /* compiled from: ScarAdapter.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f38580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ od.c f38581b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: wd.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0535a implements od.b {
            C0535a() {
            }

            @Override // od.b
            public void onAdLoaded() {
                ((j) a.this).f28512b.put(b.this.f38581b.c(), b.this.f38580a);
            }
        }

        b(e eVar, od.c cVar) {
            this.f38580a = eVar;
            this.f38581b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f38580a.b(new C0535a());
        }
    }

    public a(com.unity3d.scar.adapter.common.d dVar) {
        super(dVar);
        d dVar2 = new d();
        this.f38575e = dVar2;
        this.f28511a = new yd.c(dVar2);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, od.c cVar, g gVar) {
        k.a(new RunnableC0533a(new c(context, this.f38575e.b(cVar.c()), cVar, this.f28514d, gVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, od.c cVar, h hVar) {
        k.a(new b(new e(context, this.f38575e.b(cVar.c()), cVar, this.f28514d, hVar), cVar));
    }
}
