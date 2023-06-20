package s7;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.Caption;
import com.google.android.ads.mediationtestsuite.dataobjects.Matchable;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* compiled from: NetworkConfigViewModel.java */
/* loaded from: classes2.dex */
public class l extends com.google.android.ads.mediationtestsuite.viewmodels.b implements Matchable {

    /* renamed from: b  reason: collision with root package name */
    private final NetworkConfig f36787b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NetworkConfigViewModel.java */
    /* loaded from: classes2.dex */
    public class a implements Comparator<l> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f36788a;

        a(Context context) {
            this.f36788a = context;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(l lVar, l lVar2) {
            if (lVar.o() > lVar2.o()) {
                return 1;
            }
            if (lVar.o() == lVar2.o()) {
                return lVar.i(this.f36788a).toLowerCase(Locale.getDefault()).compareTo(lVar2.i(this.f36788a).toLowerCase(Locale.getDefault()));
            }
            return -1;
        }
    }

    public l(NetworkConfig networkConfig) {
        this.f36787b = networkConfig;
    }

    public static Comparator<l> p(Context context) {
        return new a(context);
    }

    @Override // com.google.android.ads.mediationtestsuite.dataobjects.Matchable
    public boolean c(CharSequence charSequence) {
        return this.f36787b.c(charSequence);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).n().equals(this.f36787b);
        }
        return false;
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public List<Caption> g() {
        ArrayList arrayList = new ArrayList();
        TestState s10 = this.f36787b.s();
        if (s10 != null) {
            arrayList.add(new Caption(s10, Caption.Component.SDK));
        }
        TestState p10 = this.f36787b.p();
        if (p10 != null) {
            arrayList.add(new Caption(p10, Caption.Component.MANIFEST));
        }
        TestState j10 = this.f36787b.j();
        if (j10 != null) {
            arrayList.add(new Caption(j10, Caption.Component.ADAPTER));
        }
        TestState f10 = this.f36787b.f();
        if (f10 != null) {
            arrayList.add(new Caption(f10, Caption.Component.AD_LOAD));
        }
        return arrayList;
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public String h(Context context) {
        return String.format(context.getString(com.google.android.ads.mediationtestsuite.g.f20873o), this.f36787b.i().g().getDisplayString().toLowerCase(Locale.getDefault()));
    }

    public int hashCode() {
        return this.f36787b.hashCode();
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public String i(Context context) {
        return this.f36787b.i().j();
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public boolean l() {
        return this.f36787b.D();
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.b
    public boolean m() {
        return true;
    }

    public NetworkConfig n() {
        return this.f36787b;
    }

    public int o() {
        if (this.f36787b.f() == TestState.f20946h) {
            return 2;
        }
        return this.f36787b.D() ? 1 : 0;
    }
}
