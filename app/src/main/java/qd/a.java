package qd;

import android.content.Context;
import com.unity3d.scar.adapter.common.g;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.scar.adapter.common.j;
import com.unity3d.scar.adapter.common.k;
import od.c;
import sd.d;

/* compiled from: ScarAdapter.java */
/* loaded from: classes3.dex */
public class a extends j {

    /* renamed from: e  reason: collision with root package name */
    private d f36080e;

    /* compiled from: ScarAdapter.java */
    /* renamed from: qd.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0483a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.unity3d.scar.adapter.v1920.scarads.a f36081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f36082b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: qd.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0484a implements od.b {
            C0484a() {
            }

            @Override // od.b
            public void onAdLoaded() {
                ((j) a.this).f28512b.put(RunnableC0483a.this.f36082b.c(), RunnableC0483a.this.f36081a);
            }
        }

        RunnableC0483a(com.unity3d.scar.adapter.v1920.scarads.a aVar, c cVar) {
            this.f36081a = aVar;
            this.f36082b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36081a.b(new C0484a());
        }
    }

    /* compiled from: ScarAdapter.java */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.unity3d.scar.adapter.v1920.scarads.c f36085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f36086b;

        /* compiled from: ScarAdapter.java */
        /* renamed from: qd.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0485a implements od.b {
            C0485a() {
            }

            @Override // od.b
            public void onAdLoaded() {
                ((j) a.this).f28512b.put(b.this.f36086b.c(), b.this.f36085a);
            }
        }

        b(com.unity3d.scar.adapter.v1920.scarads.c cVar, c cVar2) {
            this.f36085a = cVar;
            this.f36086b = cVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36085a.b(new C0485a());
        }
    }

    public a(com.unity3d.scar.adapter.common.d dVar) {
        super(dVar);
        d dVar2 = new d();
        this.f36080e = dVar2;
        this.f28511a = new sd.c(dVar2);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void b(Context context, c cVar, g gVar) {
        k.a(new RunnableC0483a(new com.unity3d.scar.adapter.v1920.scarads.a(context, this.f36080e.b(cVar.c()), cVar, this.f28514d, gVar), cVar));
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void d(Context context, c cVar, h hVar) {
        k.a(new b(new com.unity3d.scar.adapter.v1920.scarads.c(context, this.f36080e.b(cVar.c()), cVar, this.f28514d, hVar), cVar));
    }
}
