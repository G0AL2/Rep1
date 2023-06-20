package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzajx implements zzail {
    private final zzajw zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzajx(zzajw zzajwVar, int i10) {
        this.zzc = zzajwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((255 & zzn(inputStream)) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzh(zzajv zzajvVar) throws IOException {
        return new String(zzm(zzajvVar, zzf(zzajvVar)), "UTF-8");
    }

    static void zzj(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    static void zzk(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    static byte[] zzm(zzajv zzajvVar, long j10) throws IOException {
        long zza = zzajvVar.zza();
        if (j10 >= 0 && j10 <= zza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzajvVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + zza);
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaju zzajuVar) {
        if (this.zza.containsKey(str)) {
            this.zzb += zzajuVar.zza - ((zzaju) this.zza.get(str)).zza;
        } else {
            this.zzb += zzajuVar.zza;
        }
        this.zza.put(str, zzajuVar);
    }

    private final void zzp(String str) {
        zzaju zzajuVar = (zzaju) this.zza.remove(str);
        if (zzajuVar != null) {
            this.zzb -= zzajuVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzail
    public final synchronized zzaik zza(String str) {
        zzaju zzajuVar = (zzaju) this.zza.get(str);
        if (zzajuVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzajv zzajvVar = new zzajv(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzaju zza = zzaju.zza(zzajvVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzajn.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzajvVar, zzajvVar.zza());
                zzaik zzaikVar = new zzaik();
                zzaikVar.zza = zzm;
                zzaikVar.zzb = zzajuVar.zzc;
                zzaikVar.zzc = zzajuVar.zzd;
                zzaikVar.zzd = zzajuVar.zze;
                zzaikVar.zze = zzajuVar.zzf;
                zzaikVar.zzf = zzajuVar.zzg;
                List<zzait> list = zzajuVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzait zzaitVar : list) {
                    treeMap.put(zzaitVar.zza(), zzaitVar.zzb());
                }
                zzaikVar.zzg = treeMap;
                zzaikVar.zzh = Collections.unmodifiableList(zzajuVar.zzh);
                return zzaikVar;
            } finally {
                zzajvVar.close();
            }
        } catch (IOException e10) {
            zzajn.zza("%s: %s", zzg.getAbsolutePath(), e10.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzail
    public final synchronized void zzb() {
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            zzajn.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                long length = file.length();
                zzajv zzajvVar = new zzajv(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    zzaju zza2 = zzaju.zza(zzajvVar);
                    zza2.zza = length;
                    zzo(zza2.zzb, zza2);
                    zzajvVar.close();
                } catch (Throwable th) {
                    zzajvVar.close();
                    throw th;
                    break;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzail
    public final synchronized void zzc(String str, boolean z10) {
        zzaik zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzail
    public final synchronized void zzd(String str, zzaik zzaikVar) {
        BufferedOutputStream bufferedOutputStream;
        zzaju zzajuVar;
        long j10;
        long j11 = this.zzb;
        int length = zzaikVar.zza.length;
        int i10 = this.zzd;
        if (j11 + length <= i10 || length <= i10 * 0.9f) {
            File zzg = zzg(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzajuVar = new zzaju(str, zzaikVar);
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzajn.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzajn.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                    return;
                }
            }
            try {
                zzj(bufferedOutputStream, 538247942);
                zzl(bufferedOutputStream, zzajuVar.zzb);
                String str2 = zzajuVar.zzc;
                if (str2 == null) {
                    str2 = "";
                }
                zzl(bufferedOutputStream, str2);
                zzk(bufferedOutputStream, zzajuVar.zzd);
                zzk(bufferedOutputStream, zzajuVar.zze);
                zzk(bufferedOutputStream, zzajuVar.zzf);
                zzk(bufferedOutputStream, zzajuVar.zzg);
                List<zzait> list = zzajuVar.zzh;
                if (list != null) {
                    zzj(bufferedOutputStream, list.size());
                    for (zzait zzaitVar : list) {
                        zzl(bufferedOutputStream, zzaitVar.zza());
                        zzl(bufferedOutputStream, zzaitVar.zzb());
                    }
                } else {
                    zzj(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(zzaikVar.zza);
                bufferedOutputStream.close();
                zzajuVar.zza = zzg.length();
                zzo(str, zzajuVar);
                if (this.zzb >= this.zzd) {
                    if (zzajn.zzb) {
                        zzajn.zzd("Pruning old cache entries.", new Object[0]);
                    }
                    long j12 = this.zzb;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.zza.entrySet().iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j10 = elapsedRealtime;
                            break;
                        }
                        zzaju zzajuVar2 = (zzaju) ((Map.Entry) it.next()).getValue();
                        if (zzg(zzajuVar2.zzb).delete()) {
                            j10 = elapsedRealtime;
                            this.zzb -= zzajuVar2.zza;
                        } else {
                            j10 = elapsedRealtime;
                            String str3 = zzajuVar2.zzb;
                            zzajn.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                        }
                        it.remove();
                        i11++;
                        if (((float) this.zzb) < this.zzd * 0.9f) {
                            break;
                        }
                        elapsedRealtime = j10;
                    }
                    if (zzajn.zzb) {
                        zzajn.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j12), Long.valueOf(SystemClock.elapsedRealtime() - j10));
                    }
                }
            } catch (IOException e10) {
                zzajn.zza("%s", e10.toString());
                bufferedOutputStream.close();
                zzajn.zza("Failed to write header for %s", zzg.getAbsolutePath());
                throw new IOException();
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzajn.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzajx(File file, int i10) {
        this.zzc = new zzajt(this, file);
    }
}
