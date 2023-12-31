package ms.bd.o.Pgl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f34532a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, c> f34533b = new ConcurrentHashMap();

    /* loaded from: classes3.dex */
    public interface pgla {
        Map<String, String> frameSign(String str, int i10);

        Map<String, String> getFeatureHash(String str, byte[] bArr);

        Map<String, String> getReportRaw(String str, int i10, Map<String, String> map);

        String getToken();

        void report(String str);

        void setBDDeviceID(String str);

        void setCollectMode(int i10);

        void setDeviceID(String str);

        void setInstallID(String str);

        void setSessionID(String str);
    }

    public static String a() {
        return (String) pblb.a(67108867);
    }

    public static synchronized pgla a(String str) {
        synchronized (l0.class) {
            if (str != null) {
                if (f34532a) {
                    Object a10 = pblb.a(67108866, str);
                    if (a10 == null) {
                        return null;
                    }
                    c cVar = f34533b.get(str);
                    if (cVar == null) {
                        return null;
                    }
                    return new k0(cVar, ms.bd.o.Pgl.pgla.a().b(), ((Long) a10).longValue());
                }
                return null;
            }
            throw new NullPointerException((String) pblk.a(16777217, 0, 0L, "50af32", new byte[]{37, 34, 2, 59, 40, 101, 59, 4, 35, 34, 100, 48, 23, 82, 31, 32, 34}));
        }
    }

    public static synchronized boolean a(Context context, c cVar, String str, String str2) {
        String str3;
        synchronized (l0.class) {
            if (context == null) {
                throw new NullPointerException((String) pblk.a(16777217, 0, 0L, "c3c598", new byte[]{113, 62, 30, 85, 3, 55, 116, 82, 49, 106, 103, 61, 20, 1, 8, 32, 116, 82, 48, 96, 50, 63, 5, 77, 10}));
            }
            if (cVar == null) {
                throw new NullPointerException((String) pblk.a(16777217, 0, 0L, "c20a0c", new byte[]{113, 63, 77, 19, 6, 115, 32, 16, 110, 36, 126, 52, 3, 27, 0, 96, 32, 17, 100, 113, 124, 37, 79, 25}));
            }
            String str4 = cVar.f34515a;
            str3 = (str4 == null || str4.length() <= 0) ? cVar.f34521g : cVar.f34515a;
            if (str3 == null || str3.length() <= 0) {
                throw new NullPointerException((String) pblk.a(16777217, 0, 0L, "8b4cf5", new byte[]{40, 112, 87, 62, 125, 98, 54, 86, 118, 39, 105, 98, 66, 87, 74, 39, 47}));
            }
            synchronized (l0.class) {
                if (!f34532a) {
                    Context applicationContext = context.getApplicationContext();
                    ms.bd.o.Pgl.pgla.a().a(applicationContext);
                    try {
                        pblu.a(applicationContext, str2);
                    } catch (Throwable unused) {
                    }
                    pblu.a(applicationContext, str);
                    String str5 = (String) pblk.a(16777217, 0, 0L, "ac6ae2", new byte[]{62, 108, 86});
                    pblb.a(16777218, new n());
                    pblb.a(16777217, new y());
                    String str6 = (String) pblk.a(16777217, 0, 0L, "48316a", new byte[]{107, 55, 68});
                    pblb.a(16777219, new d0());
                    pblb.a(16777221, new e0());
                    pblb.a(16777222, new f0());
                    pblb.a(16777223, new g0());
                    pblb.a(16777224, new h0());
                    pblb.a(16777225, new i0());
                    pblb.a(16777226, new j0());
                    pblb.a(16777228, new d());
                    pblb.a(16777232, new e());
                    pblb.a(16777233, new f());
                    pblb.a(16777235, new g());
                    pblb.a(16777238, new h());
                    pblb.a(16777239, new i());
                    pblb.a(16777241, new j());
                    pblb.a(16777242, new k());
                    pblb.a(16777243, new l());
                    pblb.a(16777244, new m());
                    pblb.a(16777245, new o());
                    pblb.a(16777246, new p());
                    pblb.a(16777247, new q());
                    pblb.a(16777248, new r());
                    pblb.a(16777249, new s());
                    pblb.a(16777250, new t());
                    pblb.a(16777251, new u());
                    pblb.a(16777240, new v());
                    pblb.a(16777252, new w());
                    pblb.a(16777253, new x());
                    pblb.a(16777254, new z());
                    pblb.a(16777255, new a0());
                    pblb.a(16777256, new b0());
                    pblb.a(16777257, new c0());
                    pblb.a(33554433, pbly.b() ? new p0() : new n0());
                    pblb.a(33554434, new q0());
                    pblj.a();
                    com.bytedance.mobsec.metasec.ov.pgla.a();
                    pblk.a(16777219, 0, 0L, null, applicationContext);
                    pblk.a(16777220, 0, 0L, null, null);
                    f34532a = true;
                }
            }
        }
        if (f34533b.containsKey(str3)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(cVar.a(cVar.f34515a));
        jSONArray.put(cVar.a(cVar.f34522h));
        jSONArray.put(cVar.a(cVar.f34521g));
        jSONArray.put(cVar.a(cVar.f34523i));
        jSONArray.put(cVar.a(x0.a()));
        jSONArray.put(cVar.a(cVar.f34516b));
        jSONArray.put(cVar.a(cVar.f34517c));
        jSONArray.put(cVar.a(cVar.f34518d));
        jSONArray.put(cVar.a(cVar.f34519e));
        jSONArray.put(cVar.a(cVar.f34520f));
        jSONArray.put(String.valueOf(cVar.f34524j));
        jSONArray.put(String.valueOf(cVar.f34525k));
        jSONArray.put(String.valueOf(cVar.f34526l));
        JSONArray jSONArray2 = new JSONArray();
        for (Map.Entry<String, String> entry : cVar.f34527m.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                jSONArray2.put(cVar.a(entry.getKey()));
                jSONArray2.put(cVar.a(entry.getValue()));
            }
        }
        jSONArray.put(jSONArray2);
        JSONArray jSONArray3 = new JSONArray();
        for (Map.Entry<String, String> entry2 : cVar.f34528n.entrySet()) {
            if (!TextUtils.isEmpty(entry2.getKey())) {
                jSONArray3.put(cVar.a(entry2.getKey()));
                jSONArray3.put(cVar.a(entry2.getValue()));
            }
        }
        jSONArray.put(jSONArray3);
        if (((Boolean) pblb.a(67108865, jSONArray.toString())).booleanValue()) {
            f34533b.put(str3, cVar);
            return true;
        }
        return false;
    }
}
