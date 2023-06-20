package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.sdk.g.d;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    private final com.ironsource.environment.e.a f27826a;

    /* renamed from: b  reason: collision with root package name */
    String f27827b;

    /* loaded from: classes3.dex */
    final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27828a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27829b;

        a(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f27828a = cVar;
            this.f27829b = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27828a.b(this.f27829b.f28143b, p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27831a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ JSONObject f27832b;

        b(com.ironsource.sdk.j.a.c cVar, JSONObject jSONObject) {
            this.f27831a = cVar;
            this.f27832b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27831a.c(this.f27832b.optString("demandSourceName"), p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f27834a;

        c(com.ironsource.sdk.j.e eVar) {
            this.f27834a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27834a.onOfferwallInitFail(p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27836a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27837b;

        d(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f27836a = cVar;
            this.f27837b = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27836a.c(this.f27837b.f28143b, p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.b f27839a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Map f27840b;

        e(com.ironsource.sdk.j.a.b bVar, Map map) {
            this.f27839a = bVar;
            this.f27840b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27839a.d((String) this.f27840b.get("demandSourceName"), p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f27842a;

        f(com.ironsource.sdk.j.e eVar) {
            this.f27842a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27842a.onOWShowFail(p.this.f27827b);
            this.f27842a.onOfferwallInitFail(p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.e f27844a;

        g(com.ironsource.sdk.j.e eVar) {
            this.f27844a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27844a.onGetOWCreditsFailed(p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.d f27846a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27847b;

        h(com.ironsource.sdk.j.a.d dVar, com.ironsource.sdk.g.c cVar) {
            this.f27846a = dVar;
            this.f27847b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27846a.a(d.e.RewardedVideo, this.f27847b.f28143b, p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.d f27849a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ JSONObject f27850b;

        i(com.ironsource.sdk.j.a.d dVar, JSONObject jSONObject) {
            this.f27849a = dVar;
            this.f27850b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27849a.a(this.f27850b.optString("demandSourceName"), p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27852a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f27853b;

        j(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.f27852a = cVar;
            this.f27853b = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27852a.a(d.e.Interstitial, this.f27853b.f28143b, p.this.f27827b);
        }
    }

    /* loaded from: classes3.dex */
    final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.j.a.c f27855a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27856b;

        k(com.ironsource.sdk.j.a.c cVar, String str) {
            this.f27855a = cVar;
            this.f27856b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f27855a.b(this.f27856b, p.this.f27827b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(String str, com.ironsource.environment.e.a aVar) {
        this.f27827b = "";
        this.f27826a = aVar;
        this.f27827b = str;
    }

    private void b(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f27826a;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            b(new e(bVar, map));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new a(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        if (cVar != null) {
            b(new k(cVar, str));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            bVar.a(d.e.Banner, cVar.f28143b, this.f27827b);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new j(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        if (dVar != null) {
            b(new h(dVar, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new g(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new c(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new f(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        if (cVar != null) {
            b(new b(cVar, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        if (dVar != null) {
            b(new i(dVar, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new d(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return d.c.Native;
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void destroy() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void g() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void h() {
    }
}
