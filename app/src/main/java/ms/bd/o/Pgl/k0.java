package ms.bd.o.Pgl;

import android.content.Context;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import ms.bd.o.Pgl.l0;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class k0 implements l0.pgla {

    /* renamed from: a  reason: collision with root package name */
    private final long f34529a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f34530b;

    /* renamed from: c  reason: collision with root package name */
    private final c f34531c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(c cVar, Context context, long j10) {
        Objects.requireNonNull(context, "context could not be null");
        this.f34531c = cVar;
        this.f34530b = context.getApplicationContext();
        this.f34529a = j10;
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> frameSign(String str, int i10) {
        if (this.f34529a != -1) {
            HashMap hashMap = new HashMap();
            if (str == null || str.length() == 0) {
                return Collections.emptyMap();
            }
            String[] strArr = (String[]) pblb.a(33554442, i10, this.f34529a, str, null);
            if ((strArr instanceof String[]) && strArr.length % 2 == 0) {
                for (int i11 = 0; i11 < strArr.length; i11 += 2) {
                    String str2 = strArr[i11];
                    String str3 = strArr[i11 + 1];
                    if (str2 != null && str3 != null) {
                        hashMap.put(str2, str3);
                    }
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (str != null && str.length() != 0 && (strArr = (String[]) pblb.a(33554438, 0, this.f34529a, str, bArr)) != null && strArr.length % 2 == 0) {
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                String str2 = strArr[i10];
                String str3 = strArr[i10 + 1];
                if (str2 != null && str3 != null) {
                    hashMap.put(str2, str3);
                }
            }
        }
        return hashMap;
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public Map<String, String> getReportRaw(String str, int i10, Map<String, String> map) {
        String str2;
        if (this.f34529a != -1) {
            if (map == null || map.size() <= 0) {
                str2 = "";
            } else {
                JSONArray jSONArray = new JSONArray();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                        jSONArray.put(entry.getKey());
                        jSONArray.put(entry.getValue());
                    }
                }
                str2 = jSONArray.toString();
            }
            Object a10 = pblb.a(33554440, i10, this.f34529a, str, str2);
            if (a10 instanceof Object[]) {
                Object[] objArr = (Object[]) a10;
                if (objArr.length >= 2 && objArr[0] != null && objArr[1] != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(objArr[0].toString(), objArr[1].toString());
                    return hashMap;
                }
            }
        }
        return Collections.emptyMap();
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public String getToken() {
        long j10 = this.f34529a;
        return j10 != -1 ? (String) pblb.a(33554439, 0, j10, null, null) : "";
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void report(String str) {
        if (this.f34529a == -1 || TextUtils.isEmpty(str)) {
            return;
        }
        pblb.a(33554433, 0, this.f34529a, str, this.f34530b);
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setBDDeviceID(String str) {
        this.f34531c.f34518d = str;
        long j10 = this.f34529a;
        if (j10 != -1) {
            pblb.a(33554437, 0, j10, str, this.f34530b);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setCollectMode(int i10) {
        long j10 = this.f34529a;
        if (j10 != -1) {
            pblb.a(33554441, i10, j10, null, null);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setDeviceID(String str) {
        this.f34531c.f34517c = str;
        long j10 = this.f34529a;
        if (j10 != -1) {
            pblb.a(33554434, 0, j10, str, this.f34530b);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setInstallID(String str) {
        this.f34531c.f34519e = str;
        long j10 = this.f34529a;
        if (j10 != -1) {
            pblb.a(33554435, 0, j10, str, this.f34530b);
        }
    }

    @Override // ms.bd.o.Pgl.l0.pgla
    public void setSessionID(String str) {
        this.f34531c.f34520f = str;
        long j10 = this.f34529a;
        if (j10 != -1) {
            pblb.a(33554436, 0, j10, str, this.f34530b);
        }
    }
}
