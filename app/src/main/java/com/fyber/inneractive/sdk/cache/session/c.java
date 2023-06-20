package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.d;
import com.fyber.inneractive.sdk.util.l;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.a f16835a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.cache.session.enums.b f16836b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f16837c;

    public c(d dVar, com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.b bVar) {
        this.f16837c = dVar;
        this.f16835a = aVar;
        this.f16836b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f16837c.f16840c) {
            com.fyber.inneractive.sdk.cache.session.enums.a aVar = this.f16835a;
            if (aVar != com.fyber.inneractive.sdk.cache.session.enums.a.NEW_SESSION) {
                e eVar = this.f16837c.f16838a.f16863a.get(this.f16836b);
                if (eVar != null) {
                    int ordinal = aVar.ordinal();
                    if (ordinal == 0) {
                        eVar.f16843a++;
                    } else if (ordinal == 1) {
                        eVar.f16844b++;
                    } else if (ordinal == 2) {
                        eVar.f16845c++;
                    }
                }
            } else {
                this.f16837c.f16838a = new f();
            }
            JSONObject a10 = d.a(this.f16837c);
            boolean z10 = false;
            try {
                z10 = l.a("session_details.json", l.f20301a, a10.toString().getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            d dVar = this.f16837c;
            d.a aVar2 = dVar.f16842e;
            if (aVar2 != null) {
                aVar2.a(dVar, z10, a10);
            }
        }
    }
}
