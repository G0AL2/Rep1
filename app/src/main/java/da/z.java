package da;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: FileDataSource.java */
/* loaded from: classes2.dex */
public final class z extends g {

    /* renamed from: e  reason: collision with root package name */
    private RandomAccessFile f29326e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f29327f;

    /* renamed from: g  reason: collision with root package name */
    private long f29328g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29329h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    /* compiled from: FileDataSource.java */
    /* loaded from: classes2.dex */
    public static class b extends m {
        public b(Throwable th, int i10) {
            super(th, i10);
        }

        public b(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public z() {
        super(false);
    }

    private static RandomAccessFile u(Uri uri) throws b {
        int i10 = 2006;
        try {
            return new RandomAccessFile((String) ea.a.e(uri.getPath()), "r");
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (ea.n0.f29709a < 21 || !a.b(e10.getCause())) {
                    i10 = IronSourceConstants.IS_INSTANCE_OPENED;
                }
                throw new b(e10, i10);
            }
            throw new b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL);
        } catch (SecurityException e11) {
            throw new b(e11, 2006);
        } catch (RuntimeException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        if (this.f29328g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) ea.n0.j(this.f29326e)).read(bArr, i10, (int) Math.min(this.f29328g, i11));
            if (read > 0) {
                this.f29328g -= read;
                q(read);
            }
            return read;
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // da.l
    public void close() throws b {
        this.f29327f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f29326e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        } finally {
            this.f29326e = null;
            if (this.f29329h) {
                this.f29329h = false;
                r();
            }
        }
    }

    @Override // da.l
    public long g(p pVar) throws b {
        Uri uri = pVar.f29227a;
        this.f29327f = uri;
        s(pVar);
        RandomAccessFile u10 = u(uri);
        this.f29326e = u10;
        try {
            u10.seek(pVar.f29232f);
            long j10 = pVar.f29233g;
            if (j10 == -1) {
                j10 = this.f29326e.length() - pVar.f29232f;
            }
            this.f29328g = j10;
            if (j10 >= 0) {
                this.f29329h = true;
                t(pVar);
                return this.f29328g;
            }
            throw new b(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (IOException e10) {
            throw new b(e10, 2000);
        }
    }

    @Override // da.l
    public Uri o() {
        return this.f29327f;
    }
}
