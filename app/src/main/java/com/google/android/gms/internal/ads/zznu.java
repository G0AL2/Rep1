package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznu {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zznt zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zzns zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zznu(zznt zzntVar) {
        this.zza = zzntVar;
        int i10 = zzeg.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j10) {
        return (j10 * 1000000) / this.zzg;
    }

    private final long zzn() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        long j10 = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzeg.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j10 = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j10;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzo() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j10) {
        return this.zze - ((int) (j10 - (zzn() * this.zzd)));
    }

    public final long zzb(boolean z10) {
        long j10;
        zznn zznnVar;
        zznn zznnVar2;
        zznj zznjVar;
        Method method;
        AudioTrack audioTrack;
        long zzE;
        long zzF;
        long zzE2;
        long zzF2;
        zznu zznuVar = this;
        AudioTrack audioTrack2 = zznuVar.zzc;
        Objects.requireNonNull(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            long zzm = zznuVar.zzm(zzn());
            if (zzm != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zznuVar.zzm >= 30000) {
                    long[] jArr = zznuVar.zzb;
                    int i10 = zznuVar.zzv;
                    jArr[i10] = zzm - nanoTime;
                    zznuVar.zzv = (i10 + 1) % 10;
                    int i11 = zznuVar.zzw;
                    if (i11 < 10) {
                        zznuVar.zzw = i11 + 1;
                    }
                    zznuVar.zzm = nanoTime;
                    zznuVar.zzl = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = zznuVar.zzw;
                        if (i12 >= i13) {
                            break;
                        }
                        zznuVar.zzl += zznuVar.zzb[i12] / i13;
                        i12++;
                    }
                }
                if (!zznuVar.zzh) {
                    zzns zznsVar = zznuVar.zzf;
                    Objects.requireNonNull(zznsVar);
                    if (zznsVar.zzg(nanoTime)) {
                        long zzb = zznsVar.zzb();
                        long zza = zznsVar.zza();
                        if (Math.abs(zzb - nanoTime) > 5000000) {
                            zzoh zzohVar = (zzoh) zznuVar.zza;
                            zzE2 = zzohVar.zza.zzE();
                            zzF2 = zzohVar.zza.zzF();
                            Log.w("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzm + ", " + zzE2 + ", " + zzF2);
                            zznsVar.zzd();
                        } else if (Math.abs(zznuVar.zzm(zza) - zzm) > 5000000) {
                            zzoh zzohVar2 = (zzoh) zznuVar.zza;
                            zzE = zzohVar2.zza.zzE();
                            zzF = zzohVar2.zza.zzF();
                            Log.w("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzm + ", " + zzE + ", " + zzF);
                            zznsVar.zzd();
                        } else {
                            zznsVar.zzc();
                        }
                        zznuVar = this;
                    }
                    if (zznuVar.zzq && (method = zznuVar.zzn) != null && nanoTime - zznuVar.zzr >= 500000) {
                        try {
                            Objects.requireNonNull(zznuVar.zzc);
                            int i14 = zzeg.zza;
                            long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - zznuVar.zzi;
                            zznuVar.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            zznuVar.zzo = max;
                            if (max > 5000000) {
                                Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                                zznuVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zznuVar.zzn = null;
                        }
                        zznuVar.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzns zznsVar2 = zznuVar.zzf;
        Objects.requireNonNull(zznsVar2);
        boolean zzf = zznsVar2.zzf();
        if (zzf) {
            j10 = zznuVar.zzm(zznsVar2.zza()) + zzeg.zzs(nanoTime2 - zznsVar2.zzb(), zznuVar.zzj);
        } else {
            if (zznuVar.zzw == 0) {
                j10 = zznuVar.zzm(zzn());
            } else {
                j10 = zznuVar.zzl + nanoTime2;
            }
            if (!z10) {
                j10 = Math.max(0L, j10 - zznuVar.zzo);
            }
        }
        if (zznuVar.zzD != zzf) {
            zznuVar.zzF = zznuVar.zzC;
            zznuVar.zzE = zznuVar.zzB;
        }
        long j11 = nanoTime2 - zznuVar.zzF;
        if (j11 < 1000000) {
            long j12 = (j11 * 1000) / 1000000;
            j10 = ((j10 * j12) + ((1000 - j12) * (zznuVar.zzE + zzeg.zzs(j11, zznuVar.zzj)))) / 1000;
        }
        if (!zznuVar.zzk) {
            long j13 = zznuVar.zzB;
            if (j10 > j13) {
                zznuVar.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzeg.zzz(zzeg.zzu(zzeg.zzz(j10 - j13), zznuVar.zzj));
                zzom zzomVar = ((zzoh) zznuVar.zza).zza;
                zznnVar = zzomVar.zzn;
                if (zznnVar != null) {
                    zznnVar2 = zzomVar.zzn;
                    zznjVar = ((zzor) zznnVar2).zza.zzc;
                    zznjVar.zzr(currentTimeMillis);
                }
            }
        }
        zznuVar.zzC = nanoTime2;
        zznuVar.zzB = j10;
        zznuVar.zzD = zzf;
        return j10;
    }

    public final long zzc(long j10) {
        return zzeg.zzz(zzm(j10 - zzn()));
    }

    public final void zzd(long j10) {
        this.zzz = zzn();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j10;
    }

    public final void zze() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r7
            r3.zze = r8
            com.google.android.gms.internal.ads.zzns r0 = new com.google.android.gms.internal.ads.zzns
            r0.<init>(r4)
            r3.zzf = r0
            int r4 = r4.getSampleRate()
            r3.zzg = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L25
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            r2 = 23
            if (r5 >= r2) goto L25
            r5 = 5
            if (r6 == r5) goto L26
            if (r6 != r4) goto L25
            r6 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r3.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzeg.zzU(r6)
            r3.zzq = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.zzm(r7)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.zzi = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzu = r7
            r3.zzp = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzr = r7
            r3.zzo = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznu.zzf(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzg() {
        zzns zznsVar = this.zzf;
        Objects.requireNonNull(zznsVar);
        zznsVar.zze();
    }

    public final boolean zzh(long j10) {
        if (j10 <= zzn()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && zzn() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzj(long j10) {
        return this.zzy != -9223372036854775807L && j10 > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzk(long j10) {
        zznn zznnVar;
        long j11;
        zznn zznnVar2;
        zznj zznjVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzn() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.zzp;
        boolean zzh = zzh(j10);
        this.zzp = zzh;
        if (z10 && !zzh && playState != 1) {
            zznt zzntVar = this.zza;
            int i10 = this.zze;
            long zzz = zzeg.zzz(this.zzi);
            zzoh zzohVar = (zzoh) zzntVar;
            zznnVar = zzohVar.zza.zzn;
            if (zznnVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzom zzomVar = zzohVar.zza;
                j11 = zzomVar.zzS;
                zznnVar2 = zzomVar.zzn;
                zznjVar = ((zzor) zznnVar2).zza.zzc;
                zznjVar.zzt(i10, zzz, elapsedRealtime - j11);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzx == -9223372036854775807L) {
            zzns zznsVar = this.zzf;
            Objects.requireNonNull(zznsVar);
            zznsVar.zze();
            return true;
        }
        return false;
    }
}
