package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.l;
import java.io.IOException;

/* loaded from: classes2.dex */
public class c extends b {
    @Override // com.fyber.inneractive.sdk.response.b
    public void a(String str, y yVar) throws IOException {
        f fVar = (f) this.f20150a;
        String a10 = str == null ? null : g0.f20276g.a(str);
        int i10 = com.fyber.inneractive.sdk.config.e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
        if (!TextUtils.isEmpty(property)) {
            String c10 = l.c(property);
            if (!TextUtils.isEmpty(c10)) {
                a10 = c10;
            }
        }
        fVar.B = a10;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.response.b
    public e a() {
        f fVar = new f();
        this.f20150a = fVar;
        return fVar;
    }
}
