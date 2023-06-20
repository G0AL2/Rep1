package da;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: ContentDataSource.java */
/* loaded from: classes2.dex */
public final class h extends g {

    /* renamed from: e  reason: collision with root package name */
    private final ContentResolver f29176e;

    /* renamed from: f  reason: collision with root package name */
    private Uri f29177f;

    /* renamed from: g  reason: collision with root package name */
    private AssetFileDescriptor f29178g;

    /* renamed from: h  reason: collision with root package name */
    private FileInputStream f29179h;

    /* renamed from: i  reason: collision with root package name */
    private long f29180i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f29181j;

    /* compiled from: ContentDataSource.java */
    /* loaded from: classes2.dex */
    private static final class a {
        public static void a(Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    /* compiled from: ContentDataSource.java */
    /* loaded from: classes2.dex */
    public static class b extends m {
        public b(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public h(Context context) {
        super(false);
        this.f29176e = context.getContentResolver();
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) throws b {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f29180i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new b(e10, 2000);
            }
        }
        int read = ((FileInputStream) ea.n0.j(this.f29179h)).read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j11 = this.f29180i;
        if (j11 != -1) {
            this.f29180i = j11 - read;
        }
        q(read);
        return read;
    }

    @Override // da.l
    public void close() throws b {
        this.f29177f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f29179h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f29179h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f29178g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new b(e10, 2000);
                    }
                } finally {
                    this.f29178g = null;
                    if (this.f29181j) {
                        this.f29181j = false;
                        r();
                    }
                }
            } catch (Throwable th) {
                this.f29179h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f29178g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f29178g = null;
                        if (this.f29181j) {
                            this.f29181j = false;
                            r();
                        }
                        throw th;
                    } finally {
                        this.f29178g = null;
                        if (this.f29181j) {
                            this.f29181j = false;
                            r();
                        }
                    }
                } catch (IOException e11) {
                    throw new b(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new b(e12, 2000);
        }
    }

    @Override // da.l
    public long g(p pVar) throws b {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = pVar.f29227a;
            this.f29177f = uri;
            s(pVar);
            if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(pVar.f29227a.getScheme())) {
                Bundle bundle = new Bundle();
                if (ea.n0.f29709a >= 31) {
                    a.a(bundle);
                }
                openAssetFileDescriptor = this.f29176e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.f29176e.openAssetFileDescriptor(uri, "r");
            }
            this.f29178g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f29179h = fileInputStream;
                int i10 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i10 != 0 && pVar.f29232f > length) {
                    throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(pVar.f29232f + startOffset) - startOffset;
                if (skip == pVar.f29232f) {
                    if (i10 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f29180i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f29180i = position;
                            if (position < 0) {
                                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                    } else {
                        long j10 = length - skip;
                        this.f29180i = j10;
                        if (j10 < 0) {
                            throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                    long j11 = pVar.f29233g;
                    if (j11 != -1) {
                        long j12 = this.f29180i;
                        if (j12 != -1) {
                            j11 = Math.min(j12, j11);
                        }
                        this.f29180i = j11;
                    }
                    this.f29181j = true;
                    t(pVar);
                    long j13 = pVar.f29233g;
                    return j13 != -1 ? j13 : this.f29180i;
                }
                throw new b(null, AdError.REMOTE_ADS_SERVICE_ERROR);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 36);
            sb2.append("Could not open file descriptor for: ");
            sb2.append(valueOf);
            throw new b(new IOException(sb2.toString()), 2000);
        } catch (b e10) {
            throw e10;
        } catch (IOException e11) {
            throw new b(e11, e11 instanceof FileNotFoundException ? IronSourceConstants.IS_INSTANCE_OPENED : 2000);
        }
    }

    @Override // da.l
    public Uri o() {
        return this.f29177f;
    }
}
