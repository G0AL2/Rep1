package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafx implements zzahl {
    private final List zza;

    public zzafx() {
        this(0);
    }

    private final zzahb zzb(zzahk zzahkVar) {
        return new zzahb(zzd(zzahkVar));
    }

    private final zzahp zzc(zzahk zzahkVar) {
        return new zzahp(zzd(zzahkVar));
    }

    private final List zzd(zzahk zzahkVar) {
        String str;
        int i10;
        List list;
        zzdy zzdyVar = new zzdy(zzahkVar.zzd);
        List list2 = this.zza;
        while (zzdyVar.zza() > 0) {
            int zzk = zzdyVar.zzk();
            int zzc = zzdyVar.zzc() + zzdyVar.zzk();
            if (zzk == 134) {
                list2 = new ArrayList();
                int zzk2 = zzdyVar.zzk() & 31;
                for (int i11 = 0; i11 < zzk2; i11++) {
                    String zzx = zzdyVar.zzx(3, zzfoi.zzc);
                    int zzk3 = zzdyVar.zzk();
                    int i12 = zzk3 & 128;
                    if (i12 != 0) {
                        i10 = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte zzk4 = (byte) zzdyVar.zzk();
                    zzdyVar.zzG(1);
                    if (i12 != 0) {
                        int i13 = zzcy.zza;
                        list = Collections.singletonList((zzk4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzab zzabVar = new zzab();
                    zzabVar.zzS(str);
                    zzabVar.zzK(zzx);
                    zzabVar.zzu(i10);
                    zzabVar.zzI(list);
                    list2.add(zzabVar.zzY());
                }
            }
            zzdyVar.zzF(zzc);
        }
        return list2;
    }

    @Override // com.google.android.gms.internal.ads.zzahl
    public final zzahn zza(int i10, zzahk zzahkVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzagr(new zzago(zzahkVar.zzb));
            }
            if (i10 == 21) {
                return new zzagr(new zzagm());
            }
            if (i10 == 27) {
                return new zzagr(new zzagj(zzb(zzahkVar), false, false));
            }
            if (i10 == 36) {
                return new zzagr(new zzagl(zzb(zzahkVar)));
            }
            if (i10 == 89) {
                return new zzagr(new zzafz(zzahkVar.zzc));
            }
            if (i10 == 138) {
                return new zzagr(new zzafy(zzahkVar.zzb));
            }
            if (i10 == 172) {
                return new zzagr(new zzaft(zzahkVar.zzb));
            }
            if (i10 == 257) {
                return new zzaha(new zzagq("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 == 134) {
                        return new zzaha(new zzagq("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                return new zzagr(new zzafw(false, zzahkVar.zzb));
                            case 16:
                                return new zzagr(new zzagf(zzc(zzahkVar)));
                            case 17:
                                return new zzagr(new zzagn(zzahkVar.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzagr(new zzafq(zzahkVar.zzb));
            }
        }
        return new zzagr(new zzagc(zzc(zzahkVar)));
    }

    public zzafx(int i10) {
        this.zza = zzfrj.zzo();
    }
}
