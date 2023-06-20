package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.YieldGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: YieldGroupViewModel.java */
/* loaded from: classes2.dex */
public class p extends n<YieldGroup> {
    public p(YieldGroup yieldGroup) {
        super(yieldGroup);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    public boolean c(CharSequence charSequence) {
        return ((YieldGroup) p()).c(charSequence);
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public String h(Context context) {
        return String.format(context.getString(com.google.android.ads.mediationtestsuite.g.S0), w());
    }

    @Override // s7.d
    public List<com.google.android.ads.mediationtestsuite.viewmodels.e> o(Context context, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            com.google.android.ads.mediationtestsuite.viewmodels.c cVar = new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20794g, com.google.android.ads.mediationtestsuite.g.H0);
            String string = context.getString(com.google.android.ads.mediationtestsuite.g.Q0);
            String string2 = context.getString(com.google.android.ads.mediationtestsuite.g.D);
            com.google.android.ads.mediationtestsuite.viewmodels.d dVar = new com.google.android.ads.mediationtestsuite.viewmodels.d(string, x());
            com.google.android.ads.mediationtestsuite.viewmodels.d dVar2 = new com.google.android.ads.mediationtestsuite.viewmodels.d(string2, w());
            arrayList.add(cVar);
            arrayList.add(dVar);
            arrayList.add(dVar2);
        }
        arrayList.addAll(super.o(context, z10));
        return arrayList;
    }

    @Override // s7.d
    public String q(Context context) {
        return context.getResources().getString(com.google.android.ads.mediationtestsuite.g.f20886u0);
    }

    @Override // s7.d
    public String r(Context context) {
        return null;
    }

    @Override // s7.d
    public String s(Context context) {
        return context.getResources().getString(com.google.android.ads.mediationtestsuite.g.R0);
    }

    @Override // s7.d
    public String u() {
        return y() != null ? y() : ((YieldGroup) p()).e();
    }

    public String y() {
        return ((YieldGroup) p()).g();
    }
}
