package com.iab.omid.library.fyber.walking.a;

import com.iab.omid.library.fyber.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e extends a {
    public e(b.InterfaceC0320b interfaceC0320b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0320b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.fyber.b.a a10 = com.iab.omid.library.fyber.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.fyber.adsession.a aVar : a10.b()) {
                if (((a) this).f24118a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f24120c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f24119b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.fyber.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
