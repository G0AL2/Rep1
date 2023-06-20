package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.r;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinErrorCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f8628a = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* renamed from: b  reason: collision with root package name */
    private final m f8629b;

    /* renamed from: c  reason: collision with root package name */
    private final v f8630c;

    /* renamed from: d  reason: collision with root package name */
    private final e f8631d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private long f8632a;

        /* renamed from: b  reason: collision with root package name */
        private long f8633b;

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f8632a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f8633b = j10;
        }

        public long a() {
            return this.f8632a;
        }

        public long b() {
            return this.f8633b;
        }
    }

    /* renamed from: com.applovin.impl.sdk.network.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0134b<T> implements h0.a<e.c> {

        /* renamed from: b  reason: collision with root package name */
        private final String f8635b;

        /* renamed from: c  reason: collision with root package name */
        private final com.applovin.impl.sdk.network.c<T> f8636c;

        /* renamed from: d  reason: collision with root package name */
        private final String f8637d;

        /* renamed from: e  reason: collision with root package name */
        private final T f8638e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f8639f;

        /* renamed from: g  reason: collision with root package name */
        private final long f8640g;

        /* renamed from: h  reason: collision with root package name */
        private final a f8641h;

        /* renamed from: i  reason: collision with root package name */
        private final c<T> f8642i;

        private C0134b(String str, com.applovin.impl.sdk.network.c<T> cVar, String str2, T t10, boolean z10, long j10, a aVar, c<T> cVar2) {
            this.f8635b = str;
            this.f8636c = cVar;
            this.f8637d = str2;
            this.f8638e = t10;
            this.f8639f = z10;
            this.f8640g = j10;
            this.f8641h = aVar;
            this.f8642i = cVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h0.a
        /* renamed from: a */
        public void accept(e.c cVar) {
            int i10;
            c<T> cVar2;
            Object obj = null;
            try {
                try {
                    int a10 = cVar.a();
                    try {
                        if (a10 > 0) {
                            long currentTimeMillis = System.currentTimeMillis() - this.f8640g;
                            if (a10 >= 200 && a10 < 400) {
                                a aVar = this.f8641h;
                                if (aVar != null) {
                                    aVar.a(currentTimeMillis);
                                }
                                b.this.a(this.f8637d, this.f8635b, a10, this.f8640g);
                                String b10 = cVar.b();
                                if (Utils.isDspDemoApp(b.this.f8629b.L())) {
                                    b.this.f8629b.ag().a(b10 != null ? b10 : "", this.f8635b, this.f8636c.e() != null ? this.f8636c.e().toString() : "");
                                }
                                if (b10 == null) {
                                    this.f8642i.a(this.f8638e, a10);
                                    return;
                                }
                                if (v.a()) {
                                    b.this.f8630c.a("ConnectionManager", b10);
                                }
                                a aVar2 = this.f8641h;
                                if (aVar2 != null) {
                                    aVar2.b(b10.length());
                                }
                                if (this.f8639f) {
                                    String a11 = com.applovin.impl.sdk.utils.m.a(b10, b.this.f8629b.z());
                                    if (a11 == null) {
                                        HashMap hashMap = new HashMap(2);
                                        hashMap.put("request", StringUtils.getHostAndPath(this.f8635b));
                                        hashMap.put("response", b10);
                                        b.this.f8629b.w().trackEvent("rdf", hashMap);
                                    }
                                    b10 = a11;
                                }
                                try {
                                    this.f8642i.a(b.this.a(b10, (String) this.f8638e), a10);
                                    return;
                                } catch (Throwable th) {
                                    String str = "Unable to parse response from " + b.this.a(this.f8635b);
                                    if (v.a()) {
                                        b.this.f8630c.b("ConnectionManager", str, th);
                                    }
                                    b.this.f8629b.T().a(com.applovin.impl.sdk.d.f.f8326i);
                                    this.f8642i.a(AppLovinErrorCodes.INVALID_RESPONSE, str, null);
                                    return;
                                }
                            }
                            cVar2 = this.f8642i;
                        } else {
                            b.this.a(this.f8637d, this.f8635b, a10, this.f8640g, (Throwable) null);
                            cVar2 = this.f8642i;
                        }
                        cVar2.a(a10, null, null);
                    } catch (MalformedURLException e10) {
                        e = e10;
                        i10 = a10;
                        if (this.f8638e != null) {
                            b.this.a(this.f8637d, this.f8635b, i10, this.f8640g, e);
                            this.f8642i.a(-901, e.getMessage(), null);
                            return;
                        }
                        b.this.a(this.f8637d, this.f8635b, i10, this.f8640g);
                        this.f8642i.a(this.f8638e, -901);
                    }
                } catch (MalformedURLException e11) {
                    e = e11;
                    i10 = 0;
                }
            } catch (Throwable th2) {
                int a12 = 0 == 0 ? b.this.a(th2) : 0;
                try {
                    String c10 = cVar.c();
                    if (c10 != null) {
                        if (this.f8639f) {
                            c10 = com.applovin.impl.sdk.utils.m.a(c10, b.this.f8629b.z());
                        }
                        obj = b.this.a(c10, (String) this.f8638e);
                    }
                } catch (Throwable unused) {
                }
                b.this.a(this.f8637d, this.f8635b, a12, this.f8640g, th2);
                this.f8642i.a(a12, th2.getMessage(), obj);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        void a(int i10, String str, T t10);

        void a(T t10, int i10);
    }

    public b(m mVar) {
        this.f8629b = mVar;
        this.f8630c = mVar.A();
        e eVar = new e(mVar);
        this.f8631d = eVar;
        eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        if (th instanceof UnknownHostException) {
            return -1009;
        }
        if (th instanceof SocketTimeoutException) {
            return -1001;
        }
        if (th instanceof IOException) {
            return -100;
        }
        return th instanceof JSONException ? -104 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <T> T a(String str, T t10) throws JSONException, SAXException, ClassCastException {
        if (t10 == null) {
            return str;
        }
        if (str != 0 && str.length() >= 3) {
            if (t10 instanceof JSONObject) {
                return (T) new JSONObject(str);
            }
            if (t10 instanceof r) {
                return (T) s.a(str, this.f8629b);
            }
            if (t10 instanceof String) {
                return str;
            }
            if (v.a()) {
                v vVar = this.f8630c;
                vVar.e("ConnectionManager", "Failed to process response of type '" + t10.getClass().getName() + "'");
            }
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (v.a()) {
            v vVar = this.f8630c;
            vVar.c("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (((float) (System.currentTimeMillis() - j10)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.h.f(this.f8629b) + " to " + a(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th) {
        if (v.a()) {
            v vVar = this.f8630c;
            vVar.b("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (((float) (System.currentTimeMillis() - j10)) / 1000.0f) + " s over " + com.applovin.impl.sdk.utils.h.f(this.f8629b) + " to " + a(str2), th);
        }
    }

    public <T> void a(com.applovin.impl.sdk.network.c<T> cVar, a aVar, c<T> cVar2) {
        String str;
        T t10;
        String jSONObject;
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        String a10 = cVar.a();
        String b10 = cVar.b();
        if (a10 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (b10 == null) {
            throw new IllegalArgumentException("No method specified");
        }
        if (cVar2 == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (!a10.toLowerCase().startsWith("http")) {
            String str2 = "Requested postback submission to non HTTP endpoint " + a10 + "; skipping...";
            if (v.a()) {
                v.i("ConnectionManager", str2);
            }
            cVar2.a(AppLovinErrorCodes.INVALID_URL, str2, null);
            return;
        }
        if (((Boolean) this.f8629b.a(com.applovin.impl.sdk.c.b.cQ)).booleanValue() && !a10.contains("https://")) {
            if (v.a()) {
                this.f8629b.A().d("ConnectionManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            }
            a10 = a10.replace("http://", "https://");
        }
        HashMap hashMap = new HashMap(2);
        boolean n10 = cVar.n();
        long serverAdjustedUnixTimestampMillis = Utils.getServerAdjustedUnixTimestampMillis(this.f8629b);
        if ((cVar.c() != null && !cVar.c().isEmpty()) || cVar.i() >= 0) {
            Map<String, String> c10 = cVar.c();
            Boolean bool = (Boolean) this.f8629b.a(com.applovin.impl.sdk.c.b.f8217df);
            if (c10 != null && cVar.i() >= 0 && cVar.i() > 0) {
                c10.put("current_retry_attempt", String.valueOf(cVar.i()));
            }
            boolean booleanValue = bool.booleanValue();
            if (n10) {
                String encodeUrlMap = Utils.encodeUrlMap(c10, booleanValue, ((Boolean) this.f8629b.a(com.applovin.impl.sdk.c.b.dg)).booleanValue());
                String a11 = com.applovin.impl.sdk.utils.m.a(encodeUrlMap, this.f8629b.z(), serverAdjustedUnixTimestampMillis);
                if (StringUtils.isValidString(encodeUrlMap) && a11 == null) {
                    hashMap.put("query", encodeUrlMap);
                }
                a10 = StringUtils.appendQueryParameter(a10, "p", a11);
            } else {
                a10 = StringUtils.appendQueryParameters(a10, c10, booleanValue);
            }
        }
        String str3 = a10;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Boolean endsWith = StringUtils.endsWith(StringUtils.getHostAndPath(str3), f8628a);
            if (v.a()) {
                v vVar = this.f8630c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Sending ");
                sb2.append(b10);
                sb2.append(" request to id=#");
                sb2.append(str3.hashCode());
                sb2.append(" \"");
                sb2.append(endsWith.booleanValue() ? str3 : StringUtils.getHostAndPath(str3));
                sb2.append("\"...");
                vVar.c("ConnectionManager", sb2.toString());
            }
            e.b.a a12 = new e.b.a().a(str3).b(b10).a(cVar.d()).a(cVar.j());
            if (cVar.e() != null) {
                if (n10) {
                    jSONObject = com.applovin.impl.sdk.utils.m.a(cVar.e().toString(), this.f8629b.z(), serverAdjustedUnixTimestampMillis);
                    if (jSONObject == null) {
                        hashMap.put("body", cVar.e().toString());
                    }
                } else {
                    jSONObject = cVar.e().toString();
                }
                String str4 = jSONObject;
                byte[] gzip = (!cVar.o() || str4 == null || str4.length() <= ((Integer) this.f8629b.a(com.applovin.impl.sdk.c.b.et)).intValue()) ? null : Utils.gzip(str4.getBytes(Charset.forName("UTF-8")));
                if (v.a()) {
                    this.f8630c.b("ConnectionManager", "Request to " + a(str3) + " is " + str4);
                }
                a12.a("Content-Type", "application/json; charset=utf-8");
                if (cVar.o() && gzip != null) {
                    a12.a("Content-Encoding", "gzip");
                    a12.a(gzip);
                } else if (str4 != null) {
                    a12.a(str4.getBytes("UTF-8"));
                }
            }
            if (!hashMap.isEmpty()) {
                hashMap.put("request", StringUtils.getHostAndPath(str3));
                this.f8629b.w().trackEvent("ref", hashMap);
            }
            str = str3;
            t10 = null;
            try {
                this.f8631d.a(a12.a(new C0134b(str3, cVar, b10, cVar.g(), n10, currentTimeMillis, aVar, cVar2)).a(this.f8629b.S().b()).a());
            } catch (Throwable th) {
                th = th;
                a(b10, str, 0, currentTimeMillis, th);
                cVar2.a(0, th.getMessage(), t10);
            }
        } catch (Throwable th2) {
            th = th2;
            str = str3;
            t10 = null;
        }
    }
}
