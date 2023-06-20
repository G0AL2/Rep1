package yd;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: SignalsReader.java */
/* loaded from: classes3.dex */
public class c implements pd.b {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f39524a;

    /* renamed from: b  reason: collision with root package name */
    private static d f39525b;

    /* compiled from: SignalsReader.java */
    /* loaded from: classes3.dex */
    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private pd.a f39526a;

        public a(c cVar, pd.a aVar) {
            this.f39526a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map unused = c.f39524a = new HashMap();
            String str = null;
            for (Map.Entry<String, b> entry : c.f39525b.a().entrySet()) {
                b value = entry.getValue();
                c.f39524a.put(value.b(), value.d());
                if (value.a() != null) {
                    str = value.a();
                }
            }
            if (c.f39524a.size() > 0) {
                this.f39526a.onSignalsCollected(new JSONObject(c.f39524a).toString());
            } else if (str == null) {
                this.f39526a.onSignalsCollected("");
            } else {
                this.f39526a.onSignalsCollectionFailed(str);
            }
        }
    }

    public c(d dVar) {
        f39525b = dVar;
    }

    private void e(Context context, String str, AdFormat adFormat, com.unity3d.scar.adapter.common.a aVar) {
        AdRequest build = new AdRequest.Builder().build();
        b bVar = new b(str);
        yd.a aVar2 = new yd.a(bVar, aVar);
        f39525b.c(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar2);
    }

    @Override // pd.b
    public void a(Context context, String[] strArr, String[] strArr2, pd.a aVar) {
        com.unity3d.scar.adapter.common.a aVar2 = new com.unity3d.scar.adapter.common.a();
        for (String str : strArr) {
            aVar2.a();
            e(context, str, AdFormat.INTERSTITIAL, aVar2);
        }
        for (String str2 : strArr2) {
            aVar2.a();
            e(context, str2, AdFormat.REWARDED, aVar2);
        }
        aVar2.c(new a(this, aVar));
    }
}
