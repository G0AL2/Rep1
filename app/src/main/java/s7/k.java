package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;
import com.google.android.gms.ads.initialization.AdapterStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: NetworkConfigDetailViewModel.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final NetworkConfig f36786a;

    public k(NetworkConfig networkConfig) {
        this.f36786a = networkConfig;
    }

    public List<com.google.android.ads.mediationtestsuite.viewmodels.e> a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20796i, com.google.android.ads.mediationtestsuite.g.A0));
        boolean z10 = false;
        if (this.f36786a.i().i() != null) {
            TestState s10 = this.f36786a.s();
            String string = context.getString(com.google.android.ads.mediationtestsuite.g.f20888v0);
            String string2 = context.getString(s10.i());
            Object t10 = this.f36786a.t();
            if (t10 != null) {
                string2 = context.getString(com.google.android.ads.mediationtestsuite.g.O0, string2, t10);
            }
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.d(string, string2, s10));
        }
        TestState j10 = this.f36786a.j();
        if (j10 != null) {
            String string3 = context.getString(com.google.android.ads.mediationtestsuite.g.f20859h);
            String string4 = context.getString(j10.i());
            Object l10 = this.f36786a.l();
            if (l10 != null) {
                string4 = context.getString(com.google.android.ads.mediationtestsuite.g.O0, string4, l10);
            }
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.d(string3, string4, j10));
        }
        TestState p10 = this.f36786a.p();
        if (p10 != null) {
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.d(context.getString(com.google.android.ads.mediationtestsuite.g.P), context.getString(p10.i()), p10));
        }
        if (!this.f36786a.v()) {
            String string5 = context.getString(com.google.android.ads.mediationtestsuite.g.f20861i);
            AdapterStatus k10 = this.f36786a.k();
            if (k10 != null) {
                z10 = k10.getInitializationState() == AdapterStatus.State.READY;
            }
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.d(string5, context.getString(z10 ? com.google.android.ads.mediationtestsuite.g.K0 : com.google.android.ads.mediationtestsuite.g.J0), z10 ? TestState.f20946h : TestState.f20944f));
        }
        Map<String, String> l11 = this.f36786a.i().l();
        if (!l11.keySet().isEmpty()) {
            arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20788a, com.google.android.ads.mediationtestsuite.utils.k.d().o()));
            for (String str : l11.keySet()) {
                Map<String, String> u10 = this.f36786a.u();
                TestState testState = TestState.f20944f;
                if (u10.get(l11.get(str)) != null) {
                    testState = TestState.f20946h;
                }
                arrayList.add(new com.google.android.ads.mediationtestsuite.viewmodels.d(str, context.getString(testState.i()), testState));
            }
        }
        com.google.android.ads.mediationtestsuite.viewmodels.c cVar = new com.google.android.ads.mediationtestsuite.viewmodels.c(com.google.android.ads.mediationtestsuite.c.f20795h, com.google.android.ads.mediationtestsuite.g.f20847b);
        com.google.android.ads.mediationtestsuite.viewmodels.a aVar = new com.google.android.ads.mediationtestsuite.viewmodels.a(this.f36786a);
        arrayList.add(cVar);
        arrayList.add(aVar);
        return arrayList;
    }

    public NetworkConfig b() {
        return this.f36786a;
    }

    public String c(Context context) {
        int i10;
        if (this.f36786a.B()) {
            i10 = com.google.android.ads.mediationtestsuite.g.L0;
        } else {
            i10 = com.google.android.ads.mediationtestsuite.g.M0;
        }
        return context.getResources().getString(i10);
    }

    public String d(Context context) {
        return this.f36786a.n();
    }
}
