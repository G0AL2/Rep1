package com.RNFetchBlob;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.os.Build;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import ye.b0;
import ye.d0;
import ye.e0;
import ye.g0;
import ye.k;
import ye.l;
import ye.t;
import ye.v;
import ye.z;

/* compiled from: RNFetchBlobReq.java */
/* loaded from: classes.dex */
public class g extends BroadcastReceiver implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    public static HashMap<String, ye.e> f5624t = new HashMap<>();

    /* renamed from: u  reason: collision with root package name */
    public static HashMap<String, Long> f5625u = new HashMap<>();

    /* renamed from: v  reason: collision with root package name */
    static HashMap<String, com.RNFetchBlob.f> f5626v = new HashMap<>();

    /* renamed from: w  reason: collision with root package name */
    static HashMap<String, com.RNFetchBlob.f> f5627w = new HashMap<>();

    /* renamed from: x  reason: collision with root package name */
    static k f5628x = new k();

    /* renamed from: a  reason: collision with root package name */
    com.RNFetchBlob.b f5629a;

    /* renamed from: b  reason: collision with root package name */
    String f5630b;

    /* renamed from: c  reason: collision with root package name */
    String f5631c;

    /* renamed from: d  reason: collision with root package name */
    String f5632d;

    /* renamed from: e  reason: collision with root package name */
    String f5633e;

    /* renamed from: f  reason: collision with root package name */
    String f5634f;

    /* renamed from: g  reason: collision with root package name */
    ReadableArray f5635g;

    /* renamed from: h  reason: collision with root package name */
    ReadableMap f5636h;

    /* renamed from: i  reason: collision with root package name */
    Callback f5637i;

    /* renamed from: j  reason: collision with root package name */
    long f5638j;

    /* renamed from: k  reason: collision with root package name */
    long f5639k;

    /* renamed from: l  reason: collision with root package name */
    com.RNFetchBlob.a f5640l;

    /* renamed from: m  reason: collision with root package name */
    e f5641m;

    /* renamed from: n  reason: collision with root package name */
    EnumC0101g f5642n;

    /* renamed from: p  reason: collision with root package name */
    WritableMap f5644p;

    /* renamed from: s  reason: collision with root package name */
    z f5647s;

    /* renamed from: o  reason: collision with root package name */
    f f5643o = f.Auto;

    /* renamed from: q  reason: collision with root package name */
    boolean f5645q = false;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<String> f5646r = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq.java */
    /* loaded from: classes.dex */
    public class a implements v {
        a() {
        }

        @Override // ye.v
        public d0 intercept(v.a aVar) throws IOException {
            g.this.f5646r.add(aVar.l().l().toString());
            return aVar.a(aVar.l());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq.java */
    /* loaded from: classes.dex */
    public class b implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f5649a;

        b(b0 b0Var) {
            this.f5649a = b0Var;
        }

        @Override // ye.v
        public d0 intercept(v.a aVar) throws IOException {
            e0 aVar2;
            try {
                d0 a10 = aVar.a(this.f5649a);
                int i10 = d.f5653b[g.this.f5642n.ordinal()];
                if (i10 == 1) {
                    aVar2 = new v1.a(RNFetchBlob.RCTContext, g.this.f5630b, a10.a(), g.this.f5629a.f5604k.booleanValue());
                } else if (i10 != 2) {
                    aVar2 = new v1.a(RNFetchBlob.RCTContext, g.this.f5630b, a10.a(), g.this.f5629a.f5604k.booleanValue());
                } else {
                    ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
                    String str = g.this.f5630b;
                    e0 a11 = a10.a();
                    g gVar = g.this;
                    aVar2 = new v1.b(reactApplicationContext, str, a11, gVar.f5634f, gVar.f5629a.f5602i.booleanValue());
                }
                return a10.O().b(aVar2).c();
            } catch (SocketException unused) {
                g.this.f5645q = true;
                return aVar.a(aVar.l());
            } catch (SocketTimeoutException unused2) {
                g.this.f5645q = true;
                return aVar.a(aVar.l());
            } catch (Exception unused3) {
                return aVar.a(aVar.l());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq.java */
    /* loaded from: classes.dex */
    public class c implements ye.f {
        c() {
        }

        @Override // ye.f
        public void onFailure(ye.e eVar, IOException iOException) {
            g.c(g.this.f5630b);
            g gVar = g.this;
            if (gVar.f5644p == null) {
                gVar.f5644p = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                g.this.f5644p.putBoolean("timeout", true);
                g.this.f5637i.invoke("The request timed out.", null, null);
            } else {
                g.this.f5637i.invoke(iOException.getLocalizedMessage(), null, null);
            }
            g.this.m();
        }

        @Override // ye.f
        public void onResponse(ye.e eVar, d0 d0Var) throws IOException {
            ReadableMap readableMap = g.this.f5629a.f5597d;
            if (readableMap != null) {
                String string = readableMap.hasKey("title") ? g.this.f5629a.f5597d.getString("title") : "";
                String string2 = readableMap.hasKey("description") ? readableMap.getString("description") : "";
                String string3 = readableMap.hasKey("mime") ? readableMap.getString("mime") : "text/plain";
                boolean z10 = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                boolean z11 = readableMap.hasKey("notification") ? readableMap.getBoolean("notification") : false;
                DownloadManager downloadManager = (DownloadManager) RNFetchBlob.RCTContext.getSystemService("download");
                g gVar = g.this;
                downloadManager.addCompletedDownload(string, string2, z10, string3, gVar.f5634f, gVar.f5638j, z11);
            }
            g.this.d(d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5652a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5653b;

        static {
            int[] iArr = new int[EnumC0101g.values().length];
            f5653b = iArr;
            try {
                iArr[EnumC0101g.KeepInMemory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5653b[EnumC0101g.FileStorage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            f5652a = iArr2;
            try {
                iArr2[e.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5652a[e.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5652a[e.Form.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5652a[e.WithoutBody.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq.java */
    /* loaded from: classes.dex */
    public enum e {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq.java */
    /* loaded from: classes.dex */
    public enum f {
        Auto,
        UTF8,
        BASE64
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RNFetchBlobReq.java */
    /* renamed from: com.RNFetchBlob.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0101g {
        KeepInMemory,
        FileStorage
    }

    public g(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, z zVar, Callback callback) {
        this.f5631c = str2.toUpperCase();
        com.RNFetchBlob.b bVar = new com.RNFetchBlob.b(readableMap);
        this.f5629a = bVar;
        this.f5630b = str;
        this.f5632d = str3;
        this.f5636h = readableMap2;
        this.f5637i = callback;
        this.f5633e = str4;
        this.f5635g = readableArray;
        this.f5647s = zVar;
        if (!bVar.f5594a.booleanValue() && this.f5629a.f5595b == null) {
            this.f5642n = EnumC0101g.KeepInMemory;
        } else {
            this.f5642n = EnumC0101g.FileStorage;
        }
        if (str4 != null) {
            this.f5641m = e.SingleFile;
        } else if (readableArray != null) {
            this.f5641m = e.Form;
        } else {
            this.f5641m = e.WithoutBody;
        }
    }

    public static void c(String str) {
        if (f5624t.containsKey(str)) {
            f5624t.get(str).cancel();
            f5624t.remove(str);
        }
        if (f5625u.containsKey(str)) {
            ((DownloadManager) RNFetchBlob.RCTContext.getApplicationContext().getSystemService("download")).remove(f5625u.get(str).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d0 d0Var) {
        boolean l10 = l(d0Var);
        e(k(d0Var, l10));
        int i10 = d.f5653b[this.f5642n.ordinal()];
        if (i10 == 1) {
            if (l10) {
                try {
                    if (this.f5629a.f5601h.booleanValue()) {
                        String n10 = com.RNFetchBlob.d.n(this.f5630b);
                        InputStream a10 = d0Var.a().a();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(n10));
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = a10.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        a10.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        this.f5637i.invoke(null, "path", n10);
                    }
                } catch (IOException unused) {
                    this.f5637i.invoke("RNFetchBlob failed to encode response data to BASE64 string.", null);
                }
            }
            byte[] b10 = d0Var.a().b();
            CharsetEncoder newEncoder = Charset.forName("UTF-8").newEncoder();
            if (this.f5643o == f.BASE64) {
                this.f5637i.invoke(null, "base64", Base64.encodeToString(b10, 2));
                return;
            }
            try {
                newEncoder.encode(ByteBuffer.wrap(b10).asCharBuffer());
                this.f5637i.invoke(null, "utf8", new String(b10));
            } catch (CharacterCodingException unused2) {
                if (this.f5643o == f.UTF8) {
                    this.f5637i.invoke(null, "utf8", new String(b10));
                } else {
                    this.f5637i.invoke(null, "base64", Base64.encodeToString(b10, 2));
                }
            }
        } else if (i10 != 2) {
            try {
                this.f5637i.invoke(null, "utf8", new String(d0Var.a().b(), "UTF-8"));
            } catch (IOException unused3) {
                this.f5637i.invoke("RNFetchBlob failed to encode response data to UTF8 string.", null);
            }
        } else {
            e0 a11 = d0Var.a();
            try {
                a11.b();
            } catch (Exception unused4) {
            }
            v1.b bVar = (v1.b) a11;
            if (bVar != null && !bVar.y()) {
                this.f5637i.invoke("Download interrupted.", null);
            } else {
                String replace = this.f5634f.replace("?append=true", "");
                this.f5634f = replace;
                this.f5637i.invoke(null, "path", replace);
            }
        }
        d0Var.a().close();
        m();
    }

    private void e(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobState", writableMap);
    }

    public static z.a f(z.a aVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 16 && i10 <= 19) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                    X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                    SSLContext sSLContext = SSLContext.getInstance("SSL");
                    sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
                    aVar.W(sSLContext.getSocketFactory(), x509TrustManager);
                    l a10 = new l.a(l.f39700g).f(g0.TLS_1_2).a();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(a10);
                    arrayList.add(l.f39701h);
                    arrayList.add(l.f39702i);
                    aVar.h(arrayList);
                } else {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
            } catch (Exception e10) {
                z3.a.k("OkHttpClientProvider", "Error while enabling TLS 1.2", e10);
            }
        }
        return aVar;
    }

    private String g(HashMap<String, String> hashMap, String str) {
        String str2 = hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = hashMap.get(str.toLowerCase());
        return str3 == null ? "" : str3;
    }

    private String h(t tVar, String str) {
        String a10 = tVar.a(str);
        return a10 != null ? a10 : tVar.a(str.toLowerCase()) == null ? "" : tVar.a(str.toLowerCase());
    }

    public static com.RNFetchBlob.f i(String str) {
        if (f5626v.containsKey(str)) {
            return f5626v.get(str);
        }
        return null;
    }

    public static com.RNFetchBlob.f j(String str) {
        if (f5627w.containsKey(str)) {
            return f5627w.get(str);
        }
        return null;
    }

    private WritableMap k(d0 d0Var, boolean z10) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("status", d0Var.h());
        createMap.putString("state", "2");
        createMap.putString("taskId", this.f5630b);
        createMap.putBoolean("timeout", this.f5645q);
        WritableMap createMap2 = Arguments.createMap();
        for (int i10 = 0; i10 < d0Var.A().size(); i10++) {
            createMap2.putString(d0Var.A().c(i10), d0Var.A().h(i10));
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = this.f5646r.iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        createMap.putArray("redirects", createArray);
        createMap.putMap("headers", createMap2);
        t A = d0Var.A();
        if (z10) {
            createMap.putString("respType", "blob");
        } else if (h(A, "content-type").equalsIgnoreCase("text/")) {
            createMap.putString("respType", "text");
        } else if (h(A, "content-type").contains("application/json")) {
            createMap.putString("respType", "json");
        } else {
            createMap.putString("respType", "");
        }
        return createMap;
    }

    private boolean l(d0 d0Var) {
        boolean z10;
        String h10 = h(d0Var.A(), "Content-Type");
        boolean z11 = !h10.equalsIgnoreCase("text/");
        boolean z12 = !h10.equalsIgnoreCase("application/json");
        if (this.f5629a.f5606m != null) {
            for (int i10 = 0; i10 < this.f5629a.f5606m.size(); i10++) {
                if (h10.toLowerCase().contains(this.f5629a.f5606m.getString(i10).toLowerCase())) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        return !(z12 || z11) || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (f5624t.containsKey(this.f5630b)) {
            f5624t.remove(this.f5630b);
        }
        if (f5625u.containsKey(this.f5630b)) {
            f5625u.remove(this.f5630b);
        }
        if (f5627w.containsKey(this.f5630b)) {
            f5627w.remove(this.f5630b);
        }
        if (f5626v.containsKey(this.f5630b)) {
            f5626v.remove(this.f5630b);
        }
        com.RNFetchBlob.a aVar = this.f5640l;
        if (aVar != null) {
            aVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.g.onReceive(android.content.Context, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f5 A[Catch: Exception -> 0x0487, TryCatch #1 {Exception -> 0x0487, blocks: (B:55:0x01a4, B:57:0x01ae, B:59:0x01bb, B:61:0x01c6, B:63:0x01cc, B:65:0x01de, B:69:0x01ed, B:72:0x01f4, B:74:0x01fa, B:78:0x020f, B:75:0x0208, B:80:0x0223, B:81:0x0228, B:82:0x022d, B:86:0x023c, B:88:0x0245, B:89:0x0249, B:91:0x024f, B:93:0x0261, B:95:0x0269, B:96:0x026e, B:98:0x0276, B:99:0x027b, B:100:0x028a, B:103:0x0298, B:105:0x02a0, B:108:0x02a9, B:139:0x032d, B:159:0x041f, B:161:0x043d, B:162:0x0449, B:147:0x034f, B:149:0x0357, B:151:0x035f, B:154:0x0368, B:155:0x0370, B:156:0x037f, B:157:0x03ca, B:158:0x03f5, B:109:0x02af, B:111:0x02bb, B:118:0x02d5, B:120:0x02d9, B:122:0x02e1, B:125:0x02ec, B:127:0x02f6, B:130:0x0303, B:131:0x0308, B:133:0x0318, B:134:0x031b, B:136:0x0321, B:137:0x0324, B:138:0x0329, B:112:0x02c0, B:114:0x02c6, B:116:0x02cc, B:117:0x02d1, B:85:0x0239, B:58:0x01b5), top: B:169:0x01a4, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x043d A[Catch: Exception -> 0x0487, TryCatch #1 {Exception -> 0x0487, blocks: (B:55:0x01a4, B:57:0x01ae, B:59:0x01bb, B:61:0x01c6, B:63:0x01cc, B:65:0x01de, B:69:0x01ed, B:72:0x01f4, B:74:0x01fa, B:78:0x020f, B:75:0x0208, B:80:0x0223, B:81:0x0228, B:82:0x022d, B:86:0x023c, B:88:0x0245, B:89:0x0249, B:91:0x024f, B:93:0x0261, B:95:0x0269, B:96:0x026e, B:98:0x0276, B:99:0x027b, B:100:0x028a, B:103:0x0298, B:105:0x02a0, B:108:0x02a9, B:139:0x032d, B:159:0x041f, B:161:0x043d, B:162:0x0449, B:147:0x034f, B:149:0x0357, B:151:0x035f, B:154:0x0368, B:155:0x0370, B:156:0x037f, B:157:0x03ca, B:158:0x03f5, B:109:0x02af, B:111:0x02bb, B:118:0x02d5, B:120:0x02d9, B:122:0x02e1, B:125:0x02ec, B:127:0x02f6, B:130:0x0303, B:131:0x0308, B:133:0x0318, B:134:0x031b, B:136:0x0321, B:137:0x0324, B:138:0x0329, B:112:0x02c0, B:114:0x02c6, B:116:0x02cc, B:117:0x02d1, B:85:0x0239, B:58:0x01b5), top: B:169:0x01a4, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.g.run():void");
    }
}
