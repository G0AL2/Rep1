package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzakg extends zzajb {
    private final Object zza;
    private final zzajg zzb;

    public zzakg(int i10, String str, zzajg zzajgVar, zzajf zzajfVar) {
        super(i10, str, zzajfVar);
        this.zza = new Object();
        this.zzb = zzajgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzajb
    public final zzajh zzh(zzaix zzaixVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaixVar.zzb;
            Map map = zzaixVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i10].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaixVar.zzb);
        }
        return zzajh.zzb(str, zzajy.zzb(zzaixVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzajb
    /* renamed from: zzz */
    public void zzo(String str) {
        zzajg zzajgVar;
        synchronized (this.zza) {
            zzajgVar = this.zzb;
        }
        zzajgVar.zza(str);
    }
}
