package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private a f6777a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f6778b;

    /* renamed from: c  reason: collision with root package name */
    private String f6779c;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h a(r rVar, h hVar, com.applovin.impl.sdk.m mVar) {
        if (rVar != null) {
            if (mVar != null) {
                if (hVar == null) {
                    try {
                        hVar = new h();
                    } catch (Throwable th) {
                        if (v.a()) {
                            mVar.A().b("VastNonVideoResource", "Error occurred while initializing", th);
                            return null;
                        }
                        return null;
                    }
                }
                if (hVar.f6778b == null && !StringUtils.isValidString(hVar.f6779c)) {
                    String a10 = a(rVar, "StaticResource");
                    if (URLUtil.isValidUrl(a10)) {
                        hVar.f6778b = Uri.parse(a10);
                        hVar.f6777a = a.STATIC;
                        return hVar;
                    }
                    String a11 = a(rVar, "IFrameResource");
                    if (StringUtils.isValidString(a11)) {
                        hVar.f6777a = a.IFRAME;
                        if (URLUtil.isValidUrl(a11)) {
                            hVar.f6778b = Uri.parse(a11);
                        } else {
                            hVar.f6779c = a11;
                        }
                        return hVar;
                    }
                    String a12 = a(rVar, "HTMLResource");
                    if (StringUtils.isValidString(a12)) {
                        hVar.f6777a = a.HTML;
                        if (URLUtil.isValidUrl(a12)) {
                            hVar.f6778b = Uri.parse(a12);
                        } else {
                            hVar.f6779c = a12;
                        }
                    }
                }
                return hVar;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    private static String a(r rVar, String str) {
        r b10 = rVar.b(str);
        if (b10 != null) {
            return b10.c();
        }
        return null;
    }

    public a a() {
        return this.f6777a;
    }

    public void a(Uri uri) {
        this.f6778b = uri;
    }

    public void a(String str) {
        this.f6779c = str;
    }

    public Uri b() {
        return this.f6778b;
    }

    public String c() {
        return this.f6779c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f6777a != hVar.f6777a) {
                return false;
            }
            Uri uri = this.f6778b;
            if (uri == null ? hVar.f6778b == null : uri.equals(hVar.f6778b)) {
                String str = this.f6779c;
                String str2 = hVar.f6779c;
                return str != null ? str.equals(str2) : str2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        a aVar = this.f6777a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f6778b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f6779c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "VastNonVideoResource{type=" + this.f6777a + ", resourceUri=" + this.f6778b + ", resourceContents='" + this.f6779c + "'}";
    }
}
