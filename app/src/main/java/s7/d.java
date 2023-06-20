package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.Caption;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem;
import com.google.android.ads.mediationtestsuite.dataobjects.Matchable;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ConfigurationItemViewModel.java */
/* loaded from: classes2.dex */
public abstract class d<T extends ConfigurationItem> extends com.google.android.ads.mediationtestsuite.viewmodels.b implements Matchable, Comparable<d<?>> {

    /* renamed from: b  reason: collision with root package name */
    private final T f36769b;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(T t10) {
        this.f36769b = t10;
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public List<Caption> g() {
        ArrayList arrayList = new ArrayList();
        TestState i10 = this.f36769b.i();
        TestState testState = TestState.f20946h;
        if (i10 != testState) {
            arrayList.add(new Caption(this.f36769b.i(), Caption.Component.SDK));
        }
        if (this.f36769b.d() != testState) {
            arrayList.add(new Caption(this.f36769b.d(), Caption.Component.ADAPTER));
        }
        if (this.f36769b.f() != testState) {
            arrayList.add(new Caption(this.f36769b.f(), Caption.Component.MANIFEST));
        }
        if (!this.f36769b.k() && !this.f36769b.j()) {
            TestState testState2 = TestState.f20945g;
            if (this.f36769b.l()) {
                testState2 = TestState.f20944f;
            }
            arrayList.add(new Caption(testState2, Caption.Component.AD_LOAD));
        }
        return arrayList;
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public String i(Context context) {
        return u();
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public boolean m() {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: n */
    public int compareTo(d<?> dVar) {
        String u10 = u();
        Integer b10 = com.google.android.ads.mediationtestsuite.utils.j.b(u10);
        String u11 = dVar.u();
        Integer b11 = com.google.android.ads.mediationtestsuite.utils.j.b(u11);
        if (b10.intValue() < 0 && b11.intValue() < 0) {
            return u10.compareTo(u11);
        }
        return b10.compareTo(b11);
    }

    public List<com.google.android.ads.mediationtestsuite.viewmodels.e> o(Context context, boolean z10) {
        ArrayList arrayList = new ArrayList();
        List<NetworkConfig> t10 = t();
        if (!t10.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (NetworkConfig networkConfig : t10) {
                arrayList2.add(new l(networkConfig));
            }
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20788a, com.google.android.ads.mediationtestsuite.utils.k.d().j()));
            Collections.sort(arrayList2, l.p(context));
            arrayList.addAll(arrayList2);
        }
        List<NetworkConfig> v10 = v();
        if (!v10.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (NetworkConfig networkConfig2 : v10) {
                arrayList3.add(new l(networkConfig2));
            }
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20788a, com.google.android.ads.mediationtestsuite.utils.k.d().q()));
            Collections.sort(arrayList3, l.p(context));
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    public T p() {
        return this.f36769b;
    }

    public abstract String q(Context context);

    public abstract String r(Context context);

    public abstract String s(Context context);

    public List<NetworkConfig> t() {
        ArrayList arrayList = new ArrayList();
        for (NetworkConfig networkConfig : this.f36769b.h()) {
            if (networkConfig.B()) {
                arrayList.add(networkConfig);
            }
        }
        return arrayList;
    }

    public abstract String u();

    public List<NetworkConfig> v() {
        ArrayList arrayList = new ArrayList();
        for (NetworkConfig networkConfig : this.f36769b.h()) {
            if (!networkConfig.B()) {
                arrayList.add(networkConfig);
            }
        }
        return arrayList;
    }
}
