package s7;

import com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r7.f;

/* compiled from: ViewModelFactory.java */
/* loaded from: classes2.dex */
public class o {
    public static List<com.google.android.ads.mediationtestsuite.viewmodels.e> a(List<ConfigurationItem> list, f.a aVar) {
        if (list.isEmpty()) {
            com.google.android.ads.mediationtestsuite.viewmodels.c cVar = new com.google.android.ads.mediationtestsuite.viewmodels.c(-1, com.google.android.ads.mediationtestsuite.utils.k.d().r(aVar));
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        if (com.google.android.ads.mediationtestsuite.utils.k.d().m() && com.google.android.ads.mediationtestsuite.utils.k.t(com.google.android.ads.mediationtestsuite.utils.e.k()) && aVar != f.a.SEARCH) {
            arrayList2.add(new com.google.android.ads.mediationtestsuite.viewmodels.f());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (ConfigurationItem configurationItem : list) {
            d<? extends ConfigurationItem> n10 = com.google.android.ads.mediationtestsuite.utils.k.d().n(configurationItem);
            if (configurationItem.k()) {
                arrayList3.add(n10);
            } else if (configurationItem.j()) {
                arrayList5.add(n10);
            } else {
                arrayList4.add(n10);
            }
        }
        Collections.sort(arrayList3);
        Collections.sort(arrayList4);
        Collections.sort(arrayList5);
        com.google.android.ads.mediationtestsuite.viewmodels.c cVar2 = new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20797j, com.google.android.ads.mediationtestsuite.g.B0);
        com.google.android.ads.mediationtestsuite.viewmodels.c cVar3 = new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20798k, com.google.android.ads.mediationtestsuite.g.f20896z0);
        com.google.android.ads.mediationtestsuite.viewmodels.c cVar4 = new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20790c, com.google.android.ads.mediationtestsuite.g.G0);
        if (!arrayList3.isEmpty()) {
            arrayList2.add(cVar2);
            arrayList2.addAll(arrayList3);
        }
        if (!arrayList4.isEmpty()) {
            arrayList2.add(cVar3);
            arrayList2.addAll(arrayList4);
        }
        if (!arrayList5.isEmpty()) {
            arrayList2.add(cVar4);
            arrayList2.addAll(arrayList5);
        }
        return arrayList2;
    }
}
