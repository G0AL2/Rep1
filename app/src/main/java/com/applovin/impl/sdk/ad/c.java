package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final m f8076a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8077b;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f8082d;

        a(String str) {
            this.f8082d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f8082d;
        }
    }

    public c(String str, m mVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f8077b = str;
        this.f8076a = mVar;
    }

    private String a(com.applovin.impl.sdk.c.b<String> bVar) {
        for (String str : this.f8076a.b(bVar)) {
            if (this.f8077b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    public String a() {
        return this.f8077b;
    }

    public a b() {
        return a(com.applovin.impl.sdk.c.b.f8199ba) != null ? a.REGULAR : a(com.applovin.impl.sdk.c.b.f8200bb) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String c() {
        String a10 = a(com.applovin.impl.sdk.c.b.f8199ba);
        if (TextUtils.isEmpty(a10)) {
            String a11 = a(com.applovin.impl.sdk.c.b.f8200bb);
            if (TextUtils.isEmpty(a11)) {
                return null;
            }
            return a11;
        }
        return a10;
    }

    public JSONObject d() {
        if (b() == a.AD_RESPONSE_JSON) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f8077b.substring(c().length()), 0), "UTF-8"));
                    if (v.a()) {
                        v A = this.f8076a.A();
                        A.b("AdToken", "Decoded token into ad response: " + jSONObject);
                    }
                    return jSONObject;
                } catch (JSONException e10) {
                    if (v.a()) {
                        v A2 = this.f8076a.A();
                        A2.b("AdToken", "Unable to decode token '" + this.f8077b + "' into JSON", e10);
                        return null;
                    }
                    return null;
                }
            } catch (UnsupportedEncodingException e11) {
                if (v.a()) {
                    v A3 = this.f8076a.A();
                    A3.b("AdToken", "Unable to process ad response from token '" + this.f8077b + "'", e11);
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            String str = this.f8077b;
            String str2 = ((c) obj).f8077b;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f8077b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.f8077b);
        return "AdToken{id=" + prefixToIndex + ", type=" + b() + '}';
    }
}
