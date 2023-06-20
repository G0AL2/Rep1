package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.AdUnit;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdUnitViewModel.java */
/* loaded from: classes2.dex */
public class b extends n<AdUnit> {
    public b(AdUnit adUnit) {
        super(adUnit);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    public boolean c(CharSequence charSequence) {
        return ((AdUnit) p()).c(charSequence);
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public String h(Context context) {
        return String.format(context.getString(com.google.android.ads.mediationtestsuite.g.f20855f), w());
    }

    @Override // s7.d
    public List<com.google.android.ads.mediationtestsuite.viewmodels.e> o(Context context, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            com.google.android.ads.mediationtestsuite.viewmodels.c cVar = new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20794g, com.google.android.ads.mediationtestsuite.g.f20894y0);
            String string = context.getString(com.google.android.ads.mediationtestsuite.g.f20857g);
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
        return context.getResources().getString(com.google.android.ads.mediationtestsuite.g.f20880r0);
    }

    @Override // s7.d
    public String r(Context context) {
        return null;
    }

    @Override // s7.d
    public String s(Context context) {
        if (y() != null) {
            return y();
        }
        return context.getResources().getString(com.google.android.ads.mediationtestsuite.g.f20853e);
    }

    @Override // s7.d
    public String u() {
        if (y() != null) {
            return y();
        }
        return ((AdUnit) p()).e();
    }

    public String y() {
        return ((AdUnit) p()).g();
    }
}
