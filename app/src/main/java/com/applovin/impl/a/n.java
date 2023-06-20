package com.applovin.impl.a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import java.util.Locale;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private Uri f6807a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f6808b;

    /* renamed from: c  reason: collision with root package name */
    private a f6809c;

    /* renamed from: d  reason: collision with root package name */
    private String f6810d;

    /* renamed from: e  reason: collision with root package name */
    private int f6811e;

    /* renamed from: f  reason: collision with root package name */
    private int f6812f;

    /* renamed from: g  reason: collision with root package name */
    private int f6813g;

    /* loaded from: classes.dex */
    public enum a {
        Progressive,
        Streaming
    }

    private n() {
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }

    public static n a(r rVar, com.applovin.impl.sdk.m mVar) {
        if (rVar != null) {
            if (mVar != null) {
                try {
                    String c10 = rVar.c();
                    if (!URLUtil.isValidUrl(c10)) {
                        if (v.a()) {
                            mVar.A().e("VastVideoFile", "Unable to create video file. Could not find URL.");
                            return null;
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(c10);
                    n nVar = new n();
                    nVar.f6807a = parse;
                    nVar.f6808b = parse;
                    nVar.f6813g = StringUtils.parseInt(rVar.b().get("bitrate"));
                    nVar.f6809c = a(rVar.b().get("delivery"));
                    nVar.f6812f = StringUtils.parseInt(rVar.b().get("height"));
                    nVar.f6811e = StringUtils.parseInt(rVar.b().get("width"));
                    nVar.f6810d = rVar.b().get("type").toLowerCase(Locale.ENGLISH);
                    return nVar;
                } catch (Throwable th) {
                    if (v.a()) {
                        mVar.A().b("VastVideoFile", "Error occurred while initializing", th);
                        return null;
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    public Uri a() {
        return this.f6807a;
    }

    public void a(Uri uri) {
        this.f6808b = uri;
    }

    public Uri b() {
        return this.f6808b;
    }

    public String c() {
        return this.f6810d;
    }

    public int d() {
        return this.f6813g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f6811e == nVar.f6811e && this.f6812f == nVar.f6812f && this.f6813g == nVar.f6813g) {
                Uri uri = this.f6807a;
                if (uri == null ? nVar.f6807a == null : uri.equals(nVar.f6807a)) {
                    Uri uri2 = this.f6808b;
                    if (uri2 == null ? nVar.f6808b == null : uri2.equals(nVar.f6808b)) {
                        if (this.f6809c != nVar.f6809c) {
                            return false;
                        }
                        String str = this.f6810d;
                        String str2 = nVar.f6810d;
                        return str != null ? str.equals(str2) : str2 == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        Uri uri = this.f6807a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f6808b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f6809c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f6810d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f6811e) * 31) + this.f6812f) * 31) + this.f6813g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f6807a + ", videoUri=" + this.f6808b + ", deliveryType=" + this.f6809c + ", fileType='" + this.f6810d + "', width=" + this.f6811e + ", height=" + this.f6812f + ", bitrate=" + this.f6813g + '}';
    }
}
