package da;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: RawResourceDataSource.java */
/* loaded from: classes2.dex */
public final class h0 extends g {

    /* renamed from: e  reason: collision with root package name */
    private final Resources f29182e;

    /* renamed from: f  reason: collision with root package name */
    private final String f29183f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f29184g;

    /* renamed from: h  reason: collision with root package name */
    private AssetFileDescriptor f29185h;

    /* renamed from: i  reason: collision with root package name */
    private InputStream f29186i;

    /* renamed from: j  reason: collision with root package name */
    private long f29187j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29188k;

    /* compiled from: RawResourceDataSource.java */
    /* loaded from: classes2.dex */
    public static class a extends m {
        public a(String str, Throwable th, int i10) {
            super(str, th, i10);
        }
    }

    public h0(Context context) {
        super(false);
        this.f29182e = context.getResources();
        this.f29183f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("rawresource:///");
        sb2.append(i10);
        return Uri.parse(sb2.toString());
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f29187j;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(null, e10, 2000);
            }
        }
        int read = ((InputStream) ea.n0.j(this.f29186i)).read(bArr, i10, i11);
        if (read == -1) {
            if (this.f29187j == -1) {
                return -1;
            }
            throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j11 = this.f29187j;
        if (j11 != -1) {
            this.f29187j = j11 - read;
        }
        q(read);
        return read;
    }

    @Override // da.l
    public void close() throws a {
        this.f29184g = null;
        try {
            try {
                InputStream inputStream = this.f29186i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f29186i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f29185h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new a(null, e10, 2000);
                    }
                } finally {
                    this.f29185h = null;
                    if (this.f29188k) {
                        this.f29188k = false;
                        r();
                    }
                }
            } catch (Throwable th) {
                this.f29186i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f29185h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f29185h = null;
                        if (this.f29188k) {
                            this.f29188k = false;
                            r();
                        }
                        throw th;
                    } finally {
                        this.f29185h = null;
                        if (this.f29188k) {
                            this.f29188k = false;
                            r();
                        }
                    }
                } catch (IOException e11) {
                    throw new a(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new a(null, e12, 2000);
        }
    }

    @Override // da.l
    public long g(p pVar) throws a {
        int parseInt;
        Uri uri = pVar.f29227a;
        this.f29184g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) ea.a.e(uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str = (String) ea.a.e(uri.getPath());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                String host = uri.getHost();
                String valueOf = String.valueOf(TextUtils.isEmpty(host) ? "" : String.valueOf(host).concat(":"));
                String valueOf2 = String.valueOf(str);
                parseInt = this.f29182e.getIdentifier(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), "raw", this.f29183f);
                if (parseInt == 0) {
                    throw new a("Resource not found.", null, IronSourceConstants.IS_INSTANCE_OPENED);
                }
            } else {
                throw new a("URI must either use scheme rawresource or android.resource", null, IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) ea.a.e(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new a("Resource identifier must be an integer.", null, IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL);
            }
        }
        s(pVar);
        try {
            AssetFileDescriptor openRawResourceFd = this.f29182e.openRawResourceFd(parseInt);
            this.f29185h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f29186i = fileInputStream;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i10 != 0) {
                    try {
                        if (pVar.f29232f > length) {
                            throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    } catch (a e10) {
                        throw e10;
                    } catch (IOException e11) {
                        throw new a(null, e11, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(pVar.f29232f + startOffset) - startOffset;
                if (skip == pVar.f29232f) {
                    if (i10 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f29187j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f29187j = size;
                            if (size < 0) {
                                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f29187j = j10;
                        if (j10 < 0) {
                            throw new m(AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = pVar.f29233g;
                    if (j11 != -1) {
                        long j12 = this.f29187j;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f29187j = j11;
                    }
                    this.f29188k = true;
                    t(pVar);
                    long j13 = pVar.f29233g;
                    return j13 != -1 ? j13 : this.f29187j;
                }
                throw new a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 24);
            sb2.append("Resource is compressed: ");
            sb2.append(valueOf3);
            throw new a(sb2.toString(), null, 2000);
        } catch (Resources.NotFoundException e12) {
            throw new a(null, e12, IronSourceConstants.IS_INSTANCE_OPENED);
        }
    }

    @Override // da.l
    public Uri o() {
        return this.f29184g;
    }
}
