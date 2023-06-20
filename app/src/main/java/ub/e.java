package ub;

import android.os.Bundle;
import java.util.Locale;
import rb.a;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes3.dex */
class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private wb.b f37707a;

    /* renamed from: b  reason: collision with root package name */
    private wb.b f37708b;

    private static void b(wb.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.s(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        wb.b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f37707a;
        } else {
            bVar = this.f37708b;
        }
        b(bVar, str, bundle);
    }

    @Override // rb.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        vb.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(wb.b bVar) {
        this.f37708b = bVar;
    }

    public void e(wb.b bVar) {
        this.f37707a = bVar;
    }
}
