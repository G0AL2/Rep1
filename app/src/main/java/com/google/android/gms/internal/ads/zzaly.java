package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaly extends zzgkq implements zzgmb {
    private static final zzaly zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private zzama zzN;
    private zzalt zzaD;
    private long zzaJ;
    private long zzaL;
    private boolean zzaO;
    private long zzaQ;
    private zzamh zzaR;
    private long zzaS;
    private zzalv zzaf;
    private zzalx zzah;
    private int zzas;
    private int zzat;
    private int zzau;
    private zzamj zzav;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;
    private zzgkz zzag = zzgkq.zzaJ();
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = "D";
    private long zzar = -1;
    private long zzaw = -1;
    private int zzax = 1000;
    private int zzay = 1000;
    private String zzaz = "D";
    private zzgkz zzaA = zzgkq.zzaJ();
    private int zzaB = 1000;
    private zzgkz zzaC = zzgkq.zzaJ();
    private String zzaE = "";
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaI = -1;
    private long zzaK = -1;
    private String zzaM = "";
    private int zzaN = 2;
    private String zzaP = "";
    private String zzaT = "";

    static {
        zzaly zzalyVar = new zzaly();
        zzb = zzalyVar;
        zzgkq.zzaP(zzaly.class, zzalyVar);
    }

    private zzaly() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzA(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 134217728;
        zzalyVar.zzI = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzB(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 268435456;
        zzalyVar.zzJ = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzC(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 536870912;
        zzalyVar.zzK = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzD(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 1073741824;
        zzalyVar.zzL = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzE(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= RecyclerView.UNDEFINED_DURATION;
        zzalyVar.zzM = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzF(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 2;
        zzalyVar.zzO = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzG(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 4;
        zzalyVar.zzP = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzH(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 8;
        zzalyVar.zzQ = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzI(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 16;
        zzalyVar.zzR = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzJ(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 32;
        zzalyVar.zzS = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzK(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 64;
        zzalyVar.zzT = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzL(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzf |= 128;
        zzalyVar.zzU = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzM(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzf |= 256;
        zzalyVar.zzV = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzN(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 4096;
        zzalyVar.zzZ = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzO(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= Constants.BUFFER_SIZE;
        zzalyVar.zzaa = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzP(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 16384;
        zzalyVar.zzab = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzQ(zzaly zzalyVar, zzalv zzalvVar) {
        zzalvVar.getClass();
        zzalyVar.zzaf = zzalvVar;
        zzalyVar.zzf |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzR(zzaly zzalyVar, zzalv zzalvVar) {
        zzalvVar.getClass();
        zzgkz zzgkzVar = zzalyVar.zzag;
        if (!zzgkzVar.zzc()) {
            zzalyVar.zzag = zzgkq.zzaK(zzgkzVar);
        }
        zzalyVar.zzag.add(zzalvVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzT(zzaly zzalyVar, zzalx zzalxVar) {
        zzalxVar.getClass();
        zzalyVar.zzah = zzalxVar;
        zzalyVar.zzf |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzU(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 2097152;
        zzalyVar.zzaj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzV(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 4194304;
        zzalyVar.zzak = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzW(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 8388608;
        zzalyVar.zzal = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzX(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 67108864;
        zzalyVar.zzao = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzY(zzaly zzalyVar, long j10) {
        zzalyVar.zzf |= 134217728;
        zzalyVar.zzap = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzZ(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzf |= 268435456;
        zzalyVar.zzaq = str;
    }

    public static zzali zza() {
        return (zzali) zzb.zzay();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaa(zzaly zzalyVar, long j10) {
        zzalyVar.zzg |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzalyVar.zzaF = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzab(zzaly zzalyVar, long j10) {
        zzalyVar.zzg |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        zzalyVar.zzaG = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzac(zzaly zzalyVar, long j10) {
        zzalyVar.zzg |= 2048;
        zzalyVar.zzaH = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzad(zzaly zzalyVar, long j10) {
        zzalyVar.zzg |= 4096;
        zzalyVar.zzaI = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzae(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzg |= Constants.MIN_PROGRESS_STEP;
        zzalyVar.zzaM = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaf(zzaly zzalyVar, boolean z10) {
        zzalyVar.zzg |= 262144;
        zzalyVar.zzaO = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzag(zzaly zzalyVar, long j10) {
        zzalyVar.zzg |= 1048576;
        zzalyVar.zzaQ = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzal(zzaly zzalyVar, int i10) {
        zzalyVar.zzX = i10 - 1;
        zzalyVar.zzf |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzam(zzaly zzalyVar, int i10) {
        zzalyVar.zzY = i10 - 1;
        zzalyVar.zzf |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzan(zzaly zzalyVar, int i10) {
        zzalyVar.zzae = i10 - 1;
        zzalyVar.zzf |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzao(zzaly zzalyVar, int i10) {
        zzalyVar.zzax = i10 - 1;
        zzalyVar.zzg |= 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzap(zzaly zzalyVar, int i10) {
        zzalyVar.zzay = i10 - 1;
        zzalyVar.zzg |= 16;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzaq(zzaly zzalyVar, int i10) {
        zzalyVar.zzaN = 5;
        zzalyVar.zzg |= 131072;
    }

    public static zzaly zzd() {
        return zzb;
    }

    public static zzaly zze(byte[] bArr, zzgkc zzgkcVar) throws zzglc {
        return (zzaly) zzgkq.zzaF(zzb, bArr, zzgkcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 1;
        zzalyVar.zzh = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 2;
        zzalyVar.zzi = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzk(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 4;
        zzalyVar.zzj = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 16;
        zzalyVar.zzl = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 32;
        zzalyVar.zzm = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzn(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
        zzalyVar.zzr = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 2048;
        zzalyVar.zzs = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzp(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= Constants.BUFFER_SIZE;
        zzalyVar.zzu = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 16384;
        zzalyVar.zzv = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzr(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 32768;
        zzalyVar.zzw = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzs(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= Constants.MIN_PROGRESS_STEP;
        zzalyVar.zzx = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzt(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 524288;
        zzalyVar.zzA = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 1048576;
        zzalyVar.zzB = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzv(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 2097152;
        zzalyVar.zzC = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzw(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 4194304;
        zzalyVar.zzD = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzx(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 16777216;
        zzalyVar.zzF = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzy(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 33554432;
        zzalyVar.zzG = j10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzz(zzaly zzalyVar, long j10) {
        zzalyVar.zze |= 67108864;
        zzalyVar.zzH = j10;
    }

    public final boolean zzah() {
        return this.zzaO;
    }

    public final boolean zzai() {
        return (this.zze & 4194304) != 0;
    }

    public final boolean zzaj() {
        return (this.zzg & 2097152) != 0;
    }

    public final int zzak() {
        int zza = zzalo.zza(this.zzaN);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgkq
    protected final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 == 2) {
                zzgku zzgkuVar = zzame.zza;
                return zzgkq.zzaO(zzb, "\u0001[\u0000\u0003\u0001Į[\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂO\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈP\u0019ဂT\u001aဌQ\u001bဈ\u0016\u001cဇR\u001dဈ\u0018\u001eဈS\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNÉဉUĭဂVĮဈW", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaL", "zzB", "zzC", "zzaM", "zzaQ", "zzaN", zzaln.zza, "zzD", "zzaO", "zzF", "zzaP", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", zzalv.class, "zzS", "zzT", "zzU", "zzV", "zzX", zzgkuVar, "zzY", zzgkuVar, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", zzgkuVar, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", zzamd.zza, "zzat", zzamf.zza, "zzaq", "zzau", zzalj.zza, "zzav", "zzaw", "zzam", "zzan", "zzax", zzgkuVar, "zzW", "zzE", "zzay", zzgkuVar, "zzaz", "zzaA", zzalr.class, "zzaB", zzgkuVar, "zzaC", zzall.class, "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaR", "zzaS", "zzaT"});
            } else if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzali(null);
            } else {
                return new zzaly();
            }
        }
        return (byte) 1;
    }

    public final zzamh zzf() {
        zzamh zzamhVar = this.zzaR;
        return zzamhVar == null ? zzamh.zzd() : zzamhVar;
    }

    public final String zzg() {
        return this.zzaM;
    }

    public final String zzh() {
        return this.zzD;
    }
}
