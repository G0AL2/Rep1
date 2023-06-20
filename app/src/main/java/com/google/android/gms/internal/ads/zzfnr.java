package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfnr extends zzfnf {
    private zzfpj<Integer> zza;
    private zzfpj<Integer> zzb;
    private zzfnq zzc;
    private HttpURLConnection zzd;

    public zzfnr() {
        this(new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfno
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzf();
            }
        }, new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnp
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzg();
            }
        }, null);
    }

    public zzfnr(zzfpj<Integer> zzfpjVar, zzfpj<Integer> zzfpjVar2, zzfnq zzfnqVar) {
        this.zza = zzfpjVar;
        this.zzb = zzfpjVar2;
        this.zzc = zzfnqVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static /* synthetic */ Integer zzh(int i10) {
        return Integer.valueOf(i10);
    }

    public static /* synthetic */ Integer zzi(int i10) {
        return Integer.valueOf(i10);
    }

    public static /* synthetic */ Integer zzj(int i10) {
        return Integer.valueOf(i10);
    }

    public static /* synthetic */ Integer zzk(int i10) {
        return Integer.valueOf(i10);
    }

    public static /* synthetic */ Integer zzl(int i10) {
        return Integer.valueOf(i10);
    }

    public static /* synthetic */ URLConnection zzp(URL url) throws IOException {
        return url.openConnection();
    }

    public static /* synthetic */ URLConnection zzq(Network network, URL url) throws IOException {
        return network.openConnection(url);
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfng.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfng.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfnq zzfnqVar = this.zzc;
        Objects.requireNonNull(zzfnqVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfnqVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfnq zzfnqVar, final int i10, final int i11) throws IOException {
        this.zza = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnh
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzk(i10);
            }
        };
        this.zzb = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfni
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzl(i11);
            }
        };
        this.zzc = zzfnqVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i10, final int i11) throws IOException {
        this.zza = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnj
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzi(i10);
            }
        };
        this.zzb = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnk
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzj(i11);
            }
        };
        this.zzc = new zzfnq() { // from class: com.google.android.gms.internal.ads.zzfnl
            @Override // com.google.android.gms.internal.ads.zzfnq
            public final URLConnection zza() {
                return zzfnr.zzq(network, url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i10) throws IOException {
        this.zza = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return zzfnr.zzh(i10);
            }
        };
        this.zzc = new zzfnq() { // from class: com.google.android.gms.internal.ads.zzfnn
            @Override // com.google.android.gms.internal.ads.zzfnq
            public final URLConnection zza() {
                return zzfnr.zzp(url);
            }
        };
        return zzm();
    }
}
