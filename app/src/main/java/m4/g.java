package m4;

import android.content.res.Resources;
import java.util.concurrent.Executor;
import p5.s;
import y3.n;

/* compiled from: PipelineDraweeControllerFactory.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private Resources f34229a;

    /* renamed from: b  reason: collision with root package name */
    private q4.a f34230b;

    /* renamed from: c  reason: collision with root package name */
    private v5.a f34231c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f34232d;

    /* renamed from: e  reason: collision with root package name */
    private s<t3.d, w5.c> f34233e;

    /* renamed from: f  reason: collision with root package name */
    private y3.f<v5.a> f34234f;

    /* renamed from: g  reason: collision with root package name */
    private n<Boolean> f34235g;

    public void a(Resources resources, q4.a aVar, v5.a aVar2, Executor executor, s<t3.d, w5.c> sVar, y3.f<v5.a> fVar, n<Boolean> nVar) {
        this.f34229a = resources;
        this.f34230b = aVar;
        this.f34231c = aVar2;
        this.f34232d = executor;
        this.f34233e = sVar;
        this.f34234f = fVar;
        this.f34235g = nVar;
    }

    protected d b(Resources resources, q4.a aVar, v5.a aVar2, Executor executor, s<t3.d, w5.c> sVar, y3.f<v5.a> fVar) {
        return new d(resources, aVar, aVar2, executor, sVar, fVar);
    }

    public d c() {
        d b10 = b(this.f34229a, this.f34230b, this.f34231c, this.f34232d, this.f34233e, this.f34234f);
        n<Boolean> nVar = this.f34235g;
        if (nVar != null) {
            b10.z0(nVar.get().booleanValue());
        }
        return b10;
    }
}
