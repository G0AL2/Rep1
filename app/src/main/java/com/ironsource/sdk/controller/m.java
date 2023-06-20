package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.sdk.g.d;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public interface m {
    void a(Context context);

    void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar);

    void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2);

    void a(String str, com.ironsource.sdk.j.a.c cVar);

    void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar);

    void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2);

    void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar);

    void a(String str, String str2, com.ironsource.sdk.j.e eVar);

    void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar);

    void a(Map<String, String> map, com.ironsource.sdk.j.e eVar);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar);

    void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar);

    void b(Context context);

    void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2);

    d.c c();

    boolean c(String str);

    void d();

    void destroy();

    void e();

    void f();

    @Deprecated
    void g();

    void h();
}
