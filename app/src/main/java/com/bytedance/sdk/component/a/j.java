package com.bytedance.sdk.component.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.a.k;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Environment.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    WebView f9243a;

    /* renamed from: b  reason: collision with root package name */
    a f9244b;

    /* renamed from: d  reason: collision with root package name */
    h f9246d;

    /* renamed from: e  reason: collision with root package name */
    Context f9247e;

    /* renamed from: f  reason: collision with root package name */
    boolean f9248f;

    /* renamed from: g  reason: collision with root package name */
    boolean f9249g;

    /* renamed from: h  reason: collision with root package name */
    boolean f9250h;

    /* renamed from: i  reason: collision with root package name */
    m f9251i;

    /* renamed from: j  reason: collision with root package name */
    n f9252j;

    /* renamed from: n  reason: collision with root package name */
    boolean f9256n;

    /* renamed from: o  reason: collision with root package name */
    boolean f9257o;

    /* renamed from: p  reason: collision with root package name */
    k.b f9258p;

    /* renamed from: c  reason: collision with root package name */
    String f9245c = "IESJSBridge";

    /* renamed from: k  reason: collision with root package name */
    String f9253k = "host";

    /* renamed from: l  reason: collision with root package name */
    final Set<String> f9254l = new LinkedHashSet();

    /* renamed from: m  reason: collision with root package name */
    final Set<String> f9255m = new LinkedHashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(WebView webView) {
        this.f9243a = webView;
    }

    private void c() {
        if ((this.f9243a == null && !this.f9256n && this.f9244b == null) || ((TextUtils.isEmpty(this.f9245c) && this.f9243a != null) || this.f9246d == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public j a(a aVar) {
        this.f9244b = aVar;
        return this;
    }

    public j b(boolean z10) {
        this.f9249g = z10;
        return this;
    }

    public j a(String str) {
        this.f9245c = str;
        return this;
    }

    public r b() {
        c();
        return new r(this);
    }

    public j a(l lVar) {
        this.f9246d = h.a(lVar);
        return this;
    }

    public j a(boolean z10) {
        this.f9248f = z10;
        return this;
    }

    public j a() {
        this.f9257o = true;
        return this;
    }

    j() {
    }
}
