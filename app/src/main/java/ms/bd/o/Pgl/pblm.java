package ms.bd.o.Pgl;

import ms.bd.o.Pgl.pblb;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class pblm extends pblb.pgla {

    /* renamed from: a  reason: collision with root package name */
    private static pblm f34543a;

    /* loaded from: classes3.dex */
    public static class pgla {

        /* renamed from: a  reason: collision with root package name */
        private long f34544a;

        /* renamed from: b  reason: collision with root package name */
        private long f34545b;

        /* renamed from: c  reason: collision with root package name */
        private String f34546c;

        /* renamed from: d  reason: collision with root package name */
        private String f34547d;

        public void a(String str) {
            this.f34546c = str;
            this.f34547d = null;
            this.f34544a = System.currentTimeMillis();
        }

        public void a(String str, int i10) {
            pblm a10 = pblm.a();
            if (a10 == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f34544a;
            long j11 = currentTimeMillis - j10;
            this.f34545b = j11;
            a10.a(j11, j10, this.f34546c, this.f34547d, str, i10, null);
        }

        public void b(String str, int i10) {
            pblm a10 = pblm.a();
            if (a10 == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = this.f34544a;
            long j11 = currentTimeMillis - j10;
            this.f34545b = j11;
            a10.b(j11, j10, this.f34546c, this.f34547d, str, i10, null);
        }
    }

    public static synchronized pblm a() {
        pblm pblmVar;
        synchronized (pblm.class) {
            pblmVar = f34543a;
        }
        return pblmVar;
    }

    public static synchronized void a(pblm pblmVar) {
        synchronized (pblm.class) {
            f34543a = pblmVar;
        }
    }

    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, int i11, long j10, String str, Object obj) throws Throwable {
        if (i10 == 131073) {
            if (str == null || !a(str)) {
                return null;
            }
            return (String) pblk.a(16777217, 0, 0L, "15fb7c", new byte[]{15, 28});
        }
        if (i10 == 131074) {
            String[] strArr = (String[]) obj;
            if (str != null && strArr != null && strArr.length != 0) {
                a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
            }
        }
        return null;
    }

    public abstract void a(long j10, long j11, String str, String str2, String str3, int i10, JSONObject jSONObject);

    public abstract void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    public abstract boolean a(String str);

    public abstract void b(long j10, long j11, String str, String str2, String str3, int i10, JSONObject jSONObject);
}
