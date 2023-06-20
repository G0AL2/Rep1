package xd;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.unity3d.scar.adapter.common.g;

/* compiled from: ScarInterstitialAd.java */
/* loaded from: classes3.dex */
public class c extends a<InterstitialAd> {
    public c(Context context, yd.b bVar, od.c cVar, com.unity3d.scar.adapter.common.d dVar, g gVar) {
        super(context, cVar, bVar, dVar);
        this.f38888e = new d(gVar, this);
    }

    @Override // od.a
    public void a(Activity activity) {
        T t10 = this.f38884a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f38889f.handleError(com.unity3d.scar.adapter.common.b.a(this.f38886c));
        }
    }

    @Override // xd.a
    protected void c(AdRequest adRequest, od.b bVar) {
        InterstitialAd.load(this.f38885b, this.f38886c.b(), adRequest, ((d) this.f38888e).e());
    }
}
