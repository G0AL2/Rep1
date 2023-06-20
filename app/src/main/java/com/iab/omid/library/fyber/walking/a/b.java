package com.iab.omid.library.fyber.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private a f24121a;

    /* renamed from: d  reason: collision with root package name */
    protected final InterfaceC0320b f24122d;

    /* loaded from: classes3.dex */
    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.fyber.walking.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0320b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0320b interfaceC0320b) {
        this.f24122d = interfaceC0320b;
    }

    public void a(a aVar) {
        this.f24121a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.f24121a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
