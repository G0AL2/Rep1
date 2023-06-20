package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import ye.b0;

/* loaded from: classes.dex */
public class p0 extends h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ye.z f17678a = new ye.z();

    /* renamed from: b  reason: collision with root package name */
    public ye.d0 f17679b = null;

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    @Override // com.fyber.inneractive.sdk.network.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.fyber.inneractive.sdk.network.j a(com.fyber.inneractive.sdk.network.b0<T> r11, java.lang.String r12, java.lang.String r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.p0.a(com.fyber.inneractive.sdk.network.b0, java.lang.String, java.lang.String):com.fyber.inneractive.sdk.network.j");
    }

    @Override // com.fyber.inneractive.sdk.network.g
    public void b() {
        try {
            ye.d0 d0Var = this.f17679b;
            if (d0Var != null) {
                d0Var.close();
                if (this.f17679b.a() != null) {
                    this.f17679b.a().close();
                }
            }
        } catch (Throwable th) {
            IAlog.a("%s exception during disconnect with exception %s", "OkHttpExecutorImpl", th);
        }
        this.f17679b = null;
    }

    public final void a(b0.a aVar, String str, String str2) {
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        aVar.a(str, str2);
    }
}
