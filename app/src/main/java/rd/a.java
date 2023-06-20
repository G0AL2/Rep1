package rd;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.d;
import od.c;
import sd.b;

/* compiled from: ScarAdBase.java */
/* loaded from: classes3.dex */
public abstract class a implements od.a {

    /* renamed from: a  reason: collision with root package name */
    protected Context f36564a;

    /* renamed from: b  reason: collision with root package name */
    protected c f36565b;

    /* renamed from: c  reason: collision with root package name */
    protected b f36566c;

    /* renamed from: d  reason: collision with root package name */
    protected d f36567d;

    public a(Context context, c cVar, b bVar, d dVar) {
        this.f36564a = context;
        this.f36565b = cVar;
        this.f36566c = bVar;
        this.f36567d = dVar;
    }

    public void b(od.b bVar) {
        b bVar2 = this.f36566c;
        if (bVar2 != null) {
            c(bVar, new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.c(), this.f36565b.a())).build());
            return;
        }
        this.f36567d.handleError(com.unity3d.scar.adapter.common.b.g(this.f36565b));
    }

    protected abstract void c(od.b bVar, AdRequest adRequest);
}
