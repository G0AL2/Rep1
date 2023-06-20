package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class c extends a implements h.a {

    /* renamed from: a  reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.e f8357a;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinAdLoadListener f8358c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.sdk.q f8359d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.sdk.r f8360e;

    /* renamed from: f  reason: collision with root package name */
    private final Collection<Character> f8361f;

    /* renamed from: g  reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f8362g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8363h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.m mVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, mVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f8357a = eVar;
        this.f8358c = appLovinAdLoadListener;
        this.f8359d = mVar.ab();
        this.f8360e = mVar.aa();
        this.f8361f = j();
        this.f8362g = new com.applovin.impl.sdk.d.e();
    }

    private Uri a(Uri uri, String str) {
        StringBuilder sb2;
        String str2;
        if (uri != null) {
            String uri2 = uri.toString();
            if (StringUtils.isValidString(uri2)) {
                if (com.applovin.impl.sdk.v.a()) {
                    a("Caching " + str + " image...");
                }
                return g(uri2);
            } else if (!com.applovin.impl.sdk.v.a()) {
                return null;
            } else {
                sb2 = new StringBuilder();
                sb2.append("Failed to cache ");
                sb2.append(str);
                str2 = " image";
            }
        } else if (!com.applovin.impl.sdk.v.a()) {
            return null;
        } else {
            sb2 = new StringBuilder();
            sb2.append("No ");
            sb2.append(str);
            str2 = " image to cache";
        }
        sb2.append(str2);
        a(sb2.toString());
        return null;
    }

    private Uri a(String str, String str2) {
        StringBuilder sb2;
        if (this.f8360e != null) {
            return b(str, str2);
        }
        String replace = str2.replace("/", "_");
        String L = this.f8357a.L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a10 = this.f8359d.a(replace, this.f8349b.L());
        if (a10 == null) {
            return null;
        }
        if (a10.exists()) {
            this.f8362g.b(a10.length());
            sb2 = new StringBuilder();
        } else {
            if (!this.f8359d.a(a10, str + str2, Arrays.asList(str), this.f8362g)) {
                return null;
            }
            sb2 = new StringBuilder();
        }
        sb2.append("file://");
        sb2.append(a10.getAbsolutePath());
        return Uri.parse(sb2.toString());
    }

    private Uri b(String str, String str2) {
        StringBuilder sb2;
        String replace = str2.replace("/", "_");
        String L = this.f8357a.L();
        if (StringUtils.isValidString(L)) {
            replace = L + replace;
        }
        File a10 = this.f8360e.a(replace, this.f8349b.L());
        if (a10 == null) {
            return null;
        }
        if (a10.exists()) {
            this.f8362g.b(a10.length());
            sb2 = new StringBuilder();
        } else {
            if (!this.f8360e.a(a10, str + str2, Arrays.asList(str), this.f8362g)) {
                return null;
            }
            sb2 = new StringBuilder();
        }
        sb2.append("file://");
        sb2.append(a10.getAbsolutePath());
        return Uri.parse(sb2.toString());
    }

    private Uri g(String str) {
        return c(str, this.f8357a.H(), true);
    }

    private Collection<Character> j() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f8349b.a(com.applovin.impl.sdk.c.b.bm)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri a(String str, List<String> list, boolean z10) {
        String str2;
        if (this.f8360e != null) {
            return b(str, list, z10);
        }
        if (StringUtils.isValidString(str)) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Caching video " + str + "...");
            }
            String a10 = this.f8359d.a(f(), str, this.f8357a.L(), list, z10, this.f8362g);
            if (!StringUtils.isValidString(a10)) {
                if (com.applovin.impl.sdk.v.a()) {
                    d("Failed to cache video");
                }
                h();
                return null;
            }
            File a11 = this.f8359d.a(a10, f());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    if (com.applovin.impl.sdk.v.a()) {
                        a("Finish caching video for ad #" + this.f8357a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a10);
                    }
                    return fromFile;
                } else if (!com.applovin.impl.sdk.v.a()) {
                    return null;
                } else {
                    str2 = "Unable to create URI from cached video file = " + a11;
                }
            } else if (!com.applovin.impl.sdk.v.a()) {
                return null;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            d(str2);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, List<String> list) {
        InputStream inputStream;
        if (this.f8360e != null) {
            return b(str, list);
        }
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                if (com.applovin.impl.sdk.v.a()) {
                    a("Nothing to cache, skipping...");
                }
                return null;
            }
            String fileName = ((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f8357a.L())) {
                fileName = this.f8357a.L() + fileName;
            }
            try {
                File a10 = this.f8359d.a(fileName, f());
                if (a10 != null && a10.exists()) {
                    return this.f8359d.a(a10);
                }
                try {
                    inputStream = this.f8359d.a(str, list, true, this.f8362g);
                    if (inputStream != null) {
                        try {
                            this.f8359d.b(inputStream, a10);
                        } catch (Throwable th) {
                            th = th;
                            Utils.close(inputStream, this.f8349b);
                            throw th;
                        }
                    }
                    Utils.close(inputStream, this.f8349b);
                    return this.f8359d.a(a10);
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                }
            } catch (Throwable th3) {
                if (com.applovin.impl.sdk.v.a()) {
                    a("Resource at " + str + " failed to load.", th3);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0038, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String a(java.lang.String r11, java.util.List<java.lang.String> r12, com.applovin.impl.sdk.ad.e r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.c.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.e):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
        this.f8349b.H().b(this);
    }

    @Override // com.applovin.impl.mediation.h.a
    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.f().equalsIgnoreCase(this.f8357a.N())) {
            if (com.applovin.impl.sdk.v.a()) {
                d("Updating flag for timeout...");
            }
            this.f8363h = true;
        }
        this.f8349b.H().b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(AppLovinAdBase appLovinAdBase) {
        com.applovin.impl.sdk.d.d.a(this.f8362g, appLovinAdBase, this.f8349b);
    }

    Uri b(String str, List<String> list, boolean z10) {
        String str2;
        if (StringUtils.isValidString(str)) {
            a("Caching video " + str + "...");
            String a10 = this.f8360e.a(f(), str, this.f8357a.L(), list, z10, this.f8362g);
            if (!StringUtils.isValidString(a10)) {
                d("Failed to cache video");
                h();
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", this.f8357a.getAdIdNumber());
                bundle.putInt("load_response_code", this.f8362g.j());
                Exception i10 = this.f8362g.i();
                if (i10 != null) {
                    bundle.putString("load_exception_message", i10.getMessage());
                }
                this.f8349b.ag().a(bundle, "video_caching_failed");
                return null;
            }
            File a11 = this.f8360e.a(a10, f());
            if (a11 != null) {
                Uri fromFile = Uri.fromFile(a11);
                if (fromFile != null) {
                    a("Finish caching video for ad #" + this.f8357a.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + a10);
                    return fromFile;
                }
                str2 = "Unable to create URI from cached video file = " + a11;
            } else {
                str2 = "Unable to cache video = " + str + "Video file was missing or null";
            }
            d(str2);
            return null;
        }
        return null;
    }

    String b(String str, List<String> list) {
        if (StringUtils.isValidString(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                a("Nothing to cache, skipping...");
                return null;
            }
            String fileName = ((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.b.eT)).booleanValue() ? Utils.getFileName(parse) : parse.getLastPathSegment();
            if (StringUtils.isValidString(this.f8357a.L())) {
                fileName = this.f8357a.L() + fileName;
            }
            File a10 = this.f8360e.a(fileName, f());
            ByteArrayOutputStream a11 = (a10 == null || !a10.exists()) ? null : this.f8360e.a(a10);
            if (a11 == null) {
                a11 = this.f8360e.a(str, list, true, this.f8362g);
                if (a11 != null) {
                    this.f8360e.a(a11, a10);
                    this.f8362g.a(a11.size());
                }
            } else {
                this.f8362g.b(a11.size());
            }
            try {
                return a11.toString("UTF-8");
            } catch (UnsupportedEncodingException e10) {
                a("UTF-8 encoding not supported.", e10);
            } catch (Throwable th) {
                a("String resource at " + str + " failed to load.", th);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b() {
        return this.f8363h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri c(String str, List<String> list, boolean z10) {
        String str2;
        if (this.f8360e != null) {
            return d(str, list, z10);
        }
        try {
            String a10 = this.f8359d.a(f(), str, this.f8357a.L(), list, z10, this.f8362g);
            if (StringUtils.isValidString(a10)) {
                File a11 = this.f8359d.a(a10, f());
                if (a11 != null) {
                    Uri fromFile = Uri.fromFile(a11);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    if (!com.applovin.impl.sdk.v.a()) {
                        return null;
                    }
                    str2 = "Unable to extract Uri from image file";
                } else if (!com.applovin.impl.sdk.v.a()) {
                    return null;
                } else {
                    str2 = "Unable to retrieve File from cached image filename = " + a10;
                }
                d(str2);
                return null;
            }
            return null;
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Failed to cache image at url = " + str, th);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (com.applovin.impl.sdk.v.a()) {
            a("Caching mute images...");
        }
        Uri a10 = a(this.f8357a.aC(), "mute");
        if (a10 != null) {
            this.f8357a.c(a10);
        }
        Uri a11 = a(this.f8357a.aD(), "unmute");
        if (a11 != null) {
            this.f8357a.d(a11);
        }
        if (com.applovin.impl.sdk.v.a()) {
            a("Ad updated with muteImageFilename = " + this.f8357a.aC() + ", unmuteImageFilename = " + this.f8357a.aD());
        }
    }

    Uri d(String str, List<String> list, boolean z10) {
        String str2;
        try {
            String a10 = this.f8360e.a(f(), str, this.f8357a.L(), list, z10, this.f8362g);
            if (StringUtils.isValidString(a10)) {
                File a11 = this.f8360e.a(a10, f());
                if (a11 != null) {
                    Uri fromFile = Uri.fromFile(a11);
                    if (fromFile != null) {
                        return fromFile;
                    }
                    str2 = "Unable to extract Uri from image file";
                } else {
                    str2 = "Unable to retrieve File from cached image filename = " + a10;
                }
                d(str2);
                return null;
            }
            return null;
        } catch (Throwable th) {
            a("Failed to cache image at url = " + str, th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Uri e(String str) {
        return a(str, this.f8357a.H(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f(final String str) {
        if (StringUtils.isValidString(str)) {
            com.applovin.impl.sdk.network.c a10 = com.applovin.impl.sdk.network.c.a(this.f8349b).a(str).b("GET").a((c.a) "").a(0).a();
            final AtomicReference atomicReference = new AtomicReference(null);
            this.f8349b.R().a(a10, new b.a(), new b.c<String>() { // from class: com.applovin.impl.sdk.e.c.1
                @Override // com.applovin.impl.sdk.network.b.c
                public void a(int i10, String str2, String str3) {
                    c cVar = c.this;
                    cVar.d("Failed to load resource from '" + str + "'");
                }

                @Override // com.applovin.impl.sdk.network.b.c
                public void a(String str2, int i10) {
                    atomicReference.set(str2);
                }
            });
            String str2 = (String) atomicReference.get();
            if (str2 != null) {
                this.f8362g.a(str2.length());
            }
            return str2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8358c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            this.f8358c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        if (com.applovin.impl.sdk.v.a()) {
            a("Rendered new ad:" + this.f8357a);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.e.c.2
            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f8358c != null) {
                    c.this.f8358c.adReceived(c.this.f8357a);
                    c.this.f8358c = null;
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8357a.M()) {
            if (com.applovin.impl.sdk.v.a()) {
                a("Subscribing to timeout events...");
            }
            this.f8349b.H().a(this);
        }
    }
}
