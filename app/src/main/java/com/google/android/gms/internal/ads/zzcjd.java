package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjd implements zzays {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzayr zzf;
    private final zzayy zzg;
    private zzayl zzh;
    private HttpURLConnection zzi;
    private final Queue zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjd(String str, zzayy zzayyVar, int i10, int i11, long j10, long j11) {
        zzayz.zzb(str);
        this.zze = str;
        this.zzg = zzayyVar;
        this.zzf = new zzayr();
        this.zzc = i10;
        this.zzd = i11;
        this.zzj = new ArrayDeque();
        this.zzr = j10;
        this.zzs = j11;
    }

    private final void zzg() {
        while (!this.zzj.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzj.remove()).disconnect();
            } catch (Exception e10) {
                zzcfi.zzh("Unexpected error while disconnecting", e10);
            }
        }
        this.zzi = null;
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final int zza(byte[] bArr, int i10, int i11) throws zzayp {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzm;
            long j11 = this.zzn;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = i11;
            long j13 = this.zzs;
            long j14 = this.zzq;
            long j15 = j14 + 1;
            if (this.zzo + j11 + j12 + j13 > j15) {
                long j16 = this.zzp;
                if (j14 < j16) {
                    long min = Math.min(j16, Math.max(((this.zzr + j15) - j13) - 1, (-1) + j15 + j12));
                    zzf(j15, min, 2);
                    this.zzq = min;
                    j14 = min;
                }
            }
            int read = this.zzk.read(bArr, i10, (int) Math.min(j12, ((j14 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += read;
                zzayy zzayyVar = this.zzg;
                if (zzayyVar != null) {
                    ((zzciz) zzayyVar).zzW(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new zzayp(e10, this.zzh, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final long zzb(zzayl zzaylVar) throws zzayp {
        this.zzh = zzaylVar;
        this.zzn = 0L;
        long j10 = zzaylVar.zzc;
        long j11 = zzaylVar.zzd;
        long min = j11 == -1 ? this.zzr : Math.min(this.zzr, j11);
        this.zzo = j10;
        HttpURLConnection zzf = zzf(j10, (min + j10) - 1, 1);
        this.zzi = zzf;
        String headerField = zzf.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j12 = zzaylVar.zzd;
                    if (j12 != -1) {
                        this.zzm = j12;
                        this.zzp = Math.max(parseLong, (this.zzo + j12) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzl = true;
                    zzayy zzayyVar = this.zzg;
                    if (zzayyVar != null) {
                        ((zzciz) zzayyVar).zzk(this, zzaylVar);
                    }
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zzcfi.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzcjb(headerField, zzaylVar);
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzayj
    public final void zzd() throws zzayp {
        try {
            InputStream inputStream = this.zzk;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzayp(e10, this.zzh, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzg();
            if (this.zzl) {
                this.zzl = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @VisibleForTesting
    final HttpURLConnection zzf(long j10, long j11, int i10) throws zzayp {
        String uri = this.zzh.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + Constants.FILENAME_SEQUENCE_SEPARATOR + j11);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzj.add(httpURLConnection);
            String uri2 = this.zzh.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode <= 299) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (this.zzk != null) {
                            inputStream = new SequenceInputStream(this.zzk, inputStream);
                        }
                        this.zzk = inputStream;
                        return httpURLConnection;
                    } catch (IOException e10) {
                        zzg();
                        throw new zzayp(e10, this.zzh, i10);
                    }
                }
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                zzg();
                throw new zzcjc(responseCode, headerFields, this.zzh, i10);
            } catch (IOException e11) {
                zzg();
                throw new zzayp("Unable to connect to ".concat(String.valueOf(uri2)), e11, this.zzh, i10);
            }
        } catch (IOException e12) {
            throw new zzayp("Unable to connect to ".concat(String.valueOf(uri)), e12, this.zzh, i10);
        }
    }
}
