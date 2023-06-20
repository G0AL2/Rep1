package io.invertase.firebase.common;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: UniversalFirebaseModule.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f32085a = new b(e());

    /* renamed from: b  reason: collision with root package name */
    private final Context f32086b;

    /* renamed from: c  reason: collision with root package name */
    private final String f32087c;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(Context context, String str) {
        this.f32086b = context;
        this.f32087c = str;
    }

    public Context a() {
        return c().getApplicationContext();
    }

    public Map<String, Object> b() {
        return new HashMap();
    }

    public Context c() {
        return this.f32086b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ExecutorService d() {
        return this.f32085a.b();
    }

    public String e() {
        return "Universal" + this.f32087c + "Module";
    }
}
