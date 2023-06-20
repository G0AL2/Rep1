package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.dataobjects.YieldPartner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: YieldPartnerViewModel.java */
/* loaded from: classes2.dex */
public class s extends d<YieldPartner> {
    public s(YieldPartner yieldPartner) {
        super(yieldPartner);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    public boolean c(CharSequence charSequence) {
        return p().c(charSequence);
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public String h(Context context) {
        return null;
    }

    @Override // s7.d
    public List<com.google.android.ads.mediationtestsuite.viewmodels.e> o(Context context, boolean z10) {
        ArrayList arrayList = new ArrayList();
        List<NetworkConfig> t10 = t();
        if (!t10.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (NetworkConfig networkConfig : t10) {
                arrayList2.add(new r(networkConfig));
            }
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20788a, com.google.android.ads.mediationtestsuite.g.R));
            Collections.sort(arrayList2, l.p(context));
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    @Override // s7.d
    public String q(Context context) {
        return context.getResources().getString(com.google.android.ads.mediationtestsuite.g.f20884t0);
    }

    @Override // s7.d
    public String r(Context context) {
        return context.getResources().getString(com.google.android.ads.mediationtestsuite.g.f20872n0);
    }

    @Override // s7.d
    public String s(Context context) {
        return p().g();
    }

    @Override // s7.d
    public String u() {
        return p().g();
    }
}
