package da;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: AssetDataSource.java */
/* loaded from: classes2.dex */
public final class c extends g {

    /* renamed from: e  reason: collision with root package name */
    private final AssetManager f29126e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f29127f;

    /* renamed from: g  reason: collision with root package name */
    private InputStream f29128g;

    /* renamed from: h  reason: collision with root package name */
    private long f29129h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29130i;

    /* compiled from: AssetDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends m {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public c(Context context) {
        super(false);
        this.f29126e = context.getAssets();
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f29129h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int read = ((InputStream) ea.n0.j(this.f29128g)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f29129h;
        if (j11 != -1) {
            this.f29129h = j11 - read;
        }
        q(read);
        return read;
    }

    @Override // da.l
    public void close() throws a {
        this.f29127f = null;
        try {
            try {
                InputStream inputStream = this.f29128g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        } finally {
            this.f29128g = null;
            if (this.f29130i) {
                this.f29130i = false;
                r();
            }
        }
    }

    @Override // da.l
    public long g(p pVar) throws a {
        try {
            Uri uri = pVar.f29227a;
            this.f29127f = uri;
            String str = (String) ea.a.e(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            s(pVar);
            InputStream open = this.f29126e.open(str, 1);
            this.f29128g = open;
            if (open.skip(pVar.f29232f) >= pVar.f29232f) {
                long j10 = pVar.f29233g;
                if (j10 != -1) {
                    this.f29129h = j10;
                } else {
                    long available = this.f29128g.available();
                    this.f29129h = available;
                    if (available == 2147483647L) {
                        this.f29129h = -1L;
                    }
                }
                this.f29130i = true;
                t(pVar);
                return this.f29129h;
            }
            throw new a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? IronSourceConstants.IS_INSTANCE_OPENED : 2000);
        }
    }

    @Override // da.l
    public Uri o() {
        return this.f29127f;
    }
}
