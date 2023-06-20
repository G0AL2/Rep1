package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Keep;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.n;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TTAndroidObject.java */
/* loaded from: classes.dex */
public class w implements com.bytedance.sdk.component.adexpress.d.b, x.a, com.bytedance.sdk.openadsdk.e.b {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, Boolean> f12968g;
    private com.bytedance.sdk.openadsdk.g.b A;
    private com.bytedance.sdk.openadsdk.g.h B;
    private List<com.bytedance.sdk.openadsdk.core.e.n> D;
    private HashMap<String, i> E;
    private com.bytedance.sdk.openadsdk.b.u H;
    private com.bytedance.sdk.component.a.r I;
    private String J;
    private com.bytedance.sdk.openadsdk.core.widget.a.a L;

    /* renamed from: a  reason: collision with root package name */
    protected Map<String, Object> f12969a;

    /* renamed from: b  reason: collision with root package name */
    boolean f12970b;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<SSWebView> f12972d;

    /* renamed from: f  reason: collision with root package name */
    private String f12974f;

    /* renamed from: h  reason: collision with root package name */
    private WeakReference<Context> f12975h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.e.c f12976i;

    /* renamed from: j  reason: collision with root package name */
    private String f12977j;

    /* renamed from: k  reason: collision with root package name */
    private WeakReference<View> f12978k;

    /* renamed from: l  reason: collision with root package name */
    private String f12979l;

    /* renamed from: m  reason: collision with root package name */
    private int f12980m;

    /* renamed from: n  reason: collision with root package name */
    private String f12981n;

    /* renamed from: o  reason: collision with root package name */
    private int f12982o;

    /* renamed from: q  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.e.n f12984q;

    /* renamed from: r  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.b.j f12985r;

    /* renamed from: s  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.nativeexpress.j f12986s;

    /* renamed from: t  reason: collision with root package name */
    private JSONObject f12987t;

    /* renamed from: u  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.e.d f12988u;

    /* renamed from: v  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.g.a f12989v;

    /* renamed from: w  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.g.e f12990w;

    /* renamed from: x  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.g.d f12991x;

    /* renamed from: y  reason: collision with root package name */
    private JSONObject f12992y;

    /* renamed from: z  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.b.d f12993z;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12983p = true;
    private boolean C = true;
    private boolean F = false;
    private boolean G = false;

    /* renamed from: c  reason: collision with root package name */
    boolean f12971c = false;
    private boolean K = false;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.component.utils.x f12973e = new com.bytedance.sdk.component.utils.x(Looper.getMainLooper(), this);

    /* compiled from: TTAndroidObject.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13009a;

        /* renamed from: b  reason: collision with root package name */
        public String f13010b;

        /* renamed from: c  reason: collision with root package name */
        public String f13011c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f13012d;

        /* renamed from: e  reason: collision with root package name */
        public int f13013e;
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f12968g = concurrentHashMap;
        String a1657027613243dc = com.bytedance.sdk.component.e.c.a.a1657027613243dc("lne\\asci|");
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put(a1657027613243dc, bool);
        concurrentHashMap.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("pskueqc"), bool);
        concurrentHashMap.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("dhqseqeoWdox\u007flij"), bool);
        concurrentHashMap.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("ctqwkhYb~ld\u007f"), bool);
        concurrentHashMap.put(com.bytedance.sdk.component.e.c.a.a1657027613243dc("lne\\asci|V|8"), bool);
    }

    public w(Context context) {
        this.f12975h = new WeakReference<>(context);
    }

    private void a(final a aVar, final JSONObject jSONObject) {
        if (aVar == null) {
            return;
        }
        try {
            a(aVar.f13012d, new com.bytedance.sdk.openadsdk.g.c() { // from class: com.bytedance.sdk.openadsdk.core.w.7
                @Override // com.bytedance.sdk.openadsdk.g.c
                public void a(boolean z10, List<com.bytedance.sdk.openadsdk.core.e.n> list) {
                    if (!z10) {
                        w.this.b(aVar.f13010b, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put(com.bytedance.sdk.component.d.d.g.g1657027613257dc("csgbplpb{"), w.b(list));
                        w.this.b(aVar.f13010b, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private void a(String str, boolean z10) {
        if (this.H == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z10) {
            this.H.a(str);
        } else {
            this.H.b(str);
        }
    }

    @Keep
    @JProtect
    private void a(JSONObject jSONObject, int i10) throws Exception {
        String g1657027613239dc;
        String str;
        JSONArray jSONArray = new JSONArray();
        for (String str2 : q()) {
            jSONArray.put(str2);
        }
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqrMehc"), com.bytedance.sdk.openadsdk.common.a.a());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("iolfvDvwFhgn"), com.bytedance.sdk.openadsdk.common.a.e());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ahf"), com.bytedance.sdk.openadsdk.common.a.b());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("seiF`lrngg"), com.bytedance.sdk.openadsdk.common.a.c());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("aqrUawungg"), com.bytedance.sdk.openadsdk.common.a.d());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ndvW}uc"), com.bytedance.sdk.openadsdk.common.a.f());
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("strskwrKaz~"), jSONArray);
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Oc"), com.bytedance.sdk.openadsdk.common.a.a(m.a()));
        if (com.bytedance.sdk.openadsdk.utils.e.b(m.a())) {
            g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Ywdh~mc\u007fc");
            str = "AofqklbXXhn";
        } else {
            g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Ywdh~mc\u007fc");
            str = "Aofqklb";
        }
        jSONObject.put(g1657027613239dc, com.bytedance.sdk.component.e.c.g.g1657027613239dc(str));
        jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ddtjg`Ysqyo"), Build.VERSION.RELEASE);
    }

    @Keep
    @JProtect
    private boolean a(String str, int i10, com.bytedance.sdk.openadsdk.core.e.j jVar) {
        HashMap<String, i> hashMap;
        i iVar;
        if (TextUtils.isEmpty(str) || (hashMap = this.E) == null || (iVar = hashMap.get(str)) == null) {
            return false;
        }
        iVar.a(i10, jVar);
        return true;
    }

    public static JSONArray b(List<com.bytedance.sdk.openadsdk.core.e.n> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(list.get(i10).ar());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("_^opcZr~xl"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("c`nofdel"));
            jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("_^abhidfkbUbh"), str);
            if (jSONObject != null) {
                jSONObject2.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("_^rbvdkt"), jSONObject);
            }
            q(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void c(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^opcZr~xl"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("ewgmp"));
            jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^guakrXam"), str);
            if (jSONObject != null) {
                jSONObject2.put(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^rbvdkt"), jSONObject);
            }
            q(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private void e(JSONObject jSONObject) throws Exception {
        if (!TextUtils.isEmpty(this.f12977j)) {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("chf"), this.f12977j);
        }
        if (!TextUtils.isEmpty(this.f12979l)) {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("lne\\a}rui"), this.f12979l);
        }
        if (!TextUtils.isEmpty(this.f12981n)) {
            jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("dnumhjgcW|xg"), this.f12981n);
        }
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("db"), TextUtils.isEmpty(m.h().w()) ? m.h().w() : com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("SF"));
        jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("l`ldqdab"), com.bytedance.sdk.openadsdk.utils.u.k(m.a()));
    }

    private void f(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.e.p.b(this.f12984q))) {
            return;
        }
        jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("pmczegjbWz~r`h"), com.bytedance.sdk.openadsdk.core.e.p.b(this.f12984q));
    }

    private void g(String str) {
        try {
            String str2 = new String(Base64.decode(str, 2));
            com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.d.d.d.d1657027613261dc("TUCm`winlFhainz"), str2);
            JSONArray jSONArray = new JSONArray(str2);
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                a aVar = new a();
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        aVar.f13009a = optJSONObject.optString(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^opcZr~xl"), null);
                        aVar.f13010b = optJSONObject.optString(com.bytedance.sdk.component.d.d.d.d1657027613261dc("_^abhidfkbUbh"), null);
                        aVar.f13011c = optJSONObject.optString(com.bytedance.sdk.component.d.d.d.d1657027613261dc("ftl`"));
                        aVar.f13012d = optJSONObject.optJSONObject(com.bytedance.sdk.component.d.d.d.d1657027613261dc("p`pbiv"));
                        aVar.f13013e = optJSONObject.optInt(com.bytedance.sdk.component.d.d.d.d1657027613261dc("JRQGO"));
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(aVar.f13009a) && !TextUtils.isEmpty(aVar.f13011c)) {
                    Message obtainMessage = this.f12973e.obtainMessage(11);
                    obtainMessage.obj = aVar;
                    this.f12973e.sendMessage(obtainMessage);
                }
            }
        } catch (Exception unused2) {
            if (!com.bytedance.sdk.component.utils.l.a()) {
                com.bytedance.sdk.component.utils.l.d(com.bytedance.sdk.component.d.d.d.d1657027613261dc("TUCm`winlFhainz"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD"));
                return;
            }
            String d1657027613261dc = com.bytedance.sdk.component.d.d.d.d1657027613261dc("TUCm`winlFhainz");
            com.bytedance.sdk.component.utils.l.d(d1657027613261dc, com.bytedance.sdk.component.d.d.d.d1657027613261dc("f`koaa&sg)zj~~k/zbpa}qqr8ti|<lkzUD\u0002") + str);
        }
    }

    private void g(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.b.u uVar;
        if (jSONObject == null || (uVar = this.H) == null) {
            return;
        }
        uVar.b(jSONObject);
    }

    private void h(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.g.b bVar = this.A;
        if (bVar == null || jSONObject == null) {
            return;
        }
        bVar.a(jSONObject.optBoolean(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("irPfjacu[|i"), false), jSONObject.optInt(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("cnff"), -1), jSONObject.optString(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("mre"), ""));
    }

    private boolean h(String str) {
        return TextUtils.isEmpty(str) || !com.bytedance.sdk.component.d.d.d.d1657027613261dc("cmk`oZis`lx").equals(str) || k();
    }

    private String i(String str) {
        if (this.f12985r == null) {
            int i10 = this.f12980m;
            while (true) {
                char c10 = '^';
                char c11 = '}';
                while (true) {
                    switch (c10) {
                        case '^':
                            c10 = '_';
                            c11 = '_';
                        case '_':
                            switch (c11) {
                                case '^':
                                case '`':
                                    c10 = '_';
                                    c11 = '_';
                            }
                            break;
                    }
                    switch (c11) {
                        case '7':
                        case '9':
                            break;
                        case '8':
                            break;
                        default:
                            c10 = '_';
                            c11 = '_';
                    }
                }
            }
            return com.bytedance.sdk.openadsdk.utils.u.a(i10);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(JSONObject jSONObject) {
        if (this.f12986s != null && jSONObject != null) {
            try {
                this.f12986s.a(jSONObject.optBoolean(com.bytedance.sdk.component.e.d.c.c1657027613239dc("mtvf"), false));
            } catch (Exception unused) {
            }
        }
    }

    private void j(String str) {
        if (str != null && str.startsWith(com.bytedance.sdk.component.e.c.g.g1657027613239dc("bxvf`dhdm3%$"))) {
            String g1657027613239dc = com.bytedance.sdk.component.e.c.g.g1657027613239dc("bxvf`dhdm3%$hd}\u007fqeq{Kxsdkx}~3");
            String g1657027613239dc2 = com.bytedance.sdk.component.e.c.g.g1657027613239dc("bxvf`dhdm3%$|\u007fgyqew<gpbe}jowh2");
            try {
                if (str.equals(g1657027613239dc)) {
                    WebView o10 = o();
                    if (o10 != null) {
                        com.bytedance.sdk.component.utils.k.a(o10, com.bytedance.sdk.component.e.c.g.g1657027613239dc("j`tbwftnx}0_cxzfq~X@Vg\u007fs\u007f|4Dzxj|HpWFQ@\u000e\u000e"));
                    }
                } else if (str.startsWith(g1657027613239dc2)) {
                    int length = g1657027613239dc2.length();
                    int indexOf = str.indexOf(38, length);
                    if (indexOf <= 0) {
                        return;
                    }
                    String substring = str.substring(length, indexOf);
                    String substring2 = str.substring(indexOf + 1);
                    if (substring.equals(com.bytedance.sdk.component.e.c.g.g1657027613239dc("SBGMAZ@B\\JBZYH[J")) && substring2.length() > 0) {
                        g(substring2);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(JSONObject jSONObject) {
        if (this.f12986s != null && jSONObject != null) {
            try {
                this.f12986s.a(jSONObject.optInt(com.bytedance.sdk.component.e.d.c.c1657027613239dc("sucwaQ\u007fwm"), -1));
            } catch (Exception unused) {
            }
        }
    }

    private boolean k(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar = this.f12986s;
        if (jVar != null && jSONObject != null) {
            double c10 = jVar.c();
            int d10 = this.f12986s.d();
            try {
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ctpqakrSado"), c10 / 1000.0d);
                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("sucwa"), d10);
                com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.e.c.g.g1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("ctpqakrSado'\u007fyo{u+") + d10);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Keep
    @JProtect
    private void l(JSONObject jSONObject) {
        int i10;
        double d10;
        boolean z10;
        double d11;
        w wVar = this;
        if (wVar.f12985r == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.b.m mVar = new com.bytedance.sdk.component.adexpress.b.m();
        mVar.a(1);
        try {
            boolean optBoolean = jSONObject.optBoolean(com.bytedance.sdk.component.d.d.d.d1657027613261dc("irPfjacu[|i"));
            JSONObject optJSONObject = jSONObject.optJSONObject(com.bytedance.sdk.component.d.d.d.d1657027613261dc("AeQj~`"));
            double d12 = 0.0d;
            if (optJSONObject != null) {
                d12 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("whfwl"));
                d10 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("hdkdlq"));
            } else {
                d10 = 0.0d;
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject(com.bytedance.sdk.component.d.d.d.d1657027613261dc("vhffkLhag"));
            if (optJSONObject2 != null) {
                try {
                    double optDouble = optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("x"));
                    double optDouble2 = optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("y"));
                    z10 = optBoolean;
                    double optDouble3 = optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("whfwl"));
                    double optDouble4 = optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("hdkdlq"));
                    if (wVar.m(optJSONObject2)) {
                        d11 = d10;
                        mVar.a((float) optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("bnpgawTfl`\u007fxXb~Cuwf")));
                        mVar.b((float) optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("bnpgawTfl`\u007fxXb~]yvzg")));
                        mVar.c((float) optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("bnpgawTfl`\u007fxNbz{\u007f|^vra")));
                        mVar.d((float) optJSONObject2.optDouble(com.bytedance.sdk.component.d.d.d.d1657027613261dc("bnpgawTfl`\u007fxNbz{\u007f|@zs}b")));
                    } else {
                        d11 = d10;
                    }
                    mVar.c(optDouble);
                    mVar.d(optDouble2);
                    mVar.e(optDouble3);
                    mVar.f(optDouble4);
                } catch (Exception unused) {
                    i10 = 101;
                    wVar = this;
                    mVar.b(i10);
                    mVar.a(g.a(i10));
                    wVar.f12985r.a(mVar);
                }
            } else {
                z10 = optBoolean;
                d11 = d10;
            }
            try {
                String optString = jSONObject.optString(com.bytedance.sdk.component.d.d.d.d1657027613261dc("mdqpebc"), g.a(101));
                int optInt = jSONObject.optInt(com.bytedance.sdk.component.d.d.d.d1657027613261dc("cnff"), 101);
                mVar.a(z10);
                mVar.a(d12);
                mVar.b(d11);
                mVar.a(optString);
                mVar.b(optInt);
                wVar = this;
                wVar.f12985r.a(mVar);
                while (true) {
                    char c10 = 65452;
                    char c11 = 17;
                    while (true) {
                        if (c11 != 17) {
                            while (true) {
                                switch (c10) {
                                    case 'Y':
                                    case 'Z':
                                        break;
                                    case '[':
                                        return;
                                    default:
                                        c10 = 'Z';
                                }
                            }
                        } else {
                            while (true) {
                                char c12 = '8';
                                while (true) {
                                    switch (c12) {
                                        case '7':
                                            while (true) {
                                                switch (c11) {
                                                    case ')':
                                                        switch (c10) {
                                                        }
                                                }
                                            }
                                            c12 = '6';
                                            c11 = 'Q';
                                            c10 = '[';
                                            break;
                                        case '8':
                                            c12 = '6';
                                            c11 = 'Q';
                                            c10 = '[';
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
                wVar = this;
                i10 = 101;
                mVar.b(i10);
                mVar.a(g.a(i10));
                wVar.f12985r.a(mVar);
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035 A[PHI: r2 r3 r5 
      PHI: (r2v2 char) = (r2v1 char), (r2v3 char) binds: [B:9:0x0034, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:9:0x0034, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v2 boolean) = (r5v1 boolean), (r5v3 boolean) binds: [B:9:0x0034, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:10:0x0035). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:17:0x0043). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0049 -> B:9:0x0034). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004d -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m(org.json.JSONObject r5) {
        /*
            r4 = this;
            java.lang.String r0 = "bnpgawTfl`\u007fxXb~Cuwf"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            r1 = 0
            r2 = 56
            r3 = 60
            if (r0 == 0) goto L34
            java.lang.String r0 = "bnpgawTfl`\u007fxNbz{\u007f|^vra"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = "bnpgawTfl`\u007fxXb~]yvzg"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r0 = r5.has(r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = "bnpgawTfl`\u007fxNbz{\u007f|@zs}b"
            java.lang.String r0 = com.bytedance.sdk.component.e.d.c.c1657027613239dc(r0)
            boolean r5 = r5.has(r0)
            goto L43
        L34:
            r5 = 0
        L35:
            r0 = 41
        L37:
            switch(r0) {
                case 40: goto L3b;
                case 41: goto L55;
                case 42: goto L35;
                default: goto L3a;
            }
        L3a:
            goto L35
        L3b:
            switch(r3) {
                case 81: goto L3f;
                case 82: goto L49;
                case 83: goto L47;
                default: goto L3e;
            }
        L3e:
            goto L55
        L3f:
            switch(r2) {
                case 29: goto L47;
                case 30: goto L47;
                case 31: goto L43;
                default: goto L42;
            }
        L42:
            goto L49
        L43:
            if (r5 == 0) goto L34
            r5 = 1
            goto L4d
        L47:
            r1 = r5
            goto L55
        L49:
            switch(r2) {
                case 39: goto L4d;
                case 40: goto L34;
                case 41: goto L55;
                default: goto L4c;
            }
        L4c:
            goto L52
        L4d:
            r0 = 40
            r3 = 83
            goto L37
        L52:
            r2 = 39
            goto L49
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.m(org.json.JSONObject):boolean");
    }

    private void n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.e.d.c.c1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.d.c.c1657027613239dc("TUCm`winlFhainz/xp|wxpdSaw{vu~JmABI"));
        try {
            Uri parse = Uri.parse(jSONObject.optString(com.bytedance.sdk.component.e.d.c.c1657027613239dc("tsc`oAgsi")));
            if (!com.bytedance.sdk.component.e.d.c.c1657027613239dc("bxvf`dhdm").equals(parse.getScheme().toLowerCase())) {
                return;
            }
            com.bytedance.sdk.openadsdk.utils.i.a(parse, this);
            char c10 = '(';
            while (true) {
                switch (c10) {
                    case '(':
                    case '*':
                    default:
                        c10 = ')';
                    case ')':
                        return;
                }
            }
        } catch (Exception unused) {
        }
    }

    private WebView o() {
        WeakReference<SSWebView> weakReference = this.f12972d;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f12972d.get().getWebView();
    }

    private void o(JSONObject jSONObject) {
        if (jSONObject == null || this.f12988u == null) {
            return;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(com.bytedance.sdk.component.e.c.e.e1657027613237dc("tdobmUthl|i\u007fEi}"));
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                this.f12988u.a(false, null);
            } else {
                this.f12988u.a(true, optJSONArray);
                char c10 = '\'';
                while (true) {
                    switch (c10) {
                        case '&':
                            break;
                        case '\'':
                        case '(':
                        default:
                            c10 = '&';
                    }
                }
            }
        } catch (Exception unused) {
            this.f12988u.a(false, null);
        }
    }

    @Keep
    @JProtect
    private JSONObject p() {
        try {
            View view = this.f12978k.get();
            SSWebView sSWebView = this.f12972d.get();
            if (view != null && sSWebView != null) {
                int[] b10 = com.bytedance.sdk.openadsdk.utils.v.b(view);
                int[] b11 = com.bytedance.sdk.openadsdk.utils.v.b((View) sSWebView);
                if (b10 != null && b11 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("x"), com.bytedance.sdk.openadsdk.utils.v.d(m.a(), b10[0] - b11[0]));
                    jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("y"), com.bytedance.sdk.openadsdk.utils.v.d(m.a(), b10[1] - b11[1]));
                    jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("w"), com.bytedance.sdk.openadsdk.utils.v.d(m.a(), view.getWidth()));
                    jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("h"), com.bytedance.sdk.openadsdk.utils.v.d(m.a(), view.getHeight()));
                    jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("irG{mvr"), true);
                    return jSONObject;
                }
                com.bytedance.sdk.component.utils.l.e(com.bytedance.sdk.component.e.c.d.d1657027613220dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdv@hjubJ|~\u007fccGav~2vfgye8iuhuiwpN\u0001MQ\u0004RCE~@O\\|B]FDX]]\u0014\\E\u0017VLVW"));
                return null;
            }
            com.bytedance.sdk.component.utils.l.e(com.bytedance.sdk.component.e.c.d.d1657027613220dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdv@hjubJ|~\u007fccGav~2vfgye8zvtox\\jTUMM\u0004LU\u0007F\\FG"));
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.l.a(com.bytedance.sdk.component.e.c.d.d1657027613220dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.d.d1657027613220dc("sdv@hjubJ|~\u007fccGav~2vfgye"), th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0010, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean p(org.json.JSONObject r4) {
        /*
            r3 = this;
            r0 = 1
            java.util.List<com.bytedance.sdk.openadsdk.core.e.n> r1 = r3.D     // Catch: java.lang.Exception -> L2a
            org.json.JSONArray r1 = b(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "csgbplpb{"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.e.e1657027613237dc(r2)     // Catch: java.lang.Exception -> L2a
            r4.put(r2, r1)     // Catch: java.lang.Exception -> L2a
        L10:
            r4 = 95
            r1 = 95
        L14:
            switch(r4) {
                case 94: goto L1f;
                case 95: goto L18;
                case 96: goto L1b;
                default: goto L17;
            }
        L17:
            goto L25
        L18:
            switch(r1) {
                case 94: goto L10;
                case 95: goto L25;
                case 96: goto L10;
                default: goto L1b;
            }
        L1b:
            switch(r1) {
                case 55: goto L25;
                case 56: goto L25;
                case 57: goto L25;
                default: goto L1e;
            }
        L1e:
            goto L24
        L1f:
            r4 = 39
            if (r1 != r4) goto L24
            goto L10
        L24:
            return r0
        L25:
            r4 = 94
            r1 = 125(0x7d, float:1.75E-43)
            goto L14
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.p(org.json.JSONObject):boolean");
    }

    private List<String> q() {
        return Arrays.asList(com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("aqrJjci"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("aeKmbj"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("gdvWahvki}oBbka"), com.bytedance.sdk.openadsdk.b.i.i1657027613257dc("gdvWaHgnImy"));
    }

    private void q(JSONObject jSONObject) {
        WebView o10;
        if (jSONObject == null || (o10 = o()) == null) {
            return;
        }
        String str = com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("j`tbwftnx}0_cxzfq~X@Vg\u007fs\u007f|4Dt|p{LDoFWVG@MoXDAyAZDXS\\\u001c") + jSONObject.toString() + com.bytedance.sdk.component.d.c.b.a.a1657027613264dc(")");
        com.bytedance.sdk.component.utils.k.a(o10, str);
        if (com.bytedance.sdk.component.utils.l.a()) {
            com.bytedance.sdk.component.utils.l.a(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("TUCm`winlFhainz"), com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("jr]nwb&") + str);
        }
    }

    private JSONObject r(JSONObject jSONObject) {
        if (this.f12969a != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String optString = jSONObject.optString(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmk\u007fm"), null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                for (Map.Entry<String, Object> entry : this.f12969a.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put(com.bytedance.sdk.component.e.c.d.d1657027613220dc("ae]f|qtfWmk\u007fm"), jSONObject2.toString());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.l.b(e10.toString());
            }
        }
        return jSONObject;
    }

    private void r() {
        com.bytedance.sdk.openadsdk.g.h hVar = this.B;
        if (hVar == null) {
            return;
        }
        hVar.a();
    }

    private void s() {
        com.bytedance.sdk.openadsdk.g.h hVar = this.B;
        if (hVar == null) {
            return;
        }
        hVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar = this.f12986s;
        if (jVar == null) {
            return;
        }
        jVar.a();
        while (true) {
            char c10 = 15;
            while (true) {
                switch (c10) {
                    case '\r':
                        break;
                    case 14:
                        return;
                    case 15:
                    default:
                        c10 = 14;
                }
            }
        }
    }

    private void u() {
        WeakReference<Context> weakReference = this.f12975h;
        if (weakReference == null || weakReference.get() == null || TextUtils.isEmpty(m.h().s())) {
            return;
        }
        TTWebsiteActivity.a(this.f12975h.get(), this.f12984q, this.J);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:4:0x000b, B:6:0x0041, B:15:0x005a, B:17:0x006b, B:19:0x0099, B:23:0x00a1, B:25:0x00ae, B:26:0x00b2, B:16:0x0063), top: B:29:0x000b }] */
    @androidx.annotation.Keep
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject v() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.m.h()
            if (r1 == 0) goto Lbe
            com.bytedance.sdk.openadsdk.core.e.n r1 = r10.f12984q     // Catch: java.lang.Exception -> Lbe
            int r1 = com.bytedance.sdk.openadsdk.utils.u.f(r1)     // Catch: java.lang.Exception -> Lbe
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f12984q     // Catch: java.lang.Exception -> Lbe
            int r2 = com.bytedance.sdk.openadsdk.utils.u.e(r2)     // Catch: java.lang.Exception -> Lbe
            com.bytedance.sdk.openadsdk.core.i.f r3 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lbe
            int r3 = r3.f(r4)     // Catch: java.lang.Exception -> Lbe
            com.bytedance.sdk.openadsdk.core.i.f r4 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch: java.lang.Exception -> Lbe
            int r4 = r4.e(r1)     // Catch: java.lang.Exception -> Lbe
            com.bytedance.sdk.openadsdk.core.i.f r5 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lbe
            boolean r5 = r5.c(r6)     // Catch: java.lang.Exception -> Lbe
            com.bytedance.sdk.openadsdk.core.e.n r6 = r10.f12984q     // Catch: java.lang.Exception -> Lbe
            boolean r6 = com.bytedance.sdk.openadsdk.core.e.n.c(r6)     // Catch: java.lang.Exception -> Lbe
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L51
            com.bytedance.sdk.openadsdk.core.i.f r6 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch: java.lang.Exception -> Lbe
            java.lang.String r9 = java.lang.String.valueOf(r1)     // Catch: java.lang.Exception -> Lbe
            int r6 = r6.j(r9)     // Catch: java.lang.Exception -> Lbe
            if (r6 != r7) goto L51
            r6 = 1
            goto L52
        L51:
            r6 = 0
        L52:
            r9 = 7
            if (r2 == r9) goto L63
            r9 = 8
            if (r2 != r9) goto L5a
            goto L63
        L5a:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch: java.lang.Exception -> Lbe
            boolean r1 = r2.a(r1)     // Catch: java.lang.Exception -> Lbe
            goto L6b
        L63:
            com.bytedance.sdk.openadsdk.core.i.f r2 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch: java.lang.Exception -> Lbe
            boolean r1 = r2.b(r1)     // Catch: java.lang.Exception -> Lbe
        L6b:
            java.lang.String r2 = "vnk`aZehf}xd`"
            java.lang.String r2 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r2)     // Catch: java.lang.Exception -> Lbe
            r0.put(r2, r1)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = "rw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch: java.lang.Exception -> Lbe
            r0.put(r1, r3)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = "fw]polvX{ae|"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch: java.lang.Exception -> Lbe
            r0.put(r1, r5)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = "iw]polvX|`gn"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch: java.lang.Exception -> Lbe
            r0.put(r1, r4)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = "simt[aotd`an"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch: java.lang.Exception -> Lbe
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f12984q     // Catch: java.lang.Exception -> Lbe
            if (r2 == 0) goto La0
            boolean r2 = r2.ap()     // Catch: java.lang.Exception -> Lbe
            if (r2 == 0) goto La0
            goto La1
        La0:
            r7 = 0
        La1:
            r0.put(r1, r7)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = "vhffkZgciy~jxdaa"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch: java.lang.Exception -> Lbe
            com.bytedance.sdk.openadsdk.core.e.n r2 = r10.f12984q     // Catch: java.lang.Exception -> Lbe
            if (r2 == 0) goto Lb2
            int r8 = r2.t()     // Catch: java.lang.Exception -> Lbe
        Lb2:
            r0.put(r1, r8)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r1 = "sjks[fnffnoTxbQl|~av"
            java.lang.String r1 = com.bytedance.sdk.component.e.c.g.g1657027613239dc(r1)     // Catch: java.lang.Exception -> Lbe
            r0.put(r1, r6)     // Catch: java.lang.Exception -> Lbe
        Lbe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.v():org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Context context;
        List<com.bytedance.sdk.openadsdk.core.e.n> list = this.D;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.E = new HashMap<>();
        WeakReference<SSWebView> weakReference = this.f12972d;
        SSWebView sSWebView = weakReference != null ? weakReference.get() : null;
        WeakReference<Context> weakReference2 = this.f12975h;
        if (weakReference2 == null || (context = weakReference2.get()) == null) {
            return;
        }
        for (com.bytedance.sdk.openadsdk.core.e.n nVar : this.D) {
            this.E.put(nVar.Y(), new i(context, nVar, sSWebView));
        }
    }

    private boolean x() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12984q;
        if (nVar == null || nVar.ak() == null || com.bytedance.sdk.openadsdk.core.e.p.a(this.f12984q) || this.F || this.f12984q.ak().optInt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("p`pfjqYsqyo")) != 2) {
            return false;
        }
        int e10 = com.bytedance.sdk.openadsdk.utils.u.e(this.f12984q);
        if (e10 == 8 || e10 == 7) {
            this.F = true;
            return true;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0020 -> B:13:0x0022). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x000f -> B:6:0x0013). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0017 -> B:13:0x0022). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.e.c r0 = r3.f12976i
            r1 = 95
            if (r0 != 0) goto Lf
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f12984q
            com.bytedance.sdk.openadsdk.e.a r0 = com.bytedance.sdk.openadsdk.e.a.a(r3, r0)
            r3.f12976i = r0
            goto L22
        Lf:
            r0 = 94
            r2 = 125(0x7d, float:1.75E-43)
        L13:
            switch(r0) {
                case 94: goto L1e;
                case 95: goto L17;
                case 96: goto L1a;
                default: goto L16;
            }
        L16:
            goto Lf
        L17:
            switch(r2) {
                case 94: goto L22;
                case 95: goto Lf;
                case 96: goto L22;
                default: goto L1a;
            }
        L1a:
            switch(r2) {
                case 55: goto Lf;
                case 56: goto Lf;
                case 57: goto Lf;
                default: goto L1d;
            }
        L1d:
            goto L27
        L1e:
            r0 = 39
            if (r2 != r0) goto L27
        L22:
            r0 = 95
            r2 = 95
            goto L13
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.y():void");
    }

    public com.bytedance.sdk.component.a.r a() {
        return this.I;
    }

    public w a(int i10) {
        this.f12982o = i10;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = '[';
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0000, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        switch(r1) {
            case 91: goto L15;
            case 92: goto L15;
            case 93: goto L11;
            default: goto L10;
        };
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.w a(android.view.View r4) {
        /*
            r3 = this;
        L0:
            r0 = 94
            r1 = 75
            r2 = 93
        L6:
            switch(r0) {
                case 92: goto Lc;
                case 93: goto Lf;
                case 94: goto La;
                default: goto L9;
            }
        L9:
            goto L1e
        La:
            r0 = 4
            goto L1e
        Lc:
            switch(r1) {
                case 21: goto L0;
                case 22: goto L13;
                case 23: goto L1e;
                default: goto Lf;
            }
        Lf:
            switch(r1) {
                case 91: goto L0;
                case 92: goto L0;
                case 93: goto L13;
                default: goto L12;
            }
        L12:
            goto L1b
        L13:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.f12978k = r0
            return r3
        L1b:
            r1 = 91
            goto Lf
        L1e:
            r0 = 93
            r1 = 93
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.a(android.view.View):com.bytedance.sdk.openadsdk.core.w");
    }

    public w a(com.bytedance.sdk.component.adexpress.b.j jVar) {
        this.f12985r = jVar;
        return this;
    }

    public w a(SSWebView sSWebView) {
        String c1657027613239dc = com.bytedance.sdk.component.e.d.c.c1657027613239dc("wd`um`qwgff");
        com.bytedance.sdk.component.utils.l.e(c1657027613239dc, com.bytedance.sdk.component.e.d.c.c1657027613239dc("=<?vw`Ltj;*|ioXfuf2{uf~Tw}\u007f!") + sSWebView.hashCode());
        try {
            com.bytedance.sdk.component.a.r b10 = com.bytedance.sdk.component.a.r.a(sSWebView.getWebView()).a(new com.bytedance.sdk.openadsdk.f.a()).a(com.bytedance.sdk.component.e.d.c.c1657027613239dc("TnwwmdiM[Kxbhjk")).a(new com.bytedance.sdk.component.a.l() { // from class: com.bytedance.sdk.openadsdk.core.w.1
                @Override // com.bytedance.sdk.component.a.l
                public <T> T a(String str, Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.a.l
                public <T> String a(T t10) {
                    return null;
                }
            }).a(h.d().s()).b(true).a().b();
            this.I = b10;
            com.bytedance.sdk.openadsdk.f.a.e.a(b10, this);
            com.bytedance.sdk.openadsdk.f.a.a.a(this.I, this);
            com.bytedance.sdk.openadsdk.f.a.b.a(this.I, this);
            com.bytedance.sdk.openadsdk.f.a.c.a(this.I, this);
            com.bytedance.sdk.openadsdk.f.a.d.a(this.I, this);
        } catch (Exception unused) {
        }
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.b.u uVar) {
        this.H = uVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.core.b.d dVar) {
        this.f12993z = dVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        this.f12984q = nVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar) {
        this.f12986s = jVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.e.d dVar) {
        this.f12988u = dVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.a aVar) {
        this.f12989v = aVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.b bVar) {
        this.A = bVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.d dVar) {
        this.f12991x = dVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.e eVar) {
        this.f12990w = eVar;
        return this;
    }

    public w a(com.bytedance.sdk.openadsdk.g.h hVar) {
        this.B = hVar;
        return this;
    }

    public w a(List<com.bytedance.sdk.openadsdk.core.e.n> list) {
        this.D = list;
        return this;
    }

    public w a(Map<String, Object> map) {
        this.f12969a = map;
        return this;
    }

    public w a(JSONObject jSONObject) {
        this.f12987t = jSONObject;
        return this;
    }

    public w a(boolean z10) {
        this.f12970b = z10;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0426, code lost:
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0456, code lost:
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0458, code lost:
        r3 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.Keep
    @com.bytedance.JProtect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.json.JSONObject a(com.bytedance.sdk.openadsdk.core.w.a r22, int r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.a(com.bytedance.sdk.openadsdk.core.w$a, int):org.json.JSONObject");
    }

    @Override // com.bytedance.sdk.component.utils.x.a
    public void a(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof a) {
                try {
                    a((a) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    public void a(String str) {
    }

    @Override // com.bytedance.sdk.openadsdk.e.b
    public void a(String str, JSONObject jSONObject) {
        c(str, jSONObject);
    }

    @Keep
    @JProtect
    public void a(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.g.c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            if (this.f12984q != null && !TextUtils.isEmpty(this.f12979l)) {
                int e10 = com.bytedance.sdk.openadsdk.utils.u.e(this.f12984q);
                AdSlot x10 = this.f12984q.x();
                com.bytedance.sdk.openadsdk.core.e.o oVar = new com.bytedance.sdk.openadsdk.core.e.o();
                if (this.f12984q.G() != null) {
                    oVar.f12204f = 2;
                }
                JSONObject ak = this.f12984q.ak();
                if (ak == null) {
                    ak = new JSONObject();
                }
                if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        ak.put(next, jSONObject.opt(next));
                    }
                }
                oVar.f12206h = ak;
                m.f().a(x10, oVar, e10, new n.a() { // from class: com.bytedance.sdk.openadsdk.core.w.9
                    @Override // com.bytedance.sdk.openadsdk.core.n.a
                    public void a(int i10, String str) {
                        cVar.a(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.n.a
                    public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                        if (aVar.b() != null && !aVar.b().isEmpty()) {
                            cVar.a(true, aVar.b());
                            return;
                        }
                        cVar.a(false, null);
                        bVar.a(-3);
                        com.bytedance.sdk.openadsdk.core.e.b.a(bVar);
                    }
                });
                return;
            }
            cVar.a(false, null);
        } catch (Exception e11) {
            com.bytedance.sdk.component.utils.l.c(com.bytedance.sdk.component.d.d.d.d1657027613261dc("TUCm`winlFhainz"), com.bytedance.sdk.component.d.d.d.d1657027613261dc("gdv#eau'm{xd~"), e11);
        }
    }

    public boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (com.bytedance.sdk.component.e.c.g.g1657027613239dc("bxvf`dhdm").equals(uri.getScheme())) {
            return f12968g.containsKey(uri.getHost());
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            e(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, 0);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public w b(int i10) {
        this.f12980m = i10;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0000, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.w b(com.bytedance.sdk.component.widget.SSWebView r3) {
        /*
            r2 = this;
        L0:
            r0 = 93
            r1 = 93
        L4:
            switch(r0) {
                case 92: goto Lc;
                case 93: goto L18;
                case 94: goto L8;
                default: goto L7;
            }
        L7:
            goto L0
        L8:
            r0 = 4
            if (r1 > r0) goto L10
            goto L0
        Lc:
            switch(r1) {
                case 21: goto L0;
                case 22: goto L10;
                case 23: goto L1c;
                default: goto Lf;
            }
        Lf:
            goto L18
        L10:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f12972d = r0
            return r2
        L18:
            switch(r1) {
                case 91: goto L1c;
                case 92: goto L0;
                case 93: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L21
        L1c:
            r0 = 94
            r1 = 75
            goto L4
        L21:
            r1 = 91
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.b(com.bytedance.sdk.component.widget.SSWebView):com.bytedance.sdk.openadsdk.core.w");
    }

    public w b(JSONObject jSONObject) {
        this.f12992y = jSONObject;
        return this;
    }

    public w b(boolean z10) {
        this.G = z10;
        return this;
    }

    public void b() {
        com.bytedance.sdk.component.a.r rVar = this.I;
        if (rVar == null) {
            return;
        }
        rVar.a();
        this.I = null;
    }

    public void b(Uri uri) {
        long j10;
        JSONObject jSONObject;
        String str;
        try {
            String host = uri.getHost();
            if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\asci|").equals(host) && !com.bytedance.sdk.component.e.c.g.g1657027613239dc("ctqwkhYb~ld\u007f").equals(host) && !com.bytedance.sdk.component.e.c.g.g1657027613239dc("lne\\asci|V|8").equals(host)) {
                if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("pskueqc").equals(host) && !com.bytedance.sdk.component.e.c.g.g1657027613239dc("dhqseqeoWdox\u007flij").equals(host)) {
                    com.bytedance.sdk.component.utils.l.d(com.bytedance.sdk.component.e.c.g.g1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("h`lghwSnz3*ecy.bqeq{4fu\u007f}t{;trmk"));
                    return;
                }
                j(uri.toString());
                return;
            }
            String queryParameter = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("c`vfcjt~"));
            String queryParameter2 = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("t`e"));
            this.J = queryParameter2;
            String queryParameter3 = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("l``fh"));
            if (h(queryParameter3)) {
                long j11 = 0;
                try {
                    j10 = Long.parseLong(uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("v`nva")));
                } catch (Exception unused) {
                    j10 = 0;
                }
                try {
                    j11 = Long.parseLong(uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("eyv\\rdjrm")));
                } catch (Exception unused2) {
                }
                long j12 = j11;
                JSONObject jSONObject2 = null;
                String queryParameter4 = uri.getQueryParameter(com.bytedance.sdk.component.e.c.g.g1657027613239dc("eyvqe"));
                if (!TextUtils.isEmpty(queryParameter4)) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(queryParameter4);
                        try {
                            jSONObject3.putOpt(com.bytedance.sdk.component.e.c.g.g1657027613239dc("u`]skiodq"), Integer.valueOf(this.f12982o));
                        } catch (Exception unused3) {
                        }
                        jSONObject2 = jSONObject3;
                    } catch (Exception unused4) {
                    }
                }
                if (com.bytedance.sdk.component.e.c.g.g1657027613239dc("cmk`o").equals(queryParameter3)) {
                    jSONObject2 = r(jSONObject2);
                }
                try {
                    if (!com.bytedance.sdk.component.e.c.g.g1657027613239dc("l`lgmkaXxlxmSh|}\u007fc").equals(queryParameter3) && !com.bytedance.sdk.component.e.c.g.g1657027613239dc("l`lgmkaXxlxmS~zndb").equals(queryParameter3)) {
                        str = i(queryParameter2);
                        jSONObject = jSONObject2;
                        com.bytedance.sdk.openadsdk.b.e.a(this.f12984q, queryParameter, str, queryParameter3, j10, j12, jSONObject);
                    }
                    jSONObject = new JSONObject();
                    for (String str2 : uri.getQueryParameterNames()) {
                        try {
                            if (com.bytedance.sdk.component.e.c.g.g1657027613239dc("eyvqe").equals(str2)) {
                                jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmk\u007fm"), new JSONObject(uri.getQueryParameter(str2)).optString(com.bytedance.sdk.component.e.c.g.g1657027613239dc("ae]f|qtfWmk\u007fm")));
                            } else {
                                jSONObject.put(str2, uri.getQueryParameter(str2));
                            }
                        } catch (Exception unused5) {
                        }
                    }
                    str = this.f12974f;
                    com.bytedance.sdk.openadsdk.b.e.a(this.f12984q, queryParameter, str, queryParameter3, j10, j12, jSONObject);
                } catch (Exception unused6) {
                }
            }
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.e.c.g.g1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.c.g.g1657027613239dc("h`lgh`Sua)osoh~{y~|)4"), e10);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    public void b(String str) {
    }

    public com.bytedance.sdk.openadsdk.core.e.n c() {
        return this.f12984q;
    }

    public w c(String str) {
        this.f12974f = str;
        return this;
    }

    public w c(boolean z10) {
        this.C = z10;
        return this;
    }

    public void c(int i10) {
        com.bytedance.sdk.openadsdk.core.nativeexpress.j jVar = this.f12986s;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    public void c(JSONObject jSONObject) {
        WeakReference<Context> weakReference;
        int optInt = jSONObject.optInt(com.bytedance.sdk.component.b.a.e.e1657027613270dc("l`lgmkaT|pfn"));
        String optString = jSONObject.optString(com.bytedance.sdk.component.b.a.e.e1657027613270dc("usn"));
        String optString2 = jSONObject.optString(com.bytedance.sdk.component.b.a.e.e1657027613270dc("f`nofdelW|xg"));
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        if (optInt == 0) {
            if (o() != null) {
                o().loadUrl(optString);
            }
        } else if (optInt == 1) {
            WeakReference<Context> weakReference2 = this.f12975h;
            if (weakReference2 == null || !(weakReference2.get() instanceof Activity)) {
                return;
            }
            com.bytedance.sdk.openadsdk.utils.k.a((Activity) this.f12975h.get(), optString);
        } else if (optInt != 2 || (weakReference = this.f12975h) == null || !(weakReference.get() instanceof Activity) || com.bytedance.sdk.openadsdk.utils.k.b((Activity) this.f12975h.get(), optString)) {
        } else {
            com.bytedance.sdk.openadsdk.utils.k.a((Activity) this.f12975h.get(), optString2);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                j(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.w.3
                    @Override // java.lang.Runnable
                    public void run() {
                        w.this.j(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                d(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.w.4
                    @Override // java.lang.Runnable
                    public void run() {
                        w.this.d(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public w d(String str) {
        this.f12977j = str;
        return this;
    }

    public void d(JSONObject jSONObject) {
        String str;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        JSONObject jSONObject2;
        char c10;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.d.d.g.g1657027613257dc("TUCm`winlFhainz"), com.bytedance.sdk.component.d.d.g.g1657027613257dc("TUCm`winlFhainz/xp|wxpU{qzq^jxpk"));
        try {
            String optString = jSONObject.optString(com.bytedance.sdk.component.d.d.g.g1657027613257dc("aeKg"));
            int optInt = jSONObject.optInt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("asgbP|vb"), 1);
            String optString2 = jSONObject.optString(com.bytedance.sdk.component.d.d.g.g1657027613257dc("cmk`oDtbi]s{i"));
            JSONObject optJSONObject = jSONObject.optJSONObject(com.bytedance.sdk.component.d.d.g.g1657027613257dc("cmk`oLhag"));
            double d19 = 0.0d;
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("dnum[}"), 0.0d);
                d12 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("dnum[|"), 0.0d);
                double optDouble2 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("uq]{"), 0.0d);
                double optDouble3 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("uq]z"), 0.0d);
                double optDouble4 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("dnum[qojm"), 0.0d);
                double optDouble5 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("uq]wmhc"), 0.0d);
                double optDouble6 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("btvwkkY\u007f"), 0.0d);
                double optDouble7 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("btvwkkY~"), 0.0d);
                double optDouble8 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("btvwkkYpam~c"), 0.0d);
                double optDouble9 = optJSONObject.optDouble(com.bytedance.sdk.component.d.d.g.g1657027613257dc("btvwkkYom`mcx"), 0.0d);
                jSONObject2 = optJSONObject.optJSONObject(com.bytedance.sdk.component.d.d.g.g1657027613257dc("rdawMk`h"));
                d18 = optDouble9;
                d19 = optDouble;
                d11 = optDouble2;
                d13 = optDouble4;
                d14 = optDouble5;
                d15 = optDouble6;
                d16 = optDouble7;
                d17 = optDouble8;
                str = optString;
                d10 = optDouble3;
            } else {
                str = optString;
                d10 = 0.0d;
                d11 = 0.0d;
                d12 = 0.0d;
                d13 = 0.0d;
                d14 = 0.0d;
                d15 = 0.0d;
                d16 = 0.0d;
                d17 = 0.0d;
                d18 = 0.0d;
                jSONObject2 = null;
            }
            com.bytedance.sdk.openadsdk.core.e.j a10 = new j.a().d((float) d19).c((float) d12).b((float) d11).a((float) d10).b((long) d13).a((long) d14).c((int) d15).d((int) d16).e((int) d17).f((int) d18).a(optString2).a((SparseArray<c.a>) null).a(true).b(optInt).a(jSONObject2).a(jSONObject.optInt(com.bytedance.sdk.component.d.d.g.g1657027613257dc("cmk`oDtbiJk\u007fija}i"), -1)).a();
            com.bytedance.sdk.component.adexpress.b.j jVar = this.f12985r;
            if (jVar != null) {
                jVar.a(null, optInt, a10);
            }
            a(str, optInt, a10);
            while (true) {
                while (c10 != 7) {
                    c10 = (c10 == '\b' || c10 != '\t') ? (char) 7 : '\b';
                }
                return;
            }
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.b.j jVar2 = this.f12985r;
            if (jVar2 != null) {
                jVar2.a(null, -1, null);
            }
        }
    }

    public void d(boolean z10) {
        this.f12971c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[PHI: r0 
      PHI: (r0v5 boolean) = (r0v3 boolean), (r0v7 boolean) binds: [B:10:0x0015, B:4:0x0004] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[PHI: r0 
      PHI: (r0v4 boolean) = (r0v3 boolean), (r0v3 boolean), (r0v6 boolean) binds: [B:10:0x0015, B:9:0x0012, B:13:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023 A[LOOP:0: B:7:0x000e->B:16:0x0023, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000a A[PHI: r0 
      PHI: (r0v2 boolean) = (r0v1 boolean), (r0v3 boolean), (r0v3 boolean), (r0v3 boolean) binds: [B:5:0x0009, B:10:0x0015, B:9:0x0012, B:17:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0015 -> B:12:0x0019). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0015 -> B:6:0x000a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x001e -> B:7:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x000e -> B:6:0x000a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0012 -> B:6:0x000a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f12984q
            if (r0 == 0) goto L9
            boolean r0 = r0.o()
            goto L19
        L9:
            r0 = 0
        La:
            r1 = 74
            r2 = 55
        Le:
            switch(r1) {
                case 72: goto La;
                case 73: goto L12;
                case 74: goto L15;
                default: goto L11;
            }
        L11:
            goto L23
        L12:
            switch(r2) {
                case 94: goto L1e;
                case 95: goto La;
                case 96: goto La;
                default: goto L15;
            }
        L15:
            switch(r2) {
                case 55: goto L1d;
                case 56: goto L19;
                case 57: goto La;
                default: goto L18;
            }
        L18:
            goto L1e
        L19:
            if (r0 == 0) goto L9
            r0 = 1
            goto L1e
        L1d:
            return r0
        L1e:
            r1 = 73
            r2 = 96
            goto Le
        L23:
            r1 = 72
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.d():boolean");
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            n(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    public w e(String str) {
        this.f12979l = str;
        return this;
    }

    public boolean e() {
        boolean z10 = this.f12971c;
        while (true) {
            char c10 = ']';
            char c11 = ']';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                        }
                        c10 = '^';
                        c11 = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c11) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c11 = '[';
                            }
                        }
                        c10 = '^';
                        c11 = 'K';
                        break;
                    case '^':
                        if (c11 > 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return z10;
    }

    public w f(String str) {
        this.f12981n = str;
        return this;
    }

    public void f() {
        WeakReference<Context> weakReference = this.f12975h;
        if (weakReference != null && (weakReference.get() instanceof Activity) && com.bytedance.sdk.openadsdk.utils.k.a((Activity) this.f12975h.get())) {
            ((Activity) this.f12975h.get()).finish();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void g() {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.core.nativeexpress.j r0 = r2.f12986s
            if (r0 == 0) goto L1a
            r0.b()
            r0 = 92
        L9:
            r1 = 14
        Lb:
            switch(r1) {
                case 13: goto L13;
                case 14: goto L15;
                case 15: goto Lf;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            switch(r0) {
                case 94: goto L15;
                case 95: goto L1a;
                case 96: goto L15;
                default: goto L12;
            }
        L12:
            goto L15
        L13:
            r1 = 72
        L15:
            r1 = 15
            r0 = 95
            goto Lb
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.g():void");
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        k(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public String getTemplateInfo() {
        a(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("gdvWahvki}oBbka"), true);
        try {
            JSONObject jSONObject = this.f12987t;
            if (jSONObject != null) {
                jSONObject.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("sdvwmka"), v());
                if (this.f12984q != null) {
                    this.f12987t.put(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("eyvfjvohf"), this.f12984q.aB());
                }
            }
            a(com.bytedance.sdk.component.d.c.b.a.a1657027613264dc("gdvWahvki}oBbka"), false);
            return this.f12987t.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Keep
    @JProtect
    public void h() {
        a((JSONObject) null, new com.bytedance.sdk.openadsdk.g.c() { // from class: com.bytedance.sdk.openadsdk.core.w.8
            @Override // com.bytedance.sdk.openadsdk.g.c
            public void a(boolean z10, List<com.bytedance.sdk.openadsdk.core.e.n> list) {
                w.this.D = list;
                w.this.w();
                w.this.i();
            }
        });
        while (true) {
            char c10 = ']';
            char c11 = ']';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                        }
                        c10 = '^';
                        c11 = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c11) {
                                default:
                                    c11 = '[';
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                            }
                        }
                        c10 = '^';
                        c11 = 'K';
                    case '^':
                        if (c11 <= 4) {
                            break;
                        } else {
                            return;
                        }
                }
            }
        }
    }

    public void i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.bytedance.sdk.component.e.c.g.g1657027613239dc("m`vfvlgk"), b(this.D));
            a(com.bytedance.sdk.component.e.c.g.g1657027613239dc("m`vfvlgkEl~j"), jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.component.utils.l.b(com.bytedance.sdk.component.e.d.c.c1657027613239dc("TUCm`winlFhainz"), com.bytedance.sdk.component.e.d.c.c1657027613239dc("iokwV`hcm{Lbbd}g"));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.w.6
            @Override // java.lang.Runnable
            public void run() {
                if (w.this.L != null) {
                    w.this.L.a();
                }
            }
        });
    }

    public boolean j() {
        boolean z10 = this.K;
        while (true) {
            char c10 = '^';
            char c11 = 'K';
            while (true) {
                switch (c10) {
                    case '\\':
                        switch (c11) {
                            case 22:
                            case 23:
                                c10 = ']';
                                c11 = ']';
                        }
                        break;
                    case ']':
                        break;
                    case '^':
                        c10 = ']';
                        c11 = ']';
                    default:
                        c10 = ']';
                        c11 = ']';
                }
            }
            while (true) {
                switch (c11) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        break;
                    default:
                        c11 = '[';
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x000a, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean k() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.core.e.n r0 = r4.f12984q
            r1 = 0
            if (r0 != 0) goto L6
            goto L1e
        L6:
            int r0 = r0.I()
        La:
            r2 = 95
            r3 = 95
        Le:
            switch(r2) {
                case 94: goto L1f;
                case 95: goto L12;
                case 96: goto L1a;
                default: goto L11;
            }
        L11:
            goto L25
        L12:
            switch(r3) {
                case 94: goto La;
                case 95: goto L16;
                case 96: goto La;
                default: goto L15;
            }
        L15:
            goto L1a
        L16:
            r2 = 1
            if (r0 != r2) goto L25
            return r2
        L1a:
            switch(r3) {
                case 55: goto L1e;
                case 56: goto L25;
                case 57: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L24
        L1e:
            return r1
        L1f:
            r2 = 39
            if (r3 != r2) goto L24
            goto La
        L24:
            return r1
        L25:
            r2 = 94
            r3 = 125(0x7d, float:1.75E-43)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.k():boolean");
    }

    public void l() {
        com.bytedance.sdk.openadsdk.e.c cVar = this.f12976i;
        if (cVar != null) {
            cVar.a();
        }
        if (x()) {
            h();
        }
    }

    public void m() {
        com.bytedance.sdk.openadsdk.e.c cVar = this.f12976i;
        if (cVar == null) {
            return;
        }
        cVar.b();
        while (true) {
            char c10 = 15;
            while (true) {
                switch (c10) {
                    case '\r':
                        break;
                    case 14:
                        return;
                    case 15:
                    default:
                        c10 = 14;
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                i(jSONObject);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.w.2
                    @Override // java.lang.Runnable
                    public void run() {
                        w.this.i(jSONObject);
                    }
                });
            }
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.l.e(com.bytedance.sdk.component.d.d.g.g1657027613257dc("TUCm`winlFhainz"), "");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:406)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:204)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:138)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void n() {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.e.c r0 = r2.f12976i
            if (r0 == 0) goto L1a
            r0.c()
            r0 = 92
        L9:
            r1 = 14
        Lb:
            switch(r1) {
                case 13: goto L13;
                case 14: goto L15;
                case 15: goto Lf;
                default: goto Le;
            }
        Le:
            goto L9
        Lf:
            switch(r0) {
                case 94: goto L15;
                case 95: goto L1a;
                case 96: goto L15;
                default: goto L12;
            }
        L12:
            goto L15
        L13:
            r1 = 72
        L15:
            r1 = 15
            r0 = 95
            goto Lb
        L1a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.w.n():void");
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            l(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.d.b
    @JavascriptInterface
    public void skipVideo() {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                t();
            } else {
                this.f12973e.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.w.5
                    @Override // java.lang.Runnable
                    public void run() {
                        w.this.t();
                    }
                });
            }
        } catch (Exception unused) {
        }
    }
}
