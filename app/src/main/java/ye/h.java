package ye;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Challenge.kt */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f39675a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39676b;

    public h(String str, Map<String, String> map) {
        String str2;
        qe.k.f(str, "scheme");
        qe.k.f(map, "authParams");
        this.f39676b = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale locale = Locale.US;
                qe.k.e(locale, "US");
                str2 = key.toLowerCase(locale);
                qe.k.e(str2, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        qe.k.e(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f39675a = unmodifiableMap;
    }

    public final Charset a() {
        String str = this.f39675a.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                qe.k.e(forName, "Charset.forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        qe.k.e(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.f39675a.get("realm");
    }

    public final String c() {
        return this.f39676b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (qe.k.a(hVar.f39676b, this.f39676b) && qe.k.a(hVar.f39675a, this.f39675a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f39676b.hashCode()) * 31) + this.f39675a.hashCode();
    }

    public String toString() {
        return this.f39676b + " authParams=" + this.f39675a;
    }
}
