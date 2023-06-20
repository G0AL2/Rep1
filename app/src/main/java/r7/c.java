package r7;

import android.content.Context;
import android.net.Uri;
import com.google.android.ads.mediationtestsuite.utils.k;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import q2.p;
import q2.u;
import r2.o;
import r2.q;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Logger.java */
    /* loaded from: classes2.dex */
    public class a implements p.b<String> {
        a() {
        }

        @Override // q2.p.b
        /* renamed from: b */
        public void a(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Logger.java */
    /* loaded from: classes2.dex */
    public class b implements p.a {
        b() {
        }

        @Override // q2.p.a
        public void a(u uVar) {
        }
    }

    private static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        k s10 = k.s();
        hashMap.put("id", "gmob-apps");
        hashMap.put("application_id", s10.a(context));
        hashMap.put("admob_app_id", s10.c());
        hashMap.put("test_suite_version", s10.g());
        hashMap.put("session_id", s10.f());
        hashMap.put("timestamp", String.valueOf(new Date().getTime()));
        if (k.s().b() != null) {
            hashMap.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, k.s().b());
        }
        hashMap.put("user_agent", k.s().h());
        return hashMap;
    }

    public static void b(r7.b bVar, Context context) {
        Map<String, String> a10 = a(context);
        if (bVar.a() != null) {
            a10.putAll(bVar.a());
        }
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        for (String str : a10.keySet()) {
            buildUpon.appendQueryParameter(str, a10.get(str));
        }
        buildUpon.appendQueryParameter("event_type", bVar.b());
        q.a(context).a(new o(0, buildUpon.build().toString(), new a(), new b()));
    }
}
