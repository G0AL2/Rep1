package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: YieldPartnerConfigDetailViewModel.java */
/* loaded from: classes2.dex */
public class q extends k {
    public q(NetworkConfig networkConfig) {
        super(networkConfig);
    }

    @Override // s7.k
    public List<com.google.android.ads.mediationtestsuite.viewmodels.e> a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20794g, com.google.android.ads.mediationtestsuite.g.K));
        arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.d(context.getString(com.google.android.ads.mediationtestsuite.g.f20857g), b().g()));
        arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.d(context.getString(com.google.android.ads.mediationtestsuite.g.N0), context.getString(com.google.android.ads.mediationtestsuite.g.f20874o0, b().n())));
        arrayList.addAll(super.a(context));
        return arrayList;
    }

    @Override // s7.k
    public String c(Context context) {
        return null;
    }

    @Override // s7.k
    public String d(Context context) {
        return context.getResources().getString(com.google.android.ads.mediationtestsuite.g.Q);
    }
}
