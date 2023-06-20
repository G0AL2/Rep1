package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.u;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6178b = false;

    /* renamed from: t  reason: collision with root package name */
    private static int f6179t = 2;

    /* renamed from: a  reason: collision with root package name */
    c f6180a;

    /* renamed from: c  reason: collision with root package name */
    private int f6181c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f6182d;

    /* renamed from: e  reason: collision with root package name */
    private int f6183e;

    /* renamed from: f  reason: collision with root package name */
    private int f6184f;

    /* renamed from: g  reason: collision with root package name */
    private f f6185g;

    /* renamed from: h  reason: collision with root package name */
    private b f6186h;

    /* renamed from: i  reason: collision with root package name */
    private long f6187i;

    /* renamed from: j  reason: collision with root package name */
    private long f6188j;

    /* renamed from: k  reason: collision with root package name */
    private int f6189k;

    /* renamed from: l  reason: collision with root package name */
    private long f6190l;

    /* renamed from: m  reason: collision with root package name */
    private String f6191m;

    /* renamed from: n  reason: collision with root package name */
    private String f6192n;

    /* renamed from: o  reason: collision with root package name */
    private com.apm.insight.b.e f6193o;

    /* renamed from: p  reason: collision with root package name */
    private volatile boolean f6194p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6195q;

    /* renamed from: r  reason: collision with root package name */
    private final u f6196r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f6197s;

    /* renamed from: u  reason: collision with root package name */
    private Runnable f6198u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f6207a;

        /* renamed from: b  reason: collision with root package name */
        long f6208b;

        /* renamed from: c  reason: collision with root package name */
        long f6209c;

        /* renamed from: d  reason: collision with root package name */
        boolean f6210d;

        /* renamed from: e  reason: collision with root package name */
        int f6211e;

        /* renamed from: f  reason: collision with root package name */
        StackTraceElement[] f6212f;

        private a() {
        }

        void a() {
            this.f6207a = -1L;
            this.f6208b = -1L;
            this.f6209c = -1L;
            this.f6211e = -1;
            this.f6212f = null;
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final int f6213a;

        /* renamed from: b  reason: collision with root package name */
        a f6214b;

        /* renamed from: c  reason: collision with root package name */
        final List<a> f6215c;

        /* renamed from: d  reason: collision with root package name */
        private int f6216d = 0;

        public b(int i10) {
            this.f6213a = i10;
            this.f6215c = new ArrayList(i10);
        }

        a a() {
            a aVar = this.f6214b;
            if (aVar != null) {
                this.f6214b = null;
                return aVar;
            }
            return new a();
        }

        void a(a aVar) {
            int i10;
            int size = this.f6215c.size();
            int i11 = this.f6213a;
            if (size < i11) {
                this.f6215c.add(aVar);
                i10 = this.f6215c.size();
            } else {
                int i12 = this.f6216d % i11;
                this.f6216d = i12;
                a aVar2 = this.f6215c.set(i12, aVar);
                aVar2.a();
                this.f6214b = aVar2;
                i10 = this.f6216d + 1;
            }
            this.f6216d = i10;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        long f6217a;

        /* renamed from: b  reason: collision with root package name */
        long f6218b;

        /* renamed from: c  reason: collision with root package name */
        long f6219c;

        /* renamed from: d  reason: collision with root package name */
        long f6220d;

        /* renamed from: e  reason: collision with root package name */
        long f6221e;
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public long f6222a;

        /* renamed from: b  reason: collision with root package name */
        long f6223b;

        /* renamed from: c  reason: collision with root package name */
        long f6224c;

        /* renamed from: d  reason: collision with root package name */
        int f6225d;

        /* renamed from: e  reason: collision with root package name */
        int f6226e;

        /* renamed from: f  reason: collision with root package name */
        long f6227f;

        /* renamed from: g  reason: collision with root package name */
        long f6228g;

        /* renamed from: h  reason: collision with root package name */
        String f6229h;

        /* renamed from: i  reason: collision with root package name */
        public String f6230i;

        /* renamed from: j  reason: collision with root package name */
        String f6231j;

        /* renamed from: k  reason: collision with root package name */
        d f6232k;

        private void a(JSONObject jSONObject) {
            jSONObject.put("block_uuid", this.f6231j);
            jSONObject.put("sblock_uuid", this.f6231j);
            jSONObject.put("belong_frame", this.f6232k != null);
            d dVar = this.f6232k;
            if (dVar != null) {
                jSONObject.put("vsyncDelayTime", this.f6224c - (dVar.f6217a / 1000000));
                jSONObject.put("doFrameTime", (this.f6232k.f6218b / 1000000) - this.f6224c);
                d dVar2 = this.f6232k;
                jSONObject.put("inputHandlingTime", (dVar2.f6219c / 1000000) - (dVar2.f6218b / 1000000));
                d dVar3 = this.f6232k;
                jSONObject.put("animationsTime", (dVar3.f6220d / 1000000) - (dVar3.f6219c / 1000000));
                d dVar4 = this.f6232k;
                jSONObject.put("performTraversalsTime", (dVar4.f6221e / 1000000) - (dVar4.f6220d / 1000000));
                jSONObject.put("drawTime", this.f6223b - (this.f6232k.f6221e / 1000000));
            }
        }

        public JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", h.a(this.f6229h));
                jSONObject.put("cpuDuration", this.f6228g);
                jSONObject.put("duration", this.f6227f);
                jSONObject.put("type", this.f6225d);
                jSONObject.put("count", this.f6226e);
                jSONObject.put("messageCount", this.f6226e);
                jSONObject.put("lastDuration", this.f6223b - this.f6224c);
                jSONObject.put("start", this.f6222a);
                jSONObject.put("end", this.f6223b);
                a(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }

        void b() {
            this.f6225d = -1;
            this.f6226e = -1;
            this.f6227f = -1L;
            this.f6229h = null;
            this.f6231j = null;
            this.f6232k = null;
            this.f6230i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        int f6233a;

        /* renamed from: b  reason: collision with root package name */
        int f6234b;

        /* renamed from: c  reason: collision with root package name */
        e f6235c;

        /* renamed from: d  reason: collision with root package name */
        List<e> f6236d = new ArrayList();

        f(int i10) {
            this.f6233a = i10;
        }

        e a(int i10) {
            e eVar = this.f6235c;
            if (eVar != null) {
                eVar.f6225d = i10;
                this.f6235c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.f6225d = i10;
            return eVar2;
        }

        List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            if (this.f6236d.size() == this.f6233a) {
                for (int i11 = this.f6234b; i11 < this.f6236d.size(); i11++) {
                    arrayList.add(this.f6236d.get(i11));
                }
                while (i10 < this.f6234b - 1) {
                    arrayList.add(this.f6236d.get(i10));
                    i10++;
                }
            } else {
                while (i10 < this.f6236d.size()) {
                    arrayList.add(this.f6236d.get(i10));
                    i10++;
                }
            }
            return arrayList;
        }

        void a(e eVar) {
            int i10;
            int size = this.f6236d.size();
            int i11 = this.f6233a;
            if (size < i11) {
                this.f6236d.add(eVar);
                i10 = this.f6236d.size();
            } else {
                int i12 = this.f6234b % i11;
                this.f6234b = i12;
                e eVar2 = this.f6236d.set(i12, eVar);
                eVar2.b();
                this.f6235c = eVar2;
                i10 = this.f6234b + 1;
            }
            this.f6234b = i10;
        }
    }

    public h(int i10) {
        this(i10, false);
    }

    public h(int i10, boolean z10) {
        this.f6181c = 0;
        this.f6182d = 0;
        this.f6183e = 100;
        this.f6184f = 200;
        this.f6187i = -1L;
        this.f6188j = -1L;
        this.f6189k = -1;
        this.f6190l = -1L;
        this.f6194p = false;
        this.f6195q = false;
        this.f6197s = false;
        this.f6198u = new Runnable() { // from class: com.apm.insight.b.h.2

            /* renamed from: c  reason: collision with root package name */
            private long f6202c;

            /* renamed from: b  reason: collision with root package name */
            private long f6201b = 0;

            /* renamed from: d  reason: collision with root package name */
            private int f6203d = -1;

            /* renamed from: e  reason: collision with root package name */
            private int f6204e = 0;

            /* renamed from: f  reason: collision with root package name */
            private int f6205f = 0;

            @Override // java.lang.Runnable
            public void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                a a10 = h.this.f6186h.a();
                if (this.f6203d == h.this.f6182d) {
                    this.f6204e++;
                } else {
                    this.f6204e = 0;
                    this.f6205f = 0;
                    this.f6202c = uptimeMillis;
                }
                this.f6203d = h.this.f6182d;
                int i11 = this.f6204e;
                if (i11 > 0 && i11 - this.f6205f >= h.f6179t && this.f6201b != 0 && uptimeMillis - this.f6202c > 700 && h.this.f6197s) {
                    a10.f6212f = Looper.getMainLooper().getThread().getStackTrace();
                    this.f6205f = this.f6204e;
                }
                a10.f6210d = h.this.f6197s;
                a10.f6209c = (uptimeMillis - this.f6201b) - 300;
                a10.f6207a = uptimeMillis;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                this.f6201b = uptimeMillis2;
                a10.f6208b = uptimeMillis2 - uptimeMillis;
                a10.f6211e = h.this.f6182d;
                h.this.f6196r.a(h.this.f6198u, 300L);
                h.this.f6186h.a(a10);
            }
        };
        this.f6180a = new c() { // from class: com.apm.insight.b.h.1
        };
        if (!z10 && !f6178b) {
            this.f6196r = null;
            return;
        }
        u uVar = new u("looper_monitor");
        this.f6196r = uVar;
        uVar.b();
        this.f6186h = new b(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
        uVar.a(this.f6198u, 300L);
    }

    private static long a(int i10) {
        if (i10 < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.g.a(i10);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            String str3 = split.length == 2 ? split[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    private void a(int i10, long j10, String str) {
        a(i10, j10, str, true);
    }

    private void a(int i10, long j10, String str, boolean z10) {
        this.f6195q = true;
        e a10 = this.f6185g.a(i10);
        a10.f6227f = j10 - this.f6187i;
        if (z10) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            a10.f6228g = currentThreadTimeMillis - this.f6190l;
            this.f6190l = currentThreadTimeMillis;
        } else {
            a10.f6228g = -1L;
        }
        a10.f6226e = this.f6181c;
        a10.f6229h = str;
        a10.f6230i = this.f6191m;
        a10.f6222a = this.f6187i;
        a10.f6223b = j10;
        a10.f6224c = this.f6188j;
        this.f6185g.a(a10);
        this.f6181c = 0;
        this.f6187i = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, long j10) {
        h hVar;
        int i10;
        String str;
        boolean z11;
        int i11 = this.f6182d + 1;
        this.f6182d = i11;
        this.f6182d = i11 & 65535;
        this.f6195q = false;
        if (this.f6187i < 0) {
            this.f6187i = j10;
        }
        if (this.f6188j < 0) {
            this.f6188j = j10;
        }
        if (this.f6189k < 0) {
            this.f6189k = Process.myTid();
            this.f6190l = SystemClock.currentThreadTimeMillis();
        }
        int i12 = this.f6184f;
        if (j10 - this.f6187i > i12) {
            long j11 = this.f6188j;
            if (j10 - j11 > i12) {
                if (z10) {
                    if (this.f6181c == 0) {
                        a(1, j10, "no message running");
                    } else {
                        a(9, j11, this.f6191m);
                        i10 = 1;
                        z11 = false;
                        str = "no message running";
                    }
                } else if (this.f6181c == 0) {
                    i10 = 8;
                    str = this.f6192n;
                    z11 = true;
                } else {
                    hVar = this;
                    hVar.a(9, j11, this.f6191m, false);
                    i10 = 8;
                    str = this.f6192n;
                    z11 = true;
                    hVar.a(i10, j10, str, z11);
                }
                hVar = this;
                hVar.a(i10, j10, str, z11);
            } else {
                a(9, j10, this.f6192n);
            }
        }
        this.f6188j = j10;
    }

    private void e() {
        this.f6183e = 100;
        this.f6184f = ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
    }

    static /* synthetic */ int f(h hVar) {
        int i10 = hVar.f6181c;
        hVar.f6181c = i10 + 1;
        return i10;
    }

    public e a(long j10) {
        e eVar = new e();
        eVar.f6229h = this.f6192n;
        eVar.f6230i = this.f6191m;
        eVar.f6227f = j10 - this.f6188j;
        eVar.f6228g = a(this.f6189k) - this.f6190l;
        eVar.f6226e = this.f6181c;
        return eVar;
    }

    public void a() {
        if (this.f6194p) {
            return;
        }
        this.f6194p = true;
        e();
        this.f6185g = new f(this.f6183e);
        this.f6193o = new com.apm.insight.b.e() { // from class: com.apm.insight.b.h.3
            @Override // com.apm.insight.b.e
            public void a(String str) {
                h.this.f6197s = true;
                h.this.f6192n = str;
                super.a(str);
                h.this.a(true, com.apm.insight.b.e.f6169a);
            }

            @Override // com.apm.insight.b.e
            public boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public void b(String str) {
                super.b(str);
                h.f(h.this);
                h.this.a(false, com.apm.insight.b.e.f6169a);
                h hVar = h.this;
                hVar.f6191m = hVar.f6192n;
                h.this.f6192n = "no message running";
                h.this.f6197s = false;
            }
        };
        i.a();
        i.a(this.f6193o);
        k.a(k.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        a();
    }

    public JSONArray c() {
        List<e> a10;
        JSONArray jSONArray = new JSONArray();
        try {
            a10 = this.f6185g.a();
        } catch (Throwable unused) {
        }
        if (a10 == null) {
            return jSONArray;
        }
        int i10 = 0;
        for (e eVar : a10) {
            if (eVar != null) {
                i10++;
                jSONArray.put(eVar.a().put("id", i10));
            }
        }
        return jSONArray;
    }
}
