package com.applovin.impl.a;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private List<n> f6795a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f6796b;

    /* renamed from: c  reason: collision with root package name */
    private int f6797c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f6798d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<j> f6799e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Set<j>> f6800f;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private m() {
        this.f6795a = Collections.emptyList();
        this.f6796b = Collections.emptyList();
        this.f6799e = new HashSet();
        this.f6800f = new HashMap();
    }

    private m(e eVar) {
        this.f6795a = Collections.emptyList();
        this.f6796b = Collections.emptyList();
        this.f6799e = new HashSet();
        this.f6800f = new HashMap();
        this.f6796b = eVar.g();
    }

    private static int a(String str, com.applovin.impl.sdk.m mVar) {
        try {
            List<String> explode = CollectionUtils.explode(str, ":");
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(explode.get(1))) + StringUtils.parseInt(explode.get(2)));
            }
        } catch (Throwable unused) {
            if (v.a()) {
                v A = mVar.A();
                A.e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    public static m a(r rVar, m mVar, e eVar, com.applovin.impl.sdk.m mVar2) {
        r b10;
        List<n> a10;
        r b11;
        int a11;
        if (rVar != null) {
            if (eVar != null) {
                if (mVar2 != null) {
                    if (mVar == null) {
                        try {
                            mVar = new m(eVar);
                        } catch (Throwable th) {
                            if (v.a()) {
                                mVar2.A().b("VastVideoCreative", "Error occurred while initializing", th);
                                return null;
                            }
                            return null;
                        }
                    }
                    if (mVar.f6797c == 0 && (b11 = rVar.b("Duration")) != null && (a11 = a(b11.c(), mVar2)) > 0) {
                        mVar.f6797c = a11;
                    }
                    r b12 = rVar.b("MediaFiles");
                    if (b12 != null && (a10 = a(b12, mVar2)) != null && a10.size() > 0) {
                        List<n> list = mVar.f6795a;
                        if (list != null) {
                            a10.addAll(list);
                        }
                        mVar.f6795a = a10;
                    }
                    r b13 = rVar.b("VideoClicks");
                    if (b13 != null) {
                        if (mVar.f6798d == null && (b10 = b13.b("ClickThrough")) != null) {
                            String c10 = b10.c();
                            if (StringUtils.isValidString(c10)) {
                                mVar.f6798d = Uri.parse(c10);
                            }
                        }
                        l.a(b13.a("ClickTracking"), mVar.f6799e, eVar, mVar2);
                    }
                    l.a(rVar, mVar.f6800f, eVar, mVar2);
                    return mVar;
                }
                throw new IllegalArgumentException("No sdk specified.");
            }
            throw new IllegalArgumentException("No context specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    private static List<n> a(r rVar, com.applovin.impl.sdk.m mVar) {
        List<r> a10 = rVar.a("MediaFile");
        ArrayList arrayList = new ArrayList(a10.size());
        List<String> explode = CollectionUtils.explode((String) mVar.a(com.applovin.impl.sdk.c.b.ek));
        List<String> explode2 = CollectionUtils.explode((String) mVar.a(com.applovin.impl.sdk.c.b.ej));
        for (r rVar2 : a10) {
            n a11 = n.a(rVar2, mVar);
            if (a11 != null) {
                try {
                    String c10 = a11.c();
                    if (!StringUtils.isValidString(c10) || explode.contains(c10)) {
                        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.el)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(a11.b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        if (v.a()) {
                            v A = mVar.A();
                            A.d("VastVideoCreative", "Video file not supported: " + a11);
                        }
                    }
                    arrayList.add(a11);
                } catch (Throwable th) {
                    if (v.a()) {
                        v A2 = mVar.A();
                        A2.b("VastVideoCreative", "Failed to validate video file: " + a11, th);
                    }
                }
            }
        }
        return arrayList;
    }

    public n a(a aVar) {
        List<n> list = this.f6795a;
        if (list == null || list.size() == 0) {
            return null;
        }
        List arrayList = new ArrayList(3);
        for (String str : this.f6796b) {
            for (n nVar : this.f6795a) {
                String c10 = nVar.c();
                if (StringUtils.isValidString(c10) && str.equalsIgnoreCase(c10)) {
                    arrayList.add(nVar);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = this.f6795a;
        }
        if (com.applovin.impl.sdk.utils.g.c()) {
            Collections.sort(arrayList, new Comparator<n>() { // from class: com.applovin.impl.a.m.1
                @Override // java.util.Comparator
                @TargetApi(19)
                /* renamed from: a */
                public int compare(n nVar2, n nVar3) {
                    return Integer.compare(nVar2.d(), nVar3.d());
                }
            });
        }
        return (n) arrayList.get(aVar == a.LOW ? 0 : aVar == a.MEDIUM ? arrayList.size() / 2 : arrayList.size() - 1);
    }

    public List<n> a() {
        return this.f6795a;
    }

    public int b() {
        return this.f6797c;
    }

    public Uri c() {
        return this.f6798d;
    }

    public Set<j> d() {
        return this.f6799e;
    }

    public Map<String, Set<j>> e() {
        return this.f6800f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f6797c != mVar.f6797c) {
                return false;
            }
            List<n> list = this.f6795a;
            if (list == null ? mVar.f6795a == null : list.equals(mVar.f6795a)) {
                Uri uri = this.f6798d;
                if (uri == null ? mVar.f6798d == null : uri.equals(mVar.f6798d)) {
                    Set<j> set = this.f6799e;
                    if (set == null ? mVar.f6799e == null : set.equals(mVar.f6799e)) {
                        Map<String, Set<j>> map = this.f6800f;
                        Map<String, Set<j>> map2 = mVar.f6800f;
                        return map != null ? map.equals(map2) : map2 == null;
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
        List<n> list = this.f6795a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f6797c) * 31;
        Uri uri = this.f6798d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<j> set = this.f6799e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<j>> map = this.f6800f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f6795a + ", durationSeconds=" + this.f6797c + ", destinationUri=" + this.f6798d + ", clickTrackers=" + this.f6799e + ", eventTrackers=" + this.f6800f + '}';
    }
}
