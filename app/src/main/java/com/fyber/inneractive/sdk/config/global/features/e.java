package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.global.k;
import com.fyber.inneractive.sdk.config.global.n;
import com.fyber.inneractive.sdk.config.global.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class e extends p {

    /* renamed from: b  reason: collision with root package name */
    public String f16952b;

    /* renamed from: c  reason: collision with root package name */
    public List<com.fyber.inneractive.sdk.config.global.b> f16953c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, k> f16954d = new HashMap();

    public e(String str) {
        this.f16952b = str;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public String a(String str, String str2) {
        String str3;
        Iterator<String> it = this.f16954d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            str3 = this.f16954d.get(it.next()).c(str);
            if (str3 != null) {
                break;
            }
        }
        if (str3 == null) {
            n nVar = this.f16977a;
            return nVar != null ? nVar.a(str, str2) : str2;
        }
        return str3;
    }

    public abstract e b();

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public Integer b(String str) {
        Integer num;
        Iterator<String> it = this.f16954d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = this.f16954d.get(it.next()).b(str);
            if (num != null) {
                break;
            }
        }
        return num == null ? super.b(str) : num;
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public String c(String str) {
        return a(str, (String) null);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public Boolean d(String str) {
        Boolean bool;
        Iterator<String> it = this.f16954d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                bool = null;
                break;
            }
            bool = this.f16954d.get(it.next()).d(str);
            if (bool != null) {
                break;
            }
        }
        return bool == null ? super.d(str) : bool;
    }

    public String toString() {
        return String.format("id: %s, params: %s exp: %s", this.f16952b, this.f16977a, this.f16953c);
    }

    @Override // com.fyber.inneractive.sdk.config.global.p, com.fyber.inneractive.sdk.config.global.n
    public Double a(String str) {
        Double d10;
        Iterator<String> it = this.f16954d.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                d10 = null;
                break;
            }
            d10 = this.f16954d.get(it.next()).a(str);
            if (d10 != null) {
                break;
            }
        }
        return d10 == null ? super.a(str) : d10;
    }

    public boolean a(String str, boolean z10) {
        Boolean d10 = d(str);
        return d10 != null ? d10.booleanValue() : z10;
    }

    public void a(e eVar) {
        eVar.f16952b = this.f16952b;
        eVar.f16977a = this.f16977a;
        eVar.f16953c = new ArrayList(this.f16953c);
        eVar.f16954d = new HashMap(this.f16954d);
    }
}
