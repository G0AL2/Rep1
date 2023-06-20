package vd;

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
    private static d f38076a;

    /* compiled from: SignalsReader.java */
    /* loaded from: classes3.dex */
    private class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private pd.a f38077a;

        public a(c cVar, pd.a aVar) {
            this.f38077a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap hashMap = new HashMap();
            String str = null;
            for (Map.Entry<String, b> entry : c.f38076a.a().entrySet()) {
                b value = entry.getValue();
                hashMap.put(value.b(), value.d());
                if (value.a() != null) {
                    str = value.a();
                }
            }
            if (hashMap.size() > 0) {
                this.f38077a.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str == null) {
                this.f38077a.onSignalsCollected("");
            } else {
                this.f38077a.onSignalsCollectionFailed(str);
            }
        }
    }

    public c(d dVar) {
        f38076a = dVar;
    }

    private void c(Context context, String str, AdFormat adFormat, com.unity3d.scar.adapter.common.a aVar) {
        AdRequest build = new AdRequest.Builder().build();
        b bVar = new b(str);
        vd.a aVar2 = new vd.a(bVar, aVar);
        f38076a.c(str, bVar);
        QueryInfo.generate(context, adFormat, build, aVar2);
    }

    @Override // pd.b
    public void a(Context context, String[] strArr, String[] strArr2, pd.a aVar) {
        com.unity3d.scar.adapter.common.a aVar2 = new com.unity3d.scar.adapter.common.a();
        for (String str : strArr) {
            aVar2.a();
            c(context, str, AdFormat.INTERSTITIAL, aVar2);
        }
        for (String str2 : strArr2) {
            aVar2.a();
            c(context, str2, AdFormat.REWARDED, aVar2);
        }
        aVar2.c(new a(this, aVar));
    }
}
