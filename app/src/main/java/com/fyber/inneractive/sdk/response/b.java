package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.y;
import com.fyber.inneractive.sdk.network.m;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public e f20150a;

    /* renamed from: b  reason: collision with root package name */
    public String f20151b;

    /* renamed from: c  reason: collision with root package name */
    public j f20152c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20153d = true;

    public abstract e a();

    public void a(m mVar) {
        this.f20150a = a();
    }

    public abstract void a(String str, y yVar) throws Exception;

    public abstract boolean b();

    public e a(String str) throws Exception {
        this.f20153d = str != null;
        e eVar = this.f20150a;
        eVar.getClass();
        eVar.f20162c = System.currentTimeMillis();
        this.f20152c.a(this);
        String a10 = this.f20152c.a();
        this.f20150a.f20167h = a10;
        y b10 = com.fyber.inneractive.sdk.config.a.b(this.f20151b);
        IAlog.a("%sGot unit config for unitId: %s from config manager", IAlog.a(this), this.f20151b);
        IAlog.a("%s%s", IAlog.a(this), b10);
        if (this.f20153d) {
            a(str, b10);
        } else if (!(this instanceof com.fyber.inneractive.sdk.dv.e)) {
            h hVar = new h(a10);
            if (hVar.f20186a) {
                String str2 = hVar.f20187b;
                if (str2 != null && !TextUtils.isEmpty(str2.trim())) {
                    a(str2, b10);
                } else {
                    throw new Exception("empty ad content detected. failing fast.");
                }
            }
        } else {
            a(a10, b10);
        }
        return this.f20150a;
    }
}
