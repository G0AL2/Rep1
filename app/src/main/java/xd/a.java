package xd;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;

/* compiled from: ScarAdBase.java */
/* loaded from: classes3.dex */
public abstract class a<T> implements od.a {

    /* renamed from: a  reason: collision with root package name */
    protected T f38884a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f38885b;

    /* renamed from: c  reason: collision with root package name */
    protected od.c f38886c;

    /* renamed from: d  reason: collision with root package name */
    protected yd.b f38887d;

    /* renamed from: e  reason: collision with root package name */
    protected b f38888e;

    /* renamed from: f  reason: collision with root package name */
    protected com.unity3d.scar.adapter.common.d f38889f;

    public a(Context context, od.c cVar, yd.b bVar, com.unity3d.scar.adapter.common.d dVar) {
        this.f38885b = context;
        this.f38886c = cVar;
        this.f38887d = bVar;
        this.f38889f = dVar;
    }

    public void b(od.b bVar) {
        yd.b bVar2 = this.f38887d;
        if (bVar2 != null) {
            AdRequest build = new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.c(), this.f38886c.a())).build();
            this.f38888e.a(bVar);
            c(build, bVar);
            return;
        }
        this.f38889f.handleError(com.unity3d.scar.adapter.common.b.g(this.f38886c));
    }

    protected abstract void c(AdRequest adRequest, od.b bVar);

    public void d(T t10) {
        this.f38884a = t10;
    }
}
