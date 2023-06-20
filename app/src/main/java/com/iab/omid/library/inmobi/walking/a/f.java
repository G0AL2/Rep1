package com.iab.omid.library.inmobi.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.inmobi.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class f extends a {
    public f(b.InterfaceC0323b interfaceC0323b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0323b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.inmobi.b.a a10 = com.iab.omid.library.inmobi.b.a.a();
        if (a10 != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : a10.b()) {
                if (((a) this).f24231a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f24233c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.inmobi.d.b.b(this.f24232b, this.f24235d.b())) {
            return null;
        }
        this.f24235d.a(this.f24232b);
        return this.f24232b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.inmobi.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
