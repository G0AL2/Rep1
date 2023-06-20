package td;

import android.content.Context;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.j;
import com.unity3d.scar.adapter.common.k;
import od.c;
import vd.d;

/* compiled from: ScarAdapter.java */
/* loaded from: classes3.dex */
public class a extends j {

    /* renamed from: e  reason: collision with root package name */
    private d f37322e;

    /* compiled from: ScarAdapter.java */
    /* renamed from: td.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0506a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.unity3d.scar.adapter.v1950.scarads.a f37323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f37324b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: td.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0507a implements od.b {
            C0507a() {
            }

            @Override // od.b
            public void onAdLoaded() {
                ((j) a.this).f28512b.put(RunnableC0506a.this.f37324b.c(), RunnableC0506a.this.f37323a);
            }
        }

        RunnableC0506a(com.unity3d.scar.adapter.v1950.scarads.a aVar, c cVar) {
            this.f37323a = aVar;
            this.f37324b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37323a.b(new C0507a());
        }
    }

    /* compiled from: ScarAdapter.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.unity3d.scar.adapter.v1950.scarads.c f37327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f37328b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: td.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0508a implements od.b {
            C0508a() {
            }

            @Override // od.b
            public void onAdLoaded() {
                ((j) a.this).f28512b.put(b.this.f37328b.c(), b.this.f37327a);
            }
        }

        b(com.unity3d.scar.adapter.v1950.scarads.c cVar, c cVar2) {
            this.f37327a = cVar;
            this.f37328b = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37327a.b(new C0508a());
        }
    }

    public a(com.unity3d.scar.adapter.common.d dVar) {
        super(dVar);
        d dVar2 = new d();
        this.f37322e = dVar2;
        this.f28511a = new vd.c(dVar2);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, c cVar, g gVar) {
        k.a(new RunnableC0506a(new com.unity3d.scar.adapter.v1950.scarads.a(context, this.f37322e.b(cVar.c()), cVar, this.f28514d, gVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, c cVar, h hVar) {
        k.a(new b(new com.unity3d.scar.adapter.v1950.scarads.c(context, this.f37322e.b(cVar.c()), cVar, this.f28514d, hVar), cVar));
    }
}
