package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.mediationsdk.C1732f;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.h  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1734h {

    /* renamed from: a  reason: collision with root package name */
    ISBannerSize f27050a;

    /* renamed from: g  reason: collision with root package name */
    private String f27056g;

    /* renamed from: i  reason: collision with root package name */
    private com.ironsource.mediationsdk.utils.c f27058i;

    /* renamed from: j  reason: collision with root package name */
    private InterfaceC1733g f27059j;

    /* renamed from: b  reason: collision with root package name */
    private final String f27051b = "1";

    /* renamed from: c  reason: collision with root package name */
    private final String f27052c = "102";

    /* renamed from: d  reason: collision with root package name */
    private final String f27053d = "103";

    /* renamed from: e  reason: collision with root package name */
    private final String f27054e = "102";

    /* renamed from: f  reason: collision with root package name */
    private final String f27055f = "GenericNotifications";

    /* renamed from: h  reason: collision with root package name */
    private String f27057h = IronSourceUtils.getSessionId();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.h$a */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<InterfaceC1733g> f27060a;

        /* renamed from: b  reason: collision with root package name */
        private int f27061b;

        /* renamed from: c  reason: collision with root package name */
        private String f27062c;

        /* renamed from: d  reason: collision with root package name */
        private String f27063d;

        /* renamed from: e  reason: collision with root package name */
        private List<com.ironsource.mediationsdk.server.b> f27064e;

        /* renamed from: f  reason: collision with root package name */
        private com.ironsource.mediationsdk.server.b f27065f;

        /* renamed from: g  reason: collision with root package name */
        private JSONObject f27066g;

        /* renamed from: h  reason: collision with root package name */
        private JSONObject f27067h;

        /* renamed from: i  reason: collision with root package name */
        private long f27068i;

        /* renamed from: j  reason: collision with root package name */
        private int f27069j;

        /* renamed from: l  reason: collision with root package name */
        private int f27071l;

        /* renamed from: o  reason: collision with root package name */
        private final URL f27074o;

        /* renamed from: p  reason: collision with root package name */
        private final JSONObject f27075p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f27076q;

        /* renamed from: r  reason: collision with root package name */
        private final int f27077r;

        /* renamed from: s  reason: collision with root package name */
        private final long f27078s;

        /* renamed from: t  reason: collision with root package name */
        private final boolean f27079t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f27080u;

        /* renamed from: v  reason: collision with root package name */
        private final int f27081v;

        /* renamed from: k  reason: collision with root package name */
        private String f27070k = InneractiveMediationNameConsts.OTHER;

        /* renamed from: m  reason: collision with root package name */
        private String f27072m = "";

        /* renamed from: n  reason: collision with root package name */
        private int f27073n = 0;

        a(InterfaceC1733g interfaceC1733g, URL url, JSONObject jSONObject, boolean z10, int i10, long j10, boolean z11, boolean z12, int i11) {
            this.f27060a = new WeakReference<>(interfaceC1733g);
            this.f27074o = url;
            this.f27075p = jSONObject;
            this.f27076q = z10;
            this.f27077r = i10;
            this.f27078s = j10;
            this.f27079t = z11;
            this.f27080u = z12;
            this.f27081v = i11;
        }

        private static String a(HttpURLConnection httpURLConnection) {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb2.toString();
                }
                sb2.append(readLine);
            }
        }

        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v3 */
        private boolean a() {
            long time;
            HttpURLConnection httpURLConnection;
            String encode;
            int responseCode;
            String str;
            JSONObject jSONObject;
            this.f27068i = new Date().getTime();
            int i10 = 0;
            try {
                int i11 = this.f27073n;
                int i12 = IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE;
                ?? r72 = 1;
                this.f27071l = i11 == 1015 ? 1 : this.f27081v;
                this.f27069j = 0;
                HttpURLConnection httpURLConnection2 = null;
                while (true) {
                    int i13 = this.f27069j;
                    int i14 = this.f27077r;
                    if (i13 >= i14) {
                        this.f27069j = i14 - 1;
                        this.f27070k = "trials_fail";
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str2 = "Auction Handler: auction trial " + (this.f27069j + r72) + " out of " + this.f27077r + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str2, i10);
                        IronSourceUtils.sendAutomationLog(str2);
                        URL url = this.f27074o;
                        int i15 = (int) this.f27078s;
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                        httpURLConnection.setReadTimeout(i15);
                        httpURLConnection.setDoInput(r72);
                        httpURLConnection.setDoOutput(r72);
                        try {
                            JSONObject jSONObject2 = this.f27075p;
                            boolean z10 = this.f27079t;
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
                            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                            String str3 = "";
                            if (this.f27071l == 2) {
                                try {
                                    str3 = com.ironsource.mediationsdk.utils.g.a().d();
                                } catch (JSONException e10) {
                                    this.f27072m = e10.getLocalizedMessage();
                                    this.f27073n = i12;
                                    this.f27071l = r72;
                                    IronLog.INTERNAL.error("get encrypted session key exception " + e10.getMessage());
                                }
                            }
                            String jSONObject3 = jSONObject2.toString();
                            String b10 = b();
                            if (z10) {
                                IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                                encode = IronSourceAES.compressAndEncrypt(b10, jSONObject3);
                            } else {
                                encode = IronSourceAES.encode(b10, jSONObject3);
                            }
                            bufferedWriter.write(this.f27071l == 2 ? String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", str3, encode) : String.format("{\"request\" : \"%1$s\"}", encode));
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            outputStreamWriter.close();
                            outputStream.close();
                            responseCode = httpURLConnection.getResponseCode();
                        } catch (SocketTimeoutException e11) {
                            e = e11;
                            httpURLConnection2 = httpURLConnection;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            this.f27061b = 1006;
                            this.f27062c = "Connection timed out";
                            IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                            this.f27069j++;
                            i10 = 0;
                            i12 = IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE;
                            r72 = 1;
                        } catch (Exception e12) {
                            e = e12;
                            httpURLConnection2 = httpURLConnection;
                            IronLog.INTERNAL.error("getting exception " + e);
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            this.f27061b = 1000;
                            this.f27062c = e.getMessage();
                            this.f27070k = InneractiveMediationNameConsts.OTHER;
                            return false;
                        }
                    } catch (SocketTimeoutException e13) {
                        e = e13;
                    } catch (Exception e14) {
                        e = e14;
                    }
                    if (responseCode == 200) {
                        String a10 = a(httpURLConnection);
                        try {
                            boolean z11 = this.f27076q;
                            boolean z12 = this.f27080u;
                            if (TextUtils.isEmpty(a10)) {
                                throw new JSONException("empty response");
                            }
                            JSONObject jSONObject4 = new JSONObject(a10);
                            if (z11) {
                                String b11 = b();
                                String string = jSONObject4.getString(this.f27071l == 2 ? "ct" : "response");
                                if (z12) {
                                    IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
                                    String decryptAndDecompress = IronSourceAES.decryptAndDecompress(b11, string);
                                    if (decryptAndDecompress == null) {
                                        throw new JSONException("decompression error");
                                    }
                                    jSONObject = new JSONObject(decryptAndDecompress);
                                } else {
                                    String decode = IronSourceAES.decode(b11, string);
                                    if (TextUtils.isEmpty(decode)) {
                                        throw new JSONException("decryption error");
                                    }
                                    jSONObject = new JSONObject(decode);
                                }
                                jSONObject4 = jSONObject;
                            }
                            C1732f.a();
                            C1732f.a a11 = C1732f.a(jSONObject4);
                            this.f27063d = a11.f27037a;
                            this.f27064e = a11.f27038b;
                            this.f27065f = a11.f27039c;
                            this.f27066g = a11.f27040d;
                            this.f27067h = a11.f27041e;
                            this.f27061b = a11.f27042f;
                            this.f27062c = a11.f27043g;
                            httpURLConnection.disconnect();
                            return true;
                        } catch (JSONException e15) {
                            if (e15.getMessage() != null && e15.getMessage().equalsIgnoreCase("decryption error")) {
                                this.f27061b = 1003;
                                this.f27062c = "Auction decryption error";
                            }
                            if (e15.getMessage() == null || !e15.getMessage().equalsIgnoreCase("decompression error")) {
                                this.f27061b = 1002;
                                str = "Auction parsing error";
                            } else {
                                this.f27061b = IronSourceError.AUCTION_ERROR_DECOMPRESSION;
                                str = "Auction decompression error";
                            }
                            this.f27062c = str;
                            this.f27070k = "parsing";
                            IronLog.INTERNAL.error("Auction handle response exception " + e15.getMessage());
                            httpURLConnection.disconnect();
                            return false;
                        }
                    }
                    this.f27061b = 1001;
                    String str4 = "Auction status not 200 error, error code response from server - " + responseCode;
                    this.f27062c = str4;
                    IronLog.INTERNAL.error(str4);
                    httpURLConnection.disconnect();
                    if (this.f27069j < this.f27077r - 1) {
                        long time2 = this.f27078s - (new Date().getTime() - time);
                        if (time2 > 0) {
                            SystemClock.sleep(time2);
                        }
                    }
                    httpURLConnection2 = httpURLConnection;
                    this.f27069j++;
                    i10 = 0;
                    i12 = IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE;
                    r72 = 1;
                }
            } catch (Exception e16) {
                this.f27061b = IronSourceError.AUCTION_REQUEST_ERROR_MISSING_PARAMS;
                this.f27062c = e16.getMessage();
                this.f27069j = 0;
                this.f27070k = InneractiveMediationNameConsts.OTHER;
                IronLog.INTERNAL.error("Auction request exception " + e16.getMessage());
                return false;
            }
        }

        private String b() {
            return this.f27071l == 2 ? com.ironsource.mediationsdk.utils.g.a().c() : com.ironsource.mediationsdk.utils.g.a().b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean a10 = a();
            InterfaceC1733g interfaceC1733g = this.f27060a.get();
            if (interfaceC1733g == null) {
                return;
            }
            long time = new Date().getTime() - this.f27068i;
            if (a10) {
                interfaceC1733g.a(this.f27064e, this.f27063d, this.f27065f, this.f27066g, this.f27067h, this.f27069j + 1, time, this.f27073n, this.f27072m);
            } else {
                interfaceC1733g.a(this.f27061b, this.f27062c, this.f27069j + 1, this.f27070k, time);
            }
        }
    }

    public C1734h(String str, com.ironsource.mediationsdk.utils.c cVar, InterfaceC1733g interfaceC1733g) {
        this.f27056g = str;
        this.f27058i = cVar;
        this.f27059j = interfaceC1733g;
    }

    private JSONObject a(Context context, Map<String, Object> map, List<String> list, C1735i c1735i, int i10, boolean z10, IronSourceSegment ironSourceSegment) {
        new JSONObject();
        com.ironsource.mediationsdk.utils.p c10 = J.a().f26337i.f27494c.f27237e.c();
        JSONObject a10 = a(ironSourceSegment);
        boolean z11 = c10.f27536d;
        C1732f a11 = C1732f.a();
        if (z11) {
            return a11.a(this.f27056g, z10, map, list, c1735i, i10, this.f27050a, a10);
        }
        JSONObject a12 = a11.a(context, map, list, c1735i, i10, this.f27057h, this.f27058i, this.f27050a, a10);
        a12.put("adUnit", this.f27056g);
        a12.put("doNotEncryptResponse", z10 ? "false" : InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        return a12;
    }

    private static JSONObject a(IronSourceSegment ironSourceSegment) {
        JSONObject jSONObject = new JSONObject();
        if (ironSourceSegment == null) {
            return null;
        }
        Vector<Pair<String, String>> a10 = ironSourceSegment.a();
        for (int i10 = 0; i10 < a10.size(); i10++) {
            try {
                jSONObject.put((String) a10.get(i10).first, a10.get(i10).second);
            } catch (JSONException e10) {
                e10.printStackTrace();
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    public static void a(com.ironsource.mediationsdk.server.b bVar, int i10, com.ironsource.mediationsdk.server.b bVar2) {
        for (String str : bVar.f()) {
            String a10 = C1732f.a().a(str, i10, bVar, "", "", "");
            C1732f.a();
            C1732f.a("reportLoadSuccess", bVar.a(), a10);
        }
        if (bVar2 != null) {
            for (String str2 : bVar2.f()) {
                String a11 = C1732f.a().a(str2, i10, bVar, "", "102", "");
                C1732f.a();
                C1732f.a("reportLoadSuccess", "GenericNotifications", a11);
            }
        }
    }

    public static void a(com.ironsource.mediationsdk.server.b bVar, int i10, com.ironsource.mediationsdk.server.b bVar2, String str) {
        for (String str2 : bVar.d()) {
            String a10 = C1732f.a().a(str2, i10, bVar, "", "", str);
            C1732f.a();
            C1732f.a("reportImpression", bVar.a(), a10);
        }
        if (bVar2 != null) {
            for (String str3 : bVar2.d()) {
                String a11 = C1732f.a().a(str3, i10, bVar, "", "102", str);
                C1732f.a();
                C1732f.a("reportImpression", "GenericNotifications", a11);
            }
        }
    }

    public static void a(ArrayList<String> arrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> concurrentHashMap, int i10, com.ironsource.mediationsdk.server.b bVar, com.ironsource.mediationsdk.server.b bVar2) {
        Iterator<String> it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals(bVar2.a())) {
                z11 = i10 == 2;
                z10 = true;
            } else {
                com.ironsource.mediationsdk.server.b bVar3 = concurrentHashMap.get(next);
                String c10 = bVar3.c();
                String str = z10 ? z11 ? "102" : "103" : "1";
                for (String str2 : bVar3.e()) {
                    String a10 = C1732f.a().a(str2, i10, bVar2, c10, str, "");
                    C1732f.a();
                    C1732f.a("reportAuctionLose", bVar3.a(), a10);
                }
            }
        }
        if (bVar != null) {
            for (String str3 : bVar.e()) {
                String a11 = C1732f.a().a(str3, i10, bVar2, "", "102", "");
                C1732f.a();
                C1732f.a("reportAuctionLose", "GenericNotifications", a11);
            }
        }
    }

    public final void a(Context context, Map<String, Object> map, List<String> list, C1735i c1735i, int i10, IronSourceSegment ironSourceSegment) {
        try {
            boolean z10 = IronSourceUtils.getSerr() == 1;
            JSONObject a10 = a(context, map, list, c1735i, i10, z10, ironSourceSegment);
            InterfaceC1733g interfaceC1733g = this.f27059j;
            URL url = new URL(this.f27058i.f27411d);
            com.ironsource.mediationsdk.utils.c cVar = this.f27058i;
            com.ironsource.environment.e.c.f26160a.c(new a(interfaceC1733g, url, a10, z10, cVar.f27412e, cVar.f27415h, cVar.f27423p, cVar.f27424q, cVar.f27425r));
        } catch (Exception e10) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("execute auction exception " + e10.getMessage());
            this.f27059j.a(1000, e10.getMessage(), 0, InneractiveMediationNameConsts.OTHER, 0L);
        }
    }

    public final void a(CopyOnWriteArrayList<aa> copyOnWriteArrayList, ConcurrentHashMap<String, com.ironsource.mediationsdk.server.b> concurrentHashMap, int i10, com.ironsource.mediationsdk.server.b bVar, com.ironsource.mediationsdk.server.b bVar2) {
        ArrayList arrayList = new ArrayList();
        Iterator<aa> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().k());
        }
        a(arrayList, concurrentHashMap, i10, bVar, bVar2);
    }
}
