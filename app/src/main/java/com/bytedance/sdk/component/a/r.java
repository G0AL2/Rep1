package com.bytedance.sdk.component.a;

import android.webkit.WebView;
import com.bytedance.sdk.component.a.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsBridge2.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    static w f9275a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9276b;

    /* renamed from: c  reason: collision with root package name */
    private final WebView f9277c;

    /* renamed from: d  reason: collision with root package name */
    private final j f9278d;

    /* renamed from: e  reason: collision with root package name */
    private final List<n> f9279e;

    /* renamed from: f  reason: collision with root package name */
    private o f9280f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f9281g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(j jVar) {
        w wVar;
        ArrayList arrayList = new ArrayList();
        this.f9279e = arrayList;
        this.f9281g = false;
        this.f9278d = jVar;
        v a10 = (!jVar.f9250h || (wVar = f9275a) == null) ? null : wVar.a(jVar.f9253k);
        if (jVar.f9243a != null) {
            a aVar = jVar.f9244b;
            if (aVar == null) {
                this.f9276b = new z();
            } else {
                this.f9276b = aVar;
            }
        } else {
            this.f9276b = jVar.f9244b;
        }
        this.f9276b.a(jVar, a10);
        this.f9277c = jVar.f9243a;
        arrayList.add(jVar.f9252j);
        i.a(jVar.f9248f);
        y.a(jVar.f9249g);
    }

    public static j a(WebView webView) {
        return new j(webView);
    }

    private void b() {
        if (this.f9281g) {
            i.a(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public r a(String str, e<?, ?> eVar) {
        return a(str, (String) null, eVar);
    }

    public r a(String str, String str2, e<?, ?> eVar) {
        b();
        this.f9276b.f9211g.a(str, eVar);
        o oVar = this.f9280f;
        if (oVar != null) {
            oVar.a(str);
        }
        return this;
    }

    public r a(String str, d.b bVar) {
        return a(str, (String) null, bVar);
    }

    public r a(String str, String str2, d.b bVar) {
        b();
        this.f9276b.f9211g.a(str, bVar);
        o oVar = this.f9280f;
        if (oVar != null) {
            oVar.a(str);
        }
        return this;
    }

    public void a() {
        if (this.f9281g) {
            return;
        }
        this.f9276b.b();
        this.f9281g = true;
        for (n nVar : this.f9279e) {
            if (nVar != null) {
                nVar.a();
            }
        }
    }
}
