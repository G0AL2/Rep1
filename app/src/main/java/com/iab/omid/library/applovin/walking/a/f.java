package com.iab.omid.library.applovin.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.applovin.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0317b interfaceC0317b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0317b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.b.a a10 = com.iab.omid.library.applovin.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : a10.b()) {
                if (((a) this).f23998a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f24000c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.applovin.d.b.b(this.f23999b, this.f24004d.b())) {
            return null;
        }
        this.f24004d.a(this.f23999b);
        return this.f23999b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.applovin.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
