package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private String f6671a = null;

    /* renamed from: b  reason: collision with root package name */
    private int f6672b = -1;

    public t(Context context) {
    }

    public String a() {
        if (TextUtils.isEmpty(this.f6671a) || "0".equals(this.f6671a)) {
            String d10 = com.apm.insight.h.a().d();
            this.f6671a = d10;
            if (TextUtils.isEmpty(d10) || "0".equals(this.f6671a)) {
                String b10 = s.a().b();
                this.f6671a = b10;
                return b10;
            }
            return this.f6671a;
        }
        return this.f6671a;
    }

    public void a(String str) {
        this.f6671a = str;
        s.a().b(str);
    }

    public boolean b() {
        return this.f6671a != null;
    }
}
