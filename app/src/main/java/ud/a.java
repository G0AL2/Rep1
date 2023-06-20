package ud;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.d;
import od.c;
import vd.b;

/* compiled from: ScarAdBase.java */
/* loaded from: classes3.dex */
public abstract class a implements od.a {

    /* renamed from: a  reason: collision with root package name */
    protected Context f37710a;

    /* renamed from: b  reason: collision with root package name */
    protected c f37711b;

    /* renamed from: c  reason: collision with root package name */
    protected b f37712c;

    /* renamed from: d  reason: collision with root package name */
    protected d f37713d;

    public a(Context context, c cVar, b bVar, d dVar) {
        this.f37710a = context;
        this.f37711b = cVar;
        this.f37712c = bVar;
        this.f37713d = dVar;
    }

    public void b(od.b bVar) {
        b bVar2 = this.f37712c;
        if (bVar2 != null) {
            c(bVar, new AdRequest.Builder().setAdInfo(new AdInfo(bVar2.c(), this.f37711b.a())).build());
            return;
        }
        this.f37713d.handleError(com.unity3d.scar.adapter.common.b.g(this.f37711b));
    }

    protected abstract void c(od.b bVar, AdRequest adRequest);
}
