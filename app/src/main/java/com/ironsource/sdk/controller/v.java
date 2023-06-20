package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.a;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: e  reason: collision with root package name */
    static final String f27883e = "v";

    /* renamed from: a  reason: collision with root package name */
    com.ironsource.sdk.service.d f27884a;

    /* renamed from: c  reason: collision with root package name */
    Context f27886c;

    /* renamed from: b  reason: collision with root package name */
    com.ironsource.sdk.service.c f27885b = new com.ironsource.sdk.service.c();

    /* renamed from: d  reason: collision with root package name */
    private com.ironsource.environment.f.b f27887d = new com.ironsource.environment.f.b();

    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f27888a;

        /* renamed from: b  reason: collision with root package name */
        JSONObject f27889b;

        /* renamed from: c  reason: collision with root package name */
        String f27890c;

        /* renamed from: d  reason: collision with root package name */
        String f27891d;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public v(Context context, com.ironsource.sdk.service.d dVar) {
        this.f27884a = dVar;
        this.f27886c = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a() {
        JSONObject a10 = this.f27887d.a();
        Iterator<String> keys = a10.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a10.get(next);
            if (obj instanceof String) {
                a10.put(next, a.AnonymousClass1.a((String) obj));
            }
        }
        return a10;
    }
}
