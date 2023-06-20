package xd;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.unity3d.scar.adapter.common.h;

/* compiled from: ScarRewardedAd.java */
/* loaded from: classes3.dex */
public class e extends a<RewardedAd> {
    public e(Context context, yd.b bVar, od.c cVar, com.unity3d.scar.adapter.common.d dVar, h hVar) {
        super(context, cVar, bVar, dVar);
        this.f38888e = new f(hVar, this);
    }

    @Override // od.a
    public void a(Activity activity) {
        T t10 = this.f38884a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((f) this.f38888e).f());
        } else {
            this.f38889f.handleError(com.unity3d.scar.adapter.common.b.a(this.f38886c));
        }
    }

    @Override // xd.a
    protected void c(AdRequest adRequest, od.b bVar) {
        RewardedAd.load(this.f38885b, this.f38886c.b(), adRequest, ((f) this.f38888e).e());
    }
}
