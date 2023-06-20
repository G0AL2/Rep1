package ye;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import ye.m;

/* compiled from: JavaNetCookieJar.kt */
/* loaded from: classes3.dex */
public final class w implements n {

    /* renamed from: b  reason: collision with root package name */
    private final CookieHandler f39776b;

    public w(CookieHandler cookieHandler) {
        qe.k.f(cookieHandler, "cookieHandler");
        this.f39776b = cookieHandler;
    }

    private final List<m> e(u uVar, String str) {
        boolean y10;
        boolean y11;
        boolean k10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            int n10 = ze.c.n(str, ";,", i10, length);
            int m10 = ze.c.m(str, '=', i10, n10);
            String V = ze.c.V(str, i10, m10);
            y10 = ve.p.y(V, "$", false, 2, null);
            if (!y10) {
                String V2 = m10 < n10 ? ze.c.V(str, m10 + 1, n10) : "";
                y11 = ve.p.y(V2, "\"", false, 2, null);
                if (y11) {
                    k10 = ve.p.k(V2, "\"", false, 2, null);
                    if (k10) {
                        V2 = V2.substring(1, V2.length() - 1);
                        qe.k.e(V2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                }
                arrayList.add(new m.a().d(V).e(V2).b(uVar.h()).a());
            }
            i10 = n10 + 1;
        }
        return arrayList;
    }

    @Override // ye.n
    public List<m> a(u uVar) {
        List<m> h10;
        Map<String, List<String>> g10;
        List<m> h11;
        boolean l10;
        boolean l11;
        qe.k.f(uVar, ImagesContract.URL);
        try {
            CookieHandler cookieHandler = this.f39776b;
            URI r10 = uVar.r();
            g10 = fe.h0.g();
            Map<String, List<String>> map = cookieHandler.get(r10, g10);
            ArrayList arrayList = null;
            qe.k.e(map, "cookieHeaders");
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                l10 = ve.p.l("Cookie", key, true);
                if (!l10) {
                    l11 = ve.p.l("Cookie2", key, true);
                    if (l11) {
                    }
                }
                qe.k.e(value, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (!value.isEmpty()) {
                    for (String str : value) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        qe.k.e(str, "header");
                        arrayList.addAll(e(uVar, str));
                    }
                }
            }
            if (arrayList != null) {
                List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
                qe.k.e(unmodifiableList, "Collections.unmodifiableList(cookies)");
                return unmodifiableList;
            }
            h11 = fe.p.h();
            return h11;
        } catch (IOException e10) {
            okhttp3.internal.platform.h g11 = okhttp3.internal.platform.h.f35277c.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Loading cookies failed for ");
            u p10 = uVar.p("/...");
            qe.k.c(p10);
            sb2.append(p10);
            g11.k(sb2.toString(), 5, e10);
            h10 = fe.p.h();
            return h10;
        }
    }

    @Override // ye.n
    public void c(u uVar, List<m> list) {
        Map<String, List<String>> e10;
        qe.k.f(uVar, ImagesContract.URL);
        qe.k.f(list, "cookies");
        ArrayList arrayList = new ArrayList();
        for (m mVar : list) {
            arrayList.add(ze.b.a(mVar, true));
        }
        e10 = fe.g0.e(ee.q.a("Set-Cookie", arrayList));
        try {
            this.f39776b.put(uVar.r(), e10);
        } catch (IOException e11) {
            okhttp3.internal.platform.h g10 = okhttp3.internal.platform.h.f35277c.g();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Saving cookies failed for ");
            u p10 = uVar.p("/...");
            qe.k.c(p10);
            sb2.append(p10);
            g10.k(sb2.toString(), 5, e11);
        }
    }
}
