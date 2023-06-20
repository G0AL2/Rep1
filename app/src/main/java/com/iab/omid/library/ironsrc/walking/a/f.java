package com.iab.omid.library.ironsrc.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0326b interfaceC0326b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0326b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.ironsrc.b.a a10 = com.iab.omid.library.ironsrc.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a aVar : a10.b()) {
                if (((a) this).f24345a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f24347c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.ironsrc.d.b.b(this.f24346b, this.f24349d.b())) {
            return null;
        }
        this.f24349d.a(this.f24346b);
        return this.f24346b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.ironsrc.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
