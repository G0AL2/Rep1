package r2;

import android.os.SystemClock;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import q2.b;
import q2.r;
import q2.s;
import q2.t;
import q2.u;
import q2.v;

/* compiled from: NetworkUtility.java */
/* loaded from: classes.dex */
final class m {

    /* compiled from: NetworkUtility.java */
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f36159a;

        /* renamed from: b  reason: collision with root package name */
        private final u f36160b;

        private b(String str, u uVar) {
            this.f36159a = str;
            this.f36160b = uVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(q2.n<?> nVar, b bVar) throws u {
        r v10 = nVar.v();
        int w10 = nVar.w();
        try {
            v10.c(bVar.f36160b);
            nVar.b(String.format("%s-retry [timeout=%s]", bVar.f36159a, Integer.valueOf(w10)));
        } catch (u e10) {
            nVar.b(String.format("%s-timeout-giveup [timeout=%s]", bVar.f36159a, Integer.valueOf(w10)));
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static q2.k b(q2.n<?> nVar, long j10, List<q2.g> list) {
        b.a k10 = nVar.k();
        if (k10 == null) {
            return new q2.k(304, (byte[]) null, true, j10, list);
        }
        return new q2.k(304, k10.f35776a, true, j10, g.a(list, k10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(InputStream inputStream, int i10, d dVar) throws IOException {
        byte[] bArr;
        n nVar = new n(dVar, i10);
        try {
            bArr = dVar.a(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    nVar.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            v.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    dVar.b(bArr);
                    nVar.close();
                    throw th;
                }
            }
            byte[] byteArray = nVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                v.e("Error occurred when closing InputStream", new Object[0]);
            }
            dVar.b(bArr);
            nVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArr = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(long j10, q2.n<?> nVar, byte[] bArr, int i10) {
        if (v.f35853b || j10 > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = nVar;
            objArr[1] = Long.valueOf(j10);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i10);
            objArr[4] = Integer.valueOf(nVar.v().a());
            v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b e(q2.n<?> nVar, IOException iOException, long j10, h hVar, byte[] bArr) throws u {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new t());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + nVar.y(), iOException);
        } else if (hVar != null) {
            int d10 = hVar.d();
            v.c("Unexpected response code %d for %s", Integer.valueOf(d10), nVar.y());
            if (bArr != null) {
                q2.k kVar = new q2.k(d10, bArr, false, SystemClock.elapsedRealtime() - j10, hVar.c());
                if (d10 == 401 || d10 == 403) {
                    return new b("auth", new q2.a(kVar));
                }
                if (d10 >= 400 && d10 <= 499) {
                    throw new q2.d(kVar);
                }
                if (d10 >= 500 && d10 <= 599 && nVar.O()) {
                    return new b(Analytics.Param.SERVER, new s(kVar));
                }
                throw new s(kVar);
            }
            return new b("network", new q2.j());
        } else if (nVar.N()) {
            return new b("connection", new q2.l());
        } else {
            throw new q2.l(iOException);
        }
    }
}
