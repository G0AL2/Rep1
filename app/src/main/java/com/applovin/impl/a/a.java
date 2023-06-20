package com.applovin.impl.a;

import android.net.Uri;
import com.applovin.impl.a.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.ad.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f6705a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6706b;

    /* renamed from: c  reason: collision with root package name */
    private final i f6707c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6708d;

    /* renamed from: e  reason: collision with root package name */
    private final m f6709e;

    /* renamed from: f  reason: collision with root package name */
    private final d f6710f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6711g;

    /* renamed from: h  reason: collision with root package name */
    private final com.applovin.impl.a.c f6712h;

    /* renamed from: i  reason: collision with root package name */
    private final com.applovin.impl.sdk.a.g f6713i;

    /* renamed from: j  reason: collision with root package name */
    private final Set<j> f6714j;

    /* renamed from: k  reason: collision with root package name */
    private final Set<j> f6715k;

    /* renamed from: com.applovin.impl.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0107a {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f6716a;

        /* renamed from: b  reason: collision with root package name */
        private JSONObject f6717b;

        /* renamed from: c  reason: collision with root package name */
        private com.applovin.impl.sdk.ad.b f6718c;

        /* renamed from: d  reason: collision with root package name */
        private com.applovin.impl.sdk.m f6719d;

        /* renamed from: e  reason: collision with root package name */
        private long f6720e;

        /* renamed from: f  reason: collision with root package name */
        private String f6721f;

        /* renamed from: g  reason: collision with root package name */
        private String f6722g;

        /* renamed from: h  reason: collision with root package name */
        private i f6723h;

        /* renamed from: i  reason: collision with root package name */
        private m f6724i;

        /* renamed from: j  reason: collision with root package name */
        private d f6725j;

        /* renamed from: k  reason: collision with root package name */
        private com.applovin.impl.a.c f6726k;

        /* renamed from: l  reason: collision with root package name */
        private Set<j> f6727l;

        /* renamed from: m  reason: collision with root package name */
        private Set<j> f6728m;

        public C0107a a(long j10) {
            this.f6720e = j10;
            return this;
        }

        public C0107a a(com.applovin.impl.a.c cVar) {
            this.f6726k = cVar;
            return this;
        }

        public C0107a a(d dVar) {
            this.f6725j = dVar;
            return this;
        }

        public C0107a a(i iVar) {
            this.f6723h = iVar;
            return this;
        }

        public C0107a a(m mVar) {
            this.f6724i = mVar;
            return this;
        }

        public C0107a a(com.applovin.impl.sdk.ad.b bVar) {
            this.f6718c = bVar;
            return this;
        }

        public C0107a a(com.applovin.impl.sdk.m mVar) {
            if (mVar != null) {
                this.f6719d = mVar;
                return this;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }

        public C0107a a(String str) {
            this.f6721f = str;
            return this;
        }

        public C0107a a(Set<j> set) {
            this.f6727l = set;
            return this;
        }

        public C0107a a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6716a = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No ad object specified.");
        }

        public a a() {
            return new a(this);
        }

        public C0107a b(String str) {
            this.f6722g = str;
            return this;
        }

        public C0107a b(Set<j> set) {
            this.f6728m = set;
            return this;
        }

        public C0107a b(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f6717b = jSONObject;
                return this;
            }
            throw new IllegalArgumentException("No full ad response specified.");
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        COMPANION_AD,
        VIDEO
    }

    /* loaded from: classes.dex */
    public enum c {
        IMPRESSION,
        VIDEO_CLICK,
        COMPANION_CLICK,
        VIDEO,
        COMPANION,
        ERROR
    }

    private a(C0107a c0107a) {
        super(c0107a.f6716a, c0107a.f6717b, c0107a.f6718c, c0107a.f6719d);
        this.f6705a = c0107a.f6721f;
        this.f6707c = c0107a.f6723h;
        this.f6706b = c0107a.f6722g;
        this.f6709e = c0107a.f6724i;
        this.f6710f = c0107a.f6725j;
        this.f6712h = c0107a.f6726k;
        this.f6714j = c0107a.f6727l;
        this.f6715k = c0107a.f6728m;
        this.f6713i = new com.applovin.impl.sdk.a.g(this);
        Uri h10 = h();
        this.f6711g = h10 != null ? h10.toString() : "";
        this.f6708d = c0107a.f6720e;
    }

    private Set<j> a(b bVar, String[] strArr) {
        d dVar;
        m mVar;
        if (strArr == null || strArr.length <= 0) {
            return Collections.emptySet();
        }
        Map<String, Set<j>> map = null;
        if (bVar == b.VIDEO && (mVar = this.f6709e) != null) {
            map = mVar.e();
        } else if (bVar == b.COMPANION_AD && (dVar = this.f6710f) != null) {
            map = dVar.d();
        }
        HashSet hashSet = new HashSet();
        if (map != null && !map.isEmpty()) {
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    hashSet.addAll(map.get(str));
                }
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private String aT() {
        String stringFromAdObject = getStringFromAdObject("vimp_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    private m.a aU() {
        m.a[] values = m.a.values();
        int intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.em)).intValue();
        return (intValue < 0 || intValue >= values.length) ? m.a.UNSPECIFIED : values[intValue];
    }

    private Set<j> aV() {
        m mVar = this.f6709e;
        return mVar != null ? mVar.d() : Collections.emptySet();
    }

    private Set<j> aW() {
        d dVar = this.f6710f;
        return dVar != null ? dVar.c() : Collections.emptySet();
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean D() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE) && j() != null;
    }

    public Set<j> a(c cVar, String str) {
        return a(cVar, new String[]{str});
    }

    public Set<j> a(c cVar, String[] strArr) {
        b bVar;
        if (v.a()) {
            v A = this.sdk.A();
            A.b("VastAd", "Retrieving trackers of type '" + cVar + "' and events '" + strArr + "'...");
        }
        if (cVar == c.IMPRESSION) {
            return this.f6714j;
        }
        if (cVar == c.VIDEO_CLICK) {
            return aV();
        }
        if (cVar == c.COMPANION_CLICK) {
            return aW();
        }
        if (cVar == c.VIDEO) {
            bVar = b.VIDEO;
        } else if (cVar != c.COMPANION) {
            if (cVar == c.ERROR) {
                return this.f6715k;
            }
            if (v.a()) {
                v A2 = this.sdk.A();
                A2.e("VastAd", "Failed to retrieve trackers of invalid type '" + cVar + "' and events '" + strArr + "'");
            }
            return Collections.emptySet();
        } else {
            bVar = b.COMPANION_AD;
        }
        return a(bVar, strArr);
    }

    @Override // com.applovin.impl.sdk.ad.e
    public void a() {
    }

    public void a(String str) {
        synchronized (this.adObjectLock) {
            JsonUtils.putString(this.adObject, "html_template", str);
        }
    }

    public d aM() {
        return this.f6710f;
    }

    public boolean aN() {
        return getBooleanFromAdObject("vast_fire_click_trackers_on_html_clicks", Boolean.FALSE);
    }

    public String aO() {
        return getStringFromAdObject("html_template", "");
    }

    public Uri aP() {
        String stringFromAdObject = getStringFromAdObject("html_template_url", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aQ() {
        return getBooleanFromAdObject("cache_companion_ad", Boolean.TRUE);
    }

    public boolean aR() {
        return getBooleanFromAdObject("cache_video", Boolean.TRUE);
    }

    public com.applovin.impl.a.c aS() {
        return this.f6712h;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("vimp_urls", this.adObject, getClCode(), null, aT(), au(), y(), this.sdk);
        }
        return postbacks;
    }

    public void b() {
        synchronized (this.adObjectLock) {
            this.adObject.remove("vast_is_streaming");
        }
    }

    @Override // com.applovin.impl.sdk.ad.e
    /* renamed from: c */
    public com.applovin.impl.sdk.a.g o() {
        return this.f6713i;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public String d() {
        return this.f6711g;
    }

    public long e() {
        return getLongFromAdObject("real_close_delay", 0L);
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && super.equals(obj)) {
            a aVar = (a) obj;
            String str = this.f6705a;
            if (str == null ? aVar.f6705a == null : str.equals(aVar.f6705a)) {
                String str2 = this.f6706b;
                if (str2 == null ? aVar.f6706b == null : str2.equals(aVar.f6706b)) {
                    i iVar = this.f6707c;
                    if (iVar == null ? aVar.f6707c == null : iVar.equals(aVar.f6707c)) {
                        m mVar = this.f6709e;
                        if (mVar == null ? aVar.f6709e == null : mVar.equals(aVar.f6709e)) {
                            d dVar = this.f6710f;
                            if (dVar == null ? aVar.f6710f == null : dVar.equals(aVar.f6710f)) {
                                com.applovin.impl.a.c cVar = this.f6712h;
                                if (cVar == null ? aVar.f6712h == null : cVar.equals(aVar.f6712h)) {
                                    Set<j> set = this.f6714j;
                                    if (set == null ? aVar.f6714j == null : set.equals(aVar.f6714j)) {
                                        Set<j> set2 = this.f6715k;
                                        Set<j> set3 = aVar.f6715k;
                                        return set2 != null ? set2.equals(set3) : set3 == null;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public boolean f() {
        return getBooleanFromAdObject("vast_is_streaming", Boolean.FALSE);
    }

    public b g() {
        return "companion_ad".equalsIgnoreCase(getStringFromAdObject("vast_first_caching_operation", "companion_ad")) ? b.COMPANION_AD : b.VIDEO;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        return this.f6708d;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        return this.fullResponse;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri h() {
        n n10 = n();
        if (n10 != null) {
            return n10.b();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean hasVideoUrl() {
        List<n> a10;
        m mVar = this.f6709e;
        return (mVar == null || (a10 = mVar.a()) == null || a10.size() <= 0) ? false : true;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f6705a;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6706b;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        i iVar = this.f6707c;
        int hashCode4 = (hashCode3 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        m mVar = this.f6709e;
        int hashCode5 = (hashCode4 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        d dVar = this.f6710f;
        int hashCode6 = (hashCode5 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        com.applovin.impl.a.c cVar = this.f6712h;
        int hashCode7 = (hashCode6 + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Set<j> set = this.f6714j;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        Set<j> set2 = this.f6715k;
        return hashCode8 + (set2 != null ? set2.hashCode() : 0);
    }

    public boolean i() {
        return getBooleanFromAdObject("vast_immediate_ad_load", Boolean.TRUE);
    }

    @Override // com.applovin.impl.sdk.ad.e, com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.TRUE) && this.f6712h != null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri j() {
        m mVar = this.f6709e;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.e
    public Uri k() {
        return j();
    }

    public i l() {
        return this.f6707c;
    }

    public m m() {
        return this.f6709e;
    }

    public n n() {
        m mVar = this.f6709e;
        if (mVar != null) {
            return mVar.a(aU());
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        return "VastAd{title='" + this.f6705a + "', adDescription='" + this.f6706b + "', systemInfo=" + this.f6707c + ", videoCreative=" + this.f6709e + ", companionAd=" + this.f6710f + ", adVerifications=" + this.f6712h + ", impressionTrackers=" + this.f6714j + ", errorTrackers=" + this.f6715k + '}';
    }
}
