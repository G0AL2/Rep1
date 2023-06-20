package com.inmobi.media;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: NetworkRequest.java */
/* loaded from: classes3.dex */
public class gx {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25607a = "gx";

    /* renamed from: b  reason: collision with root package name */
    private String f25608b;

    /* renamed from: c  reason: collision with root package name */
    private ir f25609c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f25610d;

    /* renamed from: f  reason: collision with root package name */
    protected Map<String, String> f25611f;

    /* renamed from: g  reason: collision with root package name */
    protected Map<String, String> f25612g;

    /* renamed from: h  reason: collision with root package name */
    protected Map<String, String> f25613h;

    /* renamed from: i  reason: collision with root package name */
    protected JSONObject f25614i;

    /* renamed from: j  reason: collision with root package name */
    String f25615j;

    /* renamed from: k  reason: collision with root package name */
    String f25616k;

    /* renamed from: l  reason: collision with root package name */
    public int f25617l;

    /* renamed from: m  reason: collision with root package name */
    public int f25618m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f25619n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f25620o;

    /* renamed from: p  reason: collision with root package name */
    long f25621p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f25622q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f25623r;

    /* renamed from: s  reason: collision with root package name */
    protected String f25624s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f25625t;

    public gx(String str, String str2, ir irVar) {
        this(str, str2, irVar, false, "application/x-www-form-urlencoded");
    }

    public final void a(Map<String, String> map) {
        if (map != null) {
            this.f25611f.putAll(map);
        }
    }

    public final void b(Map<String, String> map) {
        if (map != null) {
            this.f25612g.putAll(map);
        }
    }

    public final boolean c() {
        return this.f25621p != -1;
    }

    public final Map<String, String> d() {
        hv.a(this.f25611f);
        return this.f25611f;
    }

    public final String e() {
        String b10;
        String str = this.f25608b;
        if (this.f25612g == null || (b10 = b()) == null || b10.trim().length() == 0) {
            return str;
        }
        if (!str.contains("?")) {
            str = str + "?";
        }
        if (!str.endsWith("&") && !str.endsWith("?")) {
            str = str + "&";
        }
        return str + b10;
    }

    public final String f() {
        String str = this.f25616k;
        str.hashCode();
        if (!str.equals("application/x-www-form-urlencoded")) {
            return !str.equals("application/json") ? "" : this.f25614i.toString();
        }
        hv.a(this.f25613h);
        return hv.a(this.f25613h, "&");
    }

    public final long g() {
        long j10 = 0;
        try {
            if ("GET".equals(this.f25615j)) {
                j10 = 0 + b().length();
            } else if ("POST".equals(this.f25615j)) {
                j10 = f().length() + 0;
            }
        } catch (Exception unused) {
        }
        return j10;
    }

    public gx(String str, String str2) {
        this(str, str2, null, false, "application/x-www-form-urlencoded");
        this.f25610d = false;
    }

    private String b() {
        hv.a(this.f25612g);
        return hv.a(this.f25612g, "&");
    }

    public void a() {
        JSONObject b10;
        ie.g();
        this.f25622q = ie.a(this.f25622q);
        if (this.f25620o) {
            if ("GET".equals(this.f25615j)) {
                e(this.f25612g);
            } else if ("POST".equals(this.f25615j)) {
                e(this.f25613h);
            }
        }
        if (this.f25610d && (b10 = ie.b()) != null) {
            if ("GET".equals(this.f25615j)) {
                this.f25612g.put("consentObject", b10.toString());
            } else if ("POST".equals(this.f25615j)) {
                this.f25613h.put("consentObject", b10.toString());
            }
        }
        if (this.f25625t) {
            if ("GET".equals(this.f25615j)) {
                this.f25612g.put("u-appsecure", Byte.toString(ia.a().f25735d));
            } else if ("POST".equals(this.f25615j)) {
                this.f25613h.put("u-appsecure", Byte.toString(ia.a().f25735d));
            }
        }
    }

    public final void c(Map<String, String> map) {
        this.f25613h.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(Map<String, String> map) {
        ir irVar = this.f25609c;
        if (irVar != null) {
            map.putAll(irVar.a());
        }
    }

    public gx(String str, String str2, ir irVar, boolean z10, String str3) {
        this.f25611f = new HashMap();
        this.f25617l = 60000;
        this.f25618m = 60000;
        this.f25619n = true;
        this.f25620o = true;
        this.f25621p = -1L;
        this.f25622q = false;
        this.f25610d = true;
        this.f25623r = false;
        this.f25624s = ho.f();
        this.f25625t = true;
        this.f25615j = str;
        this.f25608b = str2;
        this.f25609c = irVar;
        this.f25611f.put("User-Agent", ho.i());
        this.f25622q = z10;
        if ("GET".equals(str)) {
            this.f25612g = new HashMap();
        } else if ("POST".equals(str)) {
            this.f25613h = new HashMap();
            this.f25614i = new JSONObject();
        }
        this.f25616k = str3;
    }

    private void e(Map<String, String> map) {
        map.putAll(ia.a().f25734c);
        map.putAll(ib.a(this.f25623r));
        map.putAll(Cif.a());
        d(map);
    }

    public final void a(boolean z10) {
        this.f25623r = z10;
    }
}
